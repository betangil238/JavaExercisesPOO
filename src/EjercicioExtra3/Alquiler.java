package EjercicioExtra3;

import java.util.Date;

public class Alquiler {
	
	private String películaAlquilada;
	private Date fechaInicio;
	private Date fechaFin;
	private double precio;
	public Alquiler(String películaAlquilada, Date fechaInicio, Date fechaFin, double precio) {
		super();
		this.películaAlquilada = películaAlquilada;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.precio = precio;
	}
	public Alquiler() {
		super();
	}
	public String getPelículaAlquilada() {
		return películaAlquilada;
	}
	public void setPelículaAlquilada(String películaAlquilada) {
		this.películaAlquilada = películaAlquilada;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "[películaAlquilada=" + películaAlquilada + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", precio=" + precio + "]";
	}
	
	
	
	
	


}
