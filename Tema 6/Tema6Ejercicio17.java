public class Tema6Ejercicio17{
	public static void main(String[] args){
		
		int comparador = 0;
		
		System.out.println("Introduzca la altura de la pecera");
		int altura = Integer.parseInt(System.console().readLine());
		
		System.out.println("Introduzca el ancho de la pecera");
		int ancho = Integer.parseInt(System.console().readLine());
		
		for (int i = 1; i<=altura;i++){
			System.out.print("*");
			
			
			if ((i==1) || (i==altura)){
				
				for(int j = 0; j<ancho-1;j++){
					System.out.print("*");
				}
				
			}else{
					for(int j = 2; j<ancho;j++){
					System.out.print(" ");
					
				}
				System.out.print("*");
				
				
			}
				
				System.out.println();
		
		}
		
	
	
	}
}


	
	
	
	
	
	

