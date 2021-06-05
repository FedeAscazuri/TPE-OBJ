package CondicionesCobro;

import ClasesPrincipales.Comida;

public class Descuento implements CriterioCobro{
    private double descuento;
    private String diaDescuento;
    private String diaActual;

    public double getDescuento() {
        return descuento;
    }

    public String getDiaDescuento() {
        return diaDescuento;
    }

    public String getDiaActual() {
        return diaActual;
    }
    public Descuento(double descuento, String diaDescuento, String diaActual) {
        this.descuento = descuento;
        this.diaDescuento = diaDescuento;
        this.diaActual = diaActual;
    }

    @Override
    public double costoAdicional(Comida comida) {
        double valorComida= comida.getPrecio();
        if(diaActual.equals(diaDescuento))
            return (valorComida*(-descuento)/100);
        return 0;
    }
    @Override
    public boolean equals(Object obj) {
        try {
            Descuento e= (Descuento) obj;
            return (this.getDescuento()==e.getDescuento() && this.getDiaActual().equals(e.getDiaActual()) &&
                    this.getDiaDescuento().equals(e.getDiaDescuento()));

        }catch (Exception e){
            return false;
        }
    }
}
