public class Tema5Ejercicio25{
	public static void main(String[] args){
		
	
		System.out.println("Introduzca un número y le daré la vuelta");
		int numeroTeclado = Integer.parseInt(System.console().readLine());
		
		
		int numeroReves=0;
		int aux= numeroTeclado;
		
		do{
			numeroReves = (numeroReves*10) + (numeroTeclado%10);
			numeroTeclado/=10;
		}while(numeroTeclado>0);
			
		
		System.out.print("El " + aux + " al revés es " + numeroReves);
	}
}
			
