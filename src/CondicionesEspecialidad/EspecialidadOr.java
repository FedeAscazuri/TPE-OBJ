package CondicionesEspecialidad;

import ClasesPrincipales.Comida;

public class EspecialidadOr implements Especialidad{
    private Especialidad e1;
    private Especialidad e2;
    public EspecialidadOr(Especialidad e1, Especialidad e2){
        this.e1= e1;
        this.e2= e2;
    }

    @Override
    public boolean aceptaPedido(Comida comida) {
        return e1.aceptaPedido(comida) || e2.aceptaPedido(comida);
    }
}
