package JavaFeatures;

public interface Features {
	
	void add();
	
default void show() {
		
		System.out.println("This is default method");
	}

}
