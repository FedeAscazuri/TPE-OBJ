package ClasesPrincipales;

import CondicionesCobro.CriterioCobro;

import java.util.ArrayList;
import java.util.List;

public class Cocina {
    private List<EstacionDeTrabajo> estaciones = new ArrayList<EstacionDeTrabajo>();
    private EstacionDeTrabajo estacionDefecto;
    private List<CriterioCobro> cobros = new ArrayList<CriterioCobro>();


    public Cocina() {
    }

    public void agregarEstacion(EstacionDeTrabajo estacion) {
        estaciones.add(estacion);
    }

    public void agregarCobros(CriterioCobro c) {
        cobros.add(c);
    }

    public void delegarPedido(Pedido pedido) {
        boolean defecto = false;
        for (Comida pcomida : pedido.getComidasPedidas()) {
            defecto = false;
            for (EstacionDeTrabajo pEstacion : estaciones) {
                if (pEstacion.acepta(pcomida)) {
                    pEstacion.agregarComida(pcomida);
                    defecto = true;
                }
            }
                if (!defecto)
                    estacionDefecto.agregarComida(pcomida);
        }
    }

}
