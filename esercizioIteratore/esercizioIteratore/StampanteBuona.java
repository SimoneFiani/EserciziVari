package esercizioIteratore;

import java.util.List;

public class StampanteBuona implements Stampatore {

	@Override
	public void stampa(List<String> lista) {
		for (String s : lista) {
			System.out.println(s);
		}

	}

}
