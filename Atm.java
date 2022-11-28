package home;

import java.util.Scanner;

public class Atm {
	
	
	
	public static void main(String[] args) {
		System.out.println("Welcome To Our ATM");
		System.out.println("Enter Your PIN");
		Scanner scan=new Scanner(System.in);		
		int a = scan.nextInt();
		if(a==1111) {
		
		System.out.println("Enter Ammount");
		}
		
		else {
			System.out.println("Wrong PIN");
			System.out.println("Try Again");
		}
		
		int c =1000;
		int b = scan.nextInt();
		int sum =c-b;
	
		
	
		if(b<1000) {
			
			System.out.println("Your Ammount is Processing");
			System.out.println("Take Your Money");
			System.out.println("Your Available Balance is "+ sum);	

	}
		else
		{
			System.out.println("Insufficient Money");
			
	}			
	}	}
	
	
	
	
	
	
	
	
	