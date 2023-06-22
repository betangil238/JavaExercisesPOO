package Ejercicio5;

import java.util.Scanner;

public class cuentaService {
	Scanner leer = new Scanner(System.in);
	public cuenta crearCuenta() {
		System.out.println("Ingrese el numero de cuenta");
		int cuenta=leer.nextInt();
		System.out.println("Ingrese el DNI");
		long dni=leer.nextLong();
		System.out.println("Ingrese el saldo de su cuenta");
		int saldo=leer.nextInt();

		return new cuenta(cuenta,dni,saldo);
		
	}
}
