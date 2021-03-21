
public class Childdemo extends Abstraction{

	
	
	Childdemo(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	int a=10;
	
	int b=20;
	
	int c=a+b;
	
	@Override
	void show() {
		// TODO Auto-generated method stub
		
		System.out.println("Addition is "+c);
		super.display();
		
	}

	
	
	public static void main(Stringg[] args) {
		
		Childdemo c=new Childdemo(10,20);
		
		c.show();
		
	
	}
}
