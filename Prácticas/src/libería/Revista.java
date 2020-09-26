package libería;
import javax.swing.*;

public class Revista 
{
	public static String nombre, autor,isbn,número,fecha,nombre_modificado,autor_modificado,isbn_modificado,número_modificado,fecha_modificada;
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Revista.nombre = nombre;
	}
	public static String getAutor() {
		return autor;
	}
	public static void setAutor(String autor) {
		Revista.autor = autor;
	}
	public static String getIsbn() {
		return isbn;
	}
	public static void setIsbn(String isbn) {
		Revista.isbn = isbn;
	}
	public static String getNúmero() {
		return número;
	}
	public static void setNúmero(String número) {
		Revista.número = número;
	}
	public static String getFecha() {
		return fecha;
	}
	public static void setFecha(String fecha) {
		Revista.fecha = fecha;
	}
	public static String getNombre_modificado() {
		return nombre_modificado;
	}
	public static void setNombre_modificado(String nombre_modificado) {
		Revista.nombre_modificado = nombre_modificado;
	}
	public static String getAutor_modificado() {
		return autor_modificado;
	}
	public static void setAutor_modificado(String autor_modificado) {
		Revista.autor_modificado = autor_modificado;
	}
	public static String getIsbn_modificado() {
		return isbn_modificado;
	}
	public static void setIsbn_modificado(String isbn_modificado) {
		Revista.isbn_modificado = isbn_modificado;
	}
	public static String getNúmero_modificado() {
		return número_modificado;
	}
	public static void setNúmero_modificado(String número_modificado) {
		Revista.número_modificado = número_modificado;
	}
	public static String getFecha_modificada() {
		return fecha_modificada;
	}
	public static void setFecha_modificada(String fecha_modificada) {
		Revista.fecha_modificada = fecha_modificada;
	}
	public static void pedirDatosRevistas()
	{
		nombre = JOptionPane.showInputDialog("Dame el nombre de la revista\n");
		autor = JOptionPane.showInputDialog("Dame el autor de la revista\n");
		número = JOptionPane.showInputDialog("Dame el número de la revista\n");
		isbn = JOptionPane.showInputDialog("Dame el ISBN de la revista\n");
		fecha = JOptionPane.showInputDialog("Dame la fecha en la que fue publicada la revista\n");
	}
	public static void pedirDatosModificadosRevistas()
	{
		nombre_modificado = JOptionPane.showInputDialog("Dame el nombre de la nueva revista\n");
		autor_modificado = JOptionPane.showInputDialog("Dame el autor de la nueva revista\n");
		número_modificado = JOptionPane.showInputDialog("Dame el número del nuevo libro\n");
		isbn_modificado = JOptionPane.showInputDialog("Dame el ISBN de la nueva revista\n");
		fecha_modificada = JOptionPane.showInputDialog("Dame la fecha en la que fue publicada la nueva revista\n");
	}
	public static void agregarDatosRevista()
	{
		Revista.pedirDatosRevistas();
		Revista.getNombre();
		Revista.getAutor();
		Revista.getNúmero();
		Revista.getIsbn();
		Revista.getFecha();
	}
	public static void eliminarDatosRevista()
	{
		nombre = null;
		autor = null;
		número = null;
		isbn = null;
		fecha = null;
	}
	public static void modificarDatosRevista()
	{
		Revista.pedirDatosModificadosRevistas();
		Revista.getNombre_modificado();
		Revista.getAutor_modificado();
		Revista.getNúmero_modificado();
		Revista.getIsbn_modificado();
		Revista.getFecha_modificada();
	}
	public static void consultarDatosRevista()
	{
		Revista.getNombre();
		Revista.getAutor();
		Revista.getNúmero();
		Revista.getIsbn();
		Revista.getFecha();
	}
}