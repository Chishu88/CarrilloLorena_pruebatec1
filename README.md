Proyecto realizado por Lorena Carrillo Trillo.

Prueba técnica 1.

Descripción General:
Este proyecto de gestión de empleados tiene como objetivo desarrollar un backend lógico en Java para una aplicación que permite realizar operaciones CRUD (Crear, Leer, Actualizar y Borrar) en una base de datos MySQL utilizando Java Persistence API (JPA). La aplicación está enfocada en la gestión de información de empleados de una empresa, permitiendo a los usuarios realizar diversas operaciones.


Requisitos Técnicos:
Lenguaje de Programación: Java
Entorno de Desarrollo
Persistencia de Datos: JPA (Java Persistence API)
Gestión de Base de Datos: MySQL con Workbench


Instalación del Proyecto
1. Clonar el Repositorio
2. Configurar la Base de Datos
3. Configurar el Proyecto en NetBeans:
Abre NetBeans IDE.
Selecciona "File" > "Open Project" y navega hasta el directorio donde clonaste el repositorio. Abre el proyecto.
4. Configuración de la Conexión a la Base de Datos.
5. Ejecutar la Aplicación:
Encuentra y ejecuta la clase principal que inicia la aplicación.


Ejecución y Pruebas
Interactuar con la Aplicación:
- Sigue las instrucciones del programa en la consola para realizar operaciones como agregar, listar, actualizar, eliminar y buscar empleados.
Manejo de Excepciones:
- Observa cómo la aplicación maneja errores como campos vacíos o búsquedas sin resultados.


Funcionalidades Principales:
Agregar un Nuevo Empleado:

Los usuarios pueden ingresar información sobre un nuevo empleado, incluyendo nombre, apellido, cargo, salario y fecha de inicio.
Se utiliza JPA para persistir los datos en la base de datos.
Listar Empleados:

La aplicación muestra la lista de todos los empleados almacenados en la base de datos.
Se utiliza JPA para recuperar los datos de la base de datos.
Actualizar Información de un Empleado:

Los usuarios pueden modificar la información de un empleado existente, como nombre, apellido, cargo, salario o fecha de inicio.
Se implementa la funcionalidad utilizando JPA para actualizar los registros en la base de datos.
Eliminar un Empleado:

Los usuarios pueden eliminar un empleado de la base de datos.
Se utiliza JPA para realizar la operación de borrado en la base de datos.
Buscar Empleados por Cargo:

Los usuarios pueden buscar empleados por su cargo y ver una lista de empleados que tienen ese cargo específico.
Se realiza una consulta personalizada utilizando JPA para obtener los resultados deseados.




