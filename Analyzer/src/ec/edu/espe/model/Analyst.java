//package 
package ec.edu.espe.model;
//class
public class Analyst {
//Atributoss
    private String name;
    private String initials;
    private History history;

    //constructor

    public Analyst(String name, String initials, History history) {
        this.name = name;
        this.initials = initials;
        this.history = history;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the initials
     */
    public String getInitials() {
        return initials;
    }

    /**
     * @param initials the initials to set
     */
    public void setInitials(String initials) {
        this.initials = initials;
    }

    /**
     * @return the history
     */
    public History getHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(History history) {
        this.history = history;
    }
    
    public void setname(String bryan){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getname(){
        
      throw new UnsupportedOperationException("Not supported yet.");
    }
}
    