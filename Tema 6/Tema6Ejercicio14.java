public class Tema6Ejercicio14{
	public static void main(String[] args){
		
		int numeroSecreto = (int)(Math.random()*101);
		System.out.println(numeroSecreto);
		int intentos = 5;
		int numero;
		
		do{
			System.out.println("Adivine el número secreto. Intentos: " + intentos);
			numero = Integer.parseInt(System.console().readLine());
			intentos--;
			
			if(numero>numeroSecreto){
				System.out.println("El número secreto es menor");
				
			}else if(numero<numeroSecreto){
				System.out.println("El número secreto es mayor");
				
			}else if(numero==numeroSecreto){
				System.out.println("Enhorabuena! Ha acertado el número secreto!");
			}
		}while ((numero!=numeroSecreto) && (intentos!=0));
			
	 }
 }
			 

		
		
				                         
		
