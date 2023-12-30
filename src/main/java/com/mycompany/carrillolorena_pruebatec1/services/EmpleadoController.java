
package com.mycompany.carrillolorena_pruebatec1.services;

import com.mycompany.carrillolorena_pruebatec1.models.Empleado;
import com.mycompany.carrillolorena_pruebatec1.persistences.EmpleadoJpaController;
import com.mycompany.carrillolorena_pruebatec1.persistences.exceptions.NonexistentEntityException;
import java.util.List;

public class EmpleadoController {
    
    EmpleadoJpaController emplJPA = new EmpleadoJpaController();
    
    public void createEmpleado(Empleado empleado){
        emplJPA.create(empleado);
    }
    
    public void deleteEmpleado(Long empleadoId){
        try{
        emplJPA.destroy(empleadoId);
        }catch(NonexistentEntityException ex){
            ex.printStackTrace();
        }
    }
    
    public List<Empleado> getAllEmpleados(){
        return emplJPA.findEmpleadoEntities();
    }
    
    public void updateEmpleado(Empleado empleado){
        try{
        emplJPA.edit(empleado);
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    
    public Empleado findEmpleado(Long empleadoId){
        return emplJPA.findEmpleado(empleadoId);
    }
    
    public List<Empleado> findEmpleadosByCargo(String cargo) {
        return emplJPA.findEmpleadoByCargo(cargo);
       }
    
    }
    

