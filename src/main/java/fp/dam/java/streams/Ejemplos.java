package fp.dam.java.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import fp.dam.java.streams.libros.Autor;
import fp.dam.java.streams.libros.Libro;

public class Ejemplos {

	public static void main(String[] args) {
		List<Libro> libros = Datos.getLibros();
		
//		Set<Autor> autores = new TreeSet<>(Comparator.comparing(Autor::getApellidosNombre));
		Set<Autor> autores = new TreeSet<>();
		libros.forEach(libro -> autores.add(libro.getAutor()));
//		for (Libro libro: libros)
//			autores.add(libro.getAutor());
//		autores.forEach(System.out::println);
		
		// Almacenar en un conjunto el nombre de los autores sin repetir (crear al menos
		// dos stream pipelines distintos) y mostrarlo en la consola.
		
		
	}

}
