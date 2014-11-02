package ingineriaprogramarii.tema3.exceptions;

public class MyExceptions extends Exception {
	private static final long serialVersionUID = 1L;
	private String errorMsg;

	public MyExceptions() {
		super();
		this.errorMsg = "Exceptie necunoscuta";
	}

	public MyExceptions(String mesajEroare) {
		super(mesajEroare);
		this.errorMsg = mesajEroare;
	}

	public void printMes() {
		System.out.println("Mesajul de eroare : " + errorMsg);
	}
}
