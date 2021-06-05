package ClasesPrincipales;

import CondicionesCobro.*;

import java.util.ArrayList;
import java.util.List;

public class Cocina {
    private List<EstacionDeTrabajo> estaciones = new ArrayList<EstacionDeTrabajo>();
    private EstacionDeTrabajo estacionDefecto;
    private List<CriterioCobro> cobros = new ArrayList<CriterioCobro>();
    private List<Pedido> pedidosDelegados= new ArrayList<Pedido>();


    public Cocina(EstacionDeTrabajo estacionDefecto) {
        this.estacionDefecto=estacionDefecto;
    }

    public void agregarEstacion(EstacionDeTrabajo estacion) {
        estaciones.add(estacion);
    }

    public void agregarCobros(CriterioCobro c) {
        cobros.add(c);
    }

    public void delegarPedido(Pedido pedido) {
        boolean defecto = false;
        int i =0;
        for (Comida pcomida : pedido.getComidasPedidas()) {
            defecto = false;
            i=0;
            while ((defecto==false) && (i<estaciones.size())){
                EstacionDeTrabajo aux= estaciones.get(i);
                if (aux.acepta(pcomida)) {
                    aux.agregarComida(pcomida);
                    defecto = true;}
                i++;
            }
            if (!defecto)
                estacionDefecto.agregarComida(pcomida);
        }
        pedidosDelegados.add(pedido);
    }
    public double cobroMesa(int mesa) {
        double retorno=0;
        for (Pedido pPedido: pedidosDelegados){
            if (pPedido.getNumeroMesa()==mesa) {
                for(CriterioCobro pCriterio: cobros)
                    retorno += pPedido.costoTotal(pCriterio);
            }
        }
        return retorno;
    }

}
