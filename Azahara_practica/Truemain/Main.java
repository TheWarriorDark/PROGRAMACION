package Azahara_practica;

public class Main {
    
    public static void main(String[] args) {
        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal", "Calle Principal 123", 8, 20);
        
        // Crear libros
        Libro libro1 = new Libro("Don Quijote", "978-8424192", "Alfaguara", "Español", 863, 1605, true);
        Libro libro2 = new Libro("1984", "978-0451524", "Penguin", "Inglés", 328, 1949, true);
        Libro libro3 = new Libro("Cien años de soledad", "978-8447358", "Mondadori", "Español", 471, 1967, false);
        Libro libro4 = new Libro("El Hobbit", "978-8445007", "Minotauro", "Inglés", 310, 1937, true);
        
        // Agregar libros a la biblioteca
        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);
        biblioteca.addLibro(libro4);
        System.out.println("✓ Se han agregado 4 libros a la biblioteca");
        
        // Crear salas
        Sala sala1 = new Sala("Sala de Lectura", 10, false, "lectura", true);
        Sala sala2 = new Sala("Sala de Estudio", 20, true, "estudio", true);
        Sala sala3 = new Sala("Sala de Informatica", 15, true, "informática", true);
        
        // Agregar salas a la biblioteca
        biblioteca.addSala(sala1);
        biblioteca.addSala(sala2);
        biblioteca.addSala(sala3);
        System.out.println("✓ Se han agregado 3 salas a la biblioteca\n");
        
        // Crear personas
        Persona persona1 = new Persona("Juan", "García", "12345678A", 28, 666111222, "juan@email.com", "Ingeniero", 5);
        Persona persona2 = new Persona("María", "López", "87654321B", 35, 666222333, "maria@email.com", "Abogada", 10);
        Persona persona3 = new Persona("Carlos", "Martínez", "11223344C", 22, 666333444, "carlos@email.com", "Estudiante", 0);
        Persona persona4 = new Persona("Ana", "Fernández", "44332211D", 70, 666444555, "ana@email.com", "Jubilada", 40);
        System.out.println("✓ Se han creado 4 personas\n");
        
        // Probar métodos de Personas
        System.out.println("--- Prueba de Personas ---");
        persona1.mostrarInfo();
        persona4.estaJubilado();
        System.out.println();
        
        // Probar entrar personas en salas
        System.out.println("--- Prueba: Entrada de personas a salas ---");
        sala1.entrarPersona(persona1);
        sala1.entrarPersona(persona2);
        sala2.entrarPersona(persona3);
        sala2.entrarPersona(persona4);
        System.out.println();
        
        // Mostrar personas en cada sala
        System.out.println("--- Estado de personas en salas ---");
        sala1.mostrarPersonas();
        sala2.mostrarPersonas();
        sala3.mostrarPersonas();
        System.out.println();
        
        // Probar salida de personas
        System.out.println("--- Prueba: Salida de personas de salas ---");
        sala1.salirPersona(persona1);
        System.out.println();
        
        // Mostrar información de libros
        System.out.println("--- Información de libros ---");
        biblioteca.mostrarLibrosDisponibles();
        System.out.println();
        
        // Mostrar todas las salas con número de personas
        System.out.println("--- Todas las salas ---");
        biblioteca.mostrarSalas();
        System.out.println();
        
        // Mostrar salas disponibles (sin personas)
        System.out.println("--- Salas disponibles ---");
        biblioteca.mostrarSalasDisponibles();
        System.out.println();
        
        // Mostrar total de personas
        biblioteca.mostrarTotalPersonas();
        System.out.println();
        
        // Buscar libro por título
        System.out.println("--- Búsqueda de libro ---");
        Libro libroEncontrado = biblioteca.buscarLibroPorTitulo("1984");
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado");
        }
        System.out.println();
        
        // Verificar hora de apertura
        System.out.println("--- Verificación de horarios ---");
        biblioteca.estaAbierta(10);
        biblioteca.estaAbierta(22);
        System.out.println();
        
        // Mostrar información completa de la biblioteca
        System.out.println("--- Información completa de la biblioteca ---");
        biblioteca.mostrarBiblioteca();
        
        // Mostrar información de la biblioteca
        biblioteca.mostrarInfo();
    }
}
