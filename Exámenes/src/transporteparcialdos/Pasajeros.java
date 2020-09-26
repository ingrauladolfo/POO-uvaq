package transporteparcialdos;
import javax.swing.*;
public class Pasajeros
{
	public static String nombre;
	public static int número_ss;
	public Pasajeros(String nombre, int número_ss)
	{
		this.nombre = nombre;
		this.número_ss = número_ss;
	}
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Pasajeros.nombre = nombre;
	}
	public static int getNúmero_ss() {
		return número_ss;
	}
	public static void setNúmero_ss(int número_ss) {
		Pasajeros.número_ss = número_ss;
	}
	public static void pedirPasajeros()
	{
		nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?:\n");
		número_ss = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es tu número de seguro social?:\n"));
	}
	public static void agregarPasajeros()
	{
		Pasajeros.getNombre();
		Pasajeros.getNúmero_ss();
	}
	public static String toString(String nombre, int número_ss)
	{
		return "El nombre del pasajero es: "+nombre+" y "+"su número de seguro social es: "+número_ss;
	}
	public static void consultarPasajeros()
	{
		System.out.println(Pasajeros.toString(nombre, número_ss));
	}
}
