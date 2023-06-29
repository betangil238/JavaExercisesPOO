package Ejercicio13;

import java.util.Scanner;

public class CursoService {
	Scanner leer = new Scanner(System.in);
	private String [] cargarAlumnos() {
		String [] alumnos=new String [5];
		for (int i=0;i<5;i++) {
			System.out.println("Ingrese el nombre del alumno: "+(i+1));
			alumnos[i]=leer.next();
		}
		return alumnos;
	}
	public Curso crearCurso() {

		System.out.println("Porfavor ingrese el nombre del curso");
		String nombrecurso=leer.next();
		System.out.println("Porfavor ingrese la cantidad de horas por dias");
		int horasdia=leer.nextInt();
		System.out.println("Porfavor ingrese la cantidad de dias por semana");
		int diassemana=leer.nextInt();
		System.out.println("Porfavor ingrese si el turno es mañana o tarde");
		String turno=leer.next();
		System.out.println("Porfavor ingrese el precio por hora");
		double preciohora=leer.nextDouble();
		String [] alumnos=cargarAlumnos();
		Curso curso=new Curso(nombrecurso, horasdia, diassemana, turno, preciohora, alumnos);
		return curso;
	}
	
	public double calcularGananciaSemanal(Curso curso) {

		return curso.getCantidadHorasPorDia()*curso.getPrecioPorHora()*curso.getCantidadDiasPorSemana()*5;
	}
}
