public class Tema4Ejercicio24bis{
	public static void main(String[] args){
		
		System.out.println("1. Programador junior");
		System.out.println("2. Programador senior");
		System.out.println("3. Jefe de Proyecto");
		
		System.out.println("Introduzca su cargo: (1-3)");
		int cargo = Integer.parseInt(System.console().readLine());
		
		System.out.println("Introduzca los días que ha estado de visita");
		int dias = Integer.parseInt(System.console().readLine());
		double dietas = dias*30;
		
		System.out.println("Introduzca su estado civil. 1- Soltero. 2- Casado.");
		int estado = Integer.parseInt(System.console().readLine());
		
		double sueldoBase = 0;
		
		switch (cargo){
			case 1:
			sueldoBase = 950;
			break;
			
			case 2:
			sueldoBase = 1200;
			break;
			
			case 3:
			sueldoBase = 1600;
			break;
			
			default:
			System.out.println("No ha introducido bien su cargo en la empresa");
		}
		double irpf = 0;
		
		switch (estado){
			case 1: 
			irpf = 0.25;
			break;
			
			case 2:
			irpf = 0.20;
			break;
			
			default:
			System.out.println("No ha introducido bien su estado");
		}
		
		double sueldoBruto = sueldoBase + dietas;
		double descuento = (sueldoBase + dietas)* irpf;
		double sueldoNeto = (sueldoBase + dietas)-descuento;
		
		System.out.println("Sueldo base: " + sueldoBase + " euros");
		System.out.println("Dietas de viaje: " + dietas + " euros");
		System.out.println("Sueldo Bruto: " + sueldoBruto + " euros");
		System.out.println("Sueldo Neto: " + sueldoNeto + " euros");
		
	}
}
