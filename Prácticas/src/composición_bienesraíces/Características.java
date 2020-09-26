package composición_bienesraíces;
import javax.swing.*;
public class Características 
{
	public static String color,material;
	public static int alto,ancho;
	
	public Características(String color,String material,int alto,int ancho)
	{
		this.color = color;
		this.material = material;
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public static String getColor() {
		return color;
	}
	public static void setColor(String color) {
		Características.color = color;
	}
	public static String getMaterial() {
		return material;
	}
	public static void setMaterial(String material) {
		Características.material = material;
	}
	public static int getAlto() {
		return alto;
	}
	public static void setAlto(int alto) {
		Características.alto = alto;
	}
	public static int getAncho() {
		return ancho;
	}
	public static void setAncho(int ancho) {
		Características.ancho = ancho;
	}
	public static void pedirDatosCaracterísticas()
	{
		alto = Integer.parseInt(JOptionPane.showInputDialog("Dame el alto:\n"));
		ancho = Integer.parseInt(JOptionPane.showInputDialog("Dame el ancho:\n"));
		material = JOptionPane.showInputDialog("Dame el material:\n");
		color = JOptionPane.showInputDialog("Dame el color:\n");
	}
	public static void agregarDatosCaracterísticas()
	{
		Características.pedirDatosCaracterísticas();
		Características.getAlto();
		Características.getAncho();
		Características.getMaterial();
		Características.getColor();
	}
	public static String toString(String color, String material,int alto,int ancho)
	{
		return "El color es: "+ color+" El material es: "+ material + " Mide tanto de alto: "+ alto+" Mide tanto de ancho: "+ ancho;
	}
	public static void consultarDatosCaracterísticas()
	{
		System.out.println(toString(color, material, alto, ancho));
	}
	
}
