public class EjerciciosCortos7{
	public static void main(String[] args){
		
		System.out.println("Introduzca altura: ");
		int altura = Integer.parseInt(System.console().readLine());
		
		int vueltas = 0;
		int pintada = altura;
		int espacios = altura-1;
		int fespacios =altura;
		
			while(vueltas<altura){
				
				for(int i = 0; i<espacios; i++){
					System.out.print(" ");
				}
				
				for(int i = pintada+1;i>fespacios;i--){
					System.out.print(pintada);
				}
				fespacios-=2;
				pintada--;
				espacios--;
				vueltas++;
				System.out.println();
			}
		}
	}
	
	
		System.out.println("Introduzca un número: ");
		int altura = Integer.parseInt(System.console().readLine());
		int vueltas = 0;
		int pintada = 1;
		int folklore = 2;
		int espacios = altura-1;
		
		while(vueltas<altura){
			
			for(int i = 0; i<espacios;i++){
				System.out.print(" ");
			}
			for (int i = 1;i<folklore;i++){
				System.out.print(pintada);
			}
			espacios--;
			vueltas++;
			folklore++;
			pintada++;
			System.out.println();
		}
	}
}

		System.out.println("Introduzca la altura: ");
		int altura = Integer.parseInt(System.console().readLine());
		
		int vueltas = 0;
		int flipante =2;
		int espacios = altura-1;
		int pintada = 1;
		
		while(vueltas<altura){
			
			for(int i = 0; i<espacios;i++){
				System.out.print(" ");
			}
			
			for(int i = 1; i<flipante;i++){
				System.out.print(i);
			}
			vueltas++;
			flipante++;
			pintada++;
			espacios--;
			System.out.println();
		}
	}
}
				
			
