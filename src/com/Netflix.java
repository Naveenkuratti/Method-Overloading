package com;

public class Netflix {
	static void display(String email, int password) {
		System.out.println("logged using "+email +" and "+ password);

	}
	static void  display(int contactno , int otp) {
		System.out.println(" logged using "+otp+" and "+contactno);
	}
	public static void main(String[] args) {
		Netflix n = new Netflix();
		n.display("NaveenKuratti@gmail.com",1234);
		System.out.println("----------------");
		n.display(997766788,12434);
	}

}
