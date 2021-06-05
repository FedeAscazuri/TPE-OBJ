package ClasesPrincipales;

import java.util.ArrayList;
import java.util.List;

public class ComidaCompleja extends Comida {

    private List<Comida> comidas = new ArrayList<Comida>();

    public ComidaCompleja(String nombre, String tipo, String preparacion) {
        super(nombre, tipo, preparacion);
    }

    public void agregarComida(Comida comida){
        comida.setNumeroPedido(this.getNumeroPedido());
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

    @Override
    public String toString() {
        return "ComidaCompleja{" +super.toString() + '\'' +
                " - Calorias: " + getCalorias() + '\'' +
                " - Precio: " + getPrecio() + '\'' +
                " - Tiempo Preparacion: " + getTiempoPreparacion() + '\'' +
                " comidas= " + comidas + '\'' +
                '}';
    }
}
