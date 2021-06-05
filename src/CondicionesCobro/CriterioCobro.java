package CondicionesCobro;
import ClasesPrincipales.*;

public interface CriterioCobro {
    public abstract double costoAdicional(Comida comida);
    public abstract boolean equals(Object obj);
}
