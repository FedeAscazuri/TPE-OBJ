package CondicionesCobro;

import ClasesPrincipales.Comida;


public class CostoSumado implements CriterioCobro {
    private CriterioCobro c1;
    private CriterioCobro c2;

    public CostoSumado(CriterioCobro c1, CriterioCobro c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double costoAdicional(Comida comida) {
        return (c1.costoAdicional(comida) + c2.costoAdicional(comida));
    }

    public CriterioCobro getC1() {
        return c1;
    }

    public CriterioCobro getC2() {
        return c2;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            CostoSumado e= (CostoSumado) obj;
            return (this.getC1().equals(e.getC1()) && this.getC2().equals(e.getC2()));

        }catch (Exception e){
            return false;
        }
    }
}
