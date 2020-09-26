package composición_factura;
import javax.swing.*;
public class Clientes 
{
	public static String nombre, dirección;
	public static int edad;
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Clientes.nombre = nombre;
	}
	public static String getDirección() {
		return dirección;
	}
	public static void setDirección(String dirección) {
		Clientes.dirección = dirección;
	}
	public static int getEdad() {
		return edad;
	}
	public static void setEdad(int edad) {
		Clientes.edad = edad;
	}
	
	public static void pedirDatosClientes()
	{
		nombre = JOptionPane.showInputDialog("Dame tu nombre\n");
		dirección = JOptionPane.showInputDialog("Dame tu dirección\n");
		edad = Integer.parseInt(JOptionPane.showInputDialog("Dame tu edad\n"));
	}
	public static void agregarDatosClientes()
	{
		Clientes.pedirDatosClientes();
		Clientes.getNombre();
		Clientes.getDirección();
		Clientes.getEdad();
	}
	public static void consultarDatosClientes()
	{
		System.out.println("Nombre: "+Clientes.nombre+"\n"+"Dirección: "+ Clientes.dirección +"\n"+"Edad: "+Clientes.edad);
	}
}
