package com;

public class Student {
static void dispaly(int id) {
	System.out.println("id:"+id);
}
static void dispaly(String name) {
	System.out.println("String"+name);
}
static void dispaly(int id,String name) {
	System.out.println("id:"+id+"name"+name);
}


	public static void main(String[] args) {
		Student s = new Student();
		s.dispaly(101);
		s.dispaly("Naveen");
		s.dispaly(102,"Divya");

	}
}
