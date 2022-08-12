package collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		// 유일한 -> set
		Set<Character> charactersTreeSet = new TreeSet<>(characters);
		System.out.println(charactersTreeSet);

		Set<Character> charactersLinkedHashSet = new LinkedHashSet<>(characters);
		System.out.println(charactersLinkedHashSet);
	}
}
