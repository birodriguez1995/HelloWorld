/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.modelo;

/**
 *
 * @author bryan_000
 */
public class GeneticCode {
    private int id;
    private int codons;
    private String patient;
    private String nitrogenousBases;
    private String nucleicAcidsSequence;
    private String aminoacidsSequence;

public GeneticCode(){
    
}
    
    public GeneticCode(int id, int codons, String patient, String nitrogenousBases, String nucleicAcidsSequence, String aminoacidsSequence) {
        this.id = id;
        this.codons = codons;
        this.patient = patient;
        this.nitrogenousBases = nitrogenousBases;
        this.nucleicAcidsSequence = nucleicAcidsSequence;
        this.aminoacidsSequence = aminoacidsSequence;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the codons
     */
    public int getCodons() {
        return codons;
    }

    /**
     * @param codons the codons to set
     */
    public void setCodons(int codons) {
        this.codons = codons;
    }

    /**
     * @return the patient
     */
    public String getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(String patient) {
        this.patient = patient;
    }

    /**
     * @return the nitrogenousBases
     */
    public String getNitrogenousBases() {
        return nitrogenousBases;
    }

    /**
     * @param nitrogenousBases the nitrogenousBases to set
     */
    public void setNitrogenousBases(String nitrogenousBases) {
        this.nitrogenousBases = nitrogenousBases;
    }

    /**
     * @return the nucleicAcidsSequence
     */
    public String getNucleicAcidsSequence() {
        return nucleicAcidsSequence;
    }

    /**
     * @param nucleicAcidsSequence the nucleicAcidsSequence to set
     */
    public void setNucleicAcidsSequence(String nucleicAcidsSequence) {
        this.nucleicAcidsSequence = nucleicAcidsSequence;
    }

    /**
     * @return the aminoacidsSequence
     */
    public String getAminoacidsSequence() {
        return aminoacidsSequence;
    }

    /**
     * @param aminoacidsSequence the aminoacidsSequence to set
     */
    public void setAminoacidsSequence(String aminoacidsSequence) {
        this.aminoacidsSequence = aminoacidsSequence;
    }
    
    
}
