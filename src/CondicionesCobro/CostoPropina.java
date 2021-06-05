package CondicionesCobro;

import ClasesPrincipales.Comida;

public class CostoPropina implements CriterioCobro{
    private double porcentajeMozo;

    public double getPorcentajeMozo() {
        return porcentajeMozo;
    }
    public CostoPropina (double porcentajeMozo){
        this.porcentajeMozo= porcentajeMozo;
    }
    @Override
    public double costoAdicional(Comida comida) {
        double valorComida= comida.getPrecio();
        return (valorComida*(porcentajeMozo)/100);
    }
    @Override
    public boolean equals(Object obj) {
        try {
            CostoPropina e= (CostoPropina) obj;
            return (this.getPorcentajeMozo() == e.getPorcentajeMozo());

        }catch (Exception e){
            return false;
        }
    }
}
