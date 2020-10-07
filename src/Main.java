public class Main {

	public static void main(String[] args) {

		Controller c = new Controller();

		Cliente c1 = new Cliente("Simone", "Fiani");
		Cliente c2 = new Cliente("Christian", "Luzzetti");
		Cliente c3 = new Cliente("Riccardo", "Pellegrino");
		Cliente c4 = new Cliente("Stefano", "Ricci");
		Cliente c5 = new Cliente("Giuseppe", "Bellizia");

		c.aggiungiClienteCollection(1, c1);
		c.aggiungiClienteCollection(2, c2);
		c.aggiungiClienteCollection(3, c3);
		c.aggiungiClienteCollection(4, c4);
		c.aggiungiClienteCollection(5, c5);
		c.aggiungiClienteCollection(5, c5);
		c.aggiungiClienteCollection(5, c5);
		System.out.println(" ");
		c.servireClienteMap();
		c.servireClienteMap();
		System.out.println(" ");
		c.servirePrimoClienteList();
		c.servirePrimoClienteList();
		System.out.println(" ");
		c.servirePrimoClienteSet();
		c.servirePrimoClienteSet();

	}

}
