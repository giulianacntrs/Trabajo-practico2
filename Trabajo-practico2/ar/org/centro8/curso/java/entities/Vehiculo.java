package ar.org.centro8.curso.java.entities;

import java.text.DecimalFormat;

public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio2) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio2;
    }

    @Override
    public String toString() {
        return "Marca=" + marca + "// Modelo=" + modelo + "// Precio=" + precio;
    }

    @Override
    public int compareTo(Vehiculo para) {
        DecimalFormat df = new DecimalFormat("00");
        String thisVehiculo = this.getMarca() + "," + this.getModelo() + "," + df.format(this.getPrecio());
        String paraVehiculo = para.getMarca() + "," + para.getModelo() + "," + df.format(para.getPrecio());
        return thisVehiculo.compareTo(paraVehiculo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}