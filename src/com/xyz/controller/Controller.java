/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xyz.controller;

import com.xyz.domain.*;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author antares
 */
public class Controller {

    private static int index;

    public static ArrayList<String[]> readCSV() {

        String line = "";
        String splitBy = ",";

        ArrayList<String[]> empleados = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("persistencia.csv"));
            while ((line = br.readLine()) != null) //returns a Boolean value  
            {
                //tipo,nombre,edad,salario,extra
                String[] empleado = line.split(splitBy);    // use comma as separator  
                index++;
                empleados.add(empleado);

            }
            br.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        return empleados;
    }

    public static void writeCSV(ArrayList<String[]> empleados) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("persistencia.csv"));
            for (String[] empleado : empleados) {
                writer.write(String.join(",", empleado));
                writer.newLine();
            }

            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static String[] controlBonificacion(String tipo,
            String nombre, String edad, String salario, String extra) {
        String bonif;
        String total;

        String[] salida = new String[2];

        if (tipo.equals("comercial")) {
            Comercial aux;
            aux = new Comercial(Double.parseDouble(extra),
                    nombre, Integer.parseInt(edad), Double.parseDouble(salario));

            if (aux.gestionarBonificacion()) {
                bonif = "Si";
                total = String.valueOf(aux.getSalario()
                        + aux.VAL_BONIFICACION + aux.getComision());
            } else {
                bonif = "No";
                total = String.valueOf(aux.getSalario()
                        + aux.getComision());
            }
        } else {
            Repartidor aux;
            aux = new Repartidor(Integer.parseInt(extra),
                    nombre, Integer.parseInt(edad), Double.parseDouble(salario));

            if (aux.gestionarBonificacion()) {
                bonif = "Si";
                total = String.valueOf(aux.getSalario()
                        + aux.VAL_BONIFICACION);
            } else {
                bonif = "No";
                total = String.valueOf(aux.getSalario());
            }

        }
        salida[0] = bonif;
        salida[1] = total;
        return salida;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int aIndex) {
        index = aIndex;
    }

}
