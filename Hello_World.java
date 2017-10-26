public class Hello_World{
  public static void main(String[] args) {
    System.out.println("Hola mundo");
	Chicken chicken;
	chicken=new Chicken();
	chicken.initializeData("Brown, ", 2);
	chicken.addName("Lucy");
	chicken.print();
	chicken.layAnEgg();
	chicken.poop();
	chicken.drink();
	
	Chicken grace;
	grace=new Chicken();
	grace.addName("Grace");
	grace.layAnEgg();
	
	Chicken maid;
	maid=new Chicken();
	maid.addName("Maid");
	maid.drink();
	
	Chicken sofia;
	sofia=new Chicken();
	sofia.addName("Sofia");
	sofia.poop();
  }
  
}

