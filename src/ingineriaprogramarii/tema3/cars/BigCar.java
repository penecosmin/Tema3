package ingineriaprogramarii.tema3.cars;

import ingineriaprogramarii.tema3.interfaces.IMovable;

public abstract class BigCar implements IMovable {
	@Override
	public void fillWithFuel(double cantitate) {
		System.out.print("Ai adaugat " + cantitate + " litri intr-o masina mare.");
	}

	abstract void washBigCar();
}
