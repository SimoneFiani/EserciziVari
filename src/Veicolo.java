
public class Veicolo {
	private int prezzo;

	public Veicolo(int prezzo) {
		this.setPrezzo(prezzo);
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int scontoIva() {
		return this.prezzo - (this.prezzo / 100 * 22);
	}

}
