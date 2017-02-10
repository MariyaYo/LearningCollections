package TreeSet;

public class Tea implements Comparable<Tea>{
	
	String brand;
	String type;
	
	Tea(String brand, String type){
		this.brand = brand;
		this.type = type;
	}

	@Override
	public int compareTo(Tea t) {
		return (this.type + this.brand).compareTo(t.type+t.brand);
		//unique by type and brand
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return  "Tea type=" + type + ", Tea brand= " + brand ;
	}
	
}
