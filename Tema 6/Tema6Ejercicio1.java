public class Tema6Ejercicio1{
	public static void main(String[] args){

		int tirada;
		int suma =0;
		for(int i =0; i<3;i++){
		
		 tirada =(int)(Math.random()*6)+1;
		 
		 suma+=tirada;
		 
		 System.out.println(tirada);
		 
		}
		
		System.out.print("La suma de las tres tiradas es " + suma);
		
		
		
		
		
		
	}
}
		
		
