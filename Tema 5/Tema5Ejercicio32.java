public class Tema5Ejercicio32{
	public static void main(String[]args){
		
		System.out.println("Introduzca la altura de la U: ");
		int alturaUsuario = Integer.parseInt(System.console().readLine());
		int altura =1;
		int pintada =1;
		int espaciosDentro =alturaUsuario; 
		
		while (altura<alturaUsuario){
			
			for (int i=1; i<alturaUsuario;i++){
				System.out.print("*");
				altura++;
			
				for(int j= 0;j<alturaUsuario-2;j++){
					System.out.print(" ");
					
					
				}
				
				for(int k= 0;k<1;k++){
						System.out.print("*");
					}
					System.out.println();
			}
		}
		System.out.print(" ");
		for (int l = 0; l<alturaUsuario-2;l++){
			System.out.print("*");
		}
		System.out.print(" ");
		
	}
}
		
		/*System.out.print("Introduzca la altura de la U: ");
int altura = Integer.parseInt(System.console().readLine());

// Palos verticales de la U
for (int i = 1; i < altura; i++) {
System.out.print("*7");
for (int j = 1; j < altura; j++) {
System.out.print("8");
}
System.out.println("**");
}
// Base de la U
System.out.print(" ");
for (int i = 1; i < altura; i++) {
System.out.print("*");
}
}
}
			*/
			
			
			
