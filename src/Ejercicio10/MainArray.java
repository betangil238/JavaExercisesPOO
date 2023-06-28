package Ejercicio10;

import java.util.Arrays;

public class MainArray {
//	10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//	de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//	programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//	Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//	ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//	0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//	20.
	public static void main(String[] args) {
		Array arreglo=new Array();
		double[] arreglo1=arreglo.getArray1();
		double[] arreglo2=arreglo.getArray2();
		System.out.println("ARREGLO NUMERO 1");
		System.out.println(Arrays.toString(arreglo1));
//		System.out.println("ARREGLO NUMERO 2");
//		System.out.println(Arrays.toString(arreglo2));
		System.out.println("ARREGLO NUMERO 1 ORDENADO");
		Arrays.sort(arreglo.getArray1());
//		Arrays.sort(arreglo.getArray2());
		System.out.println(Arrays.toString(arreglo1));
//		System.out.println("ARREGLO NUMERO 2 ORDENADO");
//		System.out.println(Arrays.toString(arreglo2));
		for (int i=0;i<20;i++) {
			if (i<10) {
				arreglo2[i]=arreglo1[i];
			}else {
				arreglo2[i]=0.5;
			}
		}
		System.out.println("ARREGLO NUMERO 2");
		System.out.println(Arrays.toString(arreglo2));
		
		
		

	}

}
