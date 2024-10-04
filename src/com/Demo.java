package com;

public class Demo {
public static void main(int x) {
	System.out.println("x:"+x);
	}
public  static void main(double x) {
	System.out.println("x"+x);

}
public static void main(String[] args) {
	Demo d = new Demo();
	
	System.out.println("start");
	
	d.main(10);
	d.main(1.5);
	System.out.println("end");
	
}
}
