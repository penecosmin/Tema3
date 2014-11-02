package ingineriaprogramarii.tema3.cars;

public class Sedan extends SmallCar {

	private double fuelLevel;
	private String modelName;

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
	public Sedan(String model, double initialFuelLevel) {
		this.modelName = model;
		this.fuelLevel = initialFuelLevel;
	}

	@Override
	public void payRoadTax(double valoare) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fillWithFuel(double cantitate) {
		setFuelLevel(cantitate);
		super.fillWithFuel(cantitate);
	}

	@Override
	void washSmallCar() {
		// TODO Auto-generated method stub
		System.out.println("Ai spalat sedan-ul " + this.modelName + ".");
	}

}
