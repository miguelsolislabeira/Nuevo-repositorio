public class tema7Ejercicio6{
	public static void main(String[] args){
		
		int[] array = new int[15];
		int i;
		
		System.out.println("Introduzca 15 números separados por INTRO: ");
		
		for(i = 0; i<15;i++){
			array[i] = Integer.parseInt(System.console().readLine());
		}
		
		for(i=0; i<15;i++){
			System.out.print(i + " |");
		}
		System.out.println();
		for(i=0; i<45;i++){
			System.out.print("-");
		}
		
		System.out.println();
		
		for(i=0; i<15; i++){
			System.out.print(array[i] + " |");
		}
		
		int aux = array[14];
		for(i = 14; i>0;i--){
			array[i]=array[i-1];
		}
		
		array[0] = aux;
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(i=0; i<15;i++){
			System.out.print(i + " |");
		}
		System.out.println();
		for(i=0; i<15;i++){
			System.out.print("-");
		}
		
		System.out.println();
		
		for(i=0; i<15; i++){
			System.out.print(array[i] + " |");
		}
	}
}
	
