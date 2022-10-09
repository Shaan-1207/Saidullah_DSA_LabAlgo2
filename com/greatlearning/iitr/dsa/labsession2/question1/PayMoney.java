package com.greatlearning.iitr.dsa.labsession2.question1;

import java.util.Scanner;

/**
 * PayMoney. processes thousands of transactions daily amounting to CRORS of
 * RUPEES. They also have a daily target that they must achieve. Given a list of
 * transactions done by PayMoney and a daily target, your task is to determine
 * at which transaction PayMoney achieves the same. If the target is not
 * achievable, then display the target is not achieved.
 * 
 * @author Saidullah
 */

public class PayMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//take user input for size of array
		System.out.print("Enter the size of transection array: ");
		int size = sc.nextInt();

		
		//input for array value
		int arr[] = new int[size];
		System.out.print("Enter the value of array: ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}


		System.out.print("Enter the total no of targets that needs to be achieved: ");
		//input for no. of target
		int targetNO = sc.nextInt();
		while (targetNO-- != 0) {
			int flag = 0;
			int target;
			
			System.out.print("Enter the value of target: ");
			target = sc.nextInt();
			int sum = 0;
			for (int i = 0; i < size; i++) {
				sum += arr[i];
				if (sum >= target) {
					System.out.print("\nTarget achieved after " + (i + 1) + " transactions");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("\nGiven target is not achieved");
			}
		}
		sc.close();
	}
}
