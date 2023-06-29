package Ejercicio14;

import java.util.Arrays;

public class Movil {
	private String marca;
	private double precio;
	private String modelo;
	private int memoriaRam;
	private int[] codigo=new int [7];
	
	public Movil(String marca, double precio, String modelo, int memoriaRam, int[] codigo) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.modelo = modelo;
		this.memoriaRam = memoriaRam;
		this.codigo = codigo;
	}

	public Movil() {
		super();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public int[] getCodigo() {
		return codigo;
	}

	public void setCodigo(int[] codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam
				+ ", codigo=" + Arrays.toString(codigo) + "]";
	}
	
	
	
	
	



}
