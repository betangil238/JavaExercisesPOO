package Ejercicio3;

import java.util.Scanner;

public class operacionService {
	Scanner leer = new Scanner(System.in);
	
	public operacion crearOperacion() {
//		*********************FORMA 1 *******************
		operacion operacion=new operacion();
		System.out.println("Ingrese el numero 1");
		operacion.setNum1(leer.nextDouble());
		System.out.println("Ingrese el numero 2");
		operacion.setNum2(leer.nextDouble());
		return operacion;
		
//		*********************FORMA 2 *******************
//		System.out.println("Ingrese el numero 1 y numero 2");
//		operacion operacion=new operacion(leer.nextDouble(),leer.nextDouble());
//		return operacion;
	}

}
