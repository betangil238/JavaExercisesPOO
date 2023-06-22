package Ejercicio3;

public class operacion {
	private double num1;
	private double num2;
	public operacion(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public operacion() {
		super();
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double sumar(double num1,double num2) {
		return num1+num2;
	}
	
	public double restar(double num1,double num2) {
		return num1-num2;
	}
	public double multiplicar(double num1,double num2) {
		if (num1==0 || num2==0) {
			System.out.println("Imposible realizar multiplicacion por 0");
			return 0;
		}
		return num1*num2;
	}
	
	public double dividir(double num1,double num2) {
		if (num2==0) {
			System.out.println("Imposible realizar division por 0");
			return 0;
		}
		return num1/num2;
	}

}
