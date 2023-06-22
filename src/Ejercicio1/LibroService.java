package Ejercicio1;
import java.util.Scanner;
public class LibroService {
	
	public Libro cargarLibro() {
		Scanner leer= new Scanner(System.in);
		Libro libro=new Libro();
		System.out.println("Ingrese el ISBN del libro");
		libro.setISBN(leer.next());
		System.out.println("Ingrese el Titulo del libro");
		libro.setTitulo(leer.next());
		System.out.println("Ingrese el autor del libro");
		libro.setAutor(leer.next());
		System.out.println("Ingrese el numero de paginas del libro");
		libro.setNumeroPaginas(leer.nextInt());

		return libro;
	}
}
