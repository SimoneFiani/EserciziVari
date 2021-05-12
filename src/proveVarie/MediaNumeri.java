package proveVarie;

import java.util.Scanner;

public class MediaNumeri {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;
		int media;

		System.out.println("Dammi due numeri e ti calcolerò la media matematica");

		System.out.println("inserisci il primo numero");
		num1 = sc.nextInt();

		System.out.println("inserisci il secondo numero");
		num2 = sc.nextInt();

		if (num1 < 60 && num1 > -60 && num2 < 60 && num2 > -60) {
			media = (num1 + num2) / 2;
			if (media > 30) {
				System.out.println("fa caldo");
			} else if (media < 10) {
				System.out.println("fa freddo");
			} else {
				System.out.println("temperatura accettabile");
			}
		} else {
			System.out.println("queste temperature non sono accettabili");
		}

		sc.close();
	}
}
