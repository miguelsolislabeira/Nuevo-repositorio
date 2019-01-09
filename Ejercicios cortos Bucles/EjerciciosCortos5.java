public class EjerciciosCortos5{
	public static void main(String[] args){
		
		System.out.print("Introduzca un puto número: ");
		int altura = Integer.parseInt(System.console().readLine());
		int vueltas=0;
		int espacios = 1;
		
		while(vueltas<altura){
			
			for(int i = 0;i<espacios-1;i++){
				System.out.print(" ");
			}
			
			for(int i = 1; i<=espacios;i++){
				System.out.print(i);
			}
			
			
			System.out.println();
			espacios++;
			vueltas++;
		}
	}
}

		/*System.out.println("Introduzca un número: ");
		int altura = Integer.parseInt(System.console().readLine());
		int vueltas = 0;
		int espacios = 1;
		int pintada = 1;
		
		while(vueltas<altura){
			for(int i = 0; i<espacios-1;i++){
				System.out.print(" ");
			}
			
			System.out.print(pintada);
			
			pintada=pintada+1;
			vueltas++;
			espacios++;
			System.out.println();
		}
	}
}*/

	
		System.out.println("Introduzca un número: ");
		int altura = Integer.parseInt(System.console().readLine());
		int vueltas = 0;
		int pintada = altura;
		int espacios = 1;
		
		while(vueltas<altura){
			
			for(int i = 0; i<espacios-1;i++){
				System.out.print(" ");
			}
			
			for(int i = altura; i>pintada-1;i--){
				System.out.print(i);
				
			}
			pintada--;
			vueltas++;
			espacios++;
			System.out.println();
		}
	}
}
				
		
			

				
		


		
		
		
