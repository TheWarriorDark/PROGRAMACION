package Azahara_practica;

import java.util.ArrayList;
import java.util.List;

// Clase Persona
public class Libro {
private String Titulo;
private String ISBN;
private String Editorial;
private String Idioma;
private int N_paginas;
private int Anyo;
private boolean Disponible_reserva;

//Sets
public void setTitulo (String Titulo) {
this.Titulo = Titulo;
}
public void setISBN (String ISBN) {
this.ISBN = ISBN;
}
public void setEditorial (String Editorial) {
this.Editorial = Editorial;
}
public void setIdioma (String Idioma) {
this.Idioma = Idioma;
}
public void setN_paginas (int N_paginasil) {
this.N_paginas = N_paginas;
}
public void setAnyo (int Anyo) {
this.Anyo = Anyo;
}
public void setN (boolean Disponible_reserva) {
this.Disponible_reserva = Disponible_reserva;
}

//Gets
public String getTitulo () {return Titulo;
}
public String getISBN () {return ISBN;
}
public String getEditorial () {return Editorial;
}
public String getIdioma () {return Idioma;
}
public int getN_paginasil () {return N_paginas;
}
public int getAnyo () {return Anyo;
}
public boolean getDisponible_reserva () {return Disponible_reserva;
}

public void estaJubilado()
{
    if (edad>65)
    {System.out.println("Estas jubilao friki");}
    else {System.out.println("No estas jubilao friki");}
}

}
