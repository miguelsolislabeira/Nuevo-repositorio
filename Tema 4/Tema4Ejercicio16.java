public class Tema4Ejercicio16{
	public static void main(String[] args){
		
		
		int puntos =0; 
		System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. V/F");
		String respuesta1 = System.console().readLine();
		
		if (respuesta1.equals("V")){
			puntos +=3;
		}
		
		System.out.println("Ha aumentado sus gastos de vestuario. V/F");
		String respuesta2 = System.console().readLine();
		
		if (respuesta2.equals("V")){
			puntos+=3;
		}
		
		System.out.println("Ha perdido el interés que mostraba anteriormente por ti. V/F");
		String respuesta3 = System.console().readLine();
		if (respuesta3.equals("V")){
			puntos+=3;
		}
		
		System.out.println("Ahora se arregla el pelo y se asea con más frecuencia. V/F");
		String respuesta4 = System.console().readLine();
		if (respuesta4.equals("V")){
			puntos+=3;
		}
		
		System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante. V/F");
		String respuesta5 = System.console().readLine();
		if (respuesta5.equals("V")){
			puntos+=3;
		}
		
		System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceada. V/F");
		String respuesta6 = System.console().readLine();
		if (respuesta6.equals("V")){
			puntos+=3;	
		}
		
		System.out.println("No te deja que mires su agenda del movil. V/F");
		String respuesta7 = System.console().readLine();
		if (respuesta7.equals("V")){
			puntos+=3;
		}
		
		System.out.println("Llega tarde del trabajo. V/F");
		String respuesta8 = System.console().readLine();
		if (respuesta8.equals("V")){
			puntos+=3;
		}
		System.out.println("Últimamente se perfuma más. V/F");
		String respuesta9 = System.console().readLine();
		if (respuesta9.equals("V")){
			puntos+=3;
		}
		
		System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo. V/F");
		String respuesta10 = System.console().readLine();
		if (respuesta10.equals("V")){
			puntos+=3;
		}
		
		System.out.println("Has obtenido " + puntos + "puntos");
		
		if ((puntos>=0) && (puntos<=10)){
			System.out.println("Tu pareja no te engaña");
			
		}else if ((puntos >=11) && (puntos<=22)){
			System.out.println("Cuidadín");
			
		}else if ((puntos>22) && (puntos<=30)){
			System.out.println("Te engaña");
		}
		
	}
}
