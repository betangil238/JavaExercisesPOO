package EjercicioPropuesto1;

public class vehiculo {
	private String marca;
	private String modelo;
	private int anio;
	private String tipo;
	public vehiculo(String marca, String modelo, int anio, String tipo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int moverse(int segundos) {
		if (tipo=="automovil") {
			System.out.println("El automovil avanzo: "+3*segundos+"metros" );
			return 3*segundos;
		}else if(tipo=="motocicleta") {
			System.out.println("La motocicleta avanzo: "+2*segundos+"metros" );
			return 2*segundos;
		}else if (tipo=="bicicleta") {
			System.out.println("La bicicleta avanzo: "+segundos+"metros" );
			return segundos;
		}else {
			System.out.println("Tipo de vehiculo incorrecto");
			return 0;
		}	
	}
	public int frenar() {
		if (tipo=="automovil") {
			return 2;
		}else if(tipo=="motocicleta") {
			return 2;
		}else if (tipo=="bicicleta") {
			return 0;
		}else {
			System.out.println("Tipo de vehiculo incorrecto");
			return 0;
		}	
	}

}
