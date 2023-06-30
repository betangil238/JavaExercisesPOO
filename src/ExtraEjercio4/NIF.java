package ExtraEjercio4;

public class NIF {
	
	private long DNI;
	private String letra ;
	public NIF(long dNI, String letra) {
		super();
		DNI = dNI;
		this.letra = letra;
	}
	public NIF() {
		super();
	}
	public long getDNI() {
		return DNI;
	}
	public void setDNI(long dNI) {
		DNI = dNI;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	
	

}
