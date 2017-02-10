package Lists;

public class Parrot extends Animal {

	
	Parrot(){
		//TODO better constructor than this one
		this.setName("Parrot");
		this.setAge(1);
	}
	@Override
	void makeNoise() {
		System.out.println("Ga ga ga");
		
	}

	@Override
	void eat() {
		System.out.println("Eat like a parrot");
		
	}

	@Override
	void sleep() {
		System.out.println("Sleep like a bird");
		
	}
	
}
