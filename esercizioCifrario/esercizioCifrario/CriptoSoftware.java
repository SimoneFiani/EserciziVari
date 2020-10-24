package esercizioCifrario;

public class CriptoSoftware {

	private Cifrario cifrario;

	public String cifraStringa(String s) {
		return cifrario.cifra(s);
	}

	public void setCifrario(Cifrario cifrario) {
		this.cifrario = cifrario;
	}

}
