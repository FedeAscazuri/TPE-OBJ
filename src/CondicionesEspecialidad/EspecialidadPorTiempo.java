package CondicionesEspecialidad;

import ClasesPrincipales.Comida;

public class EspecialidadPorTiempo implements Especialidad{
    private int tiempo;

    public EspecialidadPorTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    @Override
    public boolean aceptaPedido(Comida comida) {
        return comida.getTiempoPreparacion()<tiempo;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            EspecialidadPorTiempo e= (EspecialidadPorTiempo)obj;
            return this.getTiempo()==e.getTiempo();
        }catch (Exception e){
            return false;
        }
    }
}
