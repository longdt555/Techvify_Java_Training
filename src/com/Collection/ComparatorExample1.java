package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample1 {

	public static void main(String[] args) {
		//create a list student
		List<Student> lstStudents = new ArrayList<Student>();
		lstStudents.add(new Student(1,"a",20));
		lstStudents.add(new Student(1,"b",10));
		lstStudents.add(new Student(1,"d",30));
		lstStudents.add(new Student(1,"c",90));
		//before sort
		showInfor(lstStudents);
		//sort list student by it's name ASC
		System.out.println("-----------Sort list student by it's name ASC: ");
		sortByName(lstStudents);
		showInfor(lstStudents);
		// sort list student by it's age ASC
        System.out.println("-----------Sort list student by it's age ASC: ");
        sortByAge(lstStudents);
        showInfor(lstStudents);
	}
	
	public static void showInfor(List<Student> lstStudents) {
		for(Student t: lstStudents) {
			System.out.println(t.toString());
		}
	}
	//created an anonymous object java.util.Compareator to install the compare() method
	public static void sortByName(List<Student> lstStudents) {
		Collections.sort(lstStudents, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}
	
	public static void sortByAge(List<Student> lstStudents) {
		Collections.sort(lstStudents, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() > o2.getAge() ? 1 : -1;
			}
		});
	}
}


