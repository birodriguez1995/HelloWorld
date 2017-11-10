/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.tipos;
//ctrl shift +i importacion de las clases

import ec.edu.espe.arreglos.modelo.Animal;

/**
 *
 * @author bryan_000
 */
public class TestingAnimals {

    public static void main(String[] args) {
        Animal[] animal = new Animal[10];

        System.out.println("Objetos de los Animales: \n\n");
        //Inicializaciones
        for (int i = 0; i < animal.length; i++) {
            animal[i] = new Animal();
            animal[i].setId(i + 1);
            if ((i % 2) == 0) {
                animal[i].setOjos("CAFES.\n");
            } else {
                animal[i].setOjos("NEGROS.\n");
            }
        }
        //Nombres
        animal[0].setName("Johan");
        animal[1].setName("Guillermo");
        animal[2].setName("Pedro");
        animal[3].setName("Luis");
        animal[4].setName("Rigoberto");
        animal[5].setName("Jhon");
        animal[6].setName("Alveiro");
        animal[7].setName("Pablo");
        animal[8].setName("Emilio");
        animal[9].setName("Jefferson");
        
        
         System.out.println("IMPRESION 1: \n");
        for(Animal animales:animal){
            System.out.println("Name: " + animales.getName() + "\t\tId: " + animales.getId() + "\t\tColor de Ojos: " + animales.getOjos());
        }   System.out.println("\n\n\n");
        //Impresion de los nombres de los Animales con los Id's.
        System.out.println("IMPRESION 2: \n");
        System.out.println("Objetos de los Animales: \n\n");
        
        for (int j = 0; j < 10; j++) {
            System.out.println("Name: " + animal[j].getName() + "\t\tId: " + animal[j].getId() + "\t\tColor de Ojos: " + animal[j].getOjos());
        }
    }
}
