// Positive or Negative number

import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("The number " + num + " is Positive.");
		} else if (num < 0) {
			System.out.println("The number " + num + " is Negative.");
		} else {
			System.out.println("The number is Zero.");
		}

	}
}