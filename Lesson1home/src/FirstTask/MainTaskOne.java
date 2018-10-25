package FirstTask;

import java.util.Arrays;
import java.util.Scanner;

public class MainTaskOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CatTaskOne catOne = new CatTaskOne("Barsik", 2.5, "White", "Siamese");
		System.out.println(catOne);

		CatTaskOne catTwo = new CatTaskOne("Pushistick", 0.5, "Ginger", "American Curl");
		System.out.println(catTwo);

		System.out.println("Call a cat(input cat name)");
		String catName = sc.nextLine();

		char[] one = catName.toCharArray();
		char[] two = catOne.getName().toCharArray();
		char[] three = catTwo.getName().toCharArray();

		if (Arrays.equals(one, two)) {
			catOne.meow();
		} else if (Arrays.equals(one, three)) {
			catOne.meow();
		}
		sc.close();
	}

}
