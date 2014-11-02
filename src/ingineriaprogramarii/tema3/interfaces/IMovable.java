package ingineriaprogramarii.tema3.interfaces;

/**
 * 
 * interfata pentru automobile de toate tipurile
 * 
 */

public interface IMovable {

	
	void fillWithFuel(double catitate);
	
	void payRoadTax(double valoare);
	
	int getFuelLevel();
}
