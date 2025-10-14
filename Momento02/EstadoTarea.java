public class EstadoTarea {
    
    private String estado;
    private long tiempoProceso;

    public EstadoTarea(String estado, long tiempoProceso){
        
        this.estado = estado;
        this.tiempoProceso = tiempoProceso;
    }

    public String getEstado(){
        return estado;
    }

    public long getTiempoProceso(){
        return tiempoProceso;
    }

    public String toString(){
        return "EstadoTarea{" +
                "estado ='" + estado + '\'' +
                ", tiempoProceso =" + tiempoProceso +
                '}';
    }
}
