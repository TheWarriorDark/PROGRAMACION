package Azahara_practica;

import java.util.ArrayList;
import java.util.List;

public class Sala {

//Atributos
    private String nombre;
    private int capacidad;
    private boolean pizarra;
    private String tipo;
    private boolean disponibleParaReserva;


    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPizarra(boolean pizarra) {
        this.pizarra = pizarra;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDisponibleParaReserva(boolean disponibleParaReserva) {
        this.disponibleParaReserva = disponibleParaReserva;
    }
      
    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isPizarra() {
        return pizarra;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponibleParaReserva() {
        return disponibleParaReserva;
    }

    //Metodos
    public void estaDisponible() {
        if (this.disponibleParaReserva) {
            System.out.println("La sala se encuentra disponible para su reserva.");
        } else {
            System.out.println("La sala no se encuentra disponible para su reserva.");
        }
    }

    public void tienePizarra() {
        if (this.pizarra) {
            System.out.println("La sala dispone de pizarra.");
        } else {
            System.out.println("La sala no dispone de pizarra.");
        }
    }

    public void informacion() {
        String textoPizarra = this.pizarra ? "dispone" : "no dispone";
        String textoDisponible = this.disponibleParaReserva ? "está" : "no está";

        System.out.println("Sala: " + this.nombre + " - " + this.capacidad + ". " +
                           "Se utiliza para " + this.tipo + ", " + textoPizarra + " de pizarra y " +
                           textoDisponible + " disponible para su reserva.");
    }
}