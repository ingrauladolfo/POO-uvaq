package composición_vehículos;

import javax.swing.JOptionPane;

public class Tipo 
{
	public static String marca,modelo;
	public Tipo(String marca, String modelo)
	{
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	public Tipo() {
	}
	public static String getMarca() {
		return marca;
	}
	public static void setMarca(String marca) {
		Tipo.marca = marca;
	}
	public static String getModelo() {
		return modelo;
	}
	public static void setModelo(String modelo) {
		Tipo.modelo = modelo;
	}
	public static void pedirDatosTipo()
	{
		marca = JOptionPane.showInputDialog("Dame la marca:\n");
		modelo = JOptionPane.showInputDialog("Dame el modelo:\n");
	}
	public static void agregarDatosTipo()
	{
		Tipo.getMarca();
		Tipo.getModelo();
	}
	public static String toString(String marca, String modelo)
	{
		return "La marca es: "+marca+" "+"el modelo es: "+modelo;
	}
	public static void consultarDatosEstructura()
	{
		System.out.println(toString(marca,modelo));
	}
}