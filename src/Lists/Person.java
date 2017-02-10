package Lists;

public class Person {
	
	private double money;
	Animal myPet;
	
	Person(){
		//TODO better constructor than this one
	}

	void buyPet(Animal x){
		//TODO some if stuff
		this.myPet = x;
		this.money -= x.getPrice();
	}
}
