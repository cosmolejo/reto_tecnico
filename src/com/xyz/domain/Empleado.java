/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xyz.domain;

/**
 *
 * @author antares
 */
public abstract class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;
    private boolean bonificacion;
    public final double VAL_BONIFICACION = 150000.0;


    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(boolean bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    
    public abstract boolean gestionarBonificacion();
    
    
    
    
}
