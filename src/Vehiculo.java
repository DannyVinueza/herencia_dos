public class Vehiculo {
    private String marca, modelo;
    private double precioAlquiler;

    public Vehiculo (String marca, String modelo, double precioAlquiler){//Constructor recibiendo marca y modelo
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setPrecioAlquiler(double precioAlquiler){
        this.precioAlquiler = precioAlquiler;
    }

    public void imprimirAtributos(){
        System.out.print("Marca: " + marca + " \tModelo " + modelo + "\t" + "Precio: " + precioAlquiler);
    }
}
