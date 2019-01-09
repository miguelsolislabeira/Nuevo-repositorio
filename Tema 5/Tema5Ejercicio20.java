public class Tema5Ejercicio20{
	public static void main(String[] args){
		
		System.out.println("Introduce la altura de la pirámide: ");
		int altura = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el caracter para pintar la pirámide: ");
		String relleno = System.console().readLine();
		
		int espaciosFuera = altura-1;
		int vueltas =1;
		int espaciosDentro=0;
		
		while(vueltas<altura){
			
			for(int i=0;i<espaciosFuera;i++){
				System.out.print(" ");
			}
			
			System.out.print(relleno);
			
			for(int j=1;j<espaciosDentro;j++){
			System.out.print(" ");
			}
			
			if(vueltas>1){
				System.out.print(relleno);
			}
			
			
			System.out.println();
			vueltas++;
			espaciosFuera--;
			espaciosDentro+=2;
		}
		
			for(int k=1;k<vueltas*2;k++){
				System.out.print(relleno);
			}
	}
}
					
					
