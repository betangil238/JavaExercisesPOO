package Ejercicio10;

public class Array {
	private double[] array1=new double [50];
	private double[] array2=new double [20];
	
	
	
	public Array() {
		for (int i=0; i<50;i++) {
			array1[i]= Math.floor((Math.random()*100));
		}
//		for (int j=0; j<20;j++) {
//			array2[j]= Math.floor((Math.random()*100));
//		}
		
	}
	public double[] getArray1() {
		return array1;
	}
	public void setArray1(double[] array1) {
		this.array1 = array1;
	}
	public double[] getArray2() {
		return array2;
	}
	public void setArray2(double[] array2) {
		this.array2 = array2;
	}
	
	

}
