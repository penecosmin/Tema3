package ingineriaprogramarii.tema3.cars;

import ingineriaprogramarii.tema3.interfaces.IMovable;

public abstract class SmallCar implements IMovable {

	@Override
	public void fillWithFuel(double cantitate) {
		System.out.println("Ai adaugat " + cantitate + " litri.");
	}

	abstract void washSmallCar();

}
