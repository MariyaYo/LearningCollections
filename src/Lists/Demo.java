package Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Demo {
	public static void main(String[] args) {
		PetStore store = new PetStore();
		Animal animal1 = new Cat();
		Animal animal2 = new Cat();
		Animal animal3 = new Parrot();
		Animal animal4 = new Dog();
		Animal animal5 = new Parrot();
		Animal animal6 = new Dog();
		Animal animal7 = new Cat();
		store.petStore.add(animal1);
		store.petStore.add(animal2);
		store.petStore.add(animal3);
		store.petStore.add(animal4);
		store.petStore.add(animal5);
		store.petStore.add(animal6);
		store.petStore.add(animal7);
		
		for(Iterator<Animal> it = store.petStore.iterator(); it.hasNext();){
			it.next().makeNoise();
		}
		System.out.println("................................................");
		Person buyer = new Person();
		buyer.buyPet(animal6);
		store.sellAnimal(animal6);
		
		for(Iterator<Animal> it = store.petStore.iterator(); it.hasNext();){
			it.next().makeNoise();
		}
		
		System.out.println("................................................");
		
		ArrayList<Animal> delivery = new ArrayList<>();
		Animal ani1 = new Cat();
		Animal ani2 = new Cat();
		Animal ani3 = new Parrot();
		Animal ani4 = new Dog();
		delivery.add(ani1);
		delivery.add(ani2);
		delivery.add(ani3);
		delivery.add(ani4);
		delivery.add(animal6);
		delivery.add(animal7);
		
		
		for(Iterator <Animal> it = store.petStore.iterator(); it.hasNext();){
			Animal x = it.next();
			for(Iterator <Animal> it2 = delivery.iterator(); it2.hasNext();){
				if(x.equals(it2.next())){
					it.remove();
				}
			}
		}
		//i know there is a more easy way, but this is for practice so it's ok
		
		for(Iterator <Animal> it = store.petStore.iterator(); it.hasNext();){
			it.next().eat();
		}
		
		System.out.println("..........................................");
		for (Animal a : delivery) {
			a.sleep();	
		}
		
		
		System.out.println("..............................");
		
		Stack<Animal> stekcheOtJivotni = new Stack<>();
		
		stekcheOtJivotni.push(animal4); //dog
		stekcheOtJivotni.push(animal2); //cat
		stekcheOtJivotni.push(ani3); //parrot
		System.out.println(stekcheOtJivotni.pop().toString());
		System.out.println(stekcheOtJivotni.peek().toString());
		
		
		System.out.println("--------------------------------");
		
		Queue<Animal> queuOfAnimal = new LinkedList<>();
		queuOfAnimal.offer(ani1); //cat
		queuOfAnimal.offer(ani2); //cat
		queuOfAnimal.offer(ani3); //parrot
		queuOfAnimal.offer(ani4); //dog
		queuOfAnimal.offer(animal6); //dog
		queuOfAnimal.offer(animal7); //cat
		
		System.out.println(queuOfAnimal.remove().toString());
		System.out.println(queuOfAnimal.poll().toString());
		System.out.println(queuOfAnimal.peek().toString());
		
		
		System.out.println("------Priority queue ueueue --------");
		
		PriorityQueue<Animal> priorityQueue = new PriorityQueue<>(new AnimalSortedByName());
		//sort by name
		priorityQueue.offer(ani1); //cat - 1
		priorityQueue.offer(ani3); //parrot - 3 
		priorityQueue.offer(ani4); //dog - 2
		
		System.out.println(priorityQueue.remove().toString());
		System.out.println(priorityQueue.poll().toString());
		System.out.println(priorityQueue.peek().toString());
		
	}
}
