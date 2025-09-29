package org.generation;
import java.util.Scanner;

public class MenuAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Agenda agenda = new Agenda();  
	        Scanner sc = new Scanner(System.in);
	        int opcion;
	        
	        do {
	            // --- MENÚ PRINCIPAL ---
	            System.out.println("\n==== MENÚAGENDA ====");
	            System.out.println("1. Añadir contacto");
	            System.out.println("2. Verificar existencia de contacto");
	            System.out.println("3. Listar contactos");
	            System.out.println("4. Buscar contacto");
	            System.out.println("5. Eliminar contacto");
	            System.out.println("6. Modificar teléfono");
	            System.out.println("7. Mostrar espacios libres");
	            System.out.println("8. Salir");
	            System.out.print("Selecciona una opción: ");
	            
	            opcion = sc.nextInt();
	            sc.nextLine(); 
	            
	            switch (opcion) {
	                case 1:
	                    System.out.print("Introduce el nombre: ");
	                    String nombre = sc.nextLine();
	                    System.out.print("Introduce el teléfono: ");
	                    String telefono = sc.nextLine();
	                    agenda.anadirContacto(nombre, telefono);
	                    break;

	                case 2:
	                    System.out.print("Introduce el nombre a verificar: ");
	                    nombre = sc.nextLine();
	                    if (agenda.existeContacto(nombre)) {
	                        System.out.println("El contacto " + nombre + " existe en la agenda.");
	                    } else {
	                        System.out.println("El contacto " + nombre + " no existe.");
	                    }
	                    break;

	                case 3:
	                    agenda.listarContactos();
	                    break;

	                case 4:
	                    System.out.print("Introduce el nombre a buscar: ");
	                    nombre = sc.nextLine();
	                    agenda.buscarContacto(nombre);
	                    break;

	                case 5:
	                    System.out.print("Introduce el nombre a eliminar: ");
	                    nombre = sc.nextLine();
	                    agenda.eliminarContacto(nombre);
	                    break;

	                case 6:
	                    System.out.print("Introduce el nombre del contacto a modificar: ");
	                    nombre = sc.nextLine();
	                    System.out.print("Introduce el nuevo teléfono: ");
	                    telefono = sc.nextLine();
	                    agenda.modificarTelefono(nombre, telefono);
	                    break;

	                case 7:
	                    agenda.espaciosLibres();
	                    break;

	                case 8:
	                    System.out.println("Saliendo de la agenda...");
	                    break;

	                default:
	                    System.out.println("Opción inválida, intenta nuevamente.");
	            }
	            
	        } while (opcion != 8);
	        
	        sc.close();
	    }
	}