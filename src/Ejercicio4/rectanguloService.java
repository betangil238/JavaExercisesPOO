package Ejercicio4;
import java.util.Scanner;
public class rectanguloService {

	Scanner leer= new Scanner(System.in);
	
	public rectangulo crearRectangulo() {
		rectangulo rectangle= new rectangulo();
		System.out.println("Ingrese la altura del rectangulo");
		rectangle.setAltura(leer.nextInt());
		System.out.println("Ingrese la base del rectangulo");
		rectangle.setBase(leer.nextInt());
		return rectangle;
	}
	
	public int areaRectangulo(rectangulo rectangle) {
		return rectangle.getAltura()*rectangle.getBase();
	}
	public int perimetroRectangulo(rectangulo rectangle) {
		return rectangle.getAltura()*2+rectangle.getBase()*2;
	}
	
	public void dibujarrectangulo(rectangulo rectangle) {
		String asterisco = "*";
		String space="";
		String wordbase="";
		for (int j=0;j<rectangle.getBase();j++) {
			wordbase+="*";
		}
		for (int k=0;k<rectangle.getBase()-2;k++) {
			space+=" ";
		}
		
		for (int i=0;i< rectangle.getAltura();i++) {
			if (i==0 || i==rectangle.getAltura()-1) {
				System.out.println(wordbase);
			}else {
				String centro="*"+space+"*";
				System.out.println(centro);
			}
		}
	}
}
