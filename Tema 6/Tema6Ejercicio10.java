public class Tema6Ejercicio10{
	public static void main(String[] args){
		
		String caracter = "";
		
		
		
	for(int j =0; j<10;j++){
		
		int numeroCaracter = (int)(Math.random()*6);
		int longitud = (int)(Math.random()*40);
		
		switch(numeroCaracter){
			
			case 0:
			caracter = "*";
			break;
			
			case 1:
			caracter = "-";
			break;
			
			case 2:
			caracter = "=";
			break;
			
			case 3:
			caracter = "@";
			break;
			
			case 4: 
			caracter = "|";
			break;
			
			case 5:
			caracter = ",";
			break;
		}

		for(int i = 0;i<=longitud;i++){
			
			System.out.print(caracter);
			}
			System.out.println();
	}
		
	 }
 }
			 

		
		
				                         
		
