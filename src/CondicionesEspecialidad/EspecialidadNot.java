package CondicionesEspecialidad;

import ClasesPrincipales.Comida;
import ClasesPrincipales.EstacionDeTrabajo;

public class EspecialidadNot implements Especialidad{
    private Especialidad e1;
    public EspecialidadNot(Especialidad e1){
        this.e1= e1;
    }
    public Especialidad getE1() {
        return e1;
    }

    @Override
    public boolean aceptaPedido(Comida comida) {
        return !e1.aceptaPedido(comida);
    }

    @Override
    public boolean equals(Object obj) {
        try {
            EspecialidadNot e= (EspecialidadNot)obj;
            return this.getE1()==e.getE1();
        }catch (Exception e){
            return false;
        }
    }
}
