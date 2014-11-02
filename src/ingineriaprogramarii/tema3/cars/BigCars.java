package ingineriaprogramarii.tema3.cars;

import ingineriaprogramarii.tema3.interfaces.IMovable;

public abstract class BigCars implements IMovable {
	@Override
	public void fillWithFuel(double cantitate) {
		System.out.print("Ai adaugat " + cantitate + " litri.");
	}

	abstract void washBigCar();
}
