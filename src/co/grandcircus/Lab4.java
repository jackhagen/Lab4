package co.grandcircus;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String userChar;
		System.out.println("Learn your squares and cubes!");
		System.out.println();

		do {

			System.out.println("Enter an integer:");
			int userNum = scnr.nextInt();

			int square = userNum * userNum;
			int cube = userNum * userNum * userNum;

			System.out.printf("%-4s %-6s %-8s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-4s %-6s %-8s\n", "======", "======", "======");
			System.out.printf(userNum + "      " + square + "      " + cube);
			System.out.println();

			System.out.println("Continue? (y/n)");
			userChar = scnr.next();

		} while (userChar.equalsIgnoreCase("y") || userChar.equalsIgnoreCase("Yes")
				|| userChar.equalsIgnoreCase("Yep"));

		scnr.close();
	}
}