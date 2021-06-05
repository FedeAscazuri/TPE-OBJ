package CondicionesEspecialidad;

import ClasesPrincipales.Comida;

public class EspecialidadPorPreparacion implements Especialidad {
    private String preparacion;

    @Override
    public boolean aceptaPedido(Comida comida) {
        return comida.getPreparaicon().equals(preparacion);
    }



}
