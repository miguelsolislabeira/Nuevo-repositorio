public class EjerciciosCortos9{
	public static void main(String[] args){
		
		int numero;
		int contador = 0;
		
		do{
			System.out.println("Introduzca un número entero (0 para salir): ");
			numero = Integer.parseInt(System.console().readLine());
			
			if(numero!=0){
			System.out.println("El cuadrado de " + numero + " es: " + (numero*numero));
			contador++;
		}
			
		}while ((numero!=0) && (contador<4));
	}
}
