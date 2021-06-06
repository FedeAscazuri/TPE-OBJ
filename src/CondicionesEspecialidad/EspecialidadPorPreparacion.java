package CondicionesEspecialidad;

import ClasesPrincipales.Comida;

public class EspecialidadPorPreparacion implements Especialidad {
    private String preparacion;

    public EspecialidadPorPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public String getPreparacion()
    {
        return preparacion;
    }

    @Override
    public boolean aceptaPedido(Comida comida) {
        return comida.getPreparacion().equals(preparacion);
    }

    @Override
    public boolean equals(Object obj) {
        try {
            EspecialidadPorPreparacion e= (EspecialidadPorPreparacion)obj;
            return this.getPreparacion().equals(e.getPreparacion());
        }catch (Exception e){
            return false;
        }
    }


}
