package EjercicioPropuesto2;

public class hexagono {
	private double lado;
	private double apotema;
	
	public double area() {
		return perimetro()*apotema/2;
	}

	public double perimetro() {
		return lado*6;
	}

}
