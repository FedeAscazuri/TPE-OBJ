package CondicionesEspecialidad;

import ClasesPrincipales.*;

public class EspecialidadAnd implements Especialidad{
    private Especialidad e1;
    private Especialidad e2;
    public EspecialidadAnd(Especialidad e1, Especialidad e2){
        this.e1= e1;
        this.e2= e2;
    }

    @Override
    public boolean aceptaPedido(Comida comida) {
        return e1.aceptaPedido(comida) && e2.aceptaPedido(comida);
    }

    @Override
    public boolean equals(Object obj) {
        try {
            EspecialidadAnd e= (EspecialidadAnd)obj;
            return this.getE1()==e.getE1() && this.getE2()==e.getE2();
        }catch (Exception e){
            return false;
        }
    }

    public Especialidad getE1() {
        return e1;
    }

    public Especialidad getE2() {
        return e2;
    }


}
