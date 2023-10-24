package com.liceolapaz.des.sfr;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        do {
            //Escribir el menú
            escribirMenu();
            //Escoger opción y guardarla
            escogerOpcion();
            int opcion = leerOpcion();
            escribirMensaje(opcion);
        } while(true);
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void escribirMensaje(int opcion) {
        switch (opcion) {
            case 0:
                System.out.println("¡Hasta la próxima!");
                System.exit(0);
                break;
            case 1:
                System.out.println("Escriba la cantidad");
                double cantidad= leerCantidad();
                double resultado = cantidad * 0.86;
                System.out.println("La cantidad en euros es " + resultado);
                break;
            case 2:
                System.out.println("Escriba la cantidad");
                double cantidad_2= leerCantidad_2();
                double resultado_2= cantidad_2 * 1.19;
                System.out.println("La cantidad en euros es " + resultado_2);
                break;
            case 3:
                System.out.println("Escriba la cantidad");
                double cantidad_3= leerCantidad_3();
                double resultado_3= cantidad_3 * 0.0075;
                System.out.println("La cantidad en euros es " + resultado_3);
                break;
            default:
                System.out.println("Error, opción no válida");
                break;
        }

    }

    private static double leerCantidad_3() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double leerCantidad_2() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static double leerCantidad() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();

    }

    private static void escogerOpcion() {
        System.out.println("Escoja una opción: ");
    }

    private static void escribirMenu() {
        System.out.println
                ("CONVERSOR DE MONEDAS\n" +
                        "1.Dólares\n" +
                        "2.Libras\n" +
                        "3.Yenes\n" +
                        "0.Salir");
    }
}