package composición_bienesraíces;
import javax.swing.*;

public class Puerta extends Características
{
	public static String tipo_puerta,uso_puerta,acabado_puerta,espejos,visagras,abrir,cerrar,perilla,estilo_perilla,mosquitero;
	public static int número_espejos,número_visagras,número_perillas,número_puertas;
	public Puerta(String color,String material,int alto,int ancho)
	{
		super(color,material,alto,ancho);
		this.tipo_puerta = tipo_puerta;
		this.uso_puerta = uso_puerta;
		this.acabado_puerta = acabado_puerta;
		this.espejos = espejos;
		this.visagras = visagras;
		this.abrir = abrir;
		this.cerrar = cerrar;
		this.perilla = perilla;
		this.estilo_perilla = estilo_perilla;
		this.mosquitero = mosquitero;
		this.número_puertas = número_puertas;
	}
	public static String getTipo_puerta() {
		return tipo_puerta;
	}
	public static void setTipo_puerta(String tipo_puerta) {
		Puerta.tipo_puerta = tipo_puerta;
	}
	public static String getUso_puerta() {
		return uso_puerta;
	}
	public static void setUso_puerta(String uso_puerta) {
		Puerta.uso_puerta = uso_puerta;
	}
	public static String getAcabado_puerta() {
		return acabado_puerta;
	}
	public static void setAcabado_puerta(String acabado_puerta) {
		Puerta.acabado_puerta = acabado_puerta;
	}
	public static String getEspejos() {
		return espejos;
	}
	public static void setEspejos(String espejos) {
		Puerta.espejos = espejos;
	}
	public static String getVisagras() {
		return visagras;
	}
	public static void setVisagras(String visagras) {
		Puerta.visagras = visagras;
	}
	public static String getAbrir() {
		return abrir;
	}
	public static void setAbrir(String abrir) {
		Puerta.abrir = abrir;
	}
	public static String getCerrar() {
		return cerrar;
	}
	public static void setCerrar(String cerrar) {
		Puerta.cerrar = cerrar;
	}
	public static String getPerilla() {
		return perilla;
	}
	public static void setPerilla(String perilla) {
		Puerta.perilla = perilla;
	}
	public static String getEstilo_perilla() {
		return estilo_perilla;
	}
	public static void setEstilo_perilla(String estilo_perilla) {
		Puerta.estilo_perilla = estilo_perilla;
	}
	public static String getMosquitero() {
		return mosquitero;
	}
	public static void setMosquitero(String mosquitero) {
		Puerta.mosquitero = mosquitero;
	}
	public static int getNúmero_espejos() {
		return número_espejos;
	}
	public static void setNúmero_espejos(int número_espejos) {
		Puerta.número_espejos = número_espejos;
	}
	public static int getNúmero_visagras() {
		return número_visagras;
	}
	public static void setNúmero_visagras(int número_visagras) {
		Puerta.número_visagras = número_visagras;
	}
	public static int getNúmero_perillas() {
		return número_perillas;
	}
	public static void setNúmero_perillas(int número_perillas) {
		Puerta.número_perillas = número_perillas;
	}
	public static void pedirDatosPuerta()
	{
		tipo_puerta = JOptionPane.showInputDialog("Dame el tipo de puerta (corrediza, normal, doble puerta,etc..):\n");
		uso_puerta = JOptionPane.showInputDialog("Dame el uso que le das a la puerta (clóset,carro,oficina, etc...):\n");
		acabado_puerta = JOptionPane.showInputDialog("Dame el acabado de puerta (rústico, moderno,etc...):\n");
		espejos = JOptionPane.showInputDialog("¿Tiene espejos?:\n");
		número_espejos = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de espejos:\n"));
		visagras = JOptionPane.showInputDialog("¿Tiene visagras?:\n");
		número_visagras = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de visagras:\n"));
		abrir = JOptionPane.showInputDialog("Forma en la que se abre la puerta (motorizado (arriba y abajo), adentro, afuera, por ambos lados):\n");
		cerrar = JOptionPane.showInputDialog("Forma en la que se cierra la puerta (motorizado (arriba y abajo), adentro, afuera, por ambos lados):\n");
		perilla = JOptionPane.showInputDialog("¿Tiene perilla?:\n");
		estilo_perilla = JOptionPane.showInputDialog("Dame el estilo de la perilla (redonda, cuadrada,etc..):\n");
		número_perillas = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de perillas:\n"));
		mosquitero = JOptionPane.showInputDialog("¿Tiene mosquitero?:\n");
	}
	public static void agregarDatosPuerta()
	{
		Puerta.pedirDatosPuerta();
		Puerta.pedirDatosCaracterísticas();
		Puerta.getTipo_puerta();
		Puerta.getUso_puerta();
		Puerta.getAcabado_puerta();
		Puerta.getEspejos();
		Puerta.getNúmero_espejos();
		Puerta.getVisagras();
		Puerta.getNúmero_visagras();
		Puerta.getAbrir();
		Puerta.getCerrar();
		Puerta.getPerilla();
		Puerta.getEstilo_perilla();
		Puerta.getNúmero_perillas();
		Puerta.getMosquitero();
		Puerta.agregarDatosCaracterísticas();
	}
	public static String toString(String tipo_puerta, String uso_puerta,String acabado_puerta,String espejos,String visagras,String abrir,String cerrar,String perilla,String estilo_perilla,String mosquitero,int número_espejos,int número_visagras,int número_perillas)
	{
		return "El tipo de puerta es: "+tipo_puerta+" "+"El uso de la puerta es:"+uso_puerta+" "+"El acabado de la puerta es: "+acabado_puerta+" "+"¿Tiene espejos?: "+espejos+" "+"El número de espejos es: "+número_espejos+" "+"¿Tiene visagras?"+visagras+" "+"El número de visagras son: "+número_visagras+" "+"La forma de abrir es: "+abrir+" "+"La forma de cerrar es: "+" "+"¿Tiene perilla?: "+perilla+" "+"El estilo de la perilla es: "+estilo_perilla+" "+"El número de perillas es: "+número_perillas;
	}
	public static void consultarDatosPuerta()
	{
		System.out.println(toString(tipo_puerta, uso_puerta, acabado_puerta, espejos, visagras, abrir, cerrar, perilla, estilo_perilla, mosquitero, número_espejos, número_visagras, número_perillas));
		Puerta.consultarDatosCaracterísticas();
	}
}