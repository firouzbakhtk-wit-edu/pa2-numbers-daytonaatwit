package edu.wit.cs.comp1000;

import java.util.Scanner; 
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.printf("Enter a b c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double discriminant = (Math.pow(b, 2) - (4 * a * c));
		
		double zerodiscriminant = ((-1 * b) / (2 * a));
		double biggerrootdiscriminant = (((-1 * b) + Math.sqrt(discriminant)) / (2 * a));
		double smallerrootdiscriminant = (((-1 * b) - Math.sqrt(discriminant)) / (2 * a));
		
		if (discriminant < 0){
			System.out.printf("Roots: imaginary%n");
		}
		else if (discriminant == 0){
			System.out.printf("Root: %.2f%n", zerodiscriminant);
		}
		else {
			System.out.printf("Roots: %.2f, %.2f%n", smallerrootdiscriminant, biggerrootdiscriminant);
		}
		
		
	scanner.close();
	}

}
