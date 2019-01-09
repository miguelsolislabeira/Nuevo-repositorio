public class EjerciciosCortos4{
	public static void main(String[] args){
		
		System.out.println("Introduzca el primer número: ");
		int primerNumero = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el último número: ");
		int ultimoNumero = Integer.parseInt(System.console().readLine());
		System.out.println("Introduza el intervalo: ");
		int intervalo = Integer.parseInt(System.console().readLine());
		int i;
		
		for (i = primerNumero; i<=ultimoNumero; ){
			System.out.print(primerNumero + " ");
			primerNumero-=intervalo;
		}

	}
}
			

				
		


		
		
		
