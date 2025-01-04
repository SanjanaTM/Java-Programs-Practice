// Sum of First N Natural numbers

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println("The sum of first " + num + " natural number is: " + num * (num + 1) / 2);
	}
}