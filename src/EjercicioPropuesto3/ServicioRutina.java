package EjercicioPropuesto3;
import java.util.ArrayList;
import java.util.Scanner;
public class ServicioRutina {
	
//	crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
//	obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
//	actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion): recibe el identificador
//	de una rutina existente y los nuevos datos de la rutina, y actualiza la información correspondiente en el sistema.
//	eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema.
	Scanner leer = new Scanner(System.in);
	ArrayList<Rutina> rutinas = new ArrayList<>();
	
	public void RegistrarRutina() {
		System.out.println("Ingrese el id de la rutina");
		int id = leer.nextInt();
		leer.nextLine();
		
		System.out.println("Ingrese el nombre");
		String nombre=leer.next();
		
		System.out.println("Ingrese la duracion");
		int duracion=leer.nextInt();
		
		System.out.println("Ingrese el nivel de dificultad");
		String dificultad=leer.next();
		
		System.out.println("Ingrese descripcion: ");
		String descripcion= leer.next();
		
		Rutina rutina = new Rutina(id, nombre, duracion, dificultad, descripcion);
		rutinas.add(rutina);
	
	}
	
	public void ObtenerRutina() {
		for(int i=0; i<rutinas.size();i++) {
			System.out.println(rutinas.get(i));
		}
		
	}
	
	public int verificarRutinas(int id) {
		int index=-1;
		for(int i=0; i<rutinas.size();i++) {
			if(rutinas.get(i).getId()==id) {
				index=i;
			};
		}
		return index;
	}
	
	public void ActualizarRutina() {
		System.out.println("Ingrese el id de la rutina");
		int id1 = leer.nextInt();
		leer.nextLine();
		int index=verificarRutinas(id1);
		
		if (index>=0) {
			Rutina rutinaActualizar= rutinas.get(index);
			System.out.println("Ingrese el nombre");
			rutinaActualizar.setNombre(leer.next());
			
			System.out.println("Ingrese la duracion");
			rutinaActualizar.setDuracion(leer.nextInt());
			
			System.out.println("Ingrese el nivel de dificultad");
			rutinaActualizar.setNivelDificultad(leer.next());
			
			System.out.println("Ingrese descripcion: ");
			rutinaActualizar.setDescripcion(leer.next());
			
			rutinas.set(index, rutinaActualizar);
		}else {
			System.out.println("No se encontro una rutina");
		}
		
	}
	
	public void EliminarRutina() {
		System.out.println("Ingrese el id de la rutina");
		int id1 = leer.nextInt();
		leer.nextLine();
		int index=verificarRutinas(id1);
		if (index>=0) {
			rutinas.remove(index);
			System.out.println("Rutina eliminada con exito");
		}else {
			System.out.println("No se encontro una rutina");
		}
		
	}
	
	

}
