package Ejercicio12;

import java.util.Date;

public class Persona {
	private String nombre;
	private Date fecha;
	
	
	public Persona(String nombre, Date fecha) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
	}
	public Persona() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	

}
