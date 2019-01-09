public class Tema4Ejercicio21{
	public static void main(String[]args){
		
		System.out.println("Introduzca la nota del primer examen: ");
		double nota1 = Double.parseDouble(System.console().readLine());
		System.out.println("Introduzca la nota del segundo examen: ");
		double nota2 = Double.parseDouble(System.console().readLine());

		double media = (nota1+nota2)/2;
		
		System.out.println("Su nota en Programación es: " + media);
		
		if (media <5){
			System.out.println("¿Cuál ha sido el resultado de la recuperación: Apto/No Apto");
			String notaRecu = System.console().readLine();		
			switch (notaRecu){
				case "Apto":
				System.out.println("Su nota en Programación es un 5");
				break;
				default:
				System.out.println("Su nota en Programación es: " + media);
			}
		}
	}
}
