package Sets;

import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
	
		Teachers teacher = new Teachers("Pesho");
		Students pepa = new Students("Pepa");
		Students depa = new Students("Depa");
		Students fepa = new Students("Fepa");
		Students gepa = new Students("Gepa");
		Students hepa = new Students("Hepa");
		Students jepa = new Students("Jepa");		
		Students kepa = new Students("Kepa");
		Students lepa = new Students("Lepa");
		teacher.addStudents(pepa);
		teacher.addStudents(depa);
		teacher.addStudents(fepa);
		teacher.addStudents(gepa);
		teacher.addStudents(hepa);
		teacher.addStudents(jepa);
		teacher.addStudents(kepa);		
		teacher.addStudents(lepa);
		teacher.addStudents(pepa);
		
		
		System.out.println("------------Start day -------------");
		
		teacher.setInClassNow(lepa);
		teacher.setInClassNow(pepa);
		teacher.setInClassNow(gepa);
		teacher.setInClassNow(hepa);
		teacher.setInClassNow(jepa);
		teacher.setInClassNow(depa);
		
		System.out.println("The teacher " + teacher.getName() +  " gets into the classroom");
		System.out.println("He will check if everybody is here");
		System.out.println("Missing students:");
		
		for(Iterator <Students> it = teacher.getListOfStudents().iterator(); it.hasNext();){
			Students a = it.next();
			if(!teacher.getInClassNow().contains(a)){
				System.out.println(a.getName());
				a.setMissedClasses();
			}
		}
		
		System.out.println("Start class..... ");
		System.out.println("End class..... ");
		teacher.classDismissed();
		System.out.println("End day..... ");
		System.out.println("Stats for today: ");
		
		for(Students s : teacher.getListOfStudents()){
			System.out.println("Student : " + s.getName());
			System.out.println("Missed clases: " + s.getMissedClasses());
		}
	}
}
