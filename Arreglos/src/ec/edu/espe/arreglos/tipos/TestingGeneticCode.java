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
        //Nombres
        geneticCode[0].setPatient("Pedro");
        geneticCode[1].setPatient("Miguel");
        geneticCode[2].setPatient("Benigno");
        geneticCode[3].setPatient("Ligia");
        geneticCode[4].setPatient("Nicole");
        geneticCode[5].setPatient("Gabriel");
        geneticCode[6].setPatient("Cecilia");
        geneticCode[7].setPatient("Diana");
        geneticCode[8].setPatient("Juan");
        geneticCode[9].setPatient("Manuel");
        
        //
        for(GeneticCode geneticCodes:geneticCode){
            System.out.println("Patient: " + geneticCodes.getPatient() + "\nId: " + geneticCodes.getId() + "\nNumber of Codons: " + geneticCodes.getCodons()+"\nNitrogenous Bases: "+geneticCodes.getNitrogenousBases()+"\nNucleic Acids Sequence: "+geneticCodes.getNucleicAcidsSequence()+"\nAminoacids Sequence: "+geneticCodes.getAminoacidsSequence());
            System.out.println("\n");
        }   
    }
}
