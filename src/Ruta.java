public class Ruta {
    private int id;
    private double precio;
    int contadorAdultosMayores;
    private double dineroGenerado;

    public Ruta(int id, double precio) {
        this.id = id;
        this.precio = precio;
        this.contadorAdultosMayores = 0;
        this.dineroGenerado = 0.0;
    }

    public int getId() {
        return id;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void incrementarDineroGenerado(double monto) {
        dineroGenerado += monto;
    }

    public double getDineroGenerado() {
        return dineroGenerado;
    }
}