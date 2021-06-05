package ClasesPrincipales;


public abstract class Comida {
    private String nombre;
    private String tipo;
    private String preparacion;
    private int numeroPedido;

    public Comida(String nombre, String tipo, String preparaicon) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.preparacion = preparaicon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparaicon) {
        this.preparacion = preparacion;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public abstract int getTiempoPreparacion();
    public abstract double getCalorias();
    public abstract double getPrecio();

    @Override
    public String toString() {
        return "Comida{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preparacion='" + preparacion + '\'' +
                ", numeroPedido=" + numeroPedido +
                '}';
    }
}
