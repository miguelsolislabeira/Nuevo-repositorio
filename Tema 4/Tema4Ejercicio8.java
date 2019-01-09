public class Tema4Ejercicio8{
	public static void main (String[] args){
		
		System.out.println("Introduzca las tres notas separadas por INTRO");
		double nota1 = Double.parseDouble(System.console().readLine());
		double nota2 = Double.parseDouble(System.console().readLine());
		double nota3 = Double.parseDouble(System.console().readLine());
		double notaMedia = (nota1 + nota2 + nota3)/3;
		
		if ((notaMedia >=0) && (notaMedia <5)){
			
			System.out.printf("Su nota media es: %.2f. Insuficiente ", notaMedia);
			
		}else if ((notaMedia >=5) && (notaMedia <6)){
			
			System.out.printf("Su nota media es: %.2f. Suficiente", notaMedia);
			
		}else if ((notaMedia >=6) && (notaMedia <7)){
			
			System.out.printf("Su nota media es: %.2f. Bien", notaMedia);
			
		}else if ((notaMedia >=7) && (notaMedia <9)){
			
			System.out.printf("Su nota media es: %.2f. Notable", notaMedia);
			
		}else if ((notaMedia >=9) && (notaMedia ==10)){
			
			System.out.printf("Su nota media es: %.2f. Sobresaliente", notaMedia);
			
		}
		
		
	}
}
