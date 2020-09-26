package composición_vehículos;

import javax.swing.JOptionPane;

public class Llantas 
{
	public static String medida;
	public static int número;
	public Llantas(String medida, int número)
	{
		super();
		this.medida = medida;
		this.número = número;
	}
	public Llantas() {
	}
	public static String getMedida() {
		return medida;
	}
	public static void setMedida(String medida) {
		Llantas.medida = medida;
	}
	public static int getNúmero() {
		return número;
	}
	public static void setNúmero(int número) {
		Llantas.número = número;
	}
	public static void pedirDatosLlantas()
	{
		medida = JOptionPane.showInputDialog("Dame la medida de las llantas:\n");
		número = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de llantas:\n"));
	}
	public static void agregarDatosLlantas()
	{
		Llantas.getMedida();
		Llantas.getNúmero();
	}
	public static String toString(String medida, int número)
	{
		return "La medida de las llantas es: "+medida+" "+"El número de llantas es: "+número;
	}
	public static void consultarDatosLlantas()
	{
		System.out.println(toString(medida,número));
	}
}
