package EjercicioPropuesto3;

public class GimnasioMain {
	
//	Crea al menos cinco clientes con datos ficticios.
//	Crea al menos cinco rutinas con datos ficticios.
//	Registra los clientes creados en el sistema utilizando el método correspondiente del servicio de clientes.
//	Agrega las rutinas creadas al sistema utilizando el método correspondiente del servicio de rutinas.
//	Obtén la lista de todos los clientes registrados y muéstralos por pantalla.
//	Obtén la lista de todas las rutinas registradas y muéstralas por pantalla.
//	Realiza una actualización en uno de los clientes existentes y muestra la lista de clientes actualizada.
//	Realiza una actualización en una de las rutinas existentes y muestra la lista de rutinas actualizada.
//	Elimina uno de los clientes existentes y muestra la lista de clientes final.
//	Elimina una de las rutinas existentes y muestra la lista de rutinas final.

	public static void main(String[] args) {
		ServicioCliente service = new ServicioCliente();
		service.registrarCliente();
		service.registrarCliente();
		service.ObtenerCliente();
		service.ActualizarCliente();
		service.ObtenerCliente();
		service.EliminarCliente();
		service.ObtenerCliente();
		
		ServicioRutina rutina= new ServicioRutina();
		rutina.RegistrarRutina();
		rutina.RegistrarRutina();
		rutina.ObtenerRutina();
		rutina.ActualizarRutina();
		rutina.ObtenerRutina();
		rutina.EliminarRutina();
		rutina.ObtenerRutina();
		
		

	}

}
