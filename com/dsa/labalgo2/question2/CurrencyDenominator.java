package com.dsa.labalgo2.question2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CurrencyDenominator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//take user input for currency size
		System.out.print("Enter the size of currency denominations: ");
		int size = sc.nextInt();


		System.out.print("Enter the currency denominations value: ");
		Integer[] denomination = new Integer[size];
		for (int i = 0; i < size; i++) {
			denomination[i] = sc.nextInt();
		}

		Arrays.sort(denomination, Collections.reverseOrder());
		System.out.print("Enter the amount you want to pay: ");
		int amount = sc.nextInt();

		int i = 0;

		int currencyCount[] = new int[size];
		while (amount > 0) {
			currencyCount[i] = amount / denomination[i];
			amount = amount - (denomination[i] * currencyCount[i]);
			i++;
		}

		System.out.println("\nYour payment approach in order to give no of notes will be as follows");
		for (int j = 0; j < size; j++) {

			System.out.println(denomination[j] + "x :: " + currencyCount[j]);
		}
		sc.close();

	}
}
