public class ejercicio3{
	public static void main(String[] args){
		
		int altura;
		
		do{
			
		System.out.println("Introduzca una altura entre 4 y 20");
		altura = Integer.parseInt(System.console().readLine());
		
		}while ((altura<4) || (altura>20));
	
		int espacios = altura-1;
		
		for(int i = 0; i<altura; i++){
			
			for(int j = 0; j<espacios; j++){
				System.out.print(" ");
			}
			
			if ((i==0) || (i==altura-1)){
				
				for(int j = 0; j<altura;j++){
					System.out.print("*");
				}
			}else{
				
				System.out.print("*");
			
				for(int j = 2; j<altura;j++){
				System.out.print(" ");
				}
				
				System.out.print("*");
		}
			
			System.out.println();
			espacios--;
		}
	}
}
				
			

