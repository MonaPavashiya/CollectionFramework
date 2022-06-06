package arrayListConcepts;

import java.util.ArrayList;

public class ArrayListDemo
{

	public static void main(String[] args)
	{
		       //dynamic class
		       //dynamic array
		
		      //default generic:
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add("testing");
		ar.add('T');
		ar.add(12.33);
		ar.add(true);
		
		System.out.println(ar); //it will maintain order 0 1 2 3 4 5
		
		System.out.println(ar.get(2)); //testing
		
		System.out.println("Total size of an array = "+ ar.size()); //6
		
		System.out.println("Lowest index = " + 0);  //0
		
		System.out.println("Highest index = " + (ar.size()-1)); //5
		ar.add(400);
		ar.add(500);
		System.out.println("size of array after adding 2 elements =  " + ar.size());
		
		
		
	
	}

}
