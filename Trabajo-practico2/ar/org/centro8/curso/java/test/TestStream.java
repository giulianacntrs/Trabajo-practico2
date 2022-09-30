package ar.org.centro8.curso.java.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import ar.org.centro8.curso.java.entities.Auto;
import ar.org.centro8.curso.java.entities.Moto;
import ar.org.centro8.curso.java.entities.Vehiculo;

public class TestStream {
    public static void main(String[] args) {

        List<Vehiculo> list = new ArrayList<>();
        list.add(new Auto("Peugeot", "206", 4, 200000.));
        list.add(new Moto("Honda", "Titan", 125, 60000.));
        list.add(new Auto("Peugeot", "208", 5, 250000.));
        list.add(new Moto("Yamaha", "YBR ", 160, 80500.5));

      
        cargarLista(list);
        separador();
        vehiculoMasCaro(list);
        vehiculoMasBarato(list);
        vehiculoY(list);
        separador();
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        ordenadaPorPrecio(list);
        separador();
        System.out.println("Vehículos ordenados por orden natural (por marca,modelo,precio):");
        ordenNatural(list);
    }

    private static void cargarLista(List<Vehiculo> list) {
        for (Vehiculo v : list) {
            System.out.println(v);
        }
    }

    private static void vehiculoMasCaro(List<Vehiculo> list) {
        double precioMax = list
                .stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get()
                .getPrecio();
        System.out.println("Vehículo más caro: " + precioMax);
    }

    private static void vehiculoMasBarato(List<Vehiculo> list) {
        String precioMin = list
                .stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get()
                .getMarca();
        // .getModelo();
        System.out.println("Vehículo más barato: " + precioMin);
    }

    private static void vehiculoY(List<Vehiculo> list) {

        list
                .stream()
                .filter(v -> v.getMarca().startsWith("Y"))
                .forEach(System.out::println);
    }

    private static void ordenadaPorPrecio(List<Vehiculo> list) {
        list
                .stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio).reversed())
                .forEach(System.out::println);
    }

    private static void ordenNatural(List<Vehiculo> list) {
        list
                .stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static void separador() {
        System.out.println("=============================");
    }

}
