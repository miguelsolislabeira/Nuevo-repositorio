public class Tema4Ejercicio24{
	public static void main (String[] args){
		
		System.out.println("1.Programador Junior");
		System.out.println("2. Programador Senior");
		System.out.println("3. Jefe de Proyecto");
		System.out.println("Introduzca su cargo: 1-3");
		int puesto = Integer.parseInt(System.console().readLine());
		
		System.out.println("¿Cuántos días ha estado visitando clientes?");
		int dias = Integer.parseInt(System.console().readLine());
		int dietas = dias*30;
	
		System.out.println("Escriba 1 para Soltero. 2 para Casado");
		int estado = Integer.parseInt(System.console().readLine());
		
			if (puesto ==1){
			System.out.println("Sueldo Base: 950€");
			System.out.println("Dietas de viaje: " + dietas);
			System.out.println("Salario bruto: " + (950 + dietas));
			
				switch(estado){
					case 1:
					System.out.printf("Retención = %.2f",((950+dietas)*0.25));
					System.out.println();
					System.out.printf("Salario neto = " + ((950+dietas) - (950+dietas)*0.25));
					break;
					
					case 2:
					System.out.printf("Retención = %.2f",((950+dietas)*0.20));
					System.out.println();
					System.out.printf("Salario neto = " + ((950+dietas) - (950+dietas)*0.20));
					break;
				}
			}
		
			if (puesto ==2){
			System.out.println("Sueldo Base: 1200€");
			System.out.println("Dietas de viaje: " + dietas);
			System.out.println("Salario bruto: " + (1200 + dietas));
			
				switch(estado){
					case 1:
				System.out.printf("Retención = %.2f",((1200+dietas)*0.25));
					System.out.println();
					System.out.printf("Salario neto = " + ((1200+dietas) - (1200+dietas)*0.25));
					break;
					
					case 2:
					System.out.printf("Retención = %.2f",((1200+dietas)*0.20));
					System.out.println();
					System.out.printf("Salario neto = " + ((1200+dietas) - (1200+dietas)*0.20));
					break;
				}
			}
					
			if (puesto ==3){
			System.out.println("Sueldo Base: 1600€");
			System.out.println("Dietas de viaje: " + dietas);
			System.out.println("Salario bruto: " + (1600 + dietas));
			
				switch(estado){
					case 1:
					System.out.printf("Retención = %.2f",((1600+dietas)*0.25));
					System.out.println();
					System.out.printf("Salario neto = " + ((1600+dietas) - (1200+dietas)*0.25));
					break;
					
					case 2:
					System.out.printf("Retención = %.2f",((1600+dietas)*0.20));
					System.out.println();
					System.out.printf("Salario neto = " + ((1600+dietas) - (1600+dietas)*0.20));
				
				}
			}
		
	}
}
		
