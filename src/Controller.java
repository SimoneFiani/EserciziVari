import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Controller {
	private Integer countCodaClienti = 1;
	private List<Cliente> listaClienti = new ArrayList<>();
	private Map<Integer, Cliente> mappaClienti = new HashMap<>();
	private Set<Cliente> setClienti = new HashSet<Cliente>();

	public void aggiungiClienteCollection(Integer numeroCliente, Cliente cliente) {
		listaClienti.add(cliente);
		mappaClienti.put(numeroCliente, cliente);
		if (setClienti.contains(cliente)) {
			System.out.println("cliente già inserito");
		} else {
			System.out.println("cliente inserito correttamente");
			setClienti.add(cliente);
		}
	}

	public void servirePrimoClienteList() {

		if (listaClienti.size() < 2 && !(listaClienti.size() == 0)) {
			System.out.println("Non c'è nessuno in fila, entra il cliente: " + listaClienti.get(0));
			listaClienti.remove(0);
		} else if (listaClienti.size() == 0) {
			System.out.println("Non ci sono Clienti");
		} else {
			System.out.println("Sto servendo il cliente: " + listaClienti.get(0));
			listaClienti.remove(0);
			System.out.println("Utenti attualmente in coda: " + listaClienti.size());
		}
	}

	public void servireClienteMap() {

		if (mappaClienti.size() > 2) {
			System.out.println(
					"serviamo il cliente: " + mappaClienti.get(countCodaClienti) + ", con numero: " + countCodaClienti);
			System.out.println("ci sono attualmente in coda n°" + (mappaClienti.size() - 1) + " clienti");
			mappaClienti.remove(countCodaClienti);
			countCodaClienti++;

		} else if (mappaClienti.size() == 2) {
			System.out.println(
					"serviamo il cliente: " + mappaClienti.get(countCodaClienti) + ", con numero: " + countCodaClienti);
			System.out.println("attulamente c'è solo n°1 utente in coda");
			mappaClienti.remove(countCodaClienti);
			countCodaClienti++;

		} else if (mappaClienti.size() == 1) {
			System.out.println(
					"serviamo il cliente: " + mappaClienti.get(countCodaClienti) + ", con numero: " + countCodaClienti);
			System.out.println("non ci sono utenti in coda");
			mappaClienti.remove(countCodaClienti);
			countCodaClienti++;
		}

	}

	public void servirePrimoClienteSet() {

		for (Cliente c : setClienti) {

			if (setClienti.size() > 2) {
				System.out.println("serviamo il cliente: " + c);
				System.out.println("clienti attualmente in coda: " + (setClienti.size() - 1));
				setClienti.remove(c);
			} else if (setClienti.size() == 1) {
				System.out.println("serviamo il cliente: " + c);
				System.out.println("non ci sono clienti in coda");
			} else {
				System.out.println("non ci sono clienti in sala");
			}

		}

	}

}
