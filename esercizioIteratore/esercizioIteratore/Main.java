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
		Stampatore s;

		s = new StampanteDritta();
		s.stampa(lista);
		s = new StampanteRovescio();
		s.stampa(lista);
		s = System.out::println;
		s.stampa(lista);
	}

}
