public class Tema4Ejercicio14{
	public static void main(String[] args){
		
		System.out.println("Introduzca un número entero y pulse INTRO");
		int numero = Integer.parseInt(System.console().readLine());
		
		if ((numero %2 ==0) && (numero %5 ==0)){
			System.out.println("El número es par y divisible entre 5");
			
		}else if (numero %2 ==0){
			System.out.println("El número es par");
		
		}else if (numero %5 ==0){
			System.out.println("El número es divisible entre 5");
		}
		
	}
} 
