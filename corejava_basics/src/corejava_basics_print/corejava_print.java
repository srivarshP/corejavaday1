package corejava_basics_print;

import java.util.Scanner;

public class corejava_print {

	public static void main(String[] args) {
		int a,b,c,OPS=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of A");
		a=s.nextInt();
		System.out.print("Enter the value of B");
		b=s.nextInt();
		System.out.print("Enter the value of C");
		c=s.nextInt();
		System.out.print("for add use 1 ,for subraction use 2 for multiplication use 3");
		OPS=s.nextInt();
		if(OPS==1) {
		System.out.print("the sum of "+a+" and "+b+" and "+c+" are "+(a+b+c));
		}
		if(OPS==2) {
			System.out.print("the sum of "+a+" and "+b+" and "+c+" are "+(a-b-c));
		}
		if(OPS==3) {
			System.out.print("the sum of "+a+" and "+b+" and "+c+" are "+(a*b*c));
		}
	}
	

}
