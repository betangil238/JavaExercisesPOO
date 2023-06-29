package Ejercicio11;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class MainFechas {
//	Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//	clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//	Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//	usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//	deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//	se puede conseguir instanciando un objeto Date con constructor vacío.
//	Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//	Ejemplo fecha actual: Date fechaActual = new Date();
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date fecha = new Date();
		System.out.println("La fecha de hoy es: "+fecha);
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese el dia a calcular");
		int dia= leer.nextInt();
		System.out.println("Ingrese el mes a calcular");
		int mes= leer.nextInt();
		System.out.println("Ingrese el anio a calcular");
		int anio= leer.nextInt();
		Date fechadada = new Date(anio-1900, mes-1, dia);
		System.out.println(fechadada);
		
		System.out.println("Entre el ano ingresado y la fecha actual hay: "+(fecha.getYear()+1900-anio)+" Anos");
	}
}
