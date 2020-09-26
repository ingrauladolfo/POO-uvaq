package composición_vehículos;

import javax.swing.JOptionPane;

public class Estructura 
{
	public static String color,material,tamaño;
	public Estructura(String color, String material,String tamaño)
	{
		super();
		this.color = color;
		this.tamaño = tamaño;
	}
	public Estructura() {
	}
	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		Estructura.color = color;
	}

	public static String getMaterial() {
		return material;
	}

	public static void setMaterial(String material) {
		Estructura.material = material;
	}

	public static String getTamaño() {
		return tamaño;
	}

	public static void setTamaño(String tamaño) {
		Estructura.tamaño = tamaño;
	}
	public static void pedirDatosEstructura()
	{
		color = JOptionPane.showInputDialog("Dame el color:\n");
		tamaño = JOptionPane.showInputDialog("Dame el tamaño:\n");
		material = JOptionPane.showInputDialog("Dame el material:\n");
	}
	public static void agregarDatosEstructura()
	{
		Estructura.getTamaño();
		Estructura.getMaterial();
		Estructura.getColor();
	}
	public static String toString(String color, String material,String tamaño)
	{
		return  "El color es: "+color+" "+"El material es: "+material+" "+"el tamaño es: "+tamaño;
	}
	public static void consultarDatosEstructura()
	{
		System.out.println(toString(color,material,tamaño));
	}
}