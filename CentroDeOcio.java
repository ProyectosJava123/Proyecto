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
		boolean seguiratracciones = true;
		
		
		Establecimiento ArrayAtraccionesInfantiles [] = new Atracciones [3];
		Establecimiento ArrayAtraccionesAcuaticas [] = new Atracciones [3];
		Establecimiento ArrayAtraccionesClasicas [] = new Atracciones [3];
		
		
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
		
		int tamaño=4, fila, columna;    //Declaración de variable
	    char sala[][]=new char[tamaño][tamaño];      //Creo array bidimensional de caracteres salacine 
	    sala=crearsala(tamaño);                      //Llamo al metodo crearsala para el array salacine
	    char sala1[][]=new char[tamaño][tamaño];     //Creo el array bidimensional de caracteres salacine2  
	    sala1=crearsala(tamaño);                     //Llamo al metodo crearsala para el array salacine2
		
	    Teatro obra= new Teatro ("La bella y la bestia",35,25,"Una conmovedora historia",6,"Romance");
	    Teatro obra1= new Teatro ("Rey Leon",35,25,"Una conmovedora historia",6,"Fantasía");
	    
	    
		do {
			System.out.println("Elige establecimiento");
			System.out.println(" ");
			System.out.println("1.Parque de atracciones");
			System.out.println("2.Teatro");
			System.out.println("3.Museo");
			System.out.println("4.Salir");
			opcion=teclado.nextLine();
			
			switch(opcion) {
			
			case "1":   System.out.println("**********************");
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
							System.out.println("Introduce DNI");
							dni=teclado.next();
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
						System.out.println("2 - NO");
						opcion=teclado.next();
						}while(!opcion.equals("1") && !opcion.equals("2"));
						
						if(opcion.equals("1")){
							veces++;
						}
						else if(opcion.equals("2")){
							seguiratracciones=false;
							MostrarInformacionDeClientes(ArrayPersona);
						}
						
						}
						while(seguiratracciones);
						
						do{
							System.out.println("¿Quieres Pedir Entrada en Otro Establecimiento?");
							System.out.println("1 - SI");
							System.out.println("2 - NO");
							opcion=teclado.next();
							}while(!opcion.equals("1") && !opcion.equals("2"));
						
						if(opcion.equals("1")){
							seguir=true;
						}
			
						else if(opcion.equals("2")){
							seguir=false;
						}
						
						break;
				
				case "2":	do {
								System.out.println("Datos para la entrada");
									
								System.out.println(" ");
								
								System.out.println("Introduce Nombre");
								nombre=teclado.next();
								System.out.println("Introduce Edad");
								edad=teclado.nextInt();
									
								System.out.println("Introduce DNI");
								dni=teclado.next();
								
								System.out.println(" ");
								ArrayPersona [veces] = new Persona(nombre, edad,dni);
					
								 System.out.println("¿Que obra de teatro quieres ver?");    //Menu de peliculas
							     System.out.println("--------------------------");
							     System.out.println("1."+ obra.getNombre()+ " Hora:"+ obra.getHora()+":00");
							     System.out.println("2."+ obra1.getNombre()+ " Hora:"+ obra1.getHora()+":00");
							     System.out.println("3.Salir del Teatro");
							     System.out.println("--------------------------");
							     opcion=teclado.nextLine();
							     if (opcion.equals("1")) {
								     do{
								    	Menu();                                                  //Llamo al metodo menu
								        opcion=teclado.nextLine();
								             
								            switch(opcion){
								                case "1": monitorTeatro(sala);                   //Muestro como esta la sala llamando al metodo monitocine
								                        break;
								                case "2": sala=asignarLugar(sala);         //El array sala es igual al método asignarLugar
								                        break;
								                case "3": do {
								                	    System.out.print("Selecciona la fila:");     //Pido fila
								                        fila=teclado.nextInt();
								                        if(fila>tamaño||fila<=0) {
								                        	System.out.println("Esa fila no existe");
								                        }
								            	        }while(fila>tamaño || fila<=0);
								            	        do {
								            	        System.out.println("Selecciona la columna:");
								            	        columna=teclado.nextInt();
								            	        if(columna>tamaño||columna<=0) {
								                        	System.out.println("Esa columna no existe");
								            	        }
								            	        }while(columna>tamaño || columna<=0);
								                	    sala=escogerLugar(sala, fila, columna);   //El array sala es igual al metodo escogerLugar
								                        break;                                             //donde el usuario escoge lugar especifico
								                case "4": seguir=false;
								                        break;
								                default: System.out.println("Introduce numero correcto");;
								            }
								      }while(seguir);
								     seguir=true;                      //Vuelvo a declarar la variable booleana a true para poder volver a escoger pelicula e incluso la misma pelicula
								     
							     }else if(opcion.equals("2")) {
							    	  do{
									    	Menu();                                                //Llamo al metodo menu
									        opcion=teclado.nextLine();
									             
									            switch(opcion){
									                case "1": monitorTeatro(sala1);                 //Muestro como esta la sala2 llamando al metodo monitocine
									                        break;
									                case "2": sala1=asignarLugar(sala1);       //El array sala1 es igual al método asignarLugar
									                        break;
									                case "3": do {
									                	    System.out.print("Selecciona la fila:");     //Pido fila
									                        fila=teclado.nextInt();
									                        if(fila>tamaño||fila<=0) {
									                        	System.out.println("Esa fila no existe");
									                        }
									            	        }while(fila>tamaño || fila<=0);
									            	        do {
									            	        System.out.println("Selecciona la columna:");
									            	        columna=teclado.nextInt();
									            	        if(columna>tamaño||columna<=0) {
									                        	System.out.println("Esa columna no existe");
									            	        }
									            	        }while(columna>tamaño || columna<=0);
									                	    sala1=escogerLugar(sala1, fila, columna);   //El array sala1 es igual al metodo escogerLugar
									                        break;                                             //donde el usuario escoge lugar especifico
									                case "4": seguir=false;
									                        break;
									                default: System.out.println("Introduce numero correcto");;
									            }
									      }while(seguir);
							    	  seguir=true;                 //Vuelvo a declarar la variable booleana a true para poder volver a escoger pelicula e incluso la misma pelicula
							     }
						     }while(opcion!="3");
							
							do{
								System.out.println("¿Quieres Pedir Otra Entrada?");
								System.out.println("1 - SI");
								System.out.println("2 - NO");
								opcion=teclado.nextLine();
								}while(!opcion.equals("1") && !opcion.equals("2"));
								
								if(opcion.equals("1")){
									veces++;
									
								}
								else if(opcion.equals("2")){
									seguir=false;
								}
								
								while(seguir);
								
								MostrarInformacionDeClientes(ArrayPersona);
								
								seguir=true;
							
							break;
							
				case "3":
					
							break;
							
				case "4":  
					seguir=false;
							break;
						
				}		
			}while(seguir);		
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
		
	public static void Menu() {                                             //Método Menu de la pelicula especifica
		System.out.println("1.- Ver estado de la Sala. v=vacio x=ocupado");
		System.out.println("2.- Asignar lugar disponible");
		System.out.println("3.- Seleccionar lugar especifico");
		System.out.println("4.- Salir de la obra de teatro");
	}
	
	public static char[][] crearsala(int tamaño){    //Método crearsala
	    char matriz[][]=new char[tamaño][tamaño];    //Declaro array bidimensional donde le paso el tamaño de filas y columnas
	    for(int i=0;i<tamaño;i++)
	        for(int j=0;j<tamaño;j++)
	            matriz[i][j]='v';                    //Con esta igualdad todas las posiciones seran v(butaca vacia)
	    return matriz;
	}
	
	public static void monitorTeatro(char mat[][]){    //Método monitor de cine
	    String cad="";
	    for(int i=0;i<mat.length;i++){
	        for(int j=0; j<mat.length; j++){
	            cad+=mat[i][j]+" ";                  //Con esta igualdad hago que exista un espacio entre cada butaca vacia(v)
	        }
	        System.out.println(cad);                 //Imprimo la cadena
	        cad="";                                  
	    }
	} 
	
	public static char[][] asignarLugar(char mat[][]){  //Metodo asignar lugar aleatorio
	    for(int i=0;i<mat.length;i++){
	        for(int j=0;j<mat.length;j++){
	            if(mat[i][j]=='v'){                                                               //Si la butaca esta vacia(v)
	            	System.out.println("Lugar asignado en la fila " +(i+1)+ " y columna "+(j+1)); //Imprimo la primera posicion vacia(v) de fila y columna
	                    mat[i][j]='x';                                                            //La butaca vacia(v) pasa a estar ocupada(x)
	                    return mat;                     
	            }else continue;
	        }
	    }
	    System.out.println("La sala esta llena");
	    return mat;
	}
	
	public static char[][] escogerLugar(char mat[][], int fila, int columna){      //Método escoger lugar específico
	   
	    if(mat[fila-1][columna-1]=='x') {                                           //Si la butaca esta ocupada(x) 
	        	
	        	System.out.println("Vuelve a seleccionar, ese lugar ya se encuentra ocupado"); //Muestro el siguiente mensaje
	            
	     }
	     else{                                                                      //Si esta vacia(v)
	        	
	        	System.out.println("Lugar asignado a la fila "+fila+" y columna "+columna);  //Asigno la butaca que haya elegido el usuario
	            mat[fila-1][columna-1]='x';
	     }
	    
	    return mat;
	}
}