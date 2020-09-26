package composición_bienesraíces;

import javax.swing.JOptionPane;

public class Casa extends Puerta
{
	public static String sala,cocina,estudio,garage,patio,baño,recámara,uso_casa;
	public static int número_recámaras,número_baños,número_patio,carros_garage;
	static int número_puertas;
	public Casa(String color, String material, int alto, int ancho)
	{
		super(color, material, alto, ancho);
		this.sala = sala;
		this.cocina = cocina;
		this.estudio = estudio;
		this.garage = garage;
		this.patio = patio;
		this.baño = baño;
		this.recámara = recámara;
		this.uso_casa = uso_casa;
		this.número_recámaras = número_recámaras;
		this.número_baños = número_baños;
		this.número_patio = número_patio;
		this.carros_garage = carros_garage;
	}
	public static String getSala() {
		return sala;
	}
	public static void setSala(String sala) {
		Casa.sala = sala;
	}
	public static String getCocina() {
		return cocina;
	}
	public static void setCocina(String cocina) {
		Casa.cocina = cocina;
	}
	public static String getEstudio() {
		return estudio;
	}
	public static void setEstudio(String estudio) {
		Casa.estudio = estudio;
	}
	public static String getGarage() {
		return garage;
	}
	public static void setGarage(String garage) {
		Casa.garage = garage;
	}
	public static String getPatio() {
		return patio;
	}
	public static void setPatio(String patio) {
		Casa.patio = patio;
	}
	public static String getBaño() {
		return baño;
	}
	public static void setBaño(String baño) {
		Casa.baño = baño;
	}
	public static String getRecámara() {
		return recámara;
	}
	public static void setRecámara(String recámara) {
		Casa.recámara = recámara;
	}
	public static int getNúmero_recámaras() {
		return número_recámaras;
	}
	public static void setNúmero_recámaras(int número_recámaras) {
		Casa.número_recámaras = número_recámaras;
	}
	public static int getNúmero_baños() {
		return número_baños;
	}
	public static void setNúmero_baños(int número_baños) {
		Casa.número_baños = número_baños;
	}
	public static int getNúmero_patio() {
		return número_patio;
	}
	public static void setNúmero_patio(int número_patio) {
		Casa.número_patio = número_patio;
	}
	public static int getCarros_garage() {
		return carros_garage;
	}
	public static void setCarros_garage(int carros_garage) {
		Casa.carros_garage = carros_garage;
	}
	public static int getNúmero_puertas() {
		return número_puertas;
	}
	public static void setNúmero_puertas(int número_puertas) {
		Casa.número_puertas = número_puertas;
	}
	public static String getUso_casa() {
		return uso_casa;
	}
	public static void setUso_casa(String uso_casa) {
		Casa.uso_casa = uso_casa;
	}
	public static void pedirDatosCasa()
	{
		sala = JOptionPane.showInputDialog("¿Tiene sala?:\n");
		cocina = JOptionPane.showInputDialog("¿Tiene cocina?:\n");
		estudio = JOptionPane.showInputDialog("¿Tiene estudio?:\n");
		garage = JOptionPane.showInputDialog("¿Tiene garage?:\n");
		patio = JOptionPane.showInputDialog("¿Tiene patio?:\n");
		recámara = JOptionPane.showInputDialog("¿Tiene recámara?:\n");
		uso_casa = JOptionPane.showInputDialog("¿Qué uso le das a la casa?:\n");
		número_recámaras = Integer.parseInt(JOptionPane.showInputDialog("Número de recámaras:\n"));
		número_baños = Integer.parseInt(JOptionPane.showInputDialog("Número de baños:\n"));
		número_patio = Integer.parseInt(JOptionPane.showInputDialog("Número de patios:\n"));
		carros_garage = Integer.parseInt(JOptionPane.showInputDialog("Número de carros en su garage:\n"));
	}
	public static void agregarDatosCasa()
	{
		Puerta.agregarDatosPuerta();
		Ventana.agregarDatosVentana();
		Casa.pedirDatosCasa();
		Casa.getSala();
		Casa.getCocina();
		Casa.getEstudio();
		Casa.getGarage();
		Casa.getPatio();
		Casa.getRecámara();
		Casa.getNúmero_baños();
		Casa.getNúmero_patio();
		Casa.getCarros_garage();
		Casa.getUso_casa();
	}
	public static String toString(String sala,String cocina,String estudio,String garage,String patio,String recámara,String uso_casa,int número_baños,int número_patio,int carros_garage)
	{
		return "¿Tiene sala?: "+sala+" "+"¿Tiene cocina?: "+cocina+" "+"¿Tiene estudio?: "+estudio+" "+"¿Tiene garage?: "+garage+" "+"¿Tiene patio?: "+patio+" "+"¿Tiene recámaras?: "+recámara+" "+"El número de baños es: "+número_baños+" "+"El número de patios es: "+número_patio+" "+"El máximo número de carros en el garage es: "+carros_garage+" "+"El uso de la casa es: "+uso_casa;
	}
	public static void consultarDatosCasa()
	{
		Puerta.consultarDatosPuerta();
		Ventana.consultarDatosVentana();
		System.out.println(toString(sala,cocina,estudio,garage,patio,recámara,uso_casa,número_baños,número_patio,carros_garage));
	}
}
