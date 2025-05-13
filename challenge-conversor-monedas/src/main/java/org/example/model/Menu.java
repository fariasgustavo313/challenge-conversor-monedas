package org.example.model;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private final List<Moneda> monedas;
    private final ConversorMoneda conversor;

    public Menu(List<Moneda> monedas) {
        this.monedas = monedas;
        this.conversor = new ConversorMoneda(monedas);
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\nBienvenido/a al Conversor de Moneda");
            System.out.println("1. ARS - Peso argentino");
            System.out.println("2. BOB - Boliviano");
            System.out.println("3. BRL - Real brasileño");
            System.out.println("4. CLP - Peso chileno");
            System.out.println("5. COP - Peso colombiano");
            System.out.println("6. USD - Dólar estadounidense");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción para la moneda ORIGEN (1-7): ");

            opcion = scanner.nextInt();
            if (opcion == 7) break;

            String monedaOrigen = obtenerCodigoMoneda(opcion);

            System.out.print("Seleccione una opción para la moneda DESTINO (1-6): ");
            int destino = scanner.nextInt();
            String monedaDestino = obtenerCodigoMoneda(destino);

            System.out.print("Ingrese el monto a convertir: ");
            double monto = scanner.nextDouble();

            try {
                double resultado = conversor.convertir(monedaOrigen, monedaDestino, monto);
                System.out.printf("%.2f %s equivale a %.2f %s%n", monto, monedaOrigen, resultado, monedaDestino);
            } catch (Exception e) {
                System.out.println("Error al convertir monedas. Intente nuevamente.");
            }
        }

        System.out.println("¡Gracias por usar el conversor!");
    }

    private String obtenerCodigoMoneda(int opcion) {
        return switch (opcion) {
            case 1 -> "ARS";
            case 2 -> "BOB";
            case 3 -> "BRL";
            case 4 -> "CLP";
            case 5 -> "COP";
            case 6 -> "USD";
            default -> "";
        };
    }
}
