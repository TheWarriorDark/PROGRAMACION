package Azahara_practica;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    //Atributos
    private String nombre;
    private String direccion;
    private int horarioApertura;
    private int horarioCierre;


    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHorarioApertura(int horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public void setHorarioCierre(int horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getHorarioApertura() {
        return horarioApertura;
    }

    public int getHorarioCierre() {
        return horarioCierre;
    }

    //Metodos
    public void estaAbierta(int hora) {
        if (hora >= this.horarioApertura && hora < this.horarioCierre) {
            System.out.println("A las " + hora + ":00, la biblioteca está abierta.");
        } else {
            System.out.println("A las " + hora + ":00, la biblioteca está cerrada.");
        }
    }

    public void informacion() {
        System.out.println("Biblioteca: " + this.nombre + " - " + this.direccion +
                           ". Abierto de " + this.horarioApertura + ":00 a " + this.horarioCierre + ":00.");
    }
}