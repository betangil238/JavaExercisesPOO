package ExtraEjercicio6;
import java.awt.Window.Type;
import java.util.Arrays;
public class Ahorcado {
	private String [] buscar;
	private int cantidadLetras;
	private int jugadasMaximas;
	public Ahorcado(String[] buscar, int cantidadLetras, int jugadasMaximas) {
		super();
		this.buscar = buscar;
		this.cantidadLetras = cantidadLetras;
		this.jugadasMaximas = jugadasMaximas;
	}
	public Ahorcado() {
		super();
	}
	public String[] getBuscar() {
		return buscar;
	}
	public void setBuscar(String[] buscar) {
		this.buscar = buscar;
	}
	public int getCantidadLetras() {
		return cantidadLetras;
	}
	public void setCantidadLetras(int cantidadLetras) {
		this.cantidadLetras = cantidadLetras;
	}
	public int getJugadasMaximas() {
		return jugadasMaximas;
	}
	public void setJugadasMaximas(int jugadasMaximas) {
		this.jugadasMaximas = jugadasMaximas;
	}
	
	public int longitud() {
		return buscar.length;
	}
	
	private int buscar(String letra) {
		int contador=0;
		for (int i=0;i<longitud();i++) {
			if (buscar[i].equals(letra)) {
				contador++;
				buscar[i] = "";
				cantidadLetras++;
			}
		}
		if (contador>0) {
			System.out.println("Se encontraron "+ contador+ " coincidencias para la letra ingresada");
		}else {
			System.out.println("No se encontraron coincidencias");
		}
		return contador;
	}
	
	public void encontradas(String letra) {
		if (jugadasMaximas!=0) {
			int cantidad=buscar(letra);
			System.out.println("En esta ocasion se encontraron: "+ cantidad+ " letras ");
			if (cantidad==0) {
				jugadasMaximas--;
			}
			System.out.println("Falta por encontrar "+ (buscar.length-cantidadLetras)+ " letras" );
			System.out.println("Restan: "+jugadasMaximas+ " jugadas");
		}else {
			System.out.println("Muchas gracias por jugar, agoto sus intentos");
		}
		if (cantidadLetras==longitud()) {
			System.out.println("FELICITACIONES HAS ENCONTRADO TODAS LAS LETRAS");
		}
	}
	
	public int intentos() {
		System.out.println("Restan: "+jugadasMaximas+" intentos" );
		return jugadasMaximas;
	}
	

}
