// Find the Sum of the Numbers in a Given Range

import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number:");
		int num2 = sc.nextInt();
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println("The sum is: " + sum);
	}
}
