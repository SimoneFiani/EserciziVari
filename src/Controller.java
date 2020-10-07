import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Controller {

	private List<Cliente> listaClienti = new ArrayList<>();
	private Map<Integer, Cliente> mappaClienti = new HashMap<>();
	private Set<Cliente> setClienti = new HashSet<Cliente>();
	private Queue<Cliente> codaClienti = new ArrayDeque<Cliente>();

	public void aggiungiClienteCollection(Integer numeroCliente, Cliente cliente) {

		if (listaClienti.contains(cliente) || mappaClienti.containsValue(cliente) || setClienti.contains(cliente)
				|| codaClienti.contains(cliente)) {
			System.out.println("cliente già inserito");
		} else {
			System.out.println("cliente inserito correttamente");
			listaClienti.add(cliente);
			mappaClienti.put(numeroCliente, cliente);
			setClienti.add(cliente);
			codaClienti.add(cliente);
		}

	}

	public void servirePrimoClienteList() {
		int count = listaClienti.size() - 1;
		for (Cliente c : listaClienti) {
			System.out.println("serviamo il cliente: " + c);
			if (count > 0) {
				System.out.println("utenti in coda: " + count);
			} else {
				System.out.println("non ci sono persone in coda");
			}
			count--;
		}
		if (listaClienti.size() > 0) {
			System.out.println("rimuovo utenti dalla collection");
			listaClienti.clear();
		} else {
			System.out.println("inserisci nuovi clienti prima di lanciare la funzione");
		}

	}

	public void servireClienteMap() {
		int count = mappaClienti.size() - 1;
		for (Cliente c : mappaClienti.values()) {
			System.out.println("serviamo il cliente: " + c);
			if (count > 0) {
				System.out.println("utenti in coda: " + count);
			} else {
				System.out.println("non ci sono persone in coda");
			}
			count--;
		}
		if (mappaClienti.size() > 0) {
			System.out.println("rimuovo utenti dalla collection");
			mappaClienti.clear();
		} else {
			System.out.println("inserisci nuovi clienti prima di lanciare la funzione");
		}
	}

	public void servirePrimoClienteSet() {
		int count = setClienti.size() - 1;
		for (Cliente c : setClienti) {
			System.out.println("serviamo il cliente: " + c);
			if (count > 0) {
				System.out.println("utenti in coda: " + count);
			} else {
				System.out.println("non ci sono persone in coda");
			}
			count--;
		}
		if (setClienti.size() > 0) {
			System.out.println("rimuovo utenti dalla collection");
			setClienti.clear();
		} else {
			System.out.println("inserisci nuovi clienti prima di lanciare la funzione");
		}
	}

	public void servirePrimoClienteQueue() {

		while (!codaClienti.isEmpty()) {
			Cliente c = codaClienti.poll();
			System.out.println("serviamo il cliente: " + c);
			System.out.println("utenti in coda: " + codaClienti.size());
		}
		System.out.println("non ci sono persone in coda");
	}

}
