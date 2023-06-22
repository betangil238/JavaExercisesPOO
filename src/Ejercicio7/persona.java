package Ejercicio7;

public class persona {
	private String nombre;
	private int edad;
	private String sexo;
	private double peso;
	private double altura;
	public persona(String nombre, int edad, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	public persona() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int calcularIMC() {
		
		double imc= peso/(altura*altura);
		if (imc<20) {
			System.out.println(nombre+ " tu peso se encuentra por debajo del peso ideal");
			return -1;
		}else if (imc<=25) {
			System.out.println(nombre+ " tu peso se encuentra en el peso ideal");
			return 0;
		}else {
			System.out.println(nombre+ " te encuentras en sobrepeso");
			return 1;
		}

	}
	public boolean esMayorDeEdad(){
		return edad>=18;
	}

	
}
