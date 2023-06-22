package Ejercicio1;
public class Libro {
	private String ISBN;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	public Libro(String iSBN, String titulo, String autor, int numeroPaginas) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	public Libro() {
	}
	public String getISBN() {
		return ISBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	@Override
	public String toString() {
		return "Informacion del LIBRO : El ISBN es: " + ISBN + 
				", titulo:" + titulo + ", autor:" + autor + ", "
						+ "numeroPaginas:" + numeroPaginas;
	}
	
	
	
	
}
