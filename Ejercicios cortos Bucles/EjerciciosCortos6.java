public class EjerciciosCortos6{
	public static void main(String[] args){
		
		System.out.println("Introduzca la altura: ");
		int altura = Integer.parseInt(System.console().readLine());
		int vueltas = 0;
		int pintada = 1;
	
		
		while(vueltas<altura){
			
			for(int i = 0; i<=vueltas;i++){
				System.out.print(pintada);
			}
			vueltas++;
			pintada++;
			System.out.println();
		}
	


		
		
		
		System.out.println("Introduzca la altura: ");
		int altura = Integer.parseInt(System.console().readLine());
		
		int vueltas = 0;
		int pintada = altura;
		int fermoso = altura-1;
		
		
		while(vueltas<altura){
			
			for(int i = altura;i<=fermoso+1;i++){
				
				System.out.print(pintada);
			}
			
			fermoso++;
			pintada--;
			vueltas++;
			System.out.println();
		}

		
		
		
		System.out.println("Introduzca una altura: ");
		int altura = Integer.parseInt(System.console().readLine());
		int vueltas = 0;
		int furibundo = 2;
		
		
		while(vueltas<altura){
			
			for(int i =1; i<furibundo;i++){
				System.out.print(i);
			}
			vueltas++;
			furibundo++;
			System.out.println();
		}
	}
}
			

		
	
	
				
		
