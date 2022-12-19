package com.loadcsv;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
//		int principle = sc.nextInt();
//		float rate = sc.nextFloat();
//		int time = sc.nextInt();
//		
//		float intrest = principle * rate *time/100;
//		System.out.println("Enter Principla:"+principle);
//		System.out.println("Enter rate:"+rate);
//		System.out.println("Enter Time:"+time);
//		System.out.println("The intrest is:" +intrest);
		
//		####################### To find max value for a given 3 numbers;
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int max=0;
		
		if(a>b) {
			if(a>c) {
				max = a;
			}
			else {
				max = c;
			}
		}else {
			if(b>c) {
				max = b;
				
			}
			else {
				max=c;
			}
		}
		System.out.println("Max number is :"+max);
	}

}
