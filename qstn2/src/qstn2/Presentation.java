package qstn2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Presentation {

	public static void main(String[] args) {
		 ArrayList<Student> ar = new ArrayList<Student>();
	        ar.add(new Student("pandu", 21, 5.0));
	        ar.add(new Student("priya", 19, 6.0));
	        ar.add(new Student("pavan", 18, 4.0));
	 
	 
	        Collections.sort(ar, new SortByAge());
	 
	       System.out.println("Sorted by age");
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));
	 
	        Collections.sort(ar, new SortByName());
	 
	        System.out.println("Sorted by name");
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));

	}

}
