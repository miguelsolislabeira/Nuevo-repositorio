public class Tema7Ejercicio9{
	public static void main(String[] args){
		
		int[] numeros = new int[8];
		int i;
		
			for(i = 0; i<8;i++){
				System.out.println("Introduzca 8 números separados por INTRO: ");
				numeros[i] = Integer.parseInt(System.console().readLine());
			}
			
			for(i = 0; i<8;i++){
				
				if(numeros[i]%2==0){
					System.out.print(" par");
					
				}else{
					System.out.print(" impar");
				}
			}
	
	}
}
