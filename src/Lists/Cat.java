package Lists;

public class Cat extends Animal {
	
	Cat(){
		//TODO better constructor than this one
		this.setName("Cat");
		//yeah thats ok xD
		this.setAge(1);
	}

	void makeNoise() {
		System.out.println("mew");
	}

	void eat() {
		System.out.println("Eat like a cat");
		
	}

	void sleep() {
		System.out.println("Sleep curled up in ball");
		
	}

}
