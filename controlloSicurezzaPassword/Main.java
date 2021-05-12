package controlloSicurezzaPassword;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {

		String passwordUtente = "ciaoo";

		/*
		 * Predicate<String> isMatched = new Predicate<String>() {
		 * 
		 * @Override public boolean test(String t) {
		 * 
		 * return false; } };
		 */

		try (FileReader fr = new FileReader(
				"C:\\Users\\Simone\\eclipse-workspace\\controlloSicurezzaPassword\\src\\controlloSicurezzaPassword\\registroPassword.txt");
				BufferedReader br = new BufferedReader(fr)) {

			double start = System.currentTimeMillis();

			br.lines().filter(line -> line.equals(passwordUtente))
					.forEach(line -> System.out.println("Password non sicura"));

			double end = System.currentTimeMillis();

			System.out.println("INFO: controllo password in " + (end - start) / 1000 + " secondi");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
