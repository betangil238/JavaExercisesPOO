package Ejercicio14;

import java.util.Scanner;

public class MovilService {
	Scanner leer= new Scanner(System.in);
	
	public Movil cargarCelular() {
		System.out.println("Porfavor ingrese la marca del movil");
		String marca= leer.next();
		System.out.println("Porfavor ingrese el precio del movil");
		double precio= leer.nextDouble();
		System.out.println("Porfavor ingrese el modelo del movil");
		String modelo= leer.next();
		System.out.println("Porfavor ingrese la memoria ram del movil");
		int memoria= leer.nextInt();
		int[] codigo = ingresarCodigo();	
		Movil movil= new Movil(marca, precio, modelo, memoria, codigo);
		return movil;
	}

	private int[] ingresarCodigo() {
		System.out.println("A continuacion va a ingresar el codigo numerico del producto");
		int[] codigo= new int[7];
		for(int i=0;i<7;i++) {
			System.out.println("Ingrese el codigo del campo "+ (i+1));
			codigo[i]=leer.nextInt();
		}
		return codigo;
	}

}
