/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.primitivos;

/**
 *
 * @author bryan_000
 */
public class TestingArrays {

    public static void main(String[] args) {
        int[] enteros = new int[10];
        float[] flotantes = new float[5];
        int[] otrosEnteros = {8, 11, 2017};

        System.out.println("Inicializacion del primer Arreglo: \n");
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i + 1;
            System.out.println(+enteros[i] + "\n");
        }
        System.out.println("\nInicializacion del segundo Arreglo: \n");
        for (float j = (float) 0.1; j <= 0.5; j += (float) 0.1) {
            flotantes[(int) j * 10] = j + 1;
            System.out.println(+flotantes[(int) j * 10] + "\n");
        }

        System.out.println("\nFecha: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(otrosEnteros[i]);
             System.out.println("\t");
        }

        for (int entero : enteros) {
            System.out.println("\n\n"+entero + "\t");
        }

       for (float flotante : flotantes) {
            System.out.println(flotante);
        }

    }
}
