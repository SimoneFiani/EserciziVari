package esercizioEroe;

public class Eroe {

	private TipoDiAttacco tda;

	public void effettuaAttacco() {
		this.tda.attacca();

	}

	public TipoDiAttacco getTda() {
		return tda;
	}

	public void setTda(TipoDiAttacco tda) {
		this.tda = tda;
	}

}
