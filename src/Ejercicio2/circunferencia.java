package Ejercicio2;

public class circunferencia {
	private double radio;

	public circunferencia(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double Area(double radio) {
		return Math.PI*radio*radio;
	}
	
	public double perimetro(double radio) {
		return Math.PI*2*radio;
	}
	

}
