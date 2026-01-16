package edu.jc1.less02.start;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите кол-во малых бидонов n = ");
		double n = sc.nextDouble();
		System.out.print("Введите кол-во больших бидонов m = ");
		double m = sc.nextDouble();
		
		double L = 0;
		
		L = (80/n + 12) * m;
		
		System.out.println("Литров в m бидонах " + L);

	}

}
