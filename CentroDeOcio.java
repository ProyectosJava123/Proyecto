package GIT;
import java.util.*;
public class CentroDeOcio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int edad;
		double altura;
		String opcion;
		String nombre, dni;
		int veces=0;
		boolean seguir = true;
		
		Atracciones ArrayAtraccionesInfantiles [] = new Atracciones [3];
		Atracciones ArrayAtraccionesAcuaticas [] = new Atracciones [3];
		Atracciones ArrayAtraccionesClasicas [] = new Atracciones [3];
		
		
		ArrayAtraccionesClasicas [0] = new Atracciones ("Noria",5,20, "La mejor atraccion del mundo",10, "1,50 ~ 1,90", "15~80");
		ArrayAtraccionesClasicas [1] = new Atracciones ("Coches de choque", 15,20,"La mejor atracion del mundo",6, "1,50 ~ 2","10 ~ 80");
		ArrayAtraccionesClasicas [2] = new Atracciones ("Martillo", 15,20,"La mejor atracion del mundo",6, "1,50 ~ 2","10 ~ 80");
		
		ArrayAtraccionesAcuaticas [0] = new Atracciones ("Los Fiordos", 15,20, "Refréscate en una montaña rusa de agua con gran caída",8, "1,50 ~ 2","10 ~ 80");
		ArrayAtraccionesAcuaticas [1] = new Atracciones ("El Aserradero", 15,20, "Montate en uno de los troncos y prepárate para la acción",7, "1,50 ~ 2","10 ~ 80");
		ArrayAtraccionesAcuaticas [2] = new Atracciones ("Los Rápidos", 15,20,"Emocionante atracción donde habrá cascadas, remolinos y olas",7, "1,50 ~ 2","10 ~ 80");
		
		ArrayAtraccionesInfantiles [0] = new Atracciones ("Coches de choque infantiles", 15,20, "Coches de choques adaptados para niños", 5,"1,50 ~ 2","10 ~ 80");
		ArrayAtraccionesInfantiles [1] = new Atracciones ("Jimmy Neutron", 15,20, "Súbete a una lanzadera y disfruta", 6,"1,50 ~ 2","10 ~ 80");
		ArrayAtraccionesInfantiles [2] = new Atracciones ("La aventura de Dora", 15,20, "Sube a uno de nuestros Jeep y adéntrate en el bosque", 6,"1,50 ~ 2","10 ~ 80");
		
		Persona ArrayPersona [] = new Persona [100];
		
		System.out.println("**********************");
		System.out.println("* B i en v e n i d o *");
		System.out.println("**********************");
		System.out.println(" ");
		System.out.println("***********************************************************");
		System.out.println("Se te permitirá o denegarán atracciones según tu altura");
		System.out.println("Atracciones Infaltiles: 1m ~ 1,30m");
		System.out.println("Atracciones Clásicas y Acuáticas: 1,30m ~ 1,90m");
		System.out.println("***********************************************************");
		
		do{	
			
			System.out.println("Datos para la entrada");
			
			System.out.println(" ");
			
			System.out.println("Introduce Nombre");
			nombre=teclado.next();
			System.out.println("Introduce Edad");
			edad=teclado.nextInt();
			
			do{System.out.println("Introduce Altura");
			altura=teclado.nextDouble();}
			while(altura<1 && altura >1.90);
			
			do{
			System.out.println("Introduce DNI");
			dni=teclado.next();
			
			}while(!comprobarDni(dni));
			
			System.out.println(" ");
		
		ArrayPersona [veces] = new Persona(nombre, edad, altura, dni);
		
		if(altura>=1 && altura<=1.30){
			System.out.println("Atracciones infantiles");
			for(int x=0; x<ArrayAtraccionesInfantiles.length;x++){
				System.out.println(" ");
				System.out.println("Nombre: " +ArrayAtraccionesInfantiles[x].toString());
				System.out.println(" ");
			}
			
			do{
			System.out.println("Elige atracción");
			System.out.println("1 - Coches Infantiles");
			System.out.println("2 - Jimmy Neutron");
			System.out.println("3 - La Aventura De Dora");
			opcion=teclado.next();
			}while(!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3"));
			
			if(opcion.equals("1")){
				ArrayPersona[veces].setEntrada(ArrayAtraccionesInfantiles[0].getPrecio());
			}
			else if(opcion.equals("2")){
				ArrayPersona[veces].setEntrada(ArrayAtraccionesInfantiles[1].getPrecio());
			}
			else if(opcion.equals("3")){
				ArrayPersona[veces].setEntrada(ArrayAtraccionesInfantiles[2].getPrecio());
			}
			
			
		}
		else if(altura>=1.30 && altura<=1.90){
			
			do{
		System.out.println("Elige Tipo De Atracción");
		System.out.println("1 - Atracciones Clásicas");
		System.out.println("2 - Atracciones Acuáticas");
		opcion=teclado.next();
			}while(!opcion.equals("1") && !opcion.equals("2"));
		
			if(opcion.equals("1")){
				
				
				for(int x=0; x<ArrayAtraccionesClasicas.length;x++){
					System.out.println(" ");
					System.out.println("Nombre: " +ArrayAtraccionesClasicas[x].toString());
					System.out.println(" ");
				}
				
				do{
					System.out.println("Elige atracción");
					System.out.println("1 - Noria");
					System.out.println("2 - Coches De Choque");
					System.out.println("3 - El Martillo");
					opcion=teclado.next();
					}while(!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3"));
					
				if(opcion.equals("1")){
					ArrayPersona[veces].setEntrada(ArrayAtraccionesClasicas[0].getPrecio());
				}
				else if(opcion.equals("2")){
					ArrayPersona[veces].setEntrada(ArrayAtraccionesClasicas[1].getPrecio());
				}
				else if(opcion.equals("3")){
					ArrayPersona[veces].setEntrada(ArrayAtraccionesClasicas[2].getPrecio());
				}
				
			}
			else{
				for(int x=0; x<ArrayAtraccionesAcuaticas.length;x++){
					System.out.println(" ");
					System.out.println("Nombre: " +ArrayAtraccionesAcuaticas[x].toString());
					System.out.println(" ");
				}
				
				do{
					System.out.println("Elige atracción");
					System.out.println("1 - Los Fiordos");
					System.out.println("2 - El Aserradero");
					System.out.println("3 - Los Rápidos");
					opcion=teclado.next();
					}while(!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3"));
					
				if(opcion.equals("1")){
					ArrayPersona[veces].setEntrada(ArrayAtraccionesAcuaticas[0].getPrecio());
				}
				else if(opcion.equals("2")){
					ArrayPersona[veces].setEntrada(ArrayAtraccionesAcuaticas[1].getPrecio());
				}
				else if(opcion.equals("3")){
					ArrayPersona[veces].setEntrada(ArrayAtraccionesAcuaticas[2].getPrecio());
				}
			}
			
		}
		
		do{
		System.out.println("¿Quieres Pedir Otra Entrada?");
		System.out.println("1 - SI");
		System.out.println("1 - NO");
		opcion=teclado.next();
		}while(!opcion.equals("1") && !opcion.equals("2"));
		
		if(opcion.equals("1")){
			veces++;
		}
		else if(opcion.equals("2")){
			seguir=false;
		}
		}
		while(seguir);
		
		MostrarInformacionDeClientes(ArrayPersona);
}
	
	public static void MostrarInformacionDeClientes(Persona ArrayPersona []){
		
	for(int x=0; x<ArrayPersona.length; x++){ //Recorremos el Array para mostrar la información de los clientes
			
			if(ArrayPersona[x]!=null){ //Mostrar los clientes que hayan sido introducidos y filtrar las posiciones vacías
				System.out.println(" ");
				System.out.println(ArrayPersona[x].toString());	
				System.out.println(" ");
			}
			
		}
	}
	
public static boolean comprobarDni(String dniAComprobar){
	    
        // Array con las letras posibles del dni en su posición
        char[] letraDni = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X',  'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };  
  
        String num= "";
        int ind = 0;  
  
        // boolean que nos indicara si es un dni correcto o no
        boolean valido;
  
        // existen dnis con 7 digitos numericos, si fuese el caso
        // le añado un cero al principio
        if(dniAComprobar.length() == 8) {
             dniAComprobar = "0" + dniAComprobar;
        }
  
        // compruebo que el 9º digito es una letra
        if (!Character.isLetter(dniAComprobar.charAt(8))) {
             return false;  
        }
  
        // compruebo su longitud que sea 9
        if (dniAComprobar.length() != 9){   
             return false;
        }  
 
        // Compruebo que lo 8 primeros digitos sean numeros
        for (int i=0; i<8; i++) {
   
             if(!Character.isDigit(dniAComprobar.charAt(i))){
                   return false;    
             }
             // si es numero, lo recojo en un String
             num += dniAComprobar.charAt(i);     
        }
  
        // paso a int el string donde tengo el numero del dni
        ind = Integer.parseInt(num);
  
        // calculo la posición de la letra en el array que corresponde a este dni
        ind %= 23;
  
        // verifico que la letra del dni corresponde con la del array
        if ((Character.toUpperCase(dniAComprobar.charAt(8))) != letraDni[ind]){
        	System.out.println("dni incorrecto");
             return false;
       }  
       // si el flujo de la funcion llega aquí, es que el dni es correcto
       return true;
   } // fin comprobar
}
