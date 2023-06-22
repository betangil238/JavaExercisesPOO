package Ejercicio2;

import java.util.Scanner;

public class circunferenciaService {
	Scanner leer= new Scanner(System.in);
	public circunferencia crearCircunferencia() {
		System.out.println("Porfavor ingrese el radio de la circunferencia");
		double radio= leer.nextDouble();
		circunferencia circunfer= new circunferencia(radio);
		return circunfer;
		
		
	}

}
