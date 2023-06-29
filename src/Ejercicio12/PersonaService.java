package Ejercicio12;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
	
	Scanner leer = new Scanner (System.in);
	
	public Persona crearPersona(){
		System.out.println("Ingrese el nombre de la persona");
		String nombre=leer.next();
		System.out.println("Ingrese el dia de nacimiento");
		int dia= leer.nextInt();
		System.out.println("Ingrese el mes de nacimiento");
		int mes= leer.nextInt();
		System.out.println("Ingrese el anio de nacimiento");
		int anio= leer.nextInt();
		Date fechadada = new Date(anio-1900, mes-1, dia);
		Persona persona=new Persona(nombre,fechadada);
		return persona;
	}
	
	public int calcularEdad(Persona persona) {
		Date fecha = new Date();
		int anioactual=persona.getFecha().getYear();
		return fecha.getYear()-anioactual;
	}
	
	public boolean menorQue(int edad) {
		System.out.println("Porfavor ingrese una edad");
		int edadingresada= leer.nextInt();
		return edadingresada>edad;
	}
	
	public void mostrarPersona(Persona persona) {
		System.out.println("El nombre es: "+persona.getNombre()+" la fecha de nacimiento es: "+persona.getFecha());
		
	}

}
