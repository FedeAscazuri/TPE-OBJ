package CondicionesCobro;

import ClasesPrincipales.Comida;
import CondicionesEspecialidad.Especialidad;


public class CostoFijo implements CriterioCobro{
    private double v1;
    private double v2;
    private Especialidad condicion;
    public double getV1(){
        return v1;
    }
    public double getV2(){
        return v2;
    }

    public Especialidad getCondicion() {
        return condicion;
    }

    public CostoFijo(double v1, double v2, Especialidad condicion) {
        this.v1 = v1;
        this.v2 = v2;
        this.condicion = condicion;
    }

    @Override
    public double costoAdicional(Comida comida) {
        if (condicion.aceptaPedido(comida))
            return v1;
        return v2;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            CostoFijo e= (CostoFijo) obj;
            return this.getCondicion().equals(e.getCondicion()) && this.getV1()==e.getV1()
                    &&  this.getV2()==e.getV2();
        }catch (Exception e){
            return false;
        }
    }
}
