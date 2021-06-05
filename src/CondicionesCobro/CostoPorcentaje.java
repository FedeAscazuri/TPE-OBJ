package CondicionesCobro;

import ClasesPrincipales.Comida;

public class CostoPorcentaje implements CriterioCobro{
    private double porcentajeMozo;
    private double porcentajeAgitado;
    private double descuento;
    private String diaDescuento;
    private String diaActual;
    private boolean diaAgitado;

    public CostoPorcentaje(double porcentajeAdicional, double porcentajeAgitado, double descuento, String diaDescuento, String diaActual, boolean diaAgitado) {
        this.porcentajeMozo = porcentajeAdicional;
        this.porcentajeAgitado = porcentajeAgitado;
        this.descuento = descuento;
        this.diaDescuento = diaDescuento;
        this.diaActual = diaActual;
        this.diaAgitado = diaAgitado;
    }

    @Override
    public double costoAdicional(Comida comida) {
        double retorno = 0;
        double valorComida= comida.getPrecio();
        if ((diaAgitado=true) && (diaActual.equals(diaDescuento)))
             retorno=(valorComida *(porcentajeAgitado-descuento)/100);
        else
            if (diaAgitado=true)
                retorno= (valorComida*(porcentajeAgitado)/100);
            else
                retorno= (valorComida*(-descuento)/100);
        return retorno+(valorComida*(porcentajeMozo)/100);
    }
}
