package ClasesPrincipales;

import CondicionesEspecialidad.*;

import java.util.ArrayList;
import java.util.List;

public class EstacionDeTrabajo {
    private int numeroEstacion;
    private List<Especialidad> condiciones= new ArrayList<Especialidad>();
    private List<Comida> comidasPreparandose= new ArrayList<Comida>();

    public EstacionDeTrabajo(int numeroEstacion) {
        this.numeroEstacion=numeroEstacion;
    }

    public void agregarEspecialidad(Especialidad c){
        if (!condiciones.contains(c))
            condiciones.add(c);
    }

    public void agregarComida(Comida c){
        comidasPreparandose.add(c);
    }

    @Override
    public boolean equals(Object obj) {
       try {
           EstacionDeTrabajo e= (EstacionDeTrabajo)obj;
           return this.numeroEstacion==e.getNumeroEstacion();
       }catch (Exception e){
         return false;
       }
    }

    public boolean acepta(Comida comida){
        for (int i=0;i<condiciones.size();i++){
            Especialidad condi= condiciones.get(i);
            if(condi.aceptaPedido(comida)==true)
                return true;
        }
        return false;
    }

    public int getNumeroEstacion() {
        return numeroEstacion;
    }
}
