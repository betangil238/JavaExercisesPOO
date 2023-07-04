package EjercicioExtra3;

import java.util.Scanner;

public class PeliculaService {
	Scanner leer= new Scanner(System.in);
	
	public Pelicula CrearPelicula() {
		System.out.println("Porfavor ingrese el titulo de la pelicula");
		String titulo= leer.next();
		System.out.println("Ingrese el genero de la pelicula");
		String genero= leer.next();
		System.out.println("Ingrese el ano de la pelicula");
		int ano=leer.nextInt();
		System.out.println("Ingrese la duracion de la pelicula");
		String duracion= leer.next();
		Pelicula pelicula=new Pelicula(titulo,genero,ano,duracion);
		return pelicula;
	}
}
