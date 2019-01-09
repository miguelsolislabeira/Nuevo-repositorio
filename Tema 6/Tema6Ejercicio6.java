public class Tema6Ejercicio6{
	public static void main(String[] args){

		int numeroSecreto = (int)(Math.random()*101);
		int intentos = 5;
		System.out.println(numeroSecreto);
		
			int numeroTeclado;
			
			do{
				System.out.println("Averigüe un número entre 0 y 100. Intentos: " + intentos);
				numeroTeclado = Integer.parseInt(System.console().readLine());
				intentos--;
				
				if(numeroTeclado>numeroSecreto){
					System.out.println("El número secreto es menor");
					
				}else if(numeroTeclado<numeroSecreto){
					System.out.println("El número secreto es mayor");
				
				}else if(numeroTeclado==numeroSecreto){
					System.out.println("Enhorabuena!");
				}
				
				
				
			}while((numeroTeclado!=numeroSecreto) && (intentos!=0));
			
		
	}
}
	
		
				                         
		
