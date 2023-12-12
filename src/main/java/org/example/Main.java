package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombreProducto;
        String distribuidor;
        double costeLote;
        double costePublico;
        double totalCompra;
        int cantidadProducto;

        System.out.println("***************");
        System.out.println("Frugal SAS");
        System.out.println("***************");

        Scanner leerDato = new Scanner(System.in);

        // System.out.println("********* Buen dia bienvenido a Frugal SAS *********");

        System.out.println("Ingrese el producto que desea almacenar: ");
        nombreProducto = leerDato.nextLine();

        System.out.println("Ingrese el nombre del distribuidor: ");
        distribuidor = leerDato.nextLine();

        System.out.println("Ingrese el precio del lote: ");
        costeLote = leerDato.nextDouble();

        System.out.println("Ingrese el valor unitario del producto: ");
        costePublico = leerDato.nextDouble();

        System.out.println("Ingrese la cantidad de producto: ");
        cantidadProducto = leerDato.nextInt();


        System.out.println("**************************");
        System.out.println("Resumen del ingreso de la mercancia");
        System.out.println("Lote que entra: " + nombreProducto);
        System.out.println("Distribuidor de la mercancia: " + distribuidor);
        System.out.println("Coste del lote: " + costeLote);
        System.out.println("Coste al publico: " + costePublico);
        System.out.println("Cantidad de productos ingresados: " + cantidadProducto);
        System.out.println("**************************+");


        System.out.println("\n ++++++++++++ Venta al detal +++++++++++++++++ \n");

        costePublico = 5000;

        System.out.println("Apreciado usuario, el costo unitario de " + nombreProducto + " es de " + costePublico);

        System.out.println("Digita la cantidad de " + nombreProducto + " que quieres llevar");
        cantidadProducto = leerDato.nextInt();

        // calculando el valor de la variable

        totalCompra=costePublico*cantidadProducto;

        System.out.println("El total de tu compra es de: $" + totalCompra);








    }
}