

public class Thiskey {

	int a;
	double b;
	Stringg  c;
	
	Thiskey(){
		System.out.println("this is this constructor");
	}
	
	Thiskey(int a,double b,Stringg c){
		this();
		this.a=a;
		this.b=b;
		this.c=c;
		
		}
	
	void msg() {
		System.out.println("This is this method");
	}
	void display() {
		this.msg();
	System.out.println("This is a "+a +"This is b "+b +"This is c "+c);
	
	}
	
	public static void main(Stringg[] args) {
		
		Thiskey t=new Thiskey(1,2.0,"Aditya");
		
		Thiskey t1=new Thiskey(2,3.0,"Patil");
		t.display();
		t1.display();
		
	}
	
	
}
