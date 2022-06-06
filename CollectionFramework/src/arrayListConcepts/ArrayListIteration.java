package arrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args)
	{
	     //ways to iterate ArrayList
		ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("Tom");
		studentList.add("Naveen");
		studentList.add("Steve");
		studentList.add("Lisa");
		
		//typical for loop
		System.out.println("for loop " );
		for(int i=0; i<studentList.size(); i++)
		{
			System.out.println(studentList.get(i));
		}
		
		//for each loop
		System.out.println("for each loop " );
		for(String s : studentList)
		{
			System.out.println(s);
		}
		
		//iterator
		System.out.println("By iterator");
		Iterator<String> it =studentList.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
