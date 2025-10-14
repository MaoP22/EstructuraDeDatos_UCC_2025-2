public class Main {
    
    public static void main(String[] args) throws InterruptedException{
        GestorTareas gestor = new GestorTareas();

        Tarea t1 = new Tarea("T1", "Actualizar sistema", 2, System.currentTimeMillis());
        Tarea t2 = new Tarea("T2", "Revisar servidor", 3, System.currentTimeMillis());
        Tarea t3 = new Tarea("T3", "Enviar reporte", 1, System.currentTimeMillis());
        Tarea t4 = new Tarea("T4", "Notificar cliente", 3, System.currentTimeMillis());

        gestor.agregarTarea(t1);
        gestor.agregarTarea(t2);
        gestor.agregarTarea(t3);
        gestor.agregarTarea(t4);

        System.out.println("Procesando: " + gestor.procesarSiguienteTarea());
        Thread.sleep(100);
        System.out.println("Procesando: " + gestor.procesarSiguienteTarea());
        Thread.sleep(100);
        System.out.println("Procesando: " + gestor.procesarSiguienteTarea());

        gestor.mostrarEstadoInterno();

        System.out.println("Estado T1: " + gestor.consultarEstadoTarea("T1"));
        System.out.println("Estado T2: " + gestor.consultarEstadoTarea("T2"));
        System.out.println("Estado T3: " + gestor.consultarEstadoTarea("T3"));
        System.out.println("Estado T4: " + gestor.consultarEstadoTarea("T4"));
    } 
}
