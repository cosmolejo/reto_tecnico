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
public class Repartidor extends Empleado {

    private int zona;

    public Repartidor(int zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public Repartidor() {
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    @Override
    public boolean gestionarBonificacion() {

        return this.getEdad()<25 && this.getZona()==3;

    }

}
