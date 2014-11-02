package ingineriaprogramarii.tema3.main;

import ingineriaprogramarii.tema3.cars.Sedan;

public class MainFunction {

	/*
	 * Aici incepe executia programului
	 */
	public static void main(String[] arguments) {

		Sedan mazda = new Sedan("Mazda", 21.5);
		System.out.println("Nivel combustibil pentru " + mazda.getModelName() + ":" + mazda.getFuelLevel());
		mazda.fillWithFuel(5.0);
		System.out.println("Nivel combustibil pentru " + mazda.getModelName() + ":" + mazda.getFuelLevel());
	}

}
