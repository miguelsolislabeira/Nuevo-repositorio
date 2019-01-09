public class Tema5Ejercicio19{
	public static void main(String[] args){
		System.out.print("Por favor, introduzca la altura de la pirámide: ");
		int alturaIntroducida = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduzca el carácter de relleno: ");
		String relleno = System.console().readLine();


		/*1º - Determinar los espacios que hay que pintar. Al ser una pirámide, en cada fila habrá un espacio menos que
		 * en la anterior. Como en la fila que hace de base no hay espacios, los espacios equivalen a la altura de la 
		 * misma -1 (Ese uno es el piso de abajo)*/
		 
		 int espacios = alturaIntroducida-1;
		 
		 /*2º Ahora creamos una variable que la compararemos con la altura introducida por el usuario. Esto nos permitirá
		  * formar el bucle principal, que irá iterando tantas veces como altura tenga la pirámide.*/
		  
		  int vueltas=1;
		  
		  /*3º Por último, creamos la variable con la que pintaremos. La inicializamos a 1 porque en la cúspide de la
		   * pirámide (en la primera iteración del bucle) pintaremos sólo un caracter*/
		   
		   int longitudPintada = 1;
		   
		   /*4º Construimos el bucle esqueleto o principal: */
		   
		   while(vueltas<=alturaIntroducida){ /*Determina la duración del bucle, que es lógicamente,la altura de la pirámide)*/
			   
			   /*5º Construimos el bucle que nos irá pintando los espacios en cada fila (en cada piso de la pirámide)*/
			   
			   for(int i=0; i<espacios;i++){ /*6º En cada vuelta nos pinta los espacios */
				   System.out.print(" ");
			   }
			   
			   /*7º Construimos el bucle que nos irá pintando la pirámide propiamente dicha. Lo creamos para que en la
			    * primera pasada sólo de una vuelta y, por tanto, pinte un único asterisco.*/
			   for(int j = 1; j<=longitudPintada;j++){
				   System.out.print(relleno);
			   }
			   
			   vueltas++; /*Las vueltas se incrementan de una en una hasta llegar a la altura introducida*/
			   espacios--;/*Los espacios decrecentan de uno en uno porque en cada fila, hay uno menos que en la anterior*/
			   longitudPintada+=2;/*Incrementamos +2 para que el bucle que pinta, de dos vueltas más en cada pasada, ya que
			   en cada fila hay dos asteriscos más que en la anterior*/
			   System.out.println(); /*Después de cada vuelta del bucle principal, hacemos un salto de línea para continuar
			   pintando la siguiente fila de la pirámide.*/
		   }
	   }
   }
			  
			




















		
