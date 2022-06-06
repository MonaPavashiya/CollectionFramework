package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;


public class RemoveDuplicateElements {

	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,3,5,6,7,8,7,9));
		
		//LinkedHashSet
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> numberslistWIthoutDuplicates = new ArrayList<Integer>(linkedHashSet);
		System.out.println(numberslistWIthoutDuplicates);
		
	}

}
