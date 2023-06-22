package Ejercicio2;

public class mainCircunferencia {
//	2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//	tipo real. A continuación, se deben crear los siguientes métodos:
//	a) Método constructor que inicialice el radio pasado como parámetro.
//	b) Métodos get y set para el atributo radio de la clase Circunferencia.
//	c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//	objeto.
//	d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
//	e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
	public static void main(String[] args) {
		circunferenciaService create=new circunferenciaService();
		circunferencia circunferencia1 = create.crearCircunferencia();
		double area1= circunferencia1.Area(circunferencia1.getRadio());
		double perimetro1=circunferencia1.perimetro(circunferencia1.getRadio());
		System.out.println("El area de la circunferencia es: "+ area1+" y el permitero es: "+ perimetro1);
	}

}
