package proveVarie;

public class StringheRipetute {

	public static void main(String[] args) {

		String esempio = "a";
		long n = 1000000000000L;

		System.out.println("la lettera a si ripete n° " + repeatedString(esempio, n) + " volte");

	}

	static long repeatedString(String s, long n) {
		long countX = 0;
		long countY = 0;
		long ripetizione = (n / s.length());
		long extra = (n - (s.length() * ripetizione));

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				countX++;
			}
		}

		for (int k = 0; k < extra; k++) {
			if (s.charAt(k) == 'a') {

				countY++;
			}
		}

		return (countX * ripetizione) + countY;

	}

}
