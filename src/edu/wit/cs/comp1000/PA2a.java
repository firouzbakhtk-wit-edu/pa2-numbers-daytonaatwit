package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Please enter 5 whole numbers:%n");
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
		}
		
		
		
		double totalavg = ((a + b + c + d + e)/5);
		System.out.printf("The average all 5 of the entered numbers is %.2f%n", totalavg);
		System.out.printf("The sum of the %.0f positive numbers is %.0f%n", countpositive, sumpositive);
		System.out.printf("The sum of the %.0f negative numbers is %.0f%n", countnegative, sumnegative);
		double positiveavg = (sumpositive / countpositive);
		System.out.printf("The average of the %.0f positive numbers is %.2f%n", countpositive, positiveavg);	
		double negativeavg = (sumnegative / countnegative);
		System.out.printf("The average of the %.0f negative numbers is %.2f%n", countnegative, negativeavg);
		scanner.close();
	}

}
