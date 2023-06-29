package ExtraEjercicio3;

import java.util.Scanner;

public class RaicesService {
	Scanner leer = new Scanner(System.in);
	public Raices crearRaiz() {
		
		System.out.println("Ingrese el valor de a");
		int a = leer.nextInt();
		System.out.println("Ingrese el valor de b");
		int b = leer.nextInt();
		System.out.println("Ingrese el valor de c");
		int c = leer.nextInt();
		Raices raiz= new Raices(a,b,c);
		return raiz;
	}
}
