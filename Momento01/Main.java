package Momento01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LockerSystem sistema = new LockerSystem();

        int opcion;
        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Registrar paquete en casillero");
            System.out.println("2. Consultar casilleros disponibles");
            System.out.println("3. Ver información de un casillero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sistema.mostrarCasilleros();
                    System.out.print("Ingrese fila (0-" + (sistema.getFilas() - 1) + "): ");
                    int fila = sc.nextInt();
                    System.out.print("Ingrese columna (0-" + (sistema.getColumnas() - 1) + "): ");
                    int columna = sc.nextInt();
                    sc.nextLine(); // limpiar buffer
                    System.out.print("Ingrese nombre del destinatario: ");
                    String destinatario = sc.nextLine();

                    if (sistema.registrarPaquete(fila, columna, destinatario)) {
                        System.out.println("✅ Paquete registrado correctamente.");
                    } else {
                        System.out.println("❌ Casillero ocupado. Elija otro.");
                    }
                    break;
                case 2:
                    sistema.mostrarCasilleros();
                    break;
                case 3:
                    System.out.print("Ingrese fila: ");
                    fila = sc.nextInt();
                    System.out.print("Ingrese columna: ");
                    columna = sc.nextInt();
                    sistema.consultarPaquete(fila, columna);
                    break;
                case 4:
                    System.out.println(" Aplicación finalizada.");
                    break;
                default:
                    System.out.println(" Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 4);
        sc.close();
    }
}
