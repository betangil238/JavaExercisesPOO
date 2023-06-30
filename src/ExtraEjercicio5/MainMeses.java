package ExtraEjercicio5;

import java.util.Scanner;

public class MainMeses {
//	5. Crea una clase en Java donde declares una variable de tipo array de Strings que
//	contenga los doce meses del año, en minúsculas. A continuación, declara una variable
//	mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
//	mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
//	usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
//	el mes secreto. Un ejemplo de ejecución del programa podría ser este:
//	Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
//	No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
//	¡Ha acertado!
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		String[] meses= new String [12];
		meses[0]="enero";
		meses[1]="febrero";
		meses[2]="marzo";
		meses[3]="abril";
		meses[4]="mayo";
		meses[5]="junio";
		meses[6]="julio";
		meses[7]="agosto";
		meses[8]="septiembre";
		meses[9]="octubre";
		meses[10]="noviembre";
		meses[11]="diciembre";
		int numero=(int) Math.floor(Math.random()*(12));
		System.out.println("El numero secreto es: "+numero+" El mes secreto es: "+meses[numero]);
		int number;
		do {
			System.out.println("Ingrese el numero del mes a consultar");
			number= leer.nextInt()+1;
			if(numero==number-1) {
				System.out.println("¡Ha acertado!");
			}else {
				System.out.println("¡No ha acertado!");
			}
		}while(number-1!=numero);
		
	}

}
