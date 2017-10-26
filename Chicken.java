public class Chicken{
	private String name;
	private String color;
	private int age;
	
		public void layAnEgg(){
			System.out.println("The chicken "+name+" laid an egg."); 
		}
		public void poop(){
			System.out.println("The chicken "+name+" did pooped."); 
		}
		public void drink(){
			System.out.println("The chicken "+name+" drank water."); 
		}
		public void print(){	
			System.out.println("The name of the chicken is:" + name + ", Color:" + color + "Age:"+ age+" "); 
		}
		
	public void initializeData(String color, int age){
		this.color=color;
		this.age=age;
	}
	
	public void addName(String name){
		this.name = name; 
	}
		
}

