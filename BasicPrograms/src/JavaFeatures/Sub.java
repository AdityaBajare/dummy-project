package JavaFeatures;

public class Sub implements Features {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("override msg");
	}

	
	public static void main(String[] args) {
		Features f=new Sub();
		f.add();
		f.show();
		
	}
}
