public class Tema6Ejercicio3{
	public static void main(String[] args){

		String carta = "";
		String palo = "";
		
		int numeroPalo = (int)((Math.random()*4)+1);
		int numeroCarta = (int) ((Math.random()*12)+1);
		
		switch(numeroPalo){
			
			case 1:
			palo = "Oros";
			break;
			
			case 2:
			palo = "Copas";
			break;
			
			case 3:
			palo = "Espadas";
			break;
			
			case 4:
			palo = "Bastos";
			break;
		}
		
		switch(numeroCarta){
			
			case 1:
			carta = "As";
			break;
			
			case 10:
			carta = "Sota";
			break;
			
			case 11:
			carta = "Caballo";
			break;
			
			case 12:
			carta = "Rey";
			break;
			
			default:
			carta = String.valueOf(numeroCarta);
		}
		
		System.out.println("Su carta es " + carta + " de " + palo);
		
	}
}
