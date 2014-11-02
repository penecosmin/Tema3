package ingineriaprogramarii.tema3.cars;

import ingineriaprogramarii.tema3.exceptions.*;

public class Sedan extends SmallCar {

	private double fuelLevel;
	private String modelName;
	private double tankMaxLevel;

	/* setFuelLevel */
	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel += fuelLevel;
	}

	/* getFuelLevel */
	@Override
	public double getFuelLevel() {
		return this.fuelLevel;
	}

	/* getModel */
	public String getModelName() {
		return this.modelName;
	}

	/* constructor */
	public Sedan(String model, double initialFuelLevel, double limitaRezervor) {
		this.modelName = model;
		this.fuelLevel = initialFuelLevel;
		this.tankMaxLevel = limitaRezervor;
	}

	@Override
	public void payRoadTax(double valoare) {
		// TODO Auto-generated method stub
		System.out.println("Ai platit taxa de drum in valoare de " + valoare
				+ " RON pentru sedanul " + this.getModelName());
	}

	@Override
	public void fillWithFuel(double cantitate) throws MyExceptions {
		try {
			if (getFuelLevel() + cantitate > tankMaxLevel)
				throw new MyExceptions(
						"Catitatea de combustibil nu are loc in rezervor");
			else {
				setFuelLevel(cantitate);
				super.fillWithFuel(cantitate);
			}
		} catch (MyExceptions e) {
			// TODO Auto-generated catch block
			e.printMes();
		}
	}

	@Override
	public void washSmallCar() {
		// TODO Auto-generated method stub
		System.out.println("Ai spalat sedan-ul " + this.modelName + ".");
	}

}
