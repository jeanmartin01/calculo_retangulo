package app;

import java.util.Locale;
import java.util.Scanner;
import Entidades.Retangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle x;
		
		x = new Retangle();
		
		System.out.println("Enter retangle Width and Height: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		
		double areaX = x.area();
		double perimeterX = x.perimeter();
		double diagonalX = x.diagonal();
		
		System.out.printf("AREA = %.2f%n", areaX);
		System.out.printf("PERIMETER = %.2f%n",perimeterX);
		System.out.printf("DIAGONAL = %.2f%n", diagonalX);
		
		sc.close();
	}

}
