public class EjerciciosCortos3{
	public static void main(String[] args){
		
		System.out.println("Introduzca cuántos números quiere ver: ");
		int vueltas = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el primer número: ");
		int primerNumero = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el intervalo entre números: ");
		int intervalo = Integer.parseInt(System.console().readLine());
		
		for(int i = 0; i<vueltas; i++){
			
			System.out.print(primerNumero + " ");
			primerNumero+=intervalo;
		}
			
	

	}
}
			

				
		


		
		
		
