package Ejercicio4;

public class mainRectangulo {
//	Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//	base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
//	con los datos del Rectángulo dados por el usuario. También incluirá un método para
//	calcular la superficie del rectángulo y un método para calcular el perímetro del
//	rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
//	asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
//	setters y constructores correspondientes.
//	Superficie = base * altura / Perímetro = (base + altura) * 2.
	
	public static void main(String[] args) {
		rectanguloService rs= new rectanguloService();
		
		rectangulo rectangulo1= rs.crearRectangulo();
		int area= rs.areaRectangulo(rectangulo1);
		int perimetro=rs.perimetroRectangulo(rectangulo1);
		rs.dibujarrectangulo(rectangulo1);
		System.out.println("Area="+ area+ " Perimetro="+perimetro);
		
	} 
	
}
