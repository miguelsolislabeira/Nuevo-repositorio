public class Tema4Ejercicio1bis {
	public static void main (String[] args) {
			
	System.out.println("Introduce un día de la semana y te diré qué tienes a primera hora");
	String diaSemana = System.console().readLine();
	
	switch (diaSemana){
		
		case "lunes":
		
		System.out.println("Sistemas");
		break;
		
		case "martes":
		
		System.out.println("Programación");
		break;
		
		case "miercoles":
		
		System.out.println("Entornos");
		break;
		
		case "jueves":
		
		System.out.println("HTML");
		break;
		
		case "viernes":
		
		System.out.println("Sistemas");
		break;
		
		default:
		
		System.out.println("Ese día no existe o no tienes clase");
	}
	
	}
}
