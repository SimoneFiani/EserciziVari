package esercizioCifrario;

public class CriptoSoftware {

	Cifrario cifrario;

	public String cifraLaStringa(String s) {
		return this.cifrario.cifra(s);
	}

	public Cifrario getCifrario() {
		return cifrario;
	}

	public void setCifrario(Cifrario cifrario) {
		this.cifrario = cifrario;
	}

}
