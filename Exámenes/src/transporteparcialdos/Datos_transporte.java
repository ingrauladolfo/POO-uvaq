package transporteparcialdos;
import javax.swing.*;
public class Datos_transporte extends Pasajeros
{
	public static String chofer,destino,placas;
	public static Pasajeros [] pasaje_van = new Pasajeros[15];
	public static Pasajeros [] pasaje_autobús = new Pasajeros[30];
	public static Pasajeros [] pasaje_auto = new Pasajeros[5];
	public static Pasajeros pasajero_van, pasajero_autobús, pasajero_auto;
	public Datos_transporte(String nombre, int número_ss)
	{
		super(nombre, número_ss);
		this.chofer = chofer;
		this.destino = destino;
		this.placas = placas;
	}
	
	public static String getChofer() {
		return chofer;
	}

	public static void setChofer(String chofer) {
		Datos_transporte.chofer = chofer;
	}

	public static String getDestino() {
		return destino;
	}

	public static void setDestino(String destino) {
		Datos_transporte.destino = destino;
	}

	public static String getPlacas() {
		return placas;
	}

	public static void setPlacas(String placas) {
		Datos_transporte.placas = placas;
	}

	public static void pedirDatosTransporte()
	{
		chofer = JOptionPane.showInputDialog("¿Cuál es el nombre del chofer?:\n");
		destino = JOptionPane.showInputDialog("¿Cuál es el destino?:\n");
		placas = JOptionPane.showInputDialog("¿Cuál es tu placa?:\n");
	}
	public static void agregarDatosTransporte()
	{
		Datos_transporte.getChofer();
		Datos_transporte.getDestino();
		Datos_transporte.getPlacas();
	}
	public static String toString(String chofer,String destino, String placas)
	{
		return "El chofer es: "+ chofer+", "+"su destino es: "+destino+" y el número de placas es: "+placas;
	}
	public static void consultarDatosPasajeros()
	{
		System.out.println(Datos_transporte.toString(chofer,destino,placas));
	}
	public static void obtenerListaPasajerosVAN()
	{
		for (int i = 0; i < pasaje_van.length;i++)
		{
			pasaje_van[i].pedirPasajeros();
			pasaje_van[i].agregarPasajeros();
			pasaje_van[i].consultarPasajeros();
		}
	}
	public static void obtenerListaPasajerosAutobús()
	{
		for (int i = 0; i < pasaje_autobús.length;i++)
		{
			pasaje_autobús[i].pedirPasajeros();
			pasaje_autobús[i].agregarPasajeros();
			pasaje_autobús[i].consultarPasajeros();
		}
	}
	public static void obtenerListaPasajerosAuto()
	{
		for (int i = 0; i < pasaje_auto.length;i++)
		{
			pasaje_auto[i].pedirPasajeros();
			pasaje_auto[i].agregarPasajeros();
			pasaje_auto[i].consultarPasajeros();
		}
	}
}
