package org.generation;

import java.util.HashMap;

public class Agenda {

    // ---ATRIBUTOS ----
	
    private HashMap<String, String> contactos;
    private int maxContactos;

    
    
    // --- CONSTRUCTOR ---
 
    public Agenda() {
        this.maxContactos = 10; 
        this.contactos = new HashMap<>(); 
    }

    
    // --- MÉTODOS --- 
    
    // 1) Añadir contacto 

    public void anadirContacto(String nombre, String telefono) {
        String clave = nombre.toLowerCase();

        if (contactos.size() >= maxContactos) {
            System.out.println("La agenda está llena. No se pudo añadir a " + nombre + ".");
        } else if (contactos.containsKey(clave)) {
            System.out.println("El contacto: " + nombre + " ya existe. No se puede añadir.");
        } else {
            contactos.put(clave, telefono);
            System.out.println("Contacto: " + nombre + " añadido con éxito.");
        }
    }

    
    // 2) Verifica si un contacto ya existe en la agenda.
   
    public boolean existeContacto(String nombre) {
        return contactos.containsKey(nombre.toLowerCase());
    }

    
     // 3) Lista de contactos
     
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
        	for (String clave : contactos.keySet()) {
        	    System.out.println("Nombre: " + clave + " - Teléfono: " + contactos.get(clave));
        	}
        }
    }

   
    // 4) Busca un contacto por su nombre y en caso de encontrarlo muestra su teléfono.
     
    public void buscarContacto(String nombre) {
        String clave = nombre.toLowerCase();

        if (contactos.containsKey(clave)) {
            System.out.println("El teléfono de " + nombre + " es: " + contactos.get(clave));
        } else {
            System.out.println("No se encontro: " + nombre);
        }
    }

    
    // 5) Elimina un contacto de la agenda usando el nombre.
     
    public void eliminarContacto(String nombre) {
        String clave = nombre.toLowerCase();

        if (contactos.remove(clave) != null) {
            System.out.println("Contacto " + nombre + " eliminado con éxito.");
        } else {
            System.out.println("El contacto " + nombre + " no existe.");
        }
    }

    
    // 6) Modifica el número de teléfono de un contacto existente.
   
    public void modificarTelefono(String nombre, String nuevoTelefono) {
        String clave = nombre.toLowerCase();

        if (contactos.containsKey(clave)) {
            contactos.put(clave, nuevoTelefono);
            System.out.println("Teléfono de " + nombre + " modificado con éxito.");
        } else {
            System.out.println("El contacto " + nombre + " no existe.");
        }
    }

    
    // 7) Muestra cuántos espacios quedan disponibles en la agenda.
    
    public void espaciosLibres() {
        System.out.println("Espacios libres: " + (maxContactos - contactos.size()));
    }
}