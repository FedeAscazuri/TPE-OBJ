package ClasesPrincipales;

import CondicionesCobro.CriterioCobro;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    protected List<Comida> comidasPedidas = new ArrayList<Comida>();
    protected int numeroMesa;
    private String mozo;

    public Pedido(int numeroMesa, String mozo) {
        this.numeroMesa = numeroMesa;
        this.mozo = mozo;
    }

    public int getNumeroMesa() {
        return this.numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getMozo() {
        return this.mozo;
    }

    public void setMozo(String mozo) {
        this.mozo = mozo;
    }

    public void agregarComida(Comida comida) {
        comida.setNumeroPedido(this.getNumeroMesa());
        comidasPedidas.add(comida);
    }

    public double costoBase(){
        double retorno=0;
        for (Comida pComidas:comidasPedidas) {
            retorno+= pComidas.getPrecio();
        }
        return retorno;
    }

    public double costoExtra(CriterioCobro c){
        double retorno=0;
        for (Comida pComidas:comidasPedidas) {
            retorno+= c.costoAdicional(pComidas);
        }
        return retorno;
    }

    public List<Comida> getComidasPedidas(){
        List<Comida> retorno= new ArrayList<Comida>();
        for (Comida pComida: comidasPedidas){
            retorno.add(pComida);
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "comidasPedidas=" + comidasPedidas +
                ", numeroMesa=" + numeroMesa +
                ", mozo='" + mozo + '\'' +
                '}';
    }
}

