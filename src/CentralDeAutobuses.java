
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CentralDeAutobuses {
    private List<Ruta> rutas;
    private Scanner scanner;

    public CentralDeAutobuses() {
        this.rutas = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        // Agregar las rutas con sus precios
        rutas.add(new Ruta(1, 10.0));
        rutas.add(new Ruta(2, 12.0));
        // Agregar más rutas según sea necesario
    }

    public List<Ruta> getRutas() {
        return rutas;
    }

    public void agregarRuta(Ruta ruta) {
        rutas.add(ruta);
    }

    public double venderBoleto(int rutaId) {
        Ruta rutaSeleccionada = buscarRutaPorId(rutaId);

        if (rutaSeleccionada != null) {
            System.out.println("¿La persona es mayor de edad? (si/no): ");
            boolean esAdultoMayor = scanner.nextBoolean();

            double precio = rutaSeleccionada.obtenerPrecio();
            if (esAdultoMayor) {
                // Aplicar descuento solo a las primeras 5 personas
                if (rutaSeleccionada.contadorAdultosMayores < 5) {
                    precio -= precio * 0.15;
                    rutaSeleccionada.contadorAdultosMayores++;
                }
            }
            rutaSeleccionada.incrementarDineroGenerado(precio); // Actualizar dinero generado
            return precio;
        } else {
            // Ruta no encontrada
            return -1.0;
        }
    }

    private Ruta buscarRutaPorId(int rutaId) {
        for (Ruta ruta : rutas) {
            if (ruta.getId() == rutaId) {
                return ruta;
            }
        }
        return null;
    }

    public double calcularDineroGenerado() {
        double total = 0.0;
        for (Ruta ruta : rutas) {
            total += ruta.getDineroGenerado();
        }
        return total;
    }
}