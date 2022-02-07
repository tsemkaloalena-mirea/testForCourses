package task2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double x = in.nextDouble();
		if (x == Math.round(x)) {
			int n = (int)Math.round(x);
			int d = 2;
			System.out.print("1");
			while (n > 1) {
				while (n % d == 0) {
					System.out.print(", " + d);
					n = n / d;
				}
				d++;
			}
		} else {
			System.out.print("Введённое число не целое");
		}

	}
}
