public class Tema5Ejercicio24{
	public static void main(String[] args){
		
		System.out.println("Introduzca la altura de la pirámide: ");
		int alturaIntroducida = Integer.parseInt(System.console().readLine());
		
		int espacios = alturaIntroducida-1;
		int vueltas = 1;
		int i = 0;
		
		while(vueltas<alturaIntroducida){
			
			for(i=1;i<espacios;i++){
				System.out.print(" ");
			}
			
			for(i=1;i<vueltas;i++){
				System.out.print(i);
			}
			
			for(i=vueltas;i>0;i--){
				System.out.print(i);
			}
			espacios--;
			vueltas++;
			System.out.println();
		}
	}
}
				
			
			
