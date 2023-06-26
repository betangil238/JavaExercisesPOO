package EjercicioPropuesto2;

public class triangulo {
	private double base;
	private double altura;
	private double lado;

	public double area() {
		return base*altura/2;
	}

	public double perimetro() {
		return base+altura+lado;
	}
}

