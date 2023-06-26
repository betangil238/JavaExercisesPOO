package EjercicioPropuesto2;

public class pentagono {
	private double lado;
	private double apotema;
	
	public double area() {
		return perimetro()*apotema/2;
	}

	public double perimetro() {
		return lado*5;
	}
}
