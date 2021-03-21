
public class Static {
	
	static {
		System.out.println("i am in statc block");
	}
	
	int a=0;
	static int b=0;

	static void m() {
		
		System.out.println("not required obkect to call");
	}
	
	void add() {
	
		a++;
		b++;
		System.out.println("value of a is "+a);
		
		System.out.println("value of b is "+b);
		
		
	}
	
	public static void main(Stringg[] args) {
		Static s=new Static();
		Static s1=new Static();
		Static s2=new Static();
		
		s.m();
		s1.m();
		s.add();
		s1.add();
		s2.add();
	}
	
	

}
