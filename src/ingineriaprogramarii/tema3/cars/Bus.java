package ingineriaprogramarii.tema3.cars;

public class Bus extends BigCar {

	private int freeSeats;
	private String modelName;
	private double fuelLevel;

	/* getModelName */
	public String getModelName() {
		return modelName;
	}

	/* setModelName */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	/* getFreeSeats */
	public int getFreeSeats(){
		return this.freeSeats;
	}

	/*constructor */
	public Bus(String modelName, int seats, double initialFuelLevel){
		this.modelName = modelName;
		this.freeSeats = seats;
		this.fuelLevel = initialFuelLevel;
	}
	
	@Override
	public void payRoadTax(double valoare) {
		// TODO Auto-generated method stub
		System.out.println("Ai platit taxa de drum in valoare de " + valoare
				+ " RON pentru autobuzul " + this.getModelName());
	}

	@Override
	public double getFuelLevel() {
		// TODO Auto-generated method stub
		return this.fuelLevel;
	}

	@Override
	public void washBigCar() {
		// TODO Auto-generated method stub
		System.out.println("S-a programat o spalare pentru autobuzul "
				+ this.modelName + " pentru urmatoare intrare la garaj.");
	}
	
	public void getIn(int numarPasageri){
		this.freeSeats -= numarPasageri; 
	}

}
