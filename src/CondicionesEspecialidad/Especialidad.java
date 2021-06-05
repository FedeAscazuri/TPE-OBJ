package CondicionesEspecialidad;

import ClasesPrincipales.*;

public interface Especialidad {
    public abstract boolean aceptaPedido(Comida comida);
    public abstract boolean equals(Object obj);
}
