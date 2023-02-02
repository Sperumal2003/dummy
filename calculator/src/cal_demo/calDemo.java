package cal_demo;

import java.util.Scanner;

public class calDemo {
	public static void main(String [] args){
		int num1,num2;
		Scanner in = new Scanner(System.in);
		System.out.println("enter 1st number:");
		num1 = in.nextInt();
		System.out.println("enter 2nd number:");
		num2 = in.nextInt();
		System.out.println("addtion="+(num1+num2));
		System.out.println("subtraction"+(num1-num2));	
		System.out.println("multiplication="+(num1*num2));
		System.out.println("division="+(num1/num2));
	}
	
}
