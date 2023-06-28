package Ejercicio9;

public class Matematica {
	private double num1;
	private double num2;
	public Matematica() {
		super();
	}
	public Matematica(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
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
	
	public void devolverMayor() {
		if  (num1>num2){
			System.out.println("El numero 1 es mayor ya que: "+ num1+ " es mayor que: "+ num2);
		}else {
			System.out.println("El numero 2 es mayor ya que: "+ num2+ " es mayor que: "+ num1);
		}
	}
	
	public double calcularPotencia() {
		if  (num1>num2){
			return Math. pow(num2, num1);
		}
		return Math. pow(num1, num2);
	}
	
	public void calculaRaiz() {
		if  (num1>num2){
			System.out.println("La raiz cuadrada del menor numero es: "+ Math.sqrt(num2));
		}else {
			System.out.println("La raiz cuadrada del menor numero es: "+ Math.sqrt(num1));
		}
	}

}
