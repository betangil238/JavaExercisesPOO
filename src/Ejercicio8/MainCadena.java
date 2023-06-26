package Ejercicio8;

import java.util.Scanner;

public class MainCadena {
//	8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
//	String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
//	una frase que puede ser una palabra o varias palabras separadas por un espacio en
//	blanco y a través de los métodos set, se guardará la frase y la longitud de manera
//	automática según la longitud de la frase ingresada. Deberá además implementar los
//	siguientes métodos:
//	a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//	frase ingresada.
//	b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//	ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
//	c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//	contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//	Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//	e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//	compone la clase con otra nueva frase ingresada por el usuario.
//	f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//	con una nueva frase ingresada por el usuario y mostrar la frase resultante.
//	g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//	encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//	la frase resultante.
//	h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//	ingresa el usuario y devuelve verdadero si la contiene y falso si no.
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Cadena cadena1=new Cadena();
		System.out.println("Porfavor ingrese una palabra");
		String palabra= leer.next();
		cadena1.setPalabra(palabra);
		int cantidadvocales=cadena1.mostrarVocales();
		System.out.println("En la frase hay: "+ cantidadvocales+ " vocales");
		String wordreverse= cadena1.invertirFrase();
		System.out.println("La palabra revertida es : "+ wordreverse);
		System.out.println("Ingrese la letra que desea consultar en la frase");
		String letra=leer.next();
		int veces=cadena1.vecesRepetido(letra);
		System.out.println("La letra ingresada esta: "+ veces + " veces");
		System.out.println("Ingrese una nueva frase");
		String nuevafrase=leer.next();
		cadena1.compararLongitud(nuevafrase);
		cadena1.unirFrases(nuevafrase);
		System.out.println("Ingrese la letra por la cual desea cambiar todas las vocales a");
		String changechar=leer.next();
		String nuevafrase1=cadena1.reemplazar(changechar);
		System.out.println("Su frase con los cambios quedaria asi: "+ nuevafrase1);
		System.out.println("Finalmente que letra desea consultar en su frase original");
		String chartofind=leer.next();
		boolean contiene=cadena1.contiene(chartofind);
		if (contiene) {
			System.out.println("La letra: "+ chartofind+ " esta en la palabra "+palabra);
		}else {
			System.out.println("La letra: "+ chartofind+ " NO esta en la palabra "+palabra);
		}
		
		
		
		
	}

}
