package edu.jc1.less02.start;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите длину прямоугольника а = ");
		double a = sc.nextDouble();
		
		double S = 0;
		
		S = a * (a/2);
		
		System.out.println("Площадь прямоугольника = " + S);

	}

}
