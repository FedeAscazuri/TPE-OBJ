package CondicionesEspecialidad;

import ClasesPrincipales.Comida;

public class EspecialidadPorTipo implements Especialidad{
    private String tipoPedido;

    public EspecialidadPorTipo(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    @Override
    public boolean aceptaPedido(Comida comida) {
        return comida.getTipo().equals(tipoPedido);
    }


    @Override
    public boolean equals(Object obj) {
        try {
            EspecialidadPorTipo e= (EspecialidadPorTipo)obj;
            return this.getTipoPedido().equals(e.getTipoPedido());
        }catch (Exception e){
            return false;
        }
    }

    public String getTipoPedido() {
        return tipoPedido;
    }
}
