package Ejercicio7;

import java.util.Scanner;

public class personaService {
	Scanner leer= new Scanner(System.in);
	
	public persona crearPersona() {
		System.out.println("Ingrese el nombre de la persona");
		String name=leer.next();
		System.out.println("Ingrese la edad de "+ name);
		int age=leer.nextInt();
		System.out.println("Ingrese el sexo de "+ name + "('H' hombre, 'M' mujer, 'O' otro)" );
		String sex=leer.next();
		if (sex !="M" ||sex!="S" || sex!="O"){
//			corregir ingreso de sexo
			do {
				System.out.println("Ingrese el sexo de "+ name + "('H' hombre, 'M' mujer, 'O' otro)" );
				sex=leer.next();
			}while (sex =="M" && sex=="S" && sex=="O");
		}
		System.out.println("Ingrese el peso de: "+ name);
		double weigth=leer.nextDouble();
		System.out.println("Ingrese la altura de: "+ name);
		double heigth=leer.nextDouble();
		persona newperson= new persona(name,age,sex,weigth,heigth);
		return newperson;
		
		
	}
	
	

}
