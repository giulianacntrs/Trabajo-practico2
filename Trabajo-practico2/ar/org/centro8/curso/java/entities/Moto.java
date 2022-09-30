package ar.org.centro8.curso.java.entities;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca=" + getMarca() + "// Modelo=" + getModelo() + "// Cilindrada=" + cilindrada + "c" + "// Precio= $"
                + getPrecio();
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

}
