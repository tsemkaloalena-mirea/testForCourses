package task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer x = in.nextInt();

		ArrayList<ArrayList<Integer>> zero = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2, 3, 4)), new ArrayList<>(Arrays.asList(1, 5)), new ArrayList<>(Arrays.asList(0, 6)), new ArrayList<>(Arrays.asList(0, 6)), new ArrayList<>(Arrays.asList(0, 6)), new ArrayList<>(Arrays.asList(1, 5)), new ArrayList<>(Arrays.asList(2, 3, 4))));
		ArrayList<ArrayList<Integer>> one = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1)), new ArrayList<>(Arrays.asList(0, 1)), new ArrayList<>(Arrays.asList(1)), new ArrayList<>(Arrays.asList(1)), new ArrayList<>(Arrays.asList(1)), new ArrayList<>(Arrays.asList(1)), new ArrayList<>(Arrays.asList(0, 1, 2))));
		ArrayList<ArrayList<Integer>> two = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList(0, 4)), new ArrayList<>(Arrays.asList(0, 3)), new ArrayList<>(Arrays.asList(2)), new ArrayList<>(Arrays.asList(1)), new ArrayList<>(Arrays.asList(0)), new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4))));
		ArrayList<ArrayList<Integer>> three = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList(0, 4)), new ArrayList<>(Arrays.asList(3)), new ArrayList<>(Arrays.asList(2)), new ArrayList<>(Arrays.asList(3)), new ArrayList<>(Arrays.asList(0, 4)), new ArrayList<>(Arrays.asList(1, 2, 3))));
		ArrayList<ArrayList<Integer>> four = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(3)), new ArrayList<>(Arrays.asList(2, 3)), new ArrayList<>(Arrays.asList(1, 3)), new ArrayList<>(Arrays.asList(0, 3)), new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4)), new ArrayList<>(Arrays.asList(3)), new ArrayList<>(Arrays.asList(3))));
		ArrayList<ArrayList<Integer>> five = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0, 1, 2, 3)), new ArrayList<>(Arrays.asList(0)), new ArrayList<>(Arrays.asList(0)), new ArrayList<>(Arrays.asList(0, 1, 2, 3)), new ArrayList<>(Arrays.asList(4)), new ArrayList<>(Arrays.asList(0, 4)), new ArrayList<>(Arrays.asList(1, 2, 3))));
		ArrayList<ArrayList<Integer>> six = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList(0, 4)), new ArrayList<>(Arrays.asList(0)), new ArrayList<>(Arrays.asList(0, 1, 2, 3)), new ArrayList<>(Arrays.asList(0, 4)), new ArrayList<>(Arrays.asList(0, 4)), new ArrayList<>(Arrays.asList(1, 2, 3))));
		ArrayList<ArrayList<Integer>> seven = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4)), new ArrayList<>(Arrays.asList(4)), new ArrayList<>(Arrays.asList(3)), new ArrayList<>(Arrays.asList(2)), new ArrayList<>(Arrays.asList(1)), new ArrayList<>(Arrays.asList(0)), new ArrayList<>(Arrays.asList(0))));
		ArrayList<ArrayList<Integer>> eight = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList(0, 4)), new ArrayList<>(Arrays.asList(0, 3)), new ArrayList<>(Arrays.asList(2)), new ArrayList<>(Arrays.asList(0, 3)), new ArrayList<>(Arrays.asList(0, 4)), new ArrayList<>(Arrays.asList(1, 2, 3))));
		ArrayList<ArrayList<Integer>> nine = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList(0, 4)), new ArrayList<>(Arrays.asList(0, 4)), new ArrayList<>(Arrays.asList(1, 2, 3, 4)), new ArrayList<>(Arrays.asList(4)), new ArrayList<>(Arrays.asList(4)), new ArrayList<>(Arrays.asList(1, 2, 3))));

		ArrayList<ArrayList<ArrayList<Integer>>> coords = new ArrayList<>(Arrays.asList(zero, one, two, three, four, five, six, seven, eight, nine));

		ArrayList<Integer> numbers = new ArrayList<>();
		while (x > 0) {
			numbers.add(x % 10);
			x /= 10;
		}

		int max = 0;
		for (int n: numbers) {
			if (n > max) {
				max = n;
			}
		}

		for (int i = 0; i < 7; i++) {
			for (int k = numbers.size() - 1; k >= 0; k--) {
				for (int j = 0; j < 7; j++) {
					if (coords.get(numbers.get(k)).get(i).contains(j)) {
						if (max == numbers.get(k)) {
							System.out.print(numbers.get(k));
						}
						else {
							System.out.print("*");
						}
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
