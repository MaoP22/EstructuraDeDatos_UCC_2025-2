public class EjecutarMatrices {
    public static void main(String[] args) {
        
        MatricesEstructuraDeDatos objMatrices = new MatricesEstructuraDeDatos();

        int[][]m = objMatrices.llenarMatriz(3, 3);

        System.out.println(objMatrices.MostrarMatriz(m));
    }
}
