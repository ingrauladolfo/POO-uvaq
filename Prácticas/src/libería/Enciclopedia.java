package libería;

import javax.swing.*;

public class Enciclopedia 
{
	public static String nombre, autor,isbn,editorial,volumen,nombre_modificado,autor_modificado,isbn_modificado,editorial_modificada,volumen_modificado;
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Enciclopedia.nombre = nombre;
	}
	public static String getAutor() {
		return autor;
	}
	public static void setAutor(String autor) {
		Enciclopedia.autor = autor;
	}
	public static String getIsbn() {
		return isbn;
	}
	public static void setIsbn(String isbn) {
		Enciclopedia.isbn = isbn;
	}
	public static String getEditorial() {
		return editorial;
	}
	public static void setEditorial(String editorial) {
		Enciclopedia.editorial = editorial;
	}
	public static String getVolumen() {
		return volumen;
	}
	public static void setVolumen(String volumen) {
		Enciclopedia.volumen = volumen;
	}
	public static String getNombre_modificado() {
		return nombre_modificado;
	}
	public static void setNombre_modificado(String nombre_modificado) {
		Enciclopedia.nombre_modificado = nombre_modificado;
	}
	public static String getAutor_modificado() {
		return autor_modificado;
	}
	public static void setAutor_modificado(String autor_modificado) {
		Enciclopedia.autor_modificado = autor_modificado;
	}
	public static String getIsbn_modificado() {
		return isbn_modificado;
	}
	public static void setIsbn_modificado(String isbn_modificado) {
		Enciclopedia.isbn_modificado = isbn_modificado;
	}
	public static String getEditorial_modificada() {
		return editorial_modificada;
	}
	public static void setEditorial_modificada(String editorial_modificada) {
		Enciclopedia.editorial_modificada = editorial_modificada;
	}
	public static String getVolumen_modificado() {
		return volumen_modificado;
	}
	public static void setVolumen_modificado(String volumen_modificado) {
		Enciclopedia.volumen_modificado = volumen_modificado;
	}
	public static void pedirDatosEnciclopedias()
	{
		nombre = JOptionPane.showInputDialog("Dame el nombre de la enciclopedia\n");
		autor = JOptionPane.showInputDialog("Dame el autor de la enciclopedia\n");
		editorial = JOptionPane.showInputDialog("Dame la editorial de la enciclopedia\n");
		isbn = JOptionPane.showInputDialog("Dame el ISBN de la enciclopedia\n");
		volumen = JOptionPane.showInputDialog("Dame el número de volumen el cual pertenece la enciclopedia\n");
	}
	public static void pedirDatosModificadosEnciclopedias()
	{
		nombre_modificado = nombre = JOptionPane.showInputDialog("Dame un nuevo nombre\n");
		autor_modificado = JOptionPane.showInputDialog("Dame nuevo autor\n");
		editorial_modificada = JOptionPane.showInputDialog("Dame una nueva editorial\n");
		isbn_modificado = JOptionPane.showInputDialog("Dame un nuevo número ISBN\n");
		volumen_modificado = JOptionPane.showInputDialog("Dame un nuevo volumen\n");
	}
	public static void agregarDatosEnciclopedia()
	{
		Enciclopedia.pedirDatosEnciclopedias();
		Enciclopedia.getNombre();
		Enciclopedia.getAutor();
		Enciclopedia.getEditorial();
		Enciclopedia.getIsbn();
		Enciclopedia.getVolumen();
	}
	public static void eliminarDatosEnciclopedia()
	{
		nombre = null;
		autor = null;
		editorial = null;
		isbn = null;
		volumen = null;
	}
	public static void modificarDatosEnciclopedia()
	{
		Enciclopedia.pedirDatosModificadosEnciclopedias();
		Enciclopedia.getNombre_modificado();
		Enciclopedia.getAutor_modificado();
		Enciclopedia.getEditorial_modificada();
		Enciclopedia.getIsbn_modificado();
		Enciclopedia.getVolumen_modificado();
	}
	public static void consultarDatosEnciclopedia()
	{
		Enciclopedia.getNombre();
		Enciclopedia.getAutor();
		Enciclopedia.getEditorial();
		Enciclopedia.getIsbn();
		Enciclopedia.getVolumen();
	}
}