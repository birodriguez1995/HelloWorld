public class Hello_World{
  public static void main(String[] args) {
    System.out.println("Hola mundo");
	Chicken chicken;
	chicken=new Chicken("Lucy","Brown", 2);
	chicken.initializeData("Brown, ", 2);
	chicken.addName("Lucy");
	chicken.print();
	chicken.layAnEgg();
	chicken.poop();
	chicken.drink();
	
	Chicken grace;
	grace=new Chicken("Grace","red",5);
	grace.addName("Grace");
	grace.layAnEgg();
	
	Chicken maid;
	maid=new Chicken("Maid","white",6);
	maid.addName("Maid");
	maid.drink();
	
	Chicken sofia;
	sofia=new Chicken("sofia","black",3);
	sofia.addName("Sofia");
	sofia.setName("Anita");
	System.out.println("El nombre de la gallina es: "+sofia.getName()+" ");
	sofia.setColor("Cafe");
	System.out.println("El color de la gallina es: "+sofia.getColor()+" ");
	sofia.setAge(10);
	System.out.println("La edad de la gallina es: "+sofia.getAge()+" ");
  }
}

