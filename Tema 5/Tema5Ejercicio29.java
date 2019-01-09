public class Tema5Ejercicio29{
	public static void main(String[] args){
		
		System.out.println("Introduzca un número entero positivo: ");
		int numero = Integer.parseInt(System.console().readLine());
		System.out.println();
		System.out.println("Introduzca el número por el que no puedan ser divisibles");
		int numero1 = Integer.parseInt(System.console().readLine());
		
		
			for(int i= 0; i<numero;i++){
				
				if(i%numero1!=0){
					
					System.out.println(i);
					
				}
		}
	}
}
		
			
