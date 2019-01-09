public class Tema5Ejercicio31{
	public static void main(String[]args){
		
		System.out.println("Introduzca la altura de la L: ");
		int alturaIntroducida = Integer.parseInt(System.console().readLine());
		System.out.println();
		
		int base = (alturaIntroducida/2)+1;
	
			
			for(int i=0;i<alturaIntroducida-1;i++){
				System.out.println("*");
			
			}
			for(int j=0;j<base;j++){
				System.out.print("*");
			}
		
	}
}
			
