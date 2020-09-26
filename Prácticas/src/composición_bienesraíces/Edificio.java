package composición_bienesraíces;
import javax.swing.*;
public class Edificio extends Casa
{
	public static String calle,uso_edificio;
	public static int número_departamentos,número_interior,número_exterior;
	public Edificio(String color, String material, int alto, int ancho)
	{
		super(color, material, alto, ancho);
		this.calle = calle;
		this.uso_edificio = uso_edificio;
		this.número_departamentos = número_departamentos;
		this.número_interior = número_interior;
		this.número_exterior = número_exterior;
	}
	public static String getCalle() {
		return calle;
	}
	public static void setCalle(String calle) {
		Edificio.calle = calle;
	}
	public static String getUso_edificio() {
		return uso_edificio;
	}
	public static void setUso_edificio(String uso_edificio) {
		Edificio.uso_edificio = uso_edificio;
	}
	public static int getNúmero_departamentos() {
		return número_departamentos;
	}
	public static void setNúmero_departamentos(int número_departamentos) {
		Edificio.número_departamentos = número_departamentos;
	}
	public static int getNúmero_interior() {
		return número_interior;
	}
	public static void setNúmero_interior(int número_interior) {
		Edificio.número_interior = número_interior;
	}
	public static int getNúmero_exterior() {
		return número_exterior;
	}
	public static void setNúmero_exterior(int número_exterior) {
		Edificio.número_exterior = número_exterior;
	}
	public static void pedirDatosEdificio()
	{
		calle = JOptionPane.showInputDialog("¿Cuál es la calle en donde se ubica el edificio?:\n");
		uso_edificio = JOptionPane.showInputDialog("¿Cuál es el uso del edificio?:\n");
		número_departamentos = Integer.parseInt(JOptionPane.showInputDialog("¿Con cuántos departamentos cuenta el edificio?:\n"));
		número_interior = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el número del departamento?:\n"));
		número_exterior = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el número del edificio?:\n"));
	}
	public static void agregarDatosEdificio()
	{
		Casa.agregarDatosCasa();
		Edificio.pedirDatosEdificio();
		Edificio.getCalle();
		Edificio.getUso_edificio();
		Edificio.getNúmero_departamentos();
		Edificio.getNúmero_interior();
		Edificio.getNúmero_exterior();
	}
	public static String toString(String calle,String uso_edificio,int número_departamentos,int número_interior,int número_exterior)
	{
		return "La calle donde se ubica el edificio es: "+calle+" "+"El uso que le das al edificio es: "+uso_edificio+" "+"El número de departamentos que tiene el edificio es: "+número_departamentos+" "+"El número del departamento es: "+número_interior+" "+"El número del edificio es: "+número_exterior;
	}
	public static void consultarDatosEdificio()
	{
		consultarDatosCasa();
		System.out.println(toString(calle,uso_edificio,número_departamentos,número_interior,número_exterior));
	}
}
