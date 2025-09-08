package Momento01;

public class LockerSystem {
    private Locker[][] casilleros;
    private int filas = 3;
    private int columnas = 3;

    public LockerSystem() {
        casilleros = new Locker[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                casilleros[i][j] = new Locker();
            }
        }
    }

    public void mostrarCasilleros() {
        System.out.println("Estado de casilleros (L = Libre, O = Ocupado):");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(casilleros[i][j].estaOcupado() ? "O " : "L ");
            }
            System.out.println();
        }
    }

    public boolean registrarPaquete(int fila, int columna, String destinatario) {
        if (casilleros[fila][columna].estaOcupado()) {
            return false;
        } else {
            casilleros[fila][columna].asignarPaquete(destinatario);
            return true;
        }
    }

    public void consultarPaquete(int fila, int columna) {
        if (casilleros[fila][columna].estaOcupado()) {
            System.out.println("Casillero [" + fila + "][" + columna + "]");
            System.out.println("Destinatario: " + casilleros[fila][columna].getDestinatario());
            System.out.println("Fecha de ingreso: " + casilleros[fila][columna].getFechaIngreso());
        } else {
            System.out.println("El casillero está vacío.");
        }
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
}
