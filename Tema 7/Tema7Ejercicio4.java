public class Tema7Ejercicio4{
	public static void main(String[] args){
		
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		int i;
		
		for(i = 0; i<20; i++){
		numero[i]=(int)(Math.random()*101);
		cuadrado[i] = numero[i] * numero[i];
		cubo[i] = cuadrado[i] * numero[i];
	}
	
		System.out.println("Número - Cuadrado - Cubo");
		System.out.println("-------------------------");
		
		for(i = 0; i<20;i++){
		System.out.printf("%4d   |%8d  | %6d \n",numero[i], cuadrado[i], cubo[i]);
		}
		
	}
}
				
		


		
		
		
