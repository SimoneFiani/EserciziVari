package esercizioCifrario;

public class Main {

	public static void main(String[] args) {

		CriptoSoftware cs = new CriptoSoftware();

		String s = "prova";

		cs.setCifrario(new CifrarioDiCesare());

		System.out.println(cs.cifraLaStringa(s));

	}
}
