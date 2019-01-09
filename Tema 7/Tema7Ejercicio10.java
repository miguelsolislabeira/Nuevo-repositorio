public class Tema7Ejercicio10{
	public static void main(String[] args){
	
		int[] numeros = new int[20];
		int i;
		int[] numerosPares = new int[20];
		int[] numerosImpares = new int[20];
		int contadorPares = 0;
		int contadorImpares = 0;
		
		for(i = 0; i<20;i++){
			
			numeros[i] = (int)(Math.random()*101);
		}
		
		for(i = 0; i<20; i++){
			
			if(numeros[i]%2==0){
				
			numerosPares[contadorPares++] = numeros[i];
			
			}else{
				numerosImpares[contadorImpares++] = numeros[i];
				
			}
		}
		
			System.out.println("Array original: ");
			
			for(i = 0; i<numeros.length;i++){
			System.out.print(numeros[i] + " ");
		}
		
			for(i = 0; i<contadorPares; i++){
				numeros[i] = numerosPares[i];
			}
			
			for(i = contadorPares; i<numeros.length;i++){
				numeros[i] = numerosImpares[i-contadorPares];
			}
				System.out.println("\n");
				System.out.println("Array con los pares al principio: \n");
			for(i = 0; i<numeros.length;i++){
				System.out.print(numeros[i] + " ");
			}
			
	}
}
