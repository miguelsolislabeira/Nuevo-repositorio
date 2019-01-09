public class Tema5Ejercicio10{
	public static void main(String[] args){

		int numeroTeclado;
		int acumulador = 0;
		int contador = -1;
	
		do{
			System.out.println("Introduzca números separados por INTRO. Negativo para terminar");
			numeroTeclado = Integer.parseInt(System.console().readLine());
			acumulador +=numeroTeclado;
			contador++;
			
		}while (numeroTeclado >0);
		
		System.out.println("La media de los números introducidos es: " + ((acumulador-numeroTeclado)/contador));


	}
}



