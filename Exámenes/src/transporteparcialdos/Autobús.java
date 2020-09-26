package transporteparcialdos;
import javax.swing.*;
public class Autobús extends Datos_transporte
{
	public Autobús(String nombre, int número_ss)
	{
		super(nombre, número_ss);
	}
	
	public static void pedirAutobús()
	{
		Datos_transporte.pedirDatosTransporte();
	}
	public static void agregarAutobús()
	{
		Datos_transporte.agregarDatosTransporte();
		Datos_transporte.obtenerListaPasajerosAutobús();
	}
	public static void consultarAutobús()
	{
		Datos_transporte.consultarDatosPasajeros();
		System.out.println(pasaje_autobús);
	}
}
