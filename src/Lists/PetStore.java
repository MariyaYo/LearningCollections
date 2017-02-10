package Lists;

import java.util.ArrayList;

public class PetStore {
	
	PetStore(){
		//TODO better constructor than this one
	}
	
	
	private int money;
	ArrayList<Animal> petStore = new ArrayList();;
	
	void sellAnimal(Animal x){
		//TODO some if stuff
		petStore.remove(x);
		this.money += x.getPrice();
	}
	
}
