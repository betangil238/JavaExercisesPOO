package ExtraEjercicio6;

import java.util.Scanner;

public class AhorcadoService {
	Scanner leer= new Scanner(System.in);
	
	public Ahorcado crearJuego() {
		String palabra="";
		System.out.println("Ingrese la palabra para jugar");
		palabra=leer.next();
		int longitud=palabra.length();
		String[] arr=new String[longitud];
		System.out.println("Ingrese la cantidad de oportunidades");
		int oportunidades=leer.nextInt();
		for (int i=0;i<longitud;i++) {
			arr[i]=String.valueOf(palabra.charAt(i));
		}
		Ahorcado ahorcado=new Ahorcado(arr, 0, oportunidades);
		return ahorcado;
	}
	

}
