package Ejercicio6;

public class cafetera {
	private int capacidadMaxima;
	private int cantidadActual;
	public cafetera(int capacidadMaxima, int cantidadActual) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
	}
	public cafetera() {
		super();
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public int getCantidadActual() {
		return cantidadActual;
	}
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	public void llenarCafetera() {
		System.out.println("Su cafetera se lleno totalmente");
		cantidadActual=capacidadMaxima;
	}
	public void servirTaza(int taza) {
		if (taza<cantidadActual) {
			cantidadActual-=taza;
			System.out.println("Su taza ha sido llenada, en la cafetera queda: "+cantidadActual );
		}else {
			System.out.println("lastimosamente no pudimos llenar la taza, solo se lleno "+cantidadActual );
			cantidadActual=0;
		}
	}
	
	public void vaciarCafetera() {
		System.out.println("Su cafetera se ha vaciado");
		cantidadActual=0;
	}
	
	public void agregarCafe(int cafe) {
		if (cafe>capacidadMaxima-cantidadActual) {
			System.out.println("Su cafetera ha sido llenada completamente, sobro: "+ (cafe-(capacidadMaxima-cantidadActual)) );
			cantidadActual=capacidadMaxima;
		}else {
			
			cantidadActual+=cafe;
			System.out.println("Su cafetera ha sido llenada,actualmente hay:  "+cantidadActual);
		}
	}
}
