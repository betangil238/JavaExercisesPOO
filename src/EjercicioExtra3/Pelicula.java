package EjercicioExtra3;

public class Pelicula {
	private String titulo;
	private String genero;
	private int ano;
	private String duracion;
	
	public Pelicula(String titulo, String genero, int ano, String duracion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.ano = ano;
		this.duracion = duracion;
	}

	public Pelicula() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "[titulo=" + titulo + ", genero=" + genero + ", ano=" + ano + ", duracion=" + duracion + "]";
	}
	
	
	

}
