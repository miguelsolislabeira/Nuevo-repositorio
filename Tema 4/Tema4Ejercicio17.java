public class Tema4Ejercicio17{
	public static void main(String[] args){
		
		System.out.println("Introduzca un número y le diré la última cifra del mismo");
		int numero = Integer.parseInt(System.console().readLine());
		
		System.out.println("La última cifra es: " + (numero%10));
		
	}
}
