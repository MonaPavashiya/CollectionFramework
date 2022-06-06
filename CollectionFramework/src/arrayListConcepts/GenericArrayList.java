package arrayListConcepts;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> markList = new ArrayList<Integer>();
		markList.add(100);
		
		ArrayList<Double> arD = new ArrayList<Double>();
		arD.add(12.33);
		
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Tom");
		
		System.out.println(markList);
		System.out.println(arD);
		System.out.println(studentNames);
	}

}
