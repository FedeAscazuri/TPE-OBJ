package CondicionesEspecialidad;

import ClasesPrincipales.Comida;

public class EspecialidadNot implements Especialidad{
    private Especialidad e1;
    public EspecialidadNot(Especialidad e1){
        this.e1= e1;
    }

    @Override
    public boolean aceptaPedido(Comida comida) {
        return !e1.aceptaPedido(comida);
    }
}
