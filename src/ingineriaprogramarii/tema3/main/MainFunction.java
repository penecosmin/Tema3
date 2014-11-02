package ingineriaprogramarii.tema3.main;

import ingineriaprogramarii.tema3.cars.Bus;
import ingineriaprogramarii.tema3.cars.Sedan;
import ingineriaprogramarii.tema3.exceptions.MyExceptions;

public class MainFunction {

	/*
	 * Aici incepe executia programului
	 */
	public static void main(String[] arguments) throws MyExceptions {

		Sedan mazda = new Sedan("Mazda", 21.5,55);
		try
		{
			System.out.println("Nivel combustibil pentru " + mazda.getModelName() + ":" + mazda.getFuelLevel());
			mazda.fillWithFuel(5.0);
			System.out.println("Nivel combustibil pentru " + mazda.getModelName() + ":" + mazda.getFuelLevel());
			mazda.washSmallCar();
			mazda.payRoadTax(25);		
		}
		finally
		{
			Bus citaro = new Bus("Citaro", 40, 100);
			citaro.getFuelLevel();
			System.out.println();
			System.out.println("Locuri libere in " + citaro.getModelName() + ":" + citaro.getFreeSeats());
			citaro.getIn(12);
			System.out.println("Locuri libere in " + citaro.getModelName() + ":" + citaro.getFreeSeats());
		}
	}

}
