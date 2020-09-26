package composición_bienesraíces;
import javax.swing.*;
public class Ventana extends Características
{
	public static String acabado_ventana,tipo_ventana,uso_ventana,polarizada,persiana,tornillos,abrir,cerrar;
	public static int número_persianas,número_tornillos;
	public Ventana(String color, String material, int alto, int ancho) 
	{
		super(color, material, alto, ancho);
		this.acabado_ventana = acabado_ventana;
		this.tipo_ventana = tipo_ventana;
		this.uso_ventana = uso_ventana;
		this.polarizada = polarizada;
		this.persiana = persiana;
		this.número_persianas = número_persianas;
		this.tornillos = tornillos;
		this.número_tornillos = número_tornillos;
		this.abrir = abrir;
		this.cerrar = cerrar;
	}
	public static String getAcabado_ventana() {
		return acabado_ventana;
	}
	public static void setAcabado_ventana(String acabado_ventana) {
		Ventana.acabado_ventana = acabado_ventana;
	}
	public static String getTipo_ventana() {
		return tipo_ventana;
	}
	public static void setTipo_ventana(String tipo_ventana) {
		Ventana.tipo_ventana = tipo_ventana;
	}
	public static String getUso_ventana() {
		return uso_ventana;
	}
	public static void setUso_ventana(String uso_ventana) {
		Ventana.uso_ventana = uso_ventana;
	}
	public static String getPolarizada() {
		return polarizada;
	}
	public static void setPolarizada(String polarizada) {
		Ventana.polarizada = polarizada;
	}
	public static String getPersiana() {
		return persiana;
	}
	public static void setPersiana(String persiana) {
		Ventana.persiana = persiana;
	}
	public static String getTornillos() {
		return tornillos;
	}
	public static void setTornillos(String tornillos) {
		Ventana.tornillos = tornillos;
	}
	public static String getAbrir() {
		return abrir;
	}
	public static void setAbrir(String abrir) {
		Ventana.abrir = abrir;
	}
	public static String getCerrar() {
		return cerrar;
	}
	public static void setCerrar(String cerrar) {
		Ventana.cerrar = cerrar;
	}
	public static int getNúmero_persianas() {
		return número_persianas;
	}
	public static void setNúmero_persianas(int número_persianas) {
		Ventana.número_persianas = número_persianas;
	}
	public static int getNúmero_tornillos() {
		return número_tornillos;
	}
	public static void setNúmero_tornillos(int número_tornillos) {
		Ventana.número_tornillos = número_tornillos;
	}
	public static void pedirDatosVentana()
	{
		acabado_ventana = JOptionPane.showInputDialog("Dame el acabado de la ventana:\n");
		tipo_ventana = JOptionPane.showInputDialog("Dame el tipo de la ventana:\n");
		uso_ventana = JOptionPane.showInputDialog("Dame el uso que le das a la ventana:\n");
		polarizada = JOptionPane.showInputDialog("¿Está polarizada la ventana?:\n");
		persiana = JOptionPane.showInputDialog("¿Tiene persianas la ventana?:\n");
		número_persianas = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de persianas que cubre la ventana:\n"));
		tornillos = JOptionPane.showInputDialog("¿Tiene tornillos la ventana?:\n");
		número_tornillos = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de tornillos que tiene la ventana:\n"));
		abrir = JOptionPane.showInputDialog("¿Se puede abrir?:\n");
		cerrar = JOptionPane.showInputDialog("¿Se puede cerrar?:\n");
	}
	public static void agregarDatosVentana()
	{
		Ventana.pedirDatosVentana();
		Ventana.getAcabado_ventana();
		Ventana.getTipo_ventana();
		Ventana.getUso_ventana();
		Ventana.getPolarizada();
		Ventana.getPersiana();
		Ventana.getNúmero_persianas();
		Ventana.getTornillos();
		Ventana.getNúmero_tornillos();
		Ventana.getAbrir();
		Ventana.getCerrar();
		Ventana.pedirDatosCaracterísticas();
		Ventana.agregarDatosCaracterísticas();
	}
	public static String toString(String acabado_ventana,String tipo_ventana,String uso_ventana,String polarizada,String persiana,String tornillos,String abrir,String cerrar,int número_persianas,int número_tornillos)
	{
		return "El acabado de la ventana es: "+ acabado_ventana+" "+"El tipo de ventana es: "+tipo_ventana+" "+"El uso que le das a la ventana es: "+uso_ventana+" "+"¿La ventana está polarizada?: "+polarizada+" "+"¿La ventana tiene persianas?: "+persiana+" "+"¿La ventana tiene tornillos?: "+tornillos+" "+"¿La ventana se abre?: "+abrir+" "+"¿La ventana se cierra?: "+" "+"El número de persianas es: "+número_persianas+" "+"El número de tornillos es: "+número_tornillos;
	}
	public static void consultarDatosVentana()
	{
		Ventana.consultarDatosCaracterísticas();
		System.out.println(toString(acabado_ventana,tipo_ventana,uso_ventana,polarizada,persiana,tornillos,abrir,cerrar,número_persianas,número_tornillos));
	}
}
