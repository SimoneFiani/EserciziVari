package esercizioIteratore;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("ciao");
		lista.add("mamma");
		lista.add("guarda");
		lista.add("come");
		lista.add("mi");
		lista.add("diverto");

		Stampatore s1 = new StampanteDritta();
		Stampatore s2 = new StampanteRovescio();

		s1.stampa(lista);
		System.out.println(" ");
		s2.stampa(lista);
	}

}
