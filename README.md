Equipo 9: Agenda de Contactos en Java
* Francisco Javier Roch Acevedo
* Jose Alberto Escalante Toledo
* Melissa Flores Garza
* Rodolfo Sánchez González

Este proyecto es una aplicación de consola sencilla y eficiente para gestionar contactos, desarrollada en Java. Permite al usuario realizar operaciones básicas como agregar, buscar, modificar y eliminar contactos a través de un menú interactivo. La implementación utiliza un HashMap para almacenar los datos, lo que garantiza una búsqueda y acceso a los contactos de manera muy rápida.

Características Principales
La agenda cuenta con las siguientes funcionalidades:

* Añadir contacto: Permite agregar un nuevo contacto con su nombre y número de teléfono. La agenda tiene un límite de 10 espacios y no permite nombres duplicados (no distingue entre mayúsculas y minúsculas).

* Verificar existencia: Comprueba si un contacto ya existe en la agenda a partir de su nombre.

* Listar contactos: Muestra en pantalla todos los contactos guardados con sus respectivos nombres y números de teléfono.

* Buscar contacto: Busca un contacto por su nombre y, si lo encuentra, muestra su número de teléfono.

* Eliminar contacto: Borra un contacto de la agenda utilizando su nombre.

* Modificar teléfono: Permite cambiar el número de teléfono de un contacto existente.

* Consultar espacios libres: Informa cuántos espacios quedan disponibles para añadir nuevos contactos.

* Menú interactivo: Todas las opciones se gestionan a través de un menú de consola fácil de usar.
  

Estructura del Código 
El proyecto está organizado en dos clases principales para separar la lógica y la interacción con el usuario:

Agenda.java
Esta clase contiene toda la lógica y la estructura de datos para gestionar los contactos.
Atributos:
* contactos (HashMap<String, String>): Almacena los contactos, usando el nombre en minúsculas como clave (key) y el número de teléfono como valor (value).
* maxContactos (int): Define la capacidad máxima de la agenda.
Métodos: 
Contiene todos los métodos para realizar las actualizaciones sobre los contactos.


MenuAgenda.java: 
Esta clase se encarga de la interacción con el usuario. Es el punto de entrada de la aplicación. Crea una instancia de la clase Agenda y muestra un menú en bucle para que el usuario elija qué acción realizar. Utiliza la clase Scanner para leer las entradas del usuario.

¿Cómo usarlo? 
Para ejecutar este programa, sigue estos pasos:

Compilación: Asegúrate de tener un Kit de Desarrollo de Java (JDK) instalado. Abre una terminal o línea de comandos, navega a la carpeta donde se encuentran los archivos .java y compílalos con el siguiente comando:
Bash
javac org/generation/Agenda.java org/generation/MenuAgenda.java
Ejecución: Una vez compilado, ejecuta la clase principal que contiene el menú:
Bash

java org.generation.MenuAgenda
Interacción: Al ejecutar el comando anterior, aparecerá el menú en la consola. Simplemente introduce el número de la opción que deseas realizar y presiona "Enter". El programa te guiará para que introduzcas la información necesaria.
