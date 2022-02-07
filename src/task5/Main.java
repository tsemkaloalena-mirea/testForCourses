package task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Box box = new Box(50);
		Tool t1 = new Tool("orange", 18, 400);
		Tool t2 = new Tool("gold", 20, 200);
		Tool t3 = new Tool("cup of tea", 8, 900);
		Tool t4 = new Tool("chocolate", 10, 800);
		Tool t5 = new Tool("laptop", 18, 1000);
		ArrayList<Tool> tools = new ArrayList<>(Arrays.asList(t1, t2, t3, t4, t5));
		box.setBestTools(tools);
		System.out.println(box.getBestTools());
	}
}
