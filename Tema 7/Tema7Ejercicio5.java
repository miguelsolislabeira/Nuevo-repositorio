public class Tema7Ejercicio5{
	public static void main(String[] args){
		
		int[] numeros = new int[10];
		int i;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (i=0; i<10; i++){
			System.out.print("Introduzca un número y pulse INTRO: ");
			numeros[i] = Integer.parseInt(System.console().readLine());
			
			if(numeros[i] > max){
				max=numeros[i];
			}
			
			if(numeros[i]<min){
				min=numeros[i];
			}
			
		}
			for(i = 0; i<10;i++){
				System.out.print(numeros[i]);
				
				
				if(numeros[i]==max){
					
				System.out.print(" Máximo ");
				}
				
				if(numeros[i]==min){
					System.out.print(" Mínimo ");
				}
				
				System.out.println();
			}
	}
}
				
		


		
		
		
