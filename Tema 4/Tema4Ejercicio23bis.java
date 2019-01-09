public class Tema4Ejercicio23bis{
	public static void main (String[] args){
		
		System.out.println("Introduzca la base imponible");
		double baseImponible = Double.parseDouble(System.console().readLine());
		
		System.out.println("Introduzca el IVA. 1 - Normal. 2 - Reducido. 3 - Superreducido");
		int tipoIva = Integer.parseInt(System.console().readLine());
		
		System.out.println("Introduzca promoción: 1- Sin promoción. 2- Mitad. 3 - 5€ descuento. 4 - -5%");
		int tipoPromo = Integer.parseInt(System.console().readLine());
		
		double iva =0;
		
		switch (tipoIva){
			case 1: 
			iva =baseImponible*0.21;
			break; 
		
			case 2:
			iva = baseImponible*0.10;
			break;
			
			case 3:
			iva = baseImponible*0.04;
			break;
		}
		
		double precioConIva = baseImponible + iva;
		double promo =0;
		
		switch (tipoPromo){
			case 1:
			promo = 0;
			break;
			
			case 2:
			promo = precioConIva/2;
			break;
			
			case 3:
			promo =-5;
			break;
			
			case 4:
			promo = (precioConIva*1.05)-precioConIva;
			break;
			
			default:
			System.out.println("No ha introducido bien el código de promoción");
		}
	
			System.out.println("Detalle de su factura");
			System.out.println("---------------------");
			System.out.println("Base Imponible: " + baseImponible);
			System.out.println("Iva aplicable: " + iva);
			System.out.println("Código Promoción: " + promo);
			System.out.println("Total a Pagar: " + (precioConIva-promo));
			
	}
}
