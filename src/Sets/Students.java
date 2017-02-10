package Sets;

public class Students {
	private String name;
	private int score;
	private Teachers teacher;
	private int missedClasses = 0;
	
	Students(String name){
		//TODO some if stuff
		this.name = name;
	}
	
	void startAttendingClass(Teachers  a){
		this.teacher = a;
	}
	
	void goToClass(){
		this.teacher.setInClassNow(this);
	}

	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Students){
			Students s = (Students) obj;
			return this.name.equals(s.getName());
		}
		return false;
	}

	public void setMissedClasses() {
		this.missedClasses++;
	}

	public int getMissedClasses() {
		return missedClasses;
	}	
	
	
}
