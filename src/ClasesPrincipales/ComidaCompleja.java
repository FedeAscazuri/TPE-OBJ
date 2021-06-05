package ClasesPrincipales;

import java.util.ArrayList;
import java.util.List;

public class ComidaCompleja extends Comida {

    private List<Comida> comidas = new ArrayList<Comida>();

    public ComidaCompleja(String nombre, String tipo, String preparaicon, int numeroPedido) {
        super(nombre, tipo, preparaicon, numeroPedido);
    }

    public void agregarComida(Comida comida){
        comidas.add(comida);
    }

    @Override
    public int getTiempoPreparacion() {
        int preparacion=0;
        for (Comida pComida: comidas){
            preparacion+=pComida.getTiempoPreparacion();
        }
        return preparacion;
    }

    @Override
    public double getCalorias() {
        double resultadoCaloria=0;
        for (Comida pComida: comidas){
            resultadoCaloria+= pComida.getCalorias();
        }
        return resultadoCaloria;
    }

    @Override
    public double getPrecio() {
        double retorno =0;
        for (Comida pComida: comidas){
            retorno+=pComida.getPrecio();
        }
        return retorno;
    }
}
