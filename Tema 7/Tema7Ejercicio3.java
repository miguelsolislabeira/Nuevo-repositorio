public class Tema7Ejercicio3{
	public static void main(String[] args){
		
		int[] array = new int[10];
		int i;
		
		for(i = 0; i<10;i++){
			System.out.println("Introduzca un número y pulse INTRO");
			array[i] = Integer.parseInt(System.console().readLine());
			
		}
		
		System.out.println("Los números introducidos al revés son: ");
		
		for(i = 9; i>=0; i--){
			System.out.println(array[i]);
		}

	}
}
				
		


		
		
		
