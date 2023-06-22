package Ejercicio5;

import java.util.Scanner;
public class cuenta {
	Scanner leer = new Scanner(System.in);
	private int numeroCuenta;
	private long DNI;
	private int saldo;
	public cuenta() {
		super();
	}
	public cuenta(int numeroCuenta, long dNI, int saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		DNI = dNI;
		this.saldo = saldo;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public long getDNI() {
		return DNI;
	}
	public void setDNI(long dNI) {
		DNI = dNI;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(double ingreso) {
		saldo+=ingreso;
		System.out.println("Se han ingresado a su cuenta "+ ingreso+ " su saldo es: "+saldo);
	}
	
	public void retirar(double retiro) {
		if (retiro>saldo) {
			System.out.println("Saldos insuficientes, se retirara: "+ saldo);
			saldo=0;
		}else {
			System.out.println("se retirara: "+ retiro+" su saldo actual es: "+ (saldo-retiro));
			saldo-=retiro;
		}
	}
	
	public void extraccionRapida() {
		System.out.println("Ingrese la cantidad de retiro rapido");
		double retiro=leer.nextDouble();
		if (retiro<=0.2*saldo) {
			saldo-=retiro;
			System.out.println("Retiro autorizado, su saldo actual es de: "+saldo);
		}else {
			System.out.println("Retiro no aurotizado");
		}
	}
	
	public void consultarSaldo() {
		System.out.println("Su saldo actual es de: "+ saldo);
	}
	
	public void consultarDatos() {
		System.out.println("Los datos de su cuenta son: numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldo=" + saldo);
	}

	
	

}
