public class Tema6Ejercicio11{
	public static void main(String[] args){

		String nota = "";
		
		int acumuladorI = 0;
		int acumuladorS = 0;
		int acumuladorB = 0;
		int acumuladorN = 0;
		int acumuladorSob = 0;
		
		
		for(int i=0; i<20;i++){
			
			int numeroNota = (int)(Math.random()*5);
			
			switch (numeroNota){
				case 0:
				nota = "Insuficiente";
				acumuladorI++;
				break;
				
				case 1:
				nota = "Suficiente";
				acumuladorS++;
				break;
				
				case 2:
				nota = "Bien";
				acumuladorB++;
				break;
				
				case 3:
				nota = "Notable";
				acumuladorN++;
				break;
				
				case 4: 
				nota = "Sobresaliente";
				acumuladorSob++;
				break;
				
			}
			
			System.out.println(nota);
		}
			System.out.println();;
			System.out.println("Insuficientes: " + acumuladorI);
			System.out.println("Suficientes: " + acumuladorS);
			System.out.println("Bien: " + acumuladorB);
			System.out.println("Notables: " + acumuladorN);
			System.out.println("Sobresalientes: " + acumuladorSob);
			
	 }
 }
			 

		
		
				                         
		
