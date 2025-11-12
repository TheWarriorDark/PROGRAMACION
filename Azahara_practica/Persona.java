package Azahara_practica;

import java.util.ArrayList;
import java.util.List;

// Clase Persona
public class Persona {
private String nombre;
private String apellidos;
private String DNI;
private int edad;
private long telefono;
private String email;
private String profesion;
private int Anyos_de_experiencia;

//Sets
public void setEdad (int edad) {
if (edad > 0) {
this.edad = edad;
} else {
this.edad = 0;
}
}
public void setNombre (String nombre) {
this.nombre = nombre;
}
public void setApellidos (String apellidos) {
this.apellidos = apellidos;
}
public void setDNI (String DNI) {
this.DNI = DNI;
}
public void setTelefono (long telefono) {
this.telefono = telefono;
}
public void setEmail (String email) {
this.email = email;
}
public void setprofesion (String profesion) {
this.profesion = profesion;
}
public void setEmail (int Anyos_de_experiencia) {
this.Anyos_de_experiencia = Anyos_de_experiencia;
}

//Gets
public String getNombre () {return nombre;
}
public String getApellidos () {return apellidos;
}
public String getDNI () {return DNI;
}
public int getEdad () {return edad;
}
public long getTelefono () {return telefono;
}
public String getEmail () {return email;
}
public String getProfesion () {return profesion;
}
public int getAnyos_de_experiencia () {return Anyos_de_experiencia;
}

public void estaJubilado()
{
    if (edad>65)
    {System.out.println("Estas jubilao friki");}
    else {System.out.println("No estas jubilao friki");}
}

}


// Clase Biblioteca
class Biblioteca {
private List<Libro> libros;
public Biblioteca()
{
libros = new ArrayList<>();
}

public void agregarLibro(Libro l)
{
libros.add(l);
}

public void mostrarLibros()
{
System.out.println("Libros en la biblioteca:");
for (Libro l : libros)
{
System.out.println("- " + l.getTitulo());
}
}

}