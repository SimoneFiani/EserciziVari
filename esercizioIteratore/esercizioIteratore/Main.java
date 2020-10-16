package esercizioIteratore;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		Stampatore s = new StampanteBuona();

		s.stampa(lista);

	}

}
