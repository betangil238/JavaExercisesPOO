package Ejercicio8;
public class Cadena {
	private String palabra;
	private int longitud;
	
	
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public int mostrarVocales() {
		int count=0;
		for(int x=0;x<palabra.length();x++) {
			 if ((palabra.toLowerCase().charAt(x)=='a') || (palabra.toLowerCase().charAt(x)=='e') || 
					 (palabra.toLowerCase().charAt(x)=='i') || (palabra.toLowerCase().charAt(x)=='o') 
					 || (palabra.toLowerCase().charAt(x)=='u')){ 
			    count++;
			  }
			}
		return count;
	}
	
	public String invertirFrase() {
		String wordreverse="";
		for (int i=palabra.length()-1;i>=0;i--) {
			wordreverse+=palabra.charAt(i);
		}
		return wordreverse;
	}
	
	public int vecesRepetido(String letra) {
		int contador=0;
		for(int x=0;x<palabra.length();x++) {
			 if (String.format("%c",palabra.charAt(x)).equals(letra)){ 
				 contador++;
			  }
			}
		return contador;
	}
	
	public void compararLongitud(String frase) {
		System.out.println("La palabra inicial tiene una longitud de "+palabra.length() + " Su nueva frase tiene una longitud de:"+frase.length());
	}
	
	public void unirFrases(String frase) {
		System.out.println("La nueva frase es: "+palabra+frase);
	}
	
	public String reemplazar(String letra) {
		String newfrase="";
		for(int x=0;x<palabra.length();x++) {
			 if (palabra.charAt(x)=='a'){ 
				 newfrase+=letra;
			  }else {
				  newfrase+=palabra.charAt(x);
			  }
			}
		return newfrase;
	}
	
	public boolean contiene(String letra) {
		return palabra.contains(letra);
	}

}
