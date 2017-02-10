package TreeSet;

import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		
		
		TreeSet<Tea> allOfTheTeaInTheWorld = new TreeSet<>();
		//tree set of tea.... 
		TreeSet<Tea> teasFromOneType = new TreeSet<>(new ByTypeComparator());
		
		
		allOfTheTeaInTheWorld.add(new Tea("Anmad tea", "Earl Grey"));
		allOfTheTeaInTheWorld.add(new Tea("Anmad tea", "English Tea N1"));
		allOfTheTeaInTheWorld.add(new Tea("Anmad tea", "English Breakfast"));
		allOfTheTeaInTheWorld.add(new Tea("Anmad tea", "Darieeling Tea"));
		allOfTheTeaInTheWorld.add(new Tea("Anmad tea", "Chocolate Brownie, Black tea"));
		
		allOfTheTeaInTheWorld.add(new Tea("Lipton", "Earl Grey"));
		allOfTheTeaInTheWorld.add(new Tea("Lipton", "Green tea"));
		allOfTheTeaInTheWorld.add(new Tea("Lipton", "Yellow lable tea"));
		allOfTheTeaInTheWorld.add(new Tea("Lipton", "Strawberry tea"));
		allOfTheTeaInTheWorld.add(new Tea("Lipton", "Green tea with Lemon"));
		allOfTheTeaInTheWorld.add(new Tea("Lipton", "Grean tea with Cinnamon"));
		allOfTheTeaInTheWorld.add(new Tea("Lipton", "Chia tea"));
		
		
		
		teasFromOneType.add(new Tea("Anmad tea", "Earl Grey"));
		teasFromOneType.add(new Tea("Anmad tea", "English Tea N1"));
		teasFromOneType.add(new Tea("Anmad tea", "English Breakfast"));
		teasFromOneType.add(new Tea("Anmad tea", "Darieeling Tea"));
		teasFromOneType.add(new Tea("Anmad tea", "Chocolate Brownie, Black tea"));
		
		teasFromOneType.add(new Tea("Lipton", "Earl Grey"));
		teasFromOneType.add(new Tea("Lipton", "Green tea"));
		teasFromOneType.add(new Tea("Lipton", "Yellow lable tea"));
		teasFromOneType.add(new Tea("Lipton", "Strawberry tea"));
		teasFromOneType.add(new Tea("Lipton", "Green tea with Lemon"));
		teasFromOneType.add(new Tea("Lipton", "Grean tea with Cinnamon"));
		teasFromOneType.add(new Tea("Lipton", "Chia tea"));

		
		
		for(Tea t : allOfTheTeaInTheWorld){
			System.out.println(t.toString());
		}
		System.out.println( " +=========================================+");
		for(Tea t : teasFromOneType){
			System.out.println(t.toString());
		}
		//here we don't have 2 Earl Grey teas .... what a waste
	}
}
