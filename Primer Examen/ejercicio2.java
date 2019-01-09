public class ejercicio2{
	public static void main(String[] args){
		
		int altura;
		do{
			
		System.out.println("Introduzca una altura entre 4 y 20");
		altura = Integer.parseInt(System.console().readLine());
		
		}while ((altura<4) || (altura>20));
		
		int espacios = altura-1;
		int base = 0;
		
		while(base<altura){
			
			for(int i=0; i<espacios;i++){
				System.out.print(" ");
			}
			
			for(int i=0; i<altura;i++){
				System.out.print("*");
			}
			System.out.println();
			base++;
			espacios--;
		}
	}
}
