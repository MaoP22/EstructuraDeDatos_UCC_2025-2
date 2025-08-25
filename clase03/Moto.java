public class Moto {

    private String marca;
    private int año; 
    private String color;
    private String placa;
    private double velocidadMax; 
    private boolean frenosABS; 
    private int cilindrada;

    //Constructor 

    public Moto(String marca, int año, String color, String placa, double velocidadMax, boolean frenosABS, int cilindrada){
        
        this.marca = marca;
        this.año = año;
        this.color = color;
        this.placa = placa;
        this.velocidadMax = velocidadMax;
        this.frenosABS = frenosABS;
        this.cilindrada = cilindrada;
    }

    //Metodo toString para mostrar la información del objeto 

    public String toString() {
        return "Moto { Marca: " + marca + 
        "Ano: " + año + 
        "Color: " + color + 
        "Placa: " + placa + 
        "VelocidadMax: " + velocidadMax + 
        "FrenosABS: " + frenosABS + 
        "Cilindrada: " + cilindrada + "}";
    }
}    