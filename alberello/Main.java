
package alberello;

public class Main {
	public static void main(String[] args) {

		int numeroPiani = 20;

		for (int i = 0; i < numeroPiani; i++) {
			String stringa = String.format("%" + (numeroPiani - i) + "s", "*");
			System.out.print(stringa);
			if (i > 0) {
				for (int k = 0; k < i * 2; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for (int x = 0; x < numeroPiani - 2; x++) {
			System.out.print(" ");
		}
		System.out.println("| |");

	}

}
