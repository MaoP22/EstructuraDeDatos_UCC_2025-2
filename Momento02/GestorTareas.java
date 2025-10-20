import java.util.*;

public class GestorTareas {
    
    private Stack<Tarea> pilaPrioritaria;
    private Queue<Tarea> colaEspera; 
    private Map<String, EstadoTarea> mapaTrazabilidad;

    public GestorTareas(){
        
        pilaPrioritaria = new Stack<>();
        colaEspera = new LinkedList<>();
        mapaTrazabilidad = new HashMap<>();
    }

    public void agregarTarea(Tarea tarea){
        if (tarea.getPrioridad() == 3){
            pilaPrioritaria.push(tarea);
        
        } else {
            colaEspera.offer(tarea);
        }
    }

    public Tarea procesarSiguienteTarea() {
        Tarea tareaProcesada = null;

        if (!pilaPrioritaria.isEmpty()) {
            tareaProcesada = pilaPrioritaria.pop();
        } else if (!colaEspera.isEmpty()) {
            tareaProcesada = colaEspera.poll();
        } else {
            System.out.println("No hay tareas pendientes.");
            return null;
        }

        EstadoTarea estado = new EstadoTarea("Completada", System.currentTimeMillis());
        mapaTrazabilidad.put(tareaProcesada.getId(), estado);

        return tareaProcesada;
    }

    public String consultarEstadoTarea(String idtarea){

        if (mapaTrazabilidad.containsKey(idtarea)){
            return "Completada";
        }

        for (Tarea t : pilaPrioritaria){
            if (t.getId().equals(idtarea)){
                return "Pendiente (Alta prioridad)";
            }
        }

        for (Tarea t : colaEspera){
            if (t.getId().equals(idtarea)){
                return "Pendiente (No hay prioridad)";
            }
        }

        return "ID no encontrado";
    }

    public void mostrarEstadoInterno(){
        
        System.out.println("\n-- Estado Interno --");
        System.out.println("Pila Prioritaria: " + pilaPrioritaria);
        System.out.println("Cola de Espera: " + colaEspera);
        System.out.println("Mapa de Trazabilidad: " + mapaTrazabilidad);
        System.out.println("--------------------\n");
    }
}
