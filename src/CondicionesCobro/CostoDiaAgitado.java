package CondicionesCobro;

import ClasesPrincipales.Comida;

public class CostoDiaAgitado implements CriterioCobro{
    private boolean diaAgitado;
    private double porcentajeAgitado;

    public CostoDiaAgitado(boolean diaAgitado, double porcentajeAgitado) {

        this.diaAgitado = diaAgitado;
        this.porcentajeAgitado = porcentajeAgitado;
    }

    @Override
    public double costoAdicional(Comida comida) {
        double retorno=0;
        double valorComida= comida.getPrecio();
        if (diaAgitado)
            retorno=(valorComida *(porcentajeAgitado)/100);
        return retorno;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            CostoDiaAgitado e= (CostoDiaAgitado) obj;
            return this.getPorcentajeAgitado() == e.getPorcentajeAgitado() && this.getDiaAgitado() == e.getDiaAgitado();

        }catch (Exception e){
            return false;
        }
    }

    public double getPorcentajeAgitado() {
        return porcentajeAgitado;
    }

    public boolean getDiaAgitado() {
        return diaAgitado;
    }
}
