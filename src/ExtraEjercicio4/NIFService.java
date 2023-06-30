package ExtraEjercicio4;

import java.util.Scanner;

public class NIFService {
	Scanner leer= new Scanner(System.in);
	
	private int aleatorio() {
		return (int) Math.floor(Math.random()*10);
	}
	
	public NIF crearNif() {
		String[] arr=new String[23];
		arr[0]="T";
		arr[1]="R";
		arr[2]="W";
		arr[3]=" A";
		arr[4]=" G";
		arr[5]=" M";
		arr[6]=" Y";
		arr[7]=" F";
		arr[8]=" P";
		arr[9]=" D";
		arr[10]=" X";
		arr[11]=" B";
		arr[12]=" N";
		arr[13]=" J";
		arr[14]=" Z";
		arr[15]=" S";
		arr[16]=" Q";
		arr[17]=" V";
		arr[18]=" H";
		arr[19]=" L";
		arr[20]=" C";
		arr[21]=" K";
		arr[22]=" E";
		System.out.println("Ingrese el dni numerico");
		long number=leer.nextLong();
		String letra= arr[(int) (number%23)];
		NIF nif= new NIF(number,letra);
		return nif;
	}
	
	public String mostrar(NIF  nif) {
		String dni="";
		for (int i=0;i<8;i++) {
			dni+=aleatorio();
		}
		dni+="-";
		dni+=nif.getLetra();
		return dni;
	}
	

}
