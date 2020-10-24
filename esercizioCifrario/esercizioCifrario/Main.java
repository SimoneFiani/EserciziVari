package esercizioCifrario;

public class Main {
	public static void main(String[] args) {

		CriptoSoftware cs = new CriptoSoftware();
		String s = "ciao";

		cs.setCifrario(new CifrarioDiCesare());

		System.out.println(cs.cifraStringa(s));

		cs.setCifrario(new CifrarioDiVegenere());

		System.out.println(cs.cifraStringa(s));

	}
}
