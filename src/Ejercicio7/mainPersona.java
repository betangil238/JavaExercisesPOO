package Ejercicio7;

public class mainPersona {
//	7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//	sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
//	atributo, puede hacerlo. Los métodos que se implementarán son:
//	 Un constructor por defecto.
//	 Un constructor con todos los atributos como parámetro.
//	 Métodos getters y setters de cada atributo.
//	 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//	al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//	Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//	O. Si no es correcto se deberá mostrar un mensaje
//	 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//	kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
//	significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
//	Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
//	persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//	de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//	función devuelve un 1.
//	 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//	devuelve un booleano.
//	A continuación, en la clase main hacer lo siguiente:
//	Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//	los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//	tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//	persona es mayor de edad.
//	Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//	distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//
//	cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//	también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
	public static void main(String[] args) {
		personaService perser= new personaService();
		persona myself= perser.crearPersona();
		int imcmyself=myself.calcularIMC();
		boolean edadmyself= myself.esMayorDeEdad();
		persona persona1=perser.crearPersona();
		int imcpersona1=persona1.calcularIMC();
		boolean edadpersona1=persona1.esMayorDeEdad();
		persona persona2=perser.crearPersona();
		int imcpersona2=persona2.calcularIMC();
		boolean edadpersona2=persona2.esMayorDeEdad();
		persona persona3=perser.crearPersona();
		int imcpersona3=persona3.calcularIMC();
		boolean edadpersona3=persona3.esMayorDeEdad();
		
		boolean[] arredad= new boolean[4];
		arredad[0]=edadmyself;
		arredad[1]=edadpersona1;
		arredad[2]=edadpersona2;
		arredad[3]=edadpersona2;
		int mayores=0;
		for (int i=0; i<4;i++) {
			if (arredad[i]==true){
				mayores++;
			}
		}
		
		System.out.println("El porcentaje de personas mayores de edad es: "+(mayores/4)*100+"%");
		System.out.println("El porcentaje de personas menores de edad es:: "+((4-mayores)/4)*100+"%");
	
		
		int[] arr= new int[4];
		arr[0]=imcmyself;
		arr[1]=imcpersona1;
		arr[2]=imcpersona2;
		arr[3]=imcpersona3;
		int infrapeso=0;
		int normopeso=0;
		int sobrepeso=0;
		for (int j=0; j<4;j++) {
			if (arr[j]<0){
				infrapeso++;
			}else if (arr[j]==0){
				normopeso++;
			}else {
				sobrepeso++;
			}
		}
		System.out.println("El porcentaje de persona cin infrapeso es: "+(infrapeso/4)*100+"%");
		System.out.println("El porcentaje de persona con normopeso es: "+(normopeso/4)*100+"%");
		System.out.println("El porcentaje de persona con sobrepeso es: "+(sobrepeso/4)*100+"%");
		
	}

}
