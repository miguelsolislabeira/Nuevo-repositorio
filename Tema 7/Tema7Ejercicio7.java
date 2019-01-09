public class Tema7Ejercicio7{
	public static void main(String[] args){
		
		int[] array = new int[100];
					
			for(int i = 0; i<100; i++){
			array[i] = (int)(Math.random()*21);
		}
			for(int i = 0; i<100; i++){
				System.out.print(array[i] + " ");
			}
			
			System.out.println("Introduzca un número de los que se han mostrado: ");
			int numero1 = Integer.parseInt(System.console().readLine());
			System.out.println("Introduzca el valor por el que lo quiere sustituir: ");
			int numero2 = Integer.parseInt(System.console().readLine());
			
			
			for(int i = 0; i<100; i++){
				
				if(array[i] == numero1){
					array[i] = numero2;
					
					System.out.print ("\"" + array[i] + "\" ");
				
				}else{
						System.out.print(array[i] + " ");
					}
			}
	}
}
