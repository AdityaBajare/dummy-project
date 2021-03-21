
public abstract class Abstraction {
	
	int abc=100;
	abstract void show();
	
	
	void display() {
		System.out.println("value is "+abc);
	}
	
	Abstraction(int a, int b){
		
		int c=a*b;
		System.out.println("multiplication is "+c);
	}
}
