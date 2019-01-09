public class Tema7Ejercicio11{
	public static void main(String[] args){
	
		int[] numeros = new int[10];
		int i;
		boolean esPrimo = false;
		int[] primo = new int[10];
		int[] noPrimo = new int[10];
		int contadorPrimos = 0;
		int contadorNoPrimos = 0;
		
		for(i = 0; i<10; i++){
			System.out.println("Introduce un número y pulsa INTRO");
			numeros[i] = Integer.parseInt(System.console().readLine());
				
				esPrimo=true;
				
				for(int j = 2; j<numeros[i]-1;j++){
					if(numeros[i]%j==0){
					esPrimo =  false;
				}
			}
			
				if(esPrimo){
					primo[contadorPrimos++]=numeros[i];
					
				}else{
					
				noPrimo[contadorNoPrimos++]=numeros[i];
				}
			}
				
				for (i = 0; i < contadorPrimos; i++) {
					numeros[i] = primo[i];
				}
				
				for (i = contadorPrimos; i < contadorPrimos + contadorNoPrimos; i++) {
				
					numeros[i] = noPrimo[i - contadorPrimos];
				}
				
				for(i = 0; i<10;i++){
					System.out.print(numeros[i] + " ");
				}
	}
}


