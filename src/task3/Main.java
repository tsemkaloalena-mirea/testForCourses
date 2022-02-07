package task3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Character> alphabet = new ArrayList<>(Arrays.asList('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'));
		String[] words = in.nextLine().split(" ");
		HashMap<Integer, Object> vowels = new HashMap<>();
		for (String word : words) {
			int n = 0;
			for (int i = 0; i < word.length(); i++) {
				if (alphabet.contains(word.charAt(i))) {
					n++;
				}
			}
			if (vowels.containsKey(n)) {
				if (vowels.get(n) instanceof String) {
					ArrayList<String> newVal = new ArrayList<>();
					newVal.add((String) vowels.get(n));
					newVal.add(word);
					vowels.put(n, newVal);
				}
				else {
					ArrayList<String> newVal = (ArrayList<String>) vowels.get(n);
					newVal.add(word);
					vowels.put(n, newVal);
				}
			}
			else {
				vowels.put(n, word);
			}
		}
		ArrayList<Integer> sortedKeys = new ArrayList(vowels.keySet());
		Collections.sort(sortedKeys);
		Collections.reverse(sortedKeys);
		for (Integer key : sortedKeys) {
			if (vowels.get(key) instanceof String) {
				System.out.println(((String) vowels.get(key)).toUpperCase().charAt(0) + ((String) vowels.get(key)).substring(1));
			}
			else {
				for (String word : (ArrayList<String>) vowels.get(key)) {
					System.out.println(word.toUpperCase().charAt(0) + word.substring(1));
				}
			}
		}


	}
}
