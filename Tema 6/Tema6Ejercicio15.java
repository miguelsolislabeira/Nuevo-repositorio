public class Tema6Ejercicio15{
	public static void main(String[] args){

	int numeroNotas;
	String nota = "";
	String fin = "|";
	
	int compases = (int)((Math.random()*8)+1);
	
	for(int i = 1; i<=compases;i++){
	
		for (int j = 0; j<4; j++){
		numeroNotas = (int)((Math.random()*7)+1);
	
		switch (numeroNotas){
		
		case 1:
		nota = "do";
		break;
		
		case 2:
		nota = "re";
		break;
		
		case 3:
		nota = "mi";
		break;
		
		case 4:
		nota = "fa";
		break;
		
		case 5:
		nota = "sol";
		
		case 6:
		nota = "la";
		break;
		
		case 7:
		nota = "si";
		break;
		}
	
		System.out.print(nota + " ");
	
	}
		if (i == compases){
		System.out.print("||");
		
		}else
			System.out.print("|");
		
	}
	
	}
}
	
	
	
	
	
	

