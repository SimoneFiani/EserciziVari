import java.util.ArrayList;
import java.util.List;

public class Controller {

	private List<Cliente> listaClienti = new ArrayList<>();

	public void aggiungiCliente(Cliente cliente) {
		try {

			listaClienti.add(cliente);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void servirePrimoCliente() {

		if (listaClienti.size() < 2 && !(listaClienti.size() == 0)) {
			System.out.println("Non c'è nessuno in fila");
			listaClienti.remove(0);
		} else if (listaClienti.size() == 0) {
			System.out.println("Non ci sono Clienti");
		} else {
			System.out.println("Sto servendo il cliente: " + listaClienti.get(0));
			listaClienti.remove(0);
		}
	}
}
