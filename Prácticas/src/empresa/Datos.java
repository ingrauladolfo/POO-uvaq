package empresa;
import javax.swing.*;

import hospital.Médico;
public class Datos 
{
	public static String nombre,puesto,salario;
	public static String getSalario() 
	{
		return salario;
	}
	public static void setSalario(String salario) 
	{
		Datos.salario = salario;
	}
	public static String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public static String getPuesto() 
	{
		return puesto;
	}
	public void setPuesto(String puesto) 
	{
		this.puesto = puesto;
	}
	public static void pedirNombre()
	{
		nombre = JOptionPane.showInputDialog("Dame tu nombre:\n");
	}
	public static void agregarNombre()
	{
		Datos.pedirNombre();
		Datos.getNombre();
	}
	public static void pedirPuesto()
	{
		puesto = JOptionPane.showInputDialog("Dame tu puesto:\n");
	}
	public static void agregarPuesto()
	{
		Datos.pedirPuesto();
		Datos.getPuesto();
	}
	public static void pedirSalario()
	{
		salario = JOptionPane.showInputDialog("Dame tu salario:\n");
	}
	public static void agregarSalario()
	{
		Datos.pedirSalario();
		Datos.getSalario();
	}
	public static void consultarNombre()
	{
		Datos.getNombre();
	}
	public static void consultarPuesto()
	{
		Datos.getPuesto();
	}
	public static void consultarSalario()
	{
		Datos.getSalario();
	}
}
