public class Tema4Ejercicio23{
	public static void main(String[] args){
		
		System.out.println("Introduzca la Base Imponible");
		int baseImponible = Integer.parseInt(System.console().readLine());
		
		System.out.println("Introduzca el tipo de IVA: Normal, Reducido o Super");
		double ivaNormal = baseImponible*0.21;
		double ivaReducido = baseImponible*0.10;
		double ivaSuper = baseImponible*0.04;
		String iva = System.console().readLine();
		
		System.out.println("Introduzca el código de descuento: noPro, mitad, meno5 o 5Porc");
		String descuento = System.console().readLine();
		
		if (iva.equals("Normal")){
			
			switch(descuento){
			case "noPro":
			System.out.println(baseImponible + ivaNormal);
			break;
			
			case "mitad":
			System.out.println((baseImponible + ivaNormal)/2);
			break;
			
			case "meno5":
			System.out.println((baseImponible + ivaNormal)-5);
			break;
			
			case "5Porc":
			System.out.printf("%.2f",(baseImponible + ivaNormal)/1.05);
			}
		}
		
		if (iva.equals("Reducido")){
				
			switch(descuento){
			case "noPro":
			System.out.println(baseImponible + ivaReducido);
			break;
			
			case "mitad":
			System.out.println((baseImponible + ivaReducido)/2);
			break;
			
			case "meno5":
			System.out.println((baseImponible + ivaReducido)-5);
			break;
			
			case "5Porc":
			System.out.printf("%.2f",(baseImponible + ivaReducido)/1.05);
			}
		}
	
			if (iva.equals("Super")){
				
			switch(descuento){
			case "noPro":
			System.out.println(baseImponible + ivaSuper);
			break;
			
			case "mitad":
			System.out.println((baseImponible + ivaSuper)/2);
			break;
			
			case "meno5":
			System.out.println((baseImponible + ivaSuper)-5);
			break;
			
			case "5Porc":
			System.out.printf("%.2f",(baseImponible + ivaSuper)/1.05);
			}
		}
	
	}
}
		
		
		
		
		
		
