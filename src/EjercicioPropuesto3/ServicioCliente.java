package EjercicioPropuesto3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioCliente {
	
//	registrarCliente: lo registra en el sistema.
//	obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
//	actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
//	de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
//	eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.
	
	Scanner leer = new Scanner(System.in);
	ArrayList<Cliente> clientes = new ArrayList<>();
	
	public void registrarCliente() {
		System.out.println("Ingrese el id del cliente");
		int id = leer.nextInt();
		leer.nextLine();
		
		System.out.println("Ingrese el nombre");
		String nombre=leer.next();
		
		System.out.println("Ingrese la edad: ");
		int edad=leer.nextInt();
		
		System.out.println("ingrese la altura");
		double altura=leer.nextDouble();
		
		System.out.println("Ingrese el peso: ");
		double peso= leer.nextDouble();
		
		System.out.println("Ingrese el objetivo: ");
		String objetivo= leer.next();
		
		Cliente newcliente= new Cliente(id, nombre, edad, altura, peso, objetivo);
		clientes.add(newcliente);
			
	}
	
	public void ObtenerCliente() {
		
		for(int i=0; i<clientes.size();i++) {
			System.out.println(clientes.get(i));
		}
	}
	
	public int verificarCliente(int id) {
		int index=-1;
		for(int i=0; i<clientes.size();i++) {
			if(clientes.get(i).getId()==id) {
				index=i;
			};
		}
		return index;
	}
	
	public void ActualizarCliente() {
		System.out.println("Ingrese el id del cliente");
		int id1 = leer.nextInt();
		leer.nextLine();
		int index=verificarCliente(id1);
		
		if (index>=0) {
			Cliente clienteActualizar= clientes.get(index);
			System.out.println("Ingrese el nombre");
			clienteActualizar.setNombre(leer.next());
			
			System.out.println("Ingrese la edad: ");
			clienteActualizar.setEdad(leer.nextInt());
			
			System.out.println("ingrese la altura");
			clienteActualizar.setAltura(leer.nextDouble());
			
			System.out.println("Ingrese el peso: ");
			clienteActualizar.setPeso(leer.nextDouble());
			
			System.out.println("Ingrese el objetivo: ");
			clienteActualizar.setObjetivo(leer.next());
			
			clientes.set(index, clienteActualizar);
		}else {
			System.out.println("No se encontro un Cliente");
		}
		
	}
	
	public void EliminarCliente() {
		System.out.println("Ingrese el id del cliente");
		int id1 = leer.nextInt();
		leer.nextLine();
		int index=verificarCliente(id1);
		if (index>=0) {
			clientes.remove(index);
			System.out.println("Cliente eliminado con exito");
		}else {
			System.out.println("No se encontro un Cliente");
		}
		
	}
	

}
