public class Tema3Ejercicio12{
	public static void main(String[] args) {
		
		System.out.println("Introduzca la nota del primer examen: ");
		int nota1 = Integer.parseInt(System.console().readLine());
		
		System.out.println("Introduzca la nota media deseada para esta asignatura: ");
		int mediaDeseada = Integer.parseInt(System.console().readLine());
		
		double nota2 = (mediaDeseada-(nota1*0.40));
		
		System.out.print(nota2/0.60);
		
		
		
		
	}
}

