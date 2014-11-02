package ingineriaprogramarii.tema3.interfaces;

import ingineriaprogramarii.tema3.exceptions.MyExceptions;

/**
 * 
 * interfata pentru automobile de toate tipurile
 * 
 */

public interface IMovable {

	
	void fillWithFuel(double catitate) throws MyExceptions;
	
	void payRoadTax(double valoare);
	
	double getFuelLevel();
}
