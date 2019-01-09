public class Tema6Ejercicio16{
	public static void main(String[] args){
		
		
		int figura;
		int figura1 = 0;
		int figura2 = 0;
		int figura3 = 0;
		
		for (int i=0; i<3; i++){
			
			figura = (int)((Math.random()*5)+1);
			
			switch (figura){
				
				case 1: 
				System.out.print("corazón ");
				break;
				
				case 2:
				System.out.print("diamante ");
				break;
				
				case 3:
				System.out.print("limón ");
				break;
				
				case 4:
				System.out.print("herradura ");
				break;
				
				case 5:
				System.out.print("campana ");
				break;
			
				
			}
				
				switch(i){
					
					case 1:
					figura1 = figura;
					break;
					
					case 2:
					figura2 = figura;
					break;
					
					case 3:
					figura3 = figura;
					break;
				}
				
			}
			
					if((figura1!=figura2) && (figura2!=figura3) && (figura1!=figura3)){
					
					System.out.println("\nLo siento");
					
				}else if ((figura1==figura2) && (figura2!=figura3)){
					
					System.out.println("\n Recupera su apuesta");
					
				}else if ((figura1==figura2) && (figura2==figura3)){
					
					System.out.println("\n Gana 10 pavos");
				}
			
	}
}


	
	
	
	
	
	

