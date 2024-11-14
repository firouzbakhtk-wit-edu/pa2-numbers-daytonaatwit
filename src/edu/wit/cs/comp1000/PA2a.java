package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter five whole numbers: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		double e = scanner.nextDouble();
		double countpositive = 0;
		double countnegative = 0;
		double sumpositive = 0;
		double sumnegative = 0;
		
		if (a > 0) {
		countpositive++;
		sumpositive = sumpositive + a;
		}
		else if (a < 0) {
		countnegative++;
		sumnegative = sumnegative + a;
		}
		else {
		a = 0;	
		countnegative++;
		}
		if (b > 0) {
		countpositive++;
		sumpositive = sumpositive + b;
		}
		else if (b < 0) {
		countnegative++;
		sumnegative = sumnegative + b;
		}
		else {
		b = 0;
		countnegative++;
		}
		if (c > 0) {
		countpositive++;
		sumpositive = sumpositive + c;
		}
		else if (c < 0) {
		countnegative++;
		sumnegative = sumnegative + c;
		}
		else {
		c = 0;
		countnegative++;
		}
		if (d > 0) {
		countpositive++;
		sumpositive = sumpositive + d;
		}
		else if (d < 0) {
		countnegative++;
		sumnegative = sumnegative + d;
		}
		else {
		d = 0;
		countnegative++;
		}
		if (e > 0) {
		countpositive++;
		sumpositive = sumpositive + e;
		}
		else if (e < 0) {
		countnegative++;
		sumnegative = sumnegative + e;
		}
		else {
		e = 0;
		countnegative++;
		}
		
		
		
		double totalavg = ((a + b + c + d + e)/5);
		double positiveavg;
		double negativeavg;
		double totalsum = (a + b + c + d + e);
		
		if (a < 0 && b < 0 && c < 0 && d < 0 && e < 0) {
			positiveavg = 0.00;
		}
		else {
		positiveavg = (sumpositive / countpositive);
		}
		if (a > 0 && b > 0 && c > 0 && d > 0 && e > 0) {
		negativeavg = 0.00;
		}
		else {
		negativeavg = (sumnegative / countnegative);
		}
		
		if (countpositive == 1) {
			System.out.printf("The sum of the 1 positive number: %.0f%n", sumpositive);
		}
		else {
			System.out.printf("The sum of the %.0f positive numbers: %.0f%n", countpositive, sumpositive);
		}
		
		
		if (countnegative == 1) {
			System.out.printf("The sum of the 1 non-positive number: %.0f%n", sumnegative);
		}
		else {
		System.out.printf("The sum of the %.0f non-positive numbers: %.0f%n", countnegative, sumnegative);
		}
		
		
		System.out.printf("The sum of the 5 numbers: %.0f%n", totalsum);
		
		
		if (countpositive == 0) {
			System.out.printf("The average of the 0 positive numbers: 0.00%n");
		}
		else if (countpositive == 1) {
			System.out.printf("The average of the 1 positive number: %.2f%n", positiveavg);
		}
		else {
		System.out.printf("The average of the %.0f positive numbers: %.2f%n", countpositive, positiveavg);	
		}
		
		if (countnegative == 1) {
			System.out.printf("The average of the 1 non-positive number: %.2f%n", negativeavg);	
		}
		else {
		System.out.printf("The average of the %.0f non-positive numbers: %.2f%n", countnegative, negativeavg);
		}
		
		
		System.out.printf("The average of the 5 numbers: %.2f%n", totalavg);
	

		

	
		
		scanner.close();
	}

}
