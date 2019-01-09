public class Tema4Ejercicio20{
	public static void main(String[] args){
		
		System.out.println("Introduzca un número de hasta 5 cifras y le diré si es capicúa: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		if ((numero>=100) && (numero<=999)){
		
			if ((numero/100) == (numero%100)){
			System.out.println("Capicúa");
			}
			
		}
	}
}
