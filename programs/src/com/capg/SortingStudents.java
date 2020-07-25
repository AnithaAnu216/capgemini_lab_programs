package com.capg;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SortingStudents {

		
		public static void main(String[] args) {
			List<Student> students=Arrays.asList(
					new Student("Anitha",21,5.8),
					new Student("Ram",20,5.5),
					new Student("Janani",19,5.1)
					
					);
			
			
			Set<Student> studentSet=new HashSet<>(students);
			
			
			
			System.out.println("Student Set - "); 
			studentSet.forEach(t->System.out.println(t));
			
			Collections.sort(students,(t1,t2)->t1.name.compareTo(t2.name));
			System.out.println();
			System.out.println("Student List - ");
			students.forEach(t->System.out.println(t));
		}
}
			

		class SortByAge implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			return s1.age-s2.age;
		}
		}

		class SortByName implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
		}

		class SortByHeight implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			return s1.height.compareTo(s2.height);
		}
		}
