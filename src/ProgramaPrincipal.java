import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CentralDeAutobuses central = new CentralDeAutobuses();

        // Ejemplo de venta de boletos
        double precioBoleto = central.venderBoleto(1);
        System.out.println("Precio del boleto: $" + precioBoleto);

        double precioBoletoAdultoMayor = central.venderBoleto(2);
        System.out.println("Precio del boleto (adulto mayor): $" + precioBoletoAdultoMayor);

        // Modificar rutas (puedes adaptar según tu lógica)
        System.out.println("Ingrese el nuevo precio para la Ruta 1:");
        double nuevoPrecioRuta1 = scanner.nextDouble();
        central.getRutas().get(0).setPrecio(nuevoPrecioRuta1);

        // Calcular y mostrar el dinero total generado al final del día
        double dineroGeneradoTotal = central.calcularDineroGenerado();
        System.out.println("Dinero total generado al final del día: $" + dineroGeneradoTotal);
    }
}