package EjercicioPropuesto1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class vehiculoMain {
//	ejercicio 1
//	Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" (En tipo, vamos a indicar si es un
//			automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:
//	Moverse: Es la cantidad de metros que avanzará por segundo.
//	Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, se frenará y no avanzará
//	más metros.
//	Un automóvil avanza 3 metros por segundo.
//	Una motocicleta avanza 2 metros por segundo.
//	Una bicicleta avanza 1 metro por segundo.
//	Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" (En tipo, vamos a indicar si es un
//	automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:
//	Referencias:
//	-
//	Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
//	pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
//	vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
//	avanzó.
	public static void main(String[] args) {
		vehiculo carro=new vehiculo("Audi","R8",2023,"automovil");
		vehiculo moto=new vehiculo("Yamaha","R6",2022,"motocicleta");
		vehiculo bici=new vehiculo("GW","carbono",2018,"bicicleta");
		vehiculo bicicleta=new vehiculo("GW","carbono",2018,"bici");
		System.out.println("***************   Calculo para 5 segundos ******************");
		carro.moverse(5);
		moto.moverse(5);
		bici.moverse(5);
		bicicleta.moverse(5);
		System.out.println("***************   Calculo para 10 segundos ******************");
		carro.moverse(10);
		moto.moverse(10);
		bici.moverse(10);
		bicicleta.moverse(10);
		System.out.println("***************   Calculo para 60 segundos ******************");
		carro.moverse(60);
		moto.moverse(60);
		bici.moverse(60);
		bicicleta.moverse(60);
		System.out.println("***************   Calculo para 5 minutos ******************");
		int dcarro=carro.moverse((60*5));
		int dmoto=moto.moverse(300);
		int dbici=bici.moverse(300);
		int dbicicleta=bicicleta.moverse(300);
		int fcarro=carro.frenar();
		int fmoto=moto.frenar();
		int fbici=bici.frenar();
		int fbicicleta=bicicleta.frenar();
		
		System.out.println("El automovil se desplazo: "+ (dcarro+fcarro)+ " la motocicleta: "+(dmoto+fmoto)+" la bicicleta: "+ (dbici+fbici)+ " finalmente la bicileta1: "+ (dbicicleta+fbicicleta)) ;
		
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("automovil", (dcarro+fcarro));
		map.put("motocicleta", (dmoto+fmoto));
		map.put("bicicleta", (dbici+fbici));
		map.put("bici", (dbicicleta+fbicicleta));
		
		 Entry<String, Integer> maxEntry = null;
	        for (Entry<String, Integer> entry : map.entrySet()) {
	            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
	                maxEntry = entry;
	            }
	        }
	 
	        System.out.println("El valor maximo fue el de: "+maxEntry);

	}

}
