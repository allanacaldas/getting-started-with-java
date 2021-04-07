package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntroductionToList {
	public static void main(String args[]) {

		List<String> list = new ArrayList<>();

		// Appends the specified element to the end of this list (optional operation).
		list.add("Uva");
		list.add("Manga");
		list.add("Limão");
		list.add("Abacaxi");
		list.add("Kiwi");
		list.add("Melancia");

		// Inserts the specified element at the specified position in this list
		// (optional operation).
		list.add(2, "Acerola");
		list.add(3, "Mamão");

		// Returns the element at the specified position in this list.
		System.out.println(list.get(2));

		// Returns the number of elements in this list.
		System.out.println("The size list is: " + list.size());

		// Printing each element in the list
		for (String x : list) {
			System.out.println(x);
		}

		// Removes the first occurrence of the specified element from this list, if it
		// is present (optional operation).
		list.remove("Kiwi");

		// Removes the element at the specified position in this list (optional
		// operation).
		list.remove(1);

		// Removing all of the elements of this collection that satisfy the given
		// predicate.
		list.removeIf(x -> x.charAt(0) == 'M');

		// It returns the index of the first occurrence of the specified element in this
		// list, or -1 if this list does not contain the element.
		System.out.println(list.indexOf("Abacaxi"));

		// It returns a stream consisting of the elements of this stream that match the
		// given predicate
		List<String> filteredList = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println(filteredList);

		// returns an Optional (a container object which may or may not contain a non-null value) describing the first element of this stream.
		String fruta = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(fruta);

	}
}
