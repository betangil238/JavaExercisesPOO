package ExtraEjercicio3;

public class Raices {
	private int a;
	private int b;
	private int c;
	public Raices(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Raices() {
		super();
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public double getDiscriminante() {
		return (b^2)-4*a*c;
	}
	
	public boolean tieneRaices() {
		if( getDiscriminante()>=0) {
			System.out.println("Tiene dos soluciones");
			return true;
		}else {
			System.out.println("No tiene soluciones");
			return false;
		}
	}
	
	public boolean tieneRaiz() {
		if( getDiscriminante()==0) {
			System.out.println("Tiene una solucion");
			return true;
		}else {
			System.out.println("No tiene soluciones o tiene varias");
			return false;
		}
	}
	
	public int obtenerRaices() {
		if (tieneRaices()) {
			double valor1=(-b+Math.sqrt(((b^2)-(4*a*c))))/(2*a);
			double valor2=(-b-Math.sqrt(((b^2)-(4*a*c))))/(2*a);
			System.out.println("Los valores obtenidos son: "+ valor1+" y "+valor2);
			return 1;
		}else {
			return 0;
		}
		
	}
	
	public int obtenerRaiz() {
		if (tieneRaiz()) {
			double valor1=(-b+Math.sqrt(((b^2)-(4*a*c))))/(2*a);
			double valor2=(-b-Math.sqrt(((b^2)-(4*a*c))))/(2*a);
			System.out.println("Los valores obtenidos son: "+ valor1+" y "+valor2);
			return 1;
		}else {
			return 0;
		}
		
		
	}
	
	public void calcular() {
		int test1=obtenerRaiz();
		int test2=obtenerRaices();
		if (test1+test2==0) {
			System.out.println("No tiene solucion");
		}
	}
	

}
