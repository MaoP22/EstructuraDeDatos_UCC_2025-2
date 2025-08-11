package clase02;

import java.util.Arrays;

public class EjecutarEstudiante {
    public static void main(String[] args) {

        // Forma 1
        // Creación de los objetos
        Estudiante objEst1 = new Estudiante(2005, "Mao", "Pantoja", "Ingeniería");
        Estudiante objEst2 = new Estudiante(2006, "Sarai", "Torres", "Psicologia");
        Estudiante objEst3 = new Estudiante(2007, "Samara", "Calderon", "Derecho");

        System.out.println(objEst1);
        System.out.println(objEst2);
        System.out.println(objEst3);

        System.out.println("---------------------------------------------");

        // Crear arreglo de objetos
        // Int[] a = new int[5];
        Estudiante[] est = new Estudiante[5];
        est[0] = objEst1;
        est[1] = objEst2;
        est[2] = objEst3;

        // Forma 2
        est[3] = new Estudiante(2008, "David", "Caipe", "Medicina");
        est[4] = new Estudiante(2009, "Sully", "Amaya", "Contaduria");

        System.out.println(Arrays.toString(est));

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        for (Estudiante e : est) {
            System.out.println(e);
        }

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        for (int i = 0; i < est.length; i++) {
            System.out.println(est[i]);
        }
    }
}
