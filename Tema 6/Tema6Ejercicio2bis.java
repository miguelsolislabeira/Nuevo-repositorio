public class Tema6Ejercicio2bis{
	public static void main(String[] args){

		System.out.println("Carta de la baraja francesa");
		System.out.println();
		
		String palo = " ";
		String carta = " ";
		
		int numeroPalo = (int)((Math.random()*4))+1;
		int numeroCarta = (int)((Math.random()*13))+1;
		
		switch(numeroPalo){
			
			case 1:
			palo = "corazones";
			break;
			
			case 2:
			palo = "picas";
			break;
			
			case 3:
			palo = "tréboles";
			break;
			
			case 4:
			palo = "rombos";
		}
		
		switch (numeroCarta){
			
			case 1:
			carta = "as";
			break;
			
			case 11:
			carta = "J";
			break;
			
			case 12:
			carta = "Q";
			break;
			
			case 13:
			carta = "K";
			break;
			
			default:
			carta = String.valueOf(numeroCarta);
		}
		
		System.out.println("Su carta es el " + carta + " de " + palo);	
		
	}
}
