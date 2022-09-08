package com.exercises.pll;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sumeven=0;
		int sumodd=0;
		System.out.println("Enter two positive Number and number1<number2");
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		if(firstNum<secondNum && firstNum>=0 && secondNum>=0) {
			while(firstNum<=secondNum) {
				if(firstNum%2==0) {
					System.out.println("Even number's are="+firstNum);
					sumeven=sumeven+firstNum;
					
				}
				else {
					System.out.println("odd number's are="+firstNum);
					sumodd=sumodd+firstNum;
				}
				firstNum++;
			}
			System.out.println("Sum of all even Number ="+sumeven);
			System.out.println("Sum of all odd Number ="+sumodd);
		}
		else {
			System.out.println("invilide input");
		}
		
		sc.close();

	}

}
