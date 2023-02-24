package Parking;

import java.util.Scanner;

import Chanllenge.Menu;

public class ClasePrincipal {
	 static Parkingg parking =new Parkingg("Centro",10);
	static int opcion;
	 static Scanner scanner =new Scanner(System.in);
	
		public static void main(String[] args) {
			do {
			menu();
		accion();	
			}while(opcion!=4);
			
		
		
			
			
			
		}
		
		
		
		 public static void menu() {
	
		try {
			
		
		
			 System.out.println(""
					+ "1) Entrada de coche\n"
					+ "2) Salida de cohce\n"
					+ "3) Mostrar Parking\n"
					+ "4) Salir del programa\n"
					+ "--->"
					+ "");
		opcion=Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			
			opcion=0;
		}	
		}
	
		 public static void accion() {

			 switch(opcion) {
			 case 1:
				 entradaCoche();
				 break;
			 case 2:
				 salidaCoche();
				 break;
			 case 3:
				 System.out.println(parking+"\n\n");
				 break;
			 case 4 :
				 System.out.println("Fin del programa");
				  break;
				  default:
					  System.out.println("ERROR EN LA OPCION \n");
					  break;
					  
				 
				 
				 
			 }
		 }
		 public static void entradaCoche() {
			 boolean correcto=false;
			 
			 try {
			 System.out.println("Introduzca matricula:..");
			 String m=scanner.nextLine();
			 System.out.println("Introduzca la plaza:..");
			 int p =Integer.parseInt(scanner.nextLine()) ;
			 
			
					parking.entrada(m,p);
			correcto=true;
			
				
			} catch (ParkinException e) {
				System.out.println("ERROR");
				System.out.println("No se realizo la entrada del coche");
				System.out.println("Con matriculas "+e.getMatricula());
			}catch(NumberFormatException e) {
				System.out.println("Formato de numero Incorrecto ");
			}catch (Exception e) {
				System.out.println("EEROR DESCONOCIDO");
			}finally {
				if(!correcto)
				 System.out.println("Se produjo un error");
			}
			 
			 
			 
			 
		 }
		 public static void salidaCoche() {
			 boolean correcto=false;
			 try {
			
			 System.out.println("Introdusca la matricula del coche que sale ..");
			 String m = scanner.nextLine();
			 
			 int p= parking.salida(m);
			 System.out.println("El cohce "+m+"\nsalio de la plaza\n***"+p+"***\n\n");
			 System.out.println("Plazas totales:..."+parking.getPlazasTotales()+"\n");
			 System.out.println("Plazas ocupadas:..."+parking.getPlazasOcupadas()+"\n");
			 correcto=true;
			} catch (ParkinException e) {
				System.out.println("ERROR "+e.getMensaje());
				System.out.println("No se realizo la salida del coche\n"+e.getMatricula());
			}catch (Exception e) {
				System.out.println("ERROR DESCONOCIDO");
				
			}finally {
				if(!correcto)
					 System.out.println("Se produjo un error");
			}
			
			 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}		
