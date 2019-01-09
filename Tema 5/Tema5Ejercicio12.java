public class Tema5Ejercicio12{
	public static void main(String[] args){

		System.out.println("Introduzca un número");
		int numero = Integer.parseInt(System.console().readLine());
		int primerNumero = 0;
		int segundoNumero = 1;
		int suma = primerNumero+segundoNumero;
		int acumulador =0;
		
		
		do{
			System.out.println(primerNumero);
			System.out.println(segundoNumero);
			System.out.println(suma);
			primerNumero=segundoNumero;
			segundoNumero=suma;
			acumulador+=suma;
			
		
				
			
			} while (acumulador!=numero);


	}
}



