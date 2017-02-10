package Lists;

public abstract class Animal {
	private String name;
	private int age;
	private double price;

	abstract void makeNoise();
	abstract void eat();
	abstract void sleep();

	public double getPrice() {
		//TODO some if stuff
		return price;
	}
	
    public String toString() { 
        String x = ("Name: " + this.name + " age: "  + this.age);
        return x;
     }
    
    
	public void setName(String name) {
		//TODO some if stuff
		this.name = name;
	}
	public void setAge(int age) {
		//TODO some if stuff
		this.age = age;
	}
	public String getName() {
		return name;
	} 
    
    
}
