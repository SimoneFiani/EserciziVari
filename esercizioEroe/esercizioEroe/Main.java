package esercizioEroe;

import tipiDiAttacco.AttaccoAManiNude;
import tipiDiAttacco.AttaccoConAscia;
import tipiDiAttacco.AttaccoConMegaPugno;

public class Main {

	public static void main(String[] args) {

		Eroe eroe = new Eroe();

		eroe.setTda(new AttaccoAManiNude());

		eroe.effettuaAttacco();

		eroe.setTda(new AttaccoConAscia());

		eroe.effettuaAttacco();

		eroe.setTda(new AttaccoConMegaPugno());

		eroe.effettuaAttacco();

		eroe.setTda(() -> System.out.println("attacco con lambda"));

		eroe.effettuaAttacco();

	}

}
