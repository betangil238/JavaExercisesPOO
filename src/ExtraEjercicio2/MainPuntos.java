package ExtraEjercicio2;

public class MainPuntos {
//	2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
//	atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
//	usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
//	los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
//	que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
//	calcular la distancia entre dos puntos consulte el siguiente link:
//	http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
	
	
	public static void main(String[] args) {
		PuntosService ps = new PuntosService();
		Puntos punto=ps.crearPuntos();
		double distancia=ps.distancia(punto);
		System.out.println("La distancia entre los puntos es de: "+distancia);
	}
}
