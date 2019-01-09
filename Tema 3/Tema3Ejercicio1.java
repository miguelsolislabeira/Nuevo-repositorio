public class Tema3Ejercicio1{
	public static void main(String[] args) {
		
		System.out.println("Por favor, introduzca un número");
		int numero1 = Integer.parseInt(System.console().readLine());
		
		System.out.println("Introduzca el segundo número");
		int numero2 = Integer.parseInt(System.console().readLine());
		
		int multiplicacion = numero1 * numero2;
		
		System.out.print("La multiplicación de ambos números es igual a: " + multiplicacion);
		
		

		
	}
}

