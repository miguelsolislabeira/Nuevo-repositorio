public class Tema3Ejercicio3{
	public static void main(String[] args) {
		
		System.out.println("Introduzca un número: ");
		int numero1 = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca otro número: ");
		int numero2 = Integer.parseInt(System.console().readLine());
		
		int suma = numero1+numero2;
		int resta = numero1-numero2;
		int multi = numero1*numero2;
		double divi = (double)numero1/(double)numero2;
		
		System.out.println("La suma de ambos números es: " + suma);
		System.out.println("La resta de ambos números es: " + resta);
		System.out.println("La multiplicación de ambos números es: " + multi);
		System.out.printf("La división de ambos números es: %.2f", divi);
		
		
		

		
	}
}

