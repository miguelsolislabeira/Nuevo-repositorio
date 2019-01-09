public class Tema4Ejercicio1 {
	public static void main (String[] args) {
		
		System.out.println("Introduce un día de la semana y te diré qué tienes a primera hora");
		String diaSemana = System.console().readLine();
	
		if (diaSemana.equals("Lunes")){
			
			System.out.println("Sistemas Informáticos");
			
		}else if (diaSemana.equals("Martes")){
			
			System.out.println("Programación");
		
		}else if (diaSemana.equals("Miercoles")){
			
			System.out.println("Entornos");
			
		}else if (diaSemana.equals("Jueves")){
			
			System.out.println("HTML");
			
		} else if (diaSemana.equals("Viernes")){
			
			System.out.println("Sistemas");
			
		}else{
		
			System.out.println("Ese día no existe");
		}	
					
	}
}


