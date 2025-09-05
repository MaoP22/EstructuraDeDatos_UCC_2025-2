package Momento01;

import java.util.optional;

public class Casillero {

    private final int fila; 
    private final int columna;
    private final TipoCasillero tipo; 
    private Paquete paquete; 

    public Casillero(int fila, int columna, TipoCasillero tipo){
        this.fila = fila; 
        this.columna = columna;
        this.tipo = tipo; 
        this.paquete = null; 
    }

    public int getFila(){
        return fila; 
    }

    public int getColimna(){
        return columna; 
    }

    public TipoCasillero getTipo(){
        return tipo; 
    }

    public boolean estaLibre(){
        return paquete == null; 
    }

    public void asignarPaquete(Paquete p){
        if (¡estaLibre()){
            return false;
        }
        this.paquete = p; 
    } 

    public paquete retirarPaquete(){
        Paquete temp = paquete;
        paquete = null; 
        return temp;   
    }

    public Optional<Paquete> getPaquete(){
        return optional.ofnullable(paquete);
    } 

    public String toString(){
        String estado = estaLibre() ? "LIBRE" : "OCUPADO ->" + paquete.getId();
        return "Casillero(" + fila + "," + columna + ") tipo=" + tipo + " " + estado; 
    }
    
}
