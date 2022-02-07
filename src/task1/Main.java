package task1;

import java.util.Scanner;

public class Main {
	public static Integer countSum(String line) {
		int sum = 0;
		for (int i = 0; i < line.length(); i++) {
			if (Character.isDigit(line.charAt(i))) {
				sum += Character.getNumericValue(line.charAt(i));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		System.out.print(countSum(line));
	}
}
