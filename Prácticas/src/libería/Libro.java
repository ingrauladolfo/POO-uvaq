package libería;
import javax.swing.*;

public class Libro 
{
	public static String nombre, autor,isbn,editorial,materia,nombre_modificado,autor_modificado,isbn_modificado,editorial_modificada,materia_modificada;
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Libro.nombre = nombre;
	}
	public static String getAutor() {
		return autor;
	}
	public static void setAutor(String autor) {
		Libro.autor = autor;
	}
	public static String getIsbn() {
		return isbn;
	}
	public static void setIsbn(String isbn) {
		Libro.isbn = isbn;
	}
	public static String getEditorial() {
		return editorial;
	}
	public static void setEditorial(String editorial) {
		Libro.editorial = editorial;
	}
	public static String getMateria() {
		return materia;
	}
	public static void setMateria(String materia) {
		Libro.materia = materia;
	}
	public static String getNombre_modificado() {
		return nombre_modificado;
	}
	public static void setNombre_modificado(String nombre_modificado) {
		Libro.nombre_modificado = nombre_modificado;
	}
	public static String getAutor_modificado() {
		return autor_modificado;
	}
	public static void setAutor_modificado(String autor_modificado) {
		Libro.autor_modificado = autor_modificado;
	}
	public static String getIsbn_modificado() {
		return isbn_modificado;
	}
	public static void setIsbn_modificado(String isbn_modificado) {
		Libro.isbn_modificado = isbn_modificado;
	}
	public static String getEditorial_modificada() {
		return editorial_modificada;
	}
	public static void setEditorial_modificada(String editorial_modificada) {
		Libro.editorial_modificada = editorial_modificada;
	}
	public static String getMateria_modificada() {
		return materia_modificada;
	}
	public static void setMateria_modificada(String materia_modificada) {
		Libro.materia_modificada = materia_modificada;
	}
	public static void pedirDatosLibros()
	{
		nombre = JOptionPane.showInputDialog("Dame el nombre del libro\n");
		autor = JOptionPane.showInputDialog("Dame el autor del libro\n");
		editorial = JOptionPane.showInputDialog("Dame la editorial del libro\n");
		isbn = JOptionPane.showInputDialog("Dame el ISBN del libro\n");
		materia = JOptionPane.showInputDialog("Dame la materia a la cual pertenece el libro\n");
	}
	public static void pedirDatosModificadosLibros()
	{
		nombre_modificado = JOptionPane.showInputDialog("Dame el nombre del nuevo libro\n");
		autor_modificado = JOptionPane.showInputDialog("Dame el nuevo autor del nuevo libro\n");
		editorial_modificada = JOptionPane.showInputDialog("Dame la editorial del nuevo libro\n");
		isbn_modificado = JOptionPane.showInputDialog("Dame el ISBN del nuevo libro\n");
		materia_modificada = JOptionPane.showInputDialog("Dame la materia a la cual pertenece el nuevo libro\n");
	}
	public static void agregarDatosLibro()
	{
		Libro.pedirDatosLibros();
		Libro.getNombre();
		Libro.getAutor();
		Libro.getEditorial();
		Libro.getIsbn();
		Libro.getMateria();
	}
	public static void eliminarDatosLibro()
	{
		nombre = null;
		autor = null;
		editorial = null;
		isbn = null;
		materia = null;
	}
	public static void modificarDatosLibro()
	{
		Libro.pedirDatosModificadosLibros();
		Libro.getNombre_modificado();
		Libro.getAutor_modificado();
		Libro.getEditorial_modificada();
		Libro.getIsbn_modificado();
		Libro.getMateria_modificada();
	}
	public static void consultarDatosLibro()
	{
		Libro.getNombre();
		Libro.getAutor();
		Libro.getEditorial();
		Libro.getIsbn();
		Libro.getMateria();
	}
}