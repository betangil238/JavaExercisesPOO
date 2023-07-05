package EjercicioExtra3;
import java.util.Date;
import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		PeliculaService ps= new PeliculaService();
		AlquilerService as=new AlquilerService();
		Alquiler[] listaalquiladas= new Alquiler[6];
		Pelicula[] listapeliculas= new Pelicula[6];
		int opc=0;
		int alquilerescreados=0;
		
		Pelicula pelicula1=new Pelicula("Buscando a Nemo","Infantil",2003,"120 minutos");
		Pelicula pelicula2=new Pelicula("Mentes poderosas","Ciencia Ficcion",2018,"160 minutos");
		Pelicula pelicula3=new Pelicula("Evil Dead","Terror",2023,"96 minutos");
		Pelicula pelicula4=new Pelicula("Mision rescate","accion",2023,"123 minutos");
		Pelicula pelicula5=new Pelicula("Max","suspenso",2015,"115 minutos");
		System.out.println("Crea la ultima pelicula");
		Pelicula solo=ps.CrearPelicula(); //Solo-drama-2018-95 minutos
	
		listapeliculas[0]=pelicula1;
		listapeliculas[1]=pelicula2;
		listapeliculas[2]=pelicula3;
		listapeliculas[3]=pelicula4;
		listapeliculas[4]=pelicula5;
		listapeliculas[5]=solo;
	
		do {
			System.out.println("***************⚠️⚠️⚠️   MENU    ⚠️⚠️⚠️************** ");
			System.out.println("0) cargar una pelicula");
			System.out.println("1) Listar todas las películas disponibles");
			System.out.println("2) Listar todas las películas alquiladas");
			System.out.println("3) Buscar una película por título");
			System.out.println("4) Buscar una película por género");
			System.out.println("5) Buscar un alquiler por fecha");
			System.out.println("6) Calcular el ingreso total del servicio");
			System.out.println("7) Crear un alquiler");
			System.out.println("8) Salir");
			System.out.println("⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️*******************⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️");
			opc=leer.nextInt();
			if(opc==0) {
				solo=ps.CrearPelicula();
				listapeliculas[5]=solo;
			}else if(opc==1) {
				mostrarPeliculas(listapeliculas);
			}else if(opc==2) {
				mostrarAlquiladas(listaalquiladas);
			}else if(opc==3) {
				buscartitulo(listapeliculas);
			}else if(opc==4) {
				buscargenero(listapeliculas);
			}else if(opc==5) {
				buscarAlquilerFecha(listaalquiladas);
			}else if(opc==6) {
				calcularingresos(listaalquiladas,alquilerescreados);
			}else if(opc==7) {
				Alquiler alquiler = as.CrearAlquiler();
				listaalquiladas[alquilerescreados]=alquiler;
				alquilerescreados++;
				if (alquilerescreados==6) {
					alquilerescreados=0;
				}
			}else if(opc==8) {
				System.out.println("Muchas gracias");
			}else {
				System.out.println("Ingrese una opcion valida");
			}
		}while(opc!=8);
	}
	
	private static void mostrarPeliculas(Pelicula[] lista) {
		for (int i=0;i<lista.length;i++) {
			System.out.print("Pelicula: "+(i+1));
			System.out.println(lista[i].toString());
		}
	}
	private static void mostrarAlquiladas(Alquiler[] listaalquiladas) {
		for (int i=0;i<listaalquiladas.length;i++) {
			try {
				System.out.print("Alquiler: "+(i+1));
				System.out.println(listaalquiladas[i].toString());
			}catch (Exception e) {
				System.out.println();
			}
		}
	}
	private static boolean buscartitulo(Pelicula[] lista) {
		System.out.println("BIENVENIDO AL BUSCADOR DE PELICULA POR TITULO");
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la pelicula a buscar");
		String titulo=leer.next();
		boolean existe=false;
		for (int i=0;i<lista.length;i++) {
			if (titulo.equals(lista[i].getTitulo())) {
				System.out.println("La pelicula existe");
				return true;
			}
			if (existe==false && i==5) {
				System.out.println("La pelicula no existe");
				return false;
			}
		}
		return existe;
	}
	
	private static boolean buscargenero(Pelicula[] lista) {
		System.out.println("BIENVENIDO AL BUSCADOR DE PELICULA POR GENERO");
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el genero de la pelicula a buscar");
		String titulo=leer.next();
		boolean existe=false;
		for (int i=0;i<lista.length;i++) {
			if (titulo.equals(lista[i].getGenero())) {
				System.out.println("El genero de la pelicula existe");
				return true;
			}
			if (existe==false && i==5) {
				System.out.println("El genero de la pelicula no existe");
				return false;
			}
		}
		return existe;
	}
	
	private static void buscarAlquilerFecha(Alquiler[] listaalquiladas) {
		System.out.println("BIENVENIDO AL BUSCADOR DE ALQUILERES POR FECHA");
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el dia,mes,ano de inicio del alquiler");
		int dia= leer.nextInt();
		int mes= leer.nextInt();
		int ano= leer.nextInt();
		Date fecha = new Date(ano-1900, mes-1, dia);
	
		for (int i=0;i<listaalquiladas.length;i++) {
			try {
				if (fecha.equals(listaalquiladas[i].getFechaInicio())) {
					System.out.println("Se encontro la siguiente pelicula:");
					System.out.println(listaalquiladas[i].toString());
				}
			}catch (Exception e) {
				
			}	
		}
	}

	private static void calcularingresos(Alquiler[] listaalquiladas, int alquilerescreados) {
		System.out.println("BIENVENIDO AL CALCULADOR DE INGRESOS");
		double acumulador=0;
		for (int i=0;i<listaalquiladas.length;i++) {
			try {
				acumulador+=listaalquiladas[i].getPrecio();
				if (alquilerescreados==i) {
					System.out.println("El coste del ultimo alquiler es de: "+ listaalquiladas[i].getPrecio());
				}
			}catch (Exception e) {
				
			}	
		}
		System.out.println("Los ingresos estimados ascienden a: "+acumulador);
	}
}

//	ejercicio 1:
//		Escribir un programa en Java que simule un servicio de alquiler de películas. El programa debe tener una clase Pelicula
//		que represente los datos de una película, como el título, el género, el año y la duración. El programa también debe tener
//		una clase Alquiler que represente los datos de un alquiler, como la película alquilada, la fecha de inicio, la fecha de fin y
//		el precio.
//	El programa puede usar la clase Date para manejar las fechas, la clase Arrays para almacenar y ordenar las películas y
//	los alquileres, la clase Math para calcular el precio según la duración y el género de la película, y la clase String para
//	manipular los textos.
//	El programa debe permitir al usuario ingresar los datos de las películas disponibles y los datos de los alquileres
//	realizados, y mostrar por pantalla un menú con las opciones de cargar una pelicula, hacer una lista de todas las peliculas
//	disponibles, crear un alquiler, realizar una lista de todos los alquileres, buscar peliculas por titulo o por genero y buscar
//	alquileres por fecha.
//Crear Película
//Crear Alquiler
//Listar todas las películas disponibles
//Listar todas las películas alquiladas
//Buscar una película por título (Decir si se existe o no)
//Buscar una película por género (Decir si se existe o no)
//Buscar un alquiler por fecha (Decir si se existe o no, y si existe, mostrar los datos del alquiler)
//Calcular el ingreso total del servicio (El alquiler cuesta $10, por 3 días. Por cada día extra, se aumenta un 10% de
//interés.)
//El programa debe validar que los datos ingresados por el usuario sean correctos y mostrar mensajes de error en caso
//contrario. El programa debe terminar cuando el usuario elija la opción de salir.
//Deben:
//	Se deben crear al menos 5 películas, junto con todos sus datos.
//	Se deben realizar 3 alquileres de películas.
//	Mostrar todas las películas cargadas.
//	Mostrar todos los alquileres realizados.