
public class Chicken{

	private String name;
	private String color;
	private int age;
	
	
		public void layAnEgg(){
			System.out.println("The chicken lay an egg."); 
		}
		public void poop(){
			System.out.println("The chicken pooped."); 
		}
		public void drink(){
			System.out.println("The chicken drank."); 
		}
		public void print(){	
			System.out.println("The name of the chicken is: " + name + "color: " + color + "age: "+ age+ ""); 
		}
		
	public void initializeData(String name, String color, int age){
		this.name=name;
		this.color=color;
		this.age=age;
		
	}
		
}

