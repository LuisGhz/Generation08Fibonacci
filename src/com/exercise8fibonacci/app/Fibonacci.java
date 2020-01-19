package com.exercise8fibonacci.app;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		//Variable declaration
		int nUser = 0;
		long cont1 = 0;
		long cont2 = 1;
		long fibonacci = 1;
		char continueUser = 'y';
		String message = "";
		
		//Arrays declaration
		
		//Object declaration
		Scanner kInput = new Scanner(System.in);
		
		do {
			nUser = 0;
			while (nUser <= 0) {
				System.out.println("Give me a number (only positivie)");
				nUser = kInput.nextInt();
				
				if (nUser <= 0) {
					System.out.println("Not valid number!");
				}
			}
			
			message = "Serie de fibonacci hasta el elemento " + nUser + ":";
			for (int i = 0; i < nUser; i++) {
				message += " " + fibonacci;
				fibonacci = cont1 + cont2;
				cont1 = cont2;
				cont2 = fibonacci;
			}
			
			System.out.println(message);
			
			System.out.println("Do you wish to check another serie?");
			continueUser = kInput.next().charAt(0);
		}while(continueUser == 'y');
		
		//terminator
		kInput.close();
	}
}
