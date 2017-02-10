package Lists;

public class Dog extends Animal{
	
	Dog(){
		//TODO better constructor than this one
		this.setName("Dog");
		this.setAge(1);
	}
	@Override
	void makeNoise() {
	System.out.println("Baff baff");
		
	}

	@Override
	void eat() {
		System.out.println("Eat like a dog");
		
	}

	@Override
	void sleep() {
		System.out.println("Sleep curled up in ball");
		
	}

}
