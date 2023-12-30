
package com.mycompany.carrillolorena_pruebatec1.models;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empleado implements Serializable {
    
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empleadoId;
    
    @Column
    private String nombre;
    
    @Column
    private String cargo;
    
    @Column
    private double salario;
    
    @Column
    private LocalDate fechaInicio;

    public Empleado() {
    }

    public Empleado(String nombre, String cargo, double salario, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }

    public Long getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Long empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "Empleado{" + "empleadoId=" + empleadoId + ", nombre=" + nombre + ", cargo=" + cargo + ", salario=" + salario + ", fechaInicio=" + fechaInicio + '}';
    }
    
   
    
}
