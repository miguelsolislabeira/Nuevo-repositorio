public class Tema4Ejercicio7 {
	public static void main (String[] args){
		
		System.out.println("Introduzca las tres notas separadas por INTRO");
		double nota1 = Double.parseDouble(System.console().readLine());
		double nota2 = Double.parseDouble(System.console().readLine());
		double nota3 = Double.parseDouble(System.console().readLine());
		double notaMedia = (nota1 + nota2 + nota3)/3;
		
		System.out.printf("Su nota media es: %.2f", notaMedia);
		
	}
}
		
		
