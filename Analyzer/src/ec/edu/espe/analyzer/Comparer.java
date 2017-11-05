package ec.edu.espe.analyzer;
import ec.edu.espe.model.Analyst;
import ec.edu.espe.model.History;

public class Comparer { 
  public static void main(String[] args) {
    History history = null;
    Analyst bryan = new Analyst("bryan", "br",history);
    bryan.setName("Bryan");
    System.out.println("Nombre del Analista: "+bryan.getName()+"");
    }
}
