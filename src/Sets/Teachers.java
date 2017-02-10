package Sets;

import java.util.HashSet;

public class Teachers {
	private String name;
	private HashSet<Students> listOfStudents = new HashSet<>();
	private HashSet<Students> inClassNow = new HashSet<>();
	
	Teachers(String name){
		//TODO same if stuff
		this.name = name;
	}
	 void classDismissed(){
		 inClassNow.clear();
	 }
	public void setInClassNow(Students student) {
		inClassNow.add(student);
	}
	
	void addStudents(Students a){
		this.listOfStudents.add(a);
	}
	public HashSet<Students> getListOfStudents() {
		return listOfStudents;
	}
	public HashSet<Students> getInClassNow() {
		return inClassNow;
	}
	public String getName() {
		return name;
	}
	
	
	
	 
}
