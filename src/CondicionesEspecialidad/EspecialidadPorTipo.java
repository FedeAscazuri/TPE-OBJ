package CondicionesEspecialidad;

import ClasesPrincipales.Comida;

public class EspecialidadPorTipo implements Especialidad{
    private String tipoPedido;

    @Override
    public boolean aceptaPedido(Comida comida) {
        return comida.getTipo().equals(tipoPedido);
    }
}
