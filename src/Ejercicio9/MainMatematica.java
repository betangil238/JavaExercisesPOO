package Ejercicio9;

public class MainMatematica {
//	9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
//	los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
//	constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
//	Math.random para generar los dos números y se guardaran en el objeto con su
//	respectivos set. Deberá además implementar los siguientes métodos:
//
//	a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//	b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//	elevado al menor número. Previamente se deben redondear ambos valores.
//	c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//	Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

	public static void main(String[] args) {
		Matematica matematicas=new Matematica();
		int num1=(int) Math.floor(Math.random()*100);
		int num2=(int) Math.floor(Math.random()*100);
		matematicas.setNum1(num1);
		matematicas.setNum2(num2);
		matematicas.devolverMayor();
		double number=matematicas.calcularPotencia();
		System.out.println("La potencia es: "+ number);
		matematicas.calculaRaiz();

	}

}
