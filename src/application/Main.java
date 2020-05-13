package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Enter the income: ");
		double income = scanner.nextDouble();
		System.out.println();
		if (income > 2000.00 && income <= 3000.00)	{
			income = income * 0.08;
			System.out.printf("U$ %.2f", income);
		}
		else if (income > 3000.00 && income <= 4500.00) {
			income = (1000 * 0.08) + ((income - 3000) * 0.18);
			System.out.printf("U$ %.2f", income);
		}
		else if (income > 4500.00) {
			income = (1000 * 0.08) + (1500 * 0.18) + ((income - 4500) * 0.28);
			System.out.printf("U$ %.2f", income);
		}
		else System.out.println("Tax free!");
		
		scanner.close();
	}

}
