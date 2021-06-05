package ClasesPrincipales;


public class ComidaSimple extends Comida {
    protected double calorias;
    protected double precio;
    protected int tiempoPreparacion;

    public ComidaSimple(String nombre, String tipo, String preparacion,double calorias, double precio, int tiempoPreparacion) {
        super(nombre, tipo,preparacion);
        this.tiempoPreparacion = tiempoPreparacion;
        this.calorias= calorias;
        this.precio= precio;
        this.tiempoPreparacion= tiempoPreparacion;
    }

    @Override
    public int getTiempoPreparacion() {
        return this.tiempoPreparacion;
    }

    @Override
    public double getCalorias() {
        return this.calorias;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "ComidaSimple{" + super.toString() +
                "calorias=" + calorias +
                ", precio=" + precio +
                ", tiempoPreparacion=" + tiempoPreparacion +
                '}';
    }
}
