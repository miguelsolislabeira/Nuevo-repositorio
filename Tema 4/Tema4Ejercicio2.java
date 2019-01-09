public class Tema4Ejercicio2 {
	public static void main (String[] args){
		
		System.out.println("¿Qué hora es?");
		int hora = Integer.parseInt(System.console().readLine());
		
		if ((hora >=6) && (hora <= 12)) {
			System.out.println("Buenos días, chocho");
			
		} else if ((hora >=13) && (hora<=20)){
			System.out.println("Buenas tardes");
			
		}else if ((hora >=21) && (hora <=23)){
		
		System.out.println("Buenas noches");
		
		}else if ((hora>=0) && (hora <=5)){	
		
		System.out.println("Buenas noches");
		
		}else {
			
			System.out.println("Hora introducida no válida");
		}
		
	}
}
