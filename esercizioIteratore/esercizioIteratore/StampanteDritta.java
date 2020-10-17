package esercizioIteratore;

import java.util.Iterator;
import java.util.List;

public class StampanteDritta implements Stampatore {

	@Override
	public void stampa(List<String> l) {

		Iterator<String> iteratore = l.iterator();
		if (l.isEmpty()) {
			System.out.println("la lista è vuota");

		} else {
			while (iteratore.hasNext()) {
				String s = iteratore.next();
				System.out.println(s);
			}
		}
	}

}
