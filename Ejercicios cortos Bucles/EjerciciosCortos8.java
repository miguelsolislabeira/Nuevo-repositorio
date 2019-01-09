public class EjerciciosCortos8{
	public static void main(String[] args){
		
		int numero;
		
		do{
			System.out.println("Introduzca un número entero (0 para salir): ");
			numero = Integer.parseInt(System.console().readLine());
			
			if(numero!=0){
			System.out.println("El cuadrado de " + numero + " es: " + (numero*numero));
		}
			
		}while (numero!=0);
	}
}
