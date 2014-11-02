package ingineriaprogramarii.tema3.cars;

import ingineriaprogramarii.tema3.exceptions.MyExceptions;
import ingineriaprogramarii.tema3.interfaces.IMovable;

public abstract class SmallCar implements IMovable {

	@Override
	public void fillWithFuel(double cantitate) throws MyExceptions {
		System.out.println("Ai adaugat " + cantitate + " litri intr-un masina mica.");
	}

	abstract void washSmallCar();

}
