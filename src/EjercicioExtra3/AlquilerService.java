package EjercicioExtra3;

import java.util.Date;
import java.util.Scanner;

public class AlquilerService {
	Scanner leer= new Scanner(System.in);
	
	public Alquiler CrearAlquiler() {
		System.out.println("Porfavor ingrese la pelicula a alquilar");
		String pelicula= leer.next();
		System.out.println("Ingrese el dia,mes,ano de inicio del alquiler");
		int dia= leer.nextInt();
		int mes= leer.nextInt();
		int ano= leer.nextInt();
		Date fechainicio=new Date(ano-1900, mes-1, dia);
		System.out.println("Ingrese el dia,mes,ano del final del alquiler");
		int dia1= leer.nextInt();
		int mes1= leer.nextInt();
		int ano1= leer.nextInt();
		Date fechaFinal=new Date(ano1-1900, mes1-1, dia1);
		double precio;
		int dias=(fechaFinal.getYear()-fechainicio.getYear())*(12*30)+(fechaFinal.getMonth()-fechainicio.getMonth())*(30)+(fechaFinal.getDate()-fechainicio.getDate());
		if (dias<=3) {
			precio=10;
		}else {
			precio=10+((dias-3)*0.1)*10;
		}
		Alquiler alquiler= new Alquiler(pelicula, fechainicio, fechaFinal, precio);
		return alquiler;
	}
}
