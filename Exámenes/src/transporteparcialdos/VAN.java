package transporteparcialdos;
import javax.swing.*;
public class VAN extends Datos_transporte 
{
	public VAN(String nombre, int número_ss) 
	{
		super(nombre, número_ss);
	}
	public static void pedirVAN()
	{
		Datos_transporte.pedirDatosTransporte();
	}
	public static void agregarVAN()
	{
		Datos_transporte.agregarDatosTransporte();
		Datos_transporte.obtenerListaPasajerosVAN();
	}
	public static void consultarVAN()
	{
		Datos_transporte.consultarDatosPasajeros();
		System.out.println(pasaje_van);
	}
}
