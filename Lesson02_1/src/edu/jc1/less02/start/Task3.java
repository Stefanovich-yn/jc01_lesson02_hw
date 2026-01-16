package edu.jc1.less02.start;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите значение x = ");
		double x = sc.nextDouble();
		System.out.print("Введите значение y = ");
		double y = sc.nextDouble();
		
		double avg = 0;
		
		avg = (x + y)/2;
		
		System.out.println("Среднее арифметическое = " + avg);

	}

}
