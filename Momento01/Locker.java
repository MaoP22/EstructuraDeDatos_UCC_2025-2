package Momento01;

import java.time.LocalDateTime;

public class Locker {
    private boolean ocupado;
    private String destinatario;
    private LocalDateTime fechaIngreso;

    public Locker() {
        this.ocupado = false;
        this.destinatario = "";
        this.fechaIngreso = null;
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    public void asignarPaquete(String destinatario) {
        this.ocupado = true;
        this.destinatario = destinatario;
        this.fechaIngreso = LocalDateTime.now();
    }

    public void liberar() {
        this.ocupado = false;
        this.destinatario = "";
        this.fechaIngreso = null;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }
}
