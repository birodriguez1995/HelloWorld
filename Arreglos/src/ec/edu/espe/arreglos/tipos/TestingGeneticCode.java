/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.tipos;
import ec.edu.espe.arreglos.modelo.GeneticCode;
/**
 *
 * @author bryan_000
 */
public class TestingGeneticCode {
    public static void main(String[] args) {
        GeneticCode[] geneticCode= new GeneticCode[10];
        System.out.println("Genetic Codes: \n");
        //Inicializaciones
        for (int i = 0; i < 10; i++) {
            geneticCode[i] = new GeneticCode();
            geneticCode[i].setCodons(64);
            geneticCode[i].setAminoacidsSequence("aa"+i);
            geneticCode[i].setNitrogenousBases(" adenine (A), uracil (U), guanine (G), thymine (T), and cytosine (C)");
            geneticCode[i].setId(i + 1);
        
            if ((i % 2) == 0) {
                geneticCode[i].setNucleicAcidsSequence("ATT");
            } else {
                geneticCode[i].setNucleicAcidsSequence("CCG");
            } 
        }
    }
}
