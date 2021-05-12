package proveVarie;

public class GiocoNuvole {

	public static void main(String[] args) {
		int[] c = { 0, 0, 0, 1, 0, 0 };

		System.out.println("sono richiesi n°" + jumpingOnClouds(c) + " per vincere");

	}

	static int jumpingOnClouds(int[] c) {
		int salti = 0;

		for (int i = 0; i <= c.length - 2; i++) {

			if (i == c.length - 2 && c[c.length - 1] == 0) {
				salti++;
				return salti;
			}

			if (c[i + 1] == 0 && c[i + 2] == 0) {
				salti++;
				i++;
			} else if (c[i + 1] == 1 && c[i + 2] == 0) {
				salti++;
				i++;

			} else if (c[i + 1] == 0 && c[i + 2] == 1) {
				salti++;
			}
		}

		return salti;
	}
}