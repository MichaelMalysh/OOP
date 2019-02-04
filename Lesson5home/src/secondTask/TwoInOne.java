package secondTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TwoInOne {
	public static String textLoader(File file) throws FileNotFoundException {
		if (file == null) {
			throw new FileNotFoundException("Rile not found");
		}
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String str = "";
			for (; (str = br.readLine()) != null;) {
				sb.append(str);
				sb.append(System.lineSeparator());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return sb.toString();
	}

	public static String[] arrayOfWords(String text) {
		String[] lineOfText = text.split(" ");
		return lineOfText;
	}

	public static void saveToFile(String text, File file) {
		if (text == null || file == null) {
			throw new IllegalArgumentException("fail with argument");
		}
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.print(text);
			System.out.println("Printed text in " + file + " are: " + text);
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
	}

	public static boolean equalsWords(String word, String text) {
		String[] textArray = arrayOfWords(text);
		for (String wordTwo : textArray) {
			if (word.equals(wordTwo)) {
				return true;
			}
		}
		return false;
	}

	public static void saveEqualsWords(File one, File two, File three) throws FileNotFoundException {
		if (one == null || two == null || three == null) {
			throw new FileNotFoundException("File mot found");
		}
		String textOne = textLoader(one);
		String textTwo = textLoader(two);
		String[] wordArray = arrayOfWords(textOne);
		StringBuilder sb = new StringBuilder();
		for (String words : wordArray) {
			if (equalsWords(words, textTwo)) {
				sb.append(words + " ");
			}
		}
		saveToFile(sb.toString(), three);
	}
}
