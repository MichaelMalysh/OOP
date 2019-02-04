package secondTask;

import java.io.File;
import java.io.FileNotFoundException;

public class MainTaskTwo {

	public static void main(String[] args) {
		Recording.createFile("one.txt");
		Recording.createFile("two.txt");
		Recording.recordToFile("one.txt", "Hello my World");
		Recording.recordToFile("two.txt", "Hello my Java-project");
		try {
			TwoInOne.saveEqualsWords(new File("one.txt"),new File("two.txt"),new File("result.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
