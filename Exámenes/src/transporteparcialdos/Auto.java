package transporteparcialdos;
import javax.swing.*;
public class Auto extends Datos_transporte
{
	public Auto(String nombre, int número_ss)
	{
		super(nombre, número_ss);
	}
	public static void pedirAuto()
	{
		Datos_transporte.pedirDatosTransporte();
	}
	public static void agregarAuto()
	{
		Datos_transporte.agregarDatosTransporte();
		Datos_transporte.obtenerListaPasajerosAuto();
	}
	public static void consultarAuto()
	{
		Datos_transporte.consultarDatosPasajeros();
		System.out.println(pasaje_auto);
	}
}
