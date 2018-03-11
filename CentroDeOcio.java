package GIT;
import java.util.*;
public class CentroDeOcio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int edad;  //<<--nombre, edad, altura, dni, etc.. son datos del cliente que se le solicitarán por teclado
		double altura; 
		String opcion; //<<--Variable para seleccionar apartados del programa
		String nombre, dni; 
		int veces=5; //<<--Variable para incrementar posición del array y así poder seguir introduciendo mas objetos, los espacios 0, 1, 2, 3, y 4 están reservados para clientes de prueba
		boolean seguir = true; //<<--Variable para continuar o finalizar programa general
		boolean seguiratracciones = true; //<<--Variable para continuar o finalizar el apartado Atracciones
		boolean seguirentrada = true; //<<--Variable para controlar si los clientes han introducido bien los datos
		int tamaño=4, fila, columna; //<<--Variables que se usarán en apartado de Teatro
		Establecimiento ArrayAtraccionesInfantiles [] = new Atracciones [3]; //<<--Estas son Arrays para guardar diferentes tipos de atracciones, hay 9 atracciones en total, 3 por cada tipo
		Establecimiento ArrayAtraccionesAcuaticas [] = new Atracciones [3];
		Establecimiento ArrayAtraccionesClasicas [] = new Atracciones [3];
		
		ArrayAtraccionesClasicas [0] = new Atracciones ("Noria",15,20, "La mejor atraccion del mundo",10, "1,50 ~ 1,90", "15~80"); //<<--Estas son las atracciones, que podrá elegir el cliente
		ArrayAtraccionesClasicas [1] = new Atracciones ("Coches de choque", 15,20,"La mejor atracion del mundo",6, "1,50 ~ 2","10 ~ 80");
		ArrayAtraccionesClasicas [2] = new Atracciones ("Martillo", 15,20,"La mejor atracion del mundo",6, "1,50 ~ 2","10 ~ 80");
		
		ArrayAtraccionesAcuaticas [0] = new Atracciones ("Los Fiordos", 20,20, "Refréscate en una montaña rusa de agua con gran caída",8, "1,50 ~ 2","10 ~ 80");
		ArrayAtraccionesAcuaticas [1] = new Atracciones ("El Aserradero", 20,20, "Montate en uno de los troncos y prepárate para la acción",7, "1,50 ~ 2","10 ~ 80");
		ArrayAtraccionesAcuaticas [2] = new Atracciones ("Los Rápidos", 20,20,"Emocionante atracción donde habrá cascadas, remolinos y olas",7, "1,50 ~ 2","10 ~ 80");
		
		ArrayAtraccionesInfantiles [0] = new Atracciones ("Coches de choque infantiles", 5,20, "Coches de choques adaptados para niños", 5,"1,50 ~ 2","10 ~ 80");
		ArrayAtraccionesInfantiles [1] = new Atracciones ("Jimmy Neutron", 5,20, "Súbete a una lanzadera y disfruta", 6,"1,50 ~ 2","10 ~ 80");
		ArrayAtraccionesInfantiles [2] = new Atracciones ("La aventura de Dora", 5,20, "Sube a uno de nuestros Jeep y adéntrate en el bosque", 6,"1,50 ~ 2","10 ~ 80");
		
		Teatro obra= new Teatro ("La bella y la bestia",35,25,"Una conmovedora historia","6","Romance"); //<<- Estas son las obras de teatro que podrán elegir los clientes
	    Teatro obra1= new Teatro ("Rey Leon",25,25,"Una conmovedora historia","6","Fantasía");
		
		Persona ArrayPersona [] = new Cliente [100]; //<<--Este es el array donde se guardará toda la información de los clientes, se usará para llevar un registro de las ventas
		
		ArrayPersona [0] = new Cliente("Damian(Prueba)", 13, 1.4, "46587L"); //<<--Estos son clientes de prueba, para comprobar que funcionan bien las consultas
		((Cliente) ArrayPersona[0]).setEntrada(5);
		((Cliente) ArrayPersona[0]).setServicio(ArrayAtraccionesInfantiles[0].getNombre());
		
		ArrayPersona [1] = new Cliente("Michael(Prueba)", 13, 1.84, "45615v"); //<<--Estos son clientes de prueba, para comprobar que funcionan bien las consultas
		((Cliente) ArrayPersona[1]).setEntrada(20);
		((Cliente) ArrayPersona[1]).setServicio(ArrayAtraccionesAcuaticas[0].getNombre());
		
		ArrayPersona [2] = new Cliente("Kyle(Prueba)", 13, 1.84, "55131v"); //<<--Estos son clientes de prueba, para comprobar que funcionan bien las consultas
		((Cliente) ArrayPersona[2]).setEntrada(15);
		((Cliente) ArrayPersona[2]).setServicio(ArrayAtraccionesClasicas[0].getNombre());
		
		ArrayPersona [3] = new Cliente("Jackson(Prueba)", 4,"5464v");
		((Cliente) ArrayPersona[3]).setEntrada(obra.getPrecio());
	     ((Cliente) ArrayPersona[3]).setServicio(obra.getNombre());
	     
	     ArrayPersona [4] = new Cliente("Donald(Prueba)", 6,"5464v");
			((Cliente) ArrayPersona[4]).setEntrada(obra1.getPrecio());
		     ((Cliente) ArrayPersona[4]).setServicio(obra1.getNombre());
		
	    char sala[][]=new char[tamaño][tamaño];      //Creo array bidimensional de caracteres salateatro
	    sala=crearsala(tamaño);                      //Llamo al metodo crearsala para el array salateatro
	    char sala1[][]=new char[tamaño][tamaño];     //Creo el array bidimensional de caracteres salateatro2  
	    sala1=crearsala(tamaño);                     //Llamo al metodo crearsala para el array teatro2
	    
		do {
			System.out.println("Bienvenido, elige opción");
			System.out.println(" ");
			System.out.println("1.Parque de atracciones"); //<<-- Estos son los apartados principales del programa
			System.out.println("2.Teatro");
			System.out.println("3.Administrador");
			System.out.println("4.Salir");
			opcion=teclado.nextLine();
			
			switch(opcion) { //<<-- APARTADO ATRACCIONES
			
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
							
							do{
								do{
									System.out.println("Datos para la entrada");
									System.out.println(" ");
									System.out.println("Introduce Nombre");
									nombre=teclado.next();
									System.out.println("Introduce Edad");
									edad=teclado.nextInt();
									do{System.out.println("Introduce Altura");
									altura=teclado.nextDouble();}
									while(altura<1 || altura >1.90);
									System.out.println("Introduce DNI");
									dni=teclado.next();
									System.out.println(" ");
									System.out.println("¿Los datos están introducidos correctamente?");
									System.out.println("1 - SI");
									System.out.println("2 - NO");
									opcion=teclado.next(); 
								}
								while(!opcion.equalsIgnoreCase("1") && !opcion.equalsIgnoreCase("2"));
								
								if(opcion.equalsIgnoreCase("1")){
									seguirentrada=false;
								} else if(opcion.equalsIgnoreCase("2")){
									System.out.println("Introduce bien los datos");
								}
							}
							while(seguirentrada); //<<--Con esto controlaremos que los datos de los clientes están bien introducidos
							
						ArrayPersona [veces] = new Cliente(nombre, edad, altura, dni);
						
						if(altura>=1 && altura<=1.30){ //<<--Si la altuta del cliente está entre 1 y 1,30 se le dará acceso solamente a las atracciones infantiles
							System.out.println("Atracciones infantiles");
							for(int x=0; x<ArrayAtraccionesInfantiles.length;x++){
								System.out.println(" ");
								System.out.println("Nombre: " +ArrayAtraccionesInfantiles[x].toString());  //<<-- Método que muestra la información de las atracciones para que el cliente pueda elegir
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
								((Cliente) ArrayPersona[veces]).setEntrada(ArrayAtraccionesInfantiles[0].getPrecio()); //<<--Aquí lo que hacemos es añadir a la variable entrada el precio de la atracción, siendo entrada el precio que el cliente tiene que pagar
								((Cliente) ArrayPersona[veces]).setServicio(ArrayAtraccionesInfantiles[0].getNombre()); //<<--Aquí le añadimos el nombre de la atracción a la variable servicio
							}                                                                                           //*Esto lo hacemos para saber qué atracción ha seleccionado cada cliente y cuanto tiene que pagar por ella*
							else if(opcion.equals("2")){
								((Cliente) ArrayPersona[veces]).setEntrada(ArrayAtraccionesInfantiles[1].getPrecio());
								((Cliente) ArrayPersona[veces]).setServicio(ArrayAtraccionesInfantiles[1].getNombre());
							}
							else if(opcion.equals("3")){
								((Cliente) ArrayPersona[veces]).setEntrada(ArrayAtraccionesInfantiles[2].getPrecio());
								((Cliente) ArrayPersona[veces]).setServicio(ArrayAtraccionesInfantiles[2].getNombre());
							}
							
						}
						else if(altura>=1.30 && altura<=1.90){ //<<--Si el cliente mide entre 1,30 y 1,90 se le mostrarán las otras atracciones a excepción de las infantiles
							
							do{
						System.out.println("Elige Tipo De Atracción");
						System.out.println("1 - Atracciones Clásicas");
						System.out.println("2 - Atracciones Acuáticas");
						opcion=teclado.next();
							}while(!opcion.equals("1") && !opcion.equals("2"));
						
							if(opcion.equals("1")){
								
								
								for(int x=0; x<ArrayAtraccionesClasicas.length;x++){ //<<--Bucle para mostrar información de atracciones clásicas
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
									((Cliente) ArrayPersona[veces]).setEntrada(ArrayAtraccionesClasicas[0].getPrecio());
									((Cliente) ArrayPersona[veces]).setServicio(ArrayAtraccionesClasicas[0].getNombre());
								}
								else if(opcion.equals("2")){
									((Cliente) ArrayPersona[veces]).setEntrada(ArrayAtraccionesClasicas[1].getPrecio());
									((Cliente) ArrayPersona[veces]).setServicio(ArrayAtraccionesClasicas[1].getNombre());
								}
								else if(opcion.equals("3")){
									((Cliente) ArrayPersona[veces]).setEntrada(ArrayAtraccionesClasicas[2].getPrecio());
									((Cliente) ArrayPersona[veces]).setServicio(ArrayAtraccionesClasicas[2].getNombre());
								}
								
							}
							else{
								for(int x=0; x<ArrayAtraccionesAcuaticas.length;x++){ //<<--Bucle para mostrar información de atracciones acuáticas
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
									((Cliente) ArrayPersona[veces]).setEntrada(ArrayAtraccionesAcuaticas[0].getPrecio());
									((Cliente) ArrayPersona[veces]).setServicio(ArrayAtraccionesAcuaticas[0].getNombre());
								}
								else if(opcion.equals("2")){
									((Cliente) ArrayPersona[veces]).setEntrada(ArrayAtraccionesAcuaticas[1].getPrecio());
									((Cliente) ArrayPersona[veces]).setServicio(ArrayAtraccionesAcuaticas[1].getNombre());
								}
								else if(opcion.equals("3")){
									((Cliente) ArrayPersona[veces]).setEntrada(ArrayAtraccionesAcuaticas[2].getPrecio());
									((Cliente) ArrayPersona[veces]).setServicio(ArrayAtraccionesAcuaticas[2].getNombre());
								}
							}
						}
						
						System.out.println(ArrayPersona[veces].toString());
						
						do{
						System.out.println("¿Quieres Pedir Otra Entrada?");
						System.out.println("1 - SI");
						System.out.println("2 - NO");
						opcion=teclado.next();
						}while(!opcion.equals("1") && !opcion.equals("2"));
						
						if(opcion.equals("1")){
							veces++; //<<--Aquí se incrementaría la posición del array para poder introducir otro cliente
						}
						else if(opcion.equals("2")){
							seguiratracciones=false; //<<--Variable para salir del apartado Atracciones
				
						}
						
						}
						while(seguiratracciones);
						
						do{
							System.out.println("1 - Salir del apartado Parque de atracciones");
							System.out.println("2 - Finalizar programa");
							opcion=teclado.next(); teclado.nextLine();
							}while(!opcion.equals("1") && !opcion.equals("2"));
						
						if(opcion.equals("1")){
							seguir=true;
						}
			
						else if(opcion.equals("2")){
							seguir=false;
						}
						break;
				
				case "2":	do { //<<--APARTADO TEATRO
				
							System.out.println("Datos entrada Teatro");
							System.out.println(" ");
							System.out.println("Introduce Nombre");
							nombre=teclado.next();
							System.out.println("Introduce Edad");
							edad=teclado.nextInt();
							System.out.println("Introduce DNI");
							dni=teclado.next();
							System.out.println(" ");
							System.out.println("¿Los datos están introducidos correctamente?");
							System.out.println("1 - SI");
							System.out.println("2 - NO");
							opcion=teclado.next();
								
								ArrayPersona [veces] = new Cliente(nombre, edad,dni);
					
								 System.out.println("¿Que obra de teatro quieres ver?");    //Menu de peliculas
							     System.out.println("--------------------------");
							     System.out.println("1."+ obra.getNombre()+ " Hora:"+ obra.getHora()+":00" +" precio:" +obra.getPrecio() +"€");
							     System.out.println("2."+ obra1.getNombre()+ " Hora:"+ obra1.getHora()+":00" +" precio:" +obra1.getPrecio() +"€");
							     System.out.println("--------------------------");
							     opcion=teclado.nextLine(); opcion=teclado.nextLine();
							     if (opcion.equals("1")) {
								     ((Cliente) ArrayPersona[veces]).setEntrada(obra.getPrecio());
								     ((Cliente) ArrayPersona[veces]).setServicio(obra.getNombre());
								    	do{
								     	Menu();                                                  //Llamo al metodo menu
								        opcion=teclado.nextLine();
								             
								            switch(opcion){
								                case "1": monitorTeatro(sala);  //Muestro como esta la sala llamando al metodo monitocine
								                break;
								                case "2": sala=asignarLugar(sala);
								                          seguir=false;                            //El array sala es igual al método asignarLugar
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
								                        seguir=false;
								                	    break;                                             //donde el usuario escoge lugar especifico
								                case "4": seguir=false;
								                        break;
								                default: System.out.println("Introduce numero correcto");;
								            }
								    	}while(seguir);
								      
								     seguir=true;                      //Vuelvo a declarar la variable booleana a true para poder volver a escoger pelicula e incluso la misma pelicula
								     
							     }else if(opcion.equals("2")) {
							    	 ((Cliente) ArrayPersona[veces]).setEntrada(obra1.getPrecio());
							    	 ((Cliente) ArrayPersona[veces]).setEntrada(obra1.getPrecio());
									    do{	
							    	 		Menu();                                                //Llamo al metodo menu
									        opcion=teclado.nextLine();
									             
									            switch(opcion){
									                case "1": monitorTeatro(sala1);                 //Muestro como esta la sala2 llamando al metodo monitocine
									                        break;
									                case "2": sala1=asignarLugar(sala1);
									                          seguir=false;                                //El array sala1 es igual al método asignarLugar
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
									                        seguir=false;
									                	    break;                                             //donde el usuario escoge lugar especifico
									                case "4": seguir=false;
									                        break;
									                default: System.out.println("Introduce numero correcto");;
									            }
									    }while(seguir);
							    	  
							    	  seguir=true;                 //Vuelvo a declarar la variable booleana a true para poder volver a escoger pelicula e incluso la misma pelicula
							     }
						     
							     System.out.println(((Cliente) ArrayPersona[veces]).toStringTeatro());
							     System.out.println(" ");
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
								
								}while(seguir);
								
								seguir=true;
								
								do{
									System.out.println("1 - Salir del apartado Teatro");
									System.out.println("2 - Finalizar programa");
									opcion=teclado.next(); teclado.nextLine();
									}while(!opcion.equals("1") && !opcion.equals("2"));
								
								if(opcion.equals("1")){
									seguir=true;
								}
					
								else if(opcion.equals("2")){
									seguir=false;
								}
								
							break;
							
				case "3": //<<--APARTADO ADMINISTRADORES
					Persona ArrayAdministradores [] = new Persona[2];
					ArrayAdministradores[0] = new Administrador("jose", "admin"); //Estos son los administradores, admin es la contraseña
					ArrayAdministradores[1]	= new Administrador("javier", "admin");
						
					do{
						System.out.println("Introduce Administrador"); //Administradores: Jose o Javier
						opcion=teclado.next();
					}while(!opcion.equalsIgnoreCase("jose") &&  !opcion.equalsIgnoreCase("javier"));
					
					do{
					System.out.println("Introduce contraseña");
					opcion=teclado.next();
					}while(!opcion.equalsIgnoreCase("admin"));
					
					do{
					System.out.println("1 - Mostrar lista entera de clientes");
					System.out.println("2 - Mostrar lista de clientes de atracciones");
					System.out.println("3 - Mostrar lista de clientes de teatro");
					System.out.println("4 - Mostrar información de clientes según el servicio");
					opcion=teclado.next();
					}while(!opcion.equalsIgnoreCase("1") && !opcion.equalsIgnoreCase("2") && !opcion.equalsIgnoreCase("3") && !opcion.equalsIgnoreCase("4"));
					
					if(opcion.equalsIgnoreCase("1")){
						MostrarInformacionDeClientes(ArrayPersona);
					}
					else if(opcion.equalsIgnoreCase("2")){
						do{
						System.out.println("1 - Mostrar información de clientes de Atracciones Clásicas");
						System.out.println("2 - Mostrar información de clientes de Atracciones Infantiles");
						System.out.println("3 - Mostrar información de clientes de Atracciones Acuáticas");
						opcion=teclado.next();
						}while(!opcion.equalsIgnoreCase("1") &&  !opcion.equalsIgnoreCase("2") && !opcion.equalsIgnoreCase("3"));
						
						if(opcion.equalsIgnoreCase("1")){
							MostrarInformacionClientesAtraccionesClasicas(ArrayPersona);
							
						}
						else if(opcion.equalsIgnoreCase("2")){
							MostrarInformacionClientesAtraccionesInfantiles(ArrayPersona);
						}
						else if(opcion.equalsIgnoreCase("3")){
							MostrarInformacionClientesAtraccionesAcuaticas(ArrayPersona);
						}
						
						do{
							System.out.println("1 - Salir del apartado Administradores");
							System.out.println("2 - Finalizar programa");
							opcion=teclado.next(); teclado.nextLine();
							}while(!opcion.equals("1") && !opcion.equals("2"));
						
						if(opcion.equals("1")){
							seguir=true;
						}
			
						else if(opcion.equals("2")){
							seguir=false;
						}
						
					}else if(opcion.equalsIgnoreCase("3")){
						MostrarInformacionClientesTeatro(ArrayPersona);
					} 
					else if(opcion.equalsIgnoreCase("4")){
						System.out.println("Introduce nombre del servicio");
						opcion=teclado.next(); teclado.nextLine();
						MostrarInformacionDeClientesSegunServicio(ArrayPersona, opcion);
					}
					
					do{
						System.out.println("1 - Salir del apartado Administradores");
						System.out.println("2 - Finalizar programa");
						opcion=teclado.next(); teclado.nextLine();
						}while(!opcion.equals("1") && !opcion.equals("2"));
					
					if(opcion.equals("1")){
						seguir=true;
					}
		
					else if(opcion.equals("2")){
						seguir=false;
					}
							break;
							
				case "4":  
					seguir=false;
							break;
						
				}		
			}while(seguir);
		System.out.println("Fin del programa");
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
		
		public static void MostrarInformacionDeClientesTeatro(Persona ArrayPersona []){
			
			for(int x=0; x<ArrayPersona.length; x++){ //Recorremos el Array para mostrar la información de los clientes
					
					if(ArrayPersona[x]!=null){ //Mostrar los clientes que hayan sido introducidos y filtrar las posiciones vacías
						System.out.println(" ");
						System.out.println(((Cliente) ArrayPersona[x]).toStringTeatro());	
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
	
	public static void MostrarInformacionClientesAtraccionesClasicas(Persona ArrayPersona []){
		
		for(int x=0; x<ArrayPersona.length; x++){ //Recorremos el Array para mostrar la información de los clientes
			
				if (ArrayPersona[x]!=null){
					if(((Cliente) ArrayPersona[x]).getEntrada() == 15){
						System.out.println(ArrayPersona[x].toString());
					}
				}
	}
		
	}
	
	public static void MostrarInformacionClientesAtraccionesAcuaticas(Persona ArrayPersona []){
		
		for(int x=0; x<ArrayPersona.length; x++){ //Recorremos el Array para mostrar la información de los clientes
			
			for(int y=0; y<ArrayPersona.length; y++){
				
				if (ArrayPersona[x]!=null){
					if(((Cliente) ArrayPersona[x]).getEntrada() == 20){
						System.out.println(ArrayPersona[x].toString());
					}
				}
			}
	}
		
	}
	
	public static void MostrarInformacionClientesAtraccionesInfantiles(Persona ArrayPersona []){
		
		for(int x=0; x<ArrayPersona.length; x++){ //Recorremos el Array para mostrar la información de los clientes
			
			if (ArrayPersona[x]!=null){
				if(((Cliente) ArrayPersona[x]).getEntrada() == 5){
					System.out.println(ArrayPersona[x].toString());
				}
		
			}
	}	
	}
	
	public static void MostrarInformacionClientesTeatro(Persona ArrayPersona[]){ //Array mostrar la información de los clientes que hayan solicitado entrada en el teatro
		for(int x=0; x<ArrayPersona.length; x++){
			
			if(ArrayPersona[x]!=null){
				if(((Cliente) ArrayPersona[x]).getServicio().equalsIgnoreCase("La bella y la bestia") ||((Cliente) ArrayPersona[x]).getServicio().equalsIgnoreCase("Rey Leon") ){
					System.out.println(((Cliente) ArrayPersona[x]).toStringTeatro());	
				}
			}
		}
	}
	
	public static void MostrarInformacionDeClientesSegunServicio(Persona ArrayPersona[], String servicio){
		
		for(int x=0; x<ArrayPersona.length; x++){
			if(ArrayPersona[x]!=null){
				if(((Cliente) ArrayPersona[x]).getServicio().equalsIgnoreCase(servicio)){
					System.out.println(ArrayPersona[x].toString());
				}
			}
		}
	}
}