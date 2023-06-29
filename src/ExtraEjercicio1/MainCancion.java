package ExtraEjercicio1;

public class MainCancion {
//	1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
//	definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
//	vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
//	además definir los métodos getters y setters correspondientes.

	public static void main(String[] args) {
		Cancion cancion = new Cancion();
		Cancion cancion1 = new Cancion("Rolling in the deep","Adele");
		System.out.println(cancion.toString());
		System.out.println(cancion1.toString());

	}

}
