package CondicionesCobro;

import ClasesPrincipales.Comida;
import CondicionesEspecialidad.Especialidad;


public class CostoFijo implements CriterioCobro{
    private double v1;
    private double v2;
    private Especialidad condicion;


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
}
