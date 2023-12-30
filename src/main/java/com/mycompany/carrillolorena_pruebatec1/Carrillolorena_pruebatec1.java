

package com.mycompany.carrillolorena_pruebatec1;

import com.mycompany.carrillolorena_pruebatec1.models.Empleado;
import com.mycompany.carrillolorena_pruebatec1.services.EmpleadoController;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class Carrillolorena_pruebatec1 {

    public static void main(String[] args) {
        
         EmpleadoController empleadoController = new EmpleadoController();
        Scanner scanner = new Scanner(System.in);
      
        while (true) {
            System.out.println("********** Menú Principal **********");
            System.out.println("1. Agregar un nuevo empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Actualizar información de un empleado");
            System.out.println("4. Eliminar un empleado");
            System.out.println("5. Buscar empleados por cargo");
            System.out.println("6. Salir");
            System.out.print("Ingrese el número de la opción deseada: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    // Lógica para agregar un nuevo empleado
                    System.out.println("Ingrese el nombre del empleado:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el cargo del empleado:");
                    String cargo = scanner.nextLine();
                    System.out.println("Ingrese el salario del empleado:");
                    double salario = scanner.nextDouble();
                    System.out.println("Ingrese la fecha de inicio del empleado (YYYY-MM-DD):");
                    String fechaInicioStr = scanner.next();
                    LocalDate fechaInicio = LocalDate.parse(fechaInicioStr);

                    Empleado nuevoEmpleado = new Empleado(nombre, cargo, salario, fechaInicio);
                    empleadoController.createEmpleado(nuevoEmpleado);
                    System.out.println("Nuevo empleado creado correctamente.");
                    break;
                case 2:
                    // Lógica para listar empleados
                    List<Empleado> empleados = empleadoController.getAllEmpleados();
                    for (Empleado emp : empleados) {
                        System.out.println(emp);
                    }
                    break;
                case 3:
                    // Lógica para actualizar información de un empleado
                    System.out.println("Ingrese el ID del empleado que desea actualizar:");
                    Long empleadoId = scanner.nextLong();
                    scanner.nextLine(); // Consumir el salto de línea

                    Empleado empleadoExistente = empleadoController.findEmpleado(empleadoId);
                    if (empleadoExistente != null) {
                        System.out.println("Ingrese el nuevo nombre del empleado (o presione Enter para dejarlo sin cambios):");
                        String nuevoNombre = scanner.nextLine();
                        if (!nuevoNombre.isEmpty()) {
                            empleadoExistente.setNombre(nuevoNombre);
                        }

                        System.out.println("Ingrese el nuevo cargo del empleado (o presione Enter para dejarlo sin cambios):");
                        String nuevoCargo = scanner.nextLine();
                        if (!nuevoCargo.isEmpty()) {
                            empleadoExistente.setCargo(nuevoCargo);
                        }

                        System.out.println("Ingrese el nuevo salario del empleado (o presione Enter para dejarlo sin cambios):");
                        double nuevoSalario;

                        // Verificar si hay una entrada válida
                        if (scanner.hasNextDouble()) {
                        nuevoSalario = scanner.nextDouble();
                        empleadoExistente.setSalario(nuevoSalario);
                        } else {
                        System.out.println("Entrada no válida. Asegúrese de ingresar un número válido como salario.");
                        scanner.next(); // Consumir la entrada no válida para evitar un bucle infinito
                        }

                        System.out.println("Ingrese la nueva fecha. (o presione Enter para dejarlo sin cambios, formato YYYY-MM-DD):");
                        String nuevaFechaInicioStr = scanner.nextLine();
                        if (!nuevaFechaInicioStr.isEmpty()) {
                            LocalDate nuevaFechaInicio = LocalDate.parse(nuevaFechaInicioStr);
                            empleadoExistente.setFechaInicio(nuevaFechaInicio);
                        }

                        empleadoController.updateEmpleado(empleadoExistente);
                        System.out.println("Empleado actualizado correctamente.");
                    } else {
                        System.out.println("No se encontró ningún empleado con el ID proporcionado.");
                    }
                    break;
                case 4:
                    // Lógica para eliminar un empleado
                    System.out.println("Ingrese el ID del empleado que desea eliminar:");
                    Long empleadoIdEliminar = scanner.nextLong();
                    empleadoController.deleteEmpleado(empleadoIdEliminar);
                    System.out.println("Empleado eliminado correctamente.");
                    break;
                case 5:
                    // Lógica para buscar empleados por cargo
                    System.out.println("Ingrese el cargo por el cual desea buscar empleados:");
                    String cargoBusqueda = scanner.nextLine();
                    List<Empleado> empleadosPorCargo = empleadoController.findEmpleadosByCargo(cargoBusqueda);
                    for (Empleado emp : empleadosPorCargo) {
                        System.out.println(emp);
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
            }
        }
    }
}