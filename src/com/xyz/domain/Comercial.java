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
public class Comercial extends Empleado{
    
    private double comision;

    public Comercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public Comercial() {
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    @Override
    public boolean gestionarBonificacion(){
        
        return this.getEdad()>30 && this.getComision() > 400000;
        
    }
    
    
}
