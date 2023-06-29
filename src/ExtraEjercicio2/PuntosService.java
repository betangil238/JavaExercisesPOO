package ExtraEjercicio2;

import java.util.Scanner;

public class PuntosService {
	Scanner leer=new Scanner(System.in);
	
	public Puntos crearPuntos() {
		System.out.println("Porfavor ingrese el valor del punto x1");
		int x1=leer.nextInt();	
		System.out.println("Porfavor ingrese el valor del punto y1");
		int y1=leer.nextInt();	
		System.out.println("Porfavor ingrese el valor del punto x2");
		int x2=leer.nextInt();	
		System.out.println("Porfavor ingrese el valor del punto y2");
		int y2=leer.nextInt();
		
		Puntos puntos=new Puntos(x1, y1, x2, y2);
		return puntos;
	}
	
	public double distancia(Puntos puntos) {
		return Math.sqrt(Math.pow((puntos.getX2()-puntos.getX1()), 2)+Math.pow((puntos.getY2()-puntos.getY1()), 2));
	}

}
