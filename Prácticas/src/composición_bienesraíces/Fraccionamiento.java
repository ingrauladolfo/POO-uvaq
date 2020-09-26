package composición_bienesraíces;

import javax.swing.JOptionPane;

public class Fraccionamiento extends Edificio
{
	public static String área_recreativa,tienda,acceso_vehicular,acceso_peatonal,alumbrado;
	public static int número_accesovehicular,número_accesopeatonal,número_árearecreativa,número_tienda,número_alumbrado;
	public Fraccionamiento(String color, String material, int alto, int ancho) 
	{
		super(color, material, alto, ancho);
		this.área_recreativa = área_recreativa;
		this.tienda = tienda;
		this.acceso_vehicular = acceso_vehicular;
		this.acceso_peatonal = acceso_peatonal;
		this.alumbrado = alumbrado;
		this.número_accesovehicular = número_accesovehicular;
		this.número_accesopeatonal = número_accesopeatonal;
		this.número_alumbrado = número_alumbrado;
		this.número_árearecreativa = número_árearecreativa;
		this.número_tienda = número_tienda;
		this.número_alumbrado = número_alumbrado;
	}
	public static String getÁrea_recreativa() {
		return área_recreativa;
	}
	public static void setÁrea_recreativa(String área_recreativa) {
		Fraccionamiento.área_recreativa = área_recreativa;
	}
	public static String getTienda() {
		return tienda;
	}
	public static void setTienda(String tienda) {
		Fraccionamiento.tienda = tienda;
	}
	public static String getAcceso_vehicular() {
		return acceso_vehicular;
	}
	public static void setAcceso_vehicular(String acceso_vehicular) {
		Fraccionamiento.acceso_vehicular = acceso_vehicular;
	}
	public static String getAcceso_peatonal() {
		return acceso_peatonal;
	}
	public static void setAcceso_peatonal(String acceso_peatonal) {
		Fraccionamiento.acceso_peatonal = acceso_peatonal;
	}
	public static String getAlumbrado() {
		return alumbrado;
	}
	public static void setAlumbrado(String alumbrado) {
		Fraccionamiento.alumbrado = alumbrado;
	}
	public static int getNúmero_accesovehicular() {
		return número_accesovehicular;
	}
	public static void setNúmero_accesovehicular(int número_accesovehicular) {
		Fraccionamiento.número_accesovehicular = número_accesovehicular;
	}
	public static int getNúmero_accesopeatonal() {
		return número_accesopeatonal;
	}
	public static void setNúmero_accesopeatonal(int número_accesopeatonal) {
		Fraccionamiento.número_accesopeatonal = número_accesopeatonal;
	}
	public static int getNúmero_árearecreativa() {
		return número_árearecreativa;
	}
	public static void setNúmero_árearecreativa(int número_árearecreativa) {
		Fraccionamiento.número_árearecreativa = número_árearecreativa;
	}
	public static int getNúmero_tienda() {
		return número_tienda;
	}
	public static void setNúmero_tienda(int número_tienda) {
		Fraccionamiento.número_tienda = número_tienda;
	}
	public static int getNúmero_alumbrado() {
		return número_alumbrado;
	}
	public static void setNúmero_alumbrado(int número_alumbrado) {
		Fraccionamiento.número_alumbrado = número_alumbrado;
	}
	public static void pedirDatosFraccionamiento()
	{
		área_recreativa = JOptionPane.showInputDialog("¿Cuenta con área recreativa el fraccionamiento?:\n");
		tienda = JOptionPane.showInputDialog("¿Cuenta con tienda el fraccionamiento?:\n");
		acceso_vehicular = JOptionPane.showInputDialog("¿Cuenta con acceso vehicular el fraccionamiento?:\n");
		acceso_peatonal = JOptionPane.showInputDialog("¿Cuenta con acceso peatonal el fraccionamiento?:\n");
		alumbrado = JOptionPane.showInputDialog("¿Cuenta con alumbrado el fraccionamiento?:\n");
		número_accesovehicular = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos accesos vehiculares tiene el fraccionamiento?:\n"));
		número_accesopeatonal = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos accesos peatonales tiene el fraccionamiento?:\n"));
		número_árearecreativa = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas áreas recreativas tiene el fraccionamiento?:\n"));
		número_tienda = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas tiendas tiene el fraccionamiento?:\n"));
		número_alumbrado = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos alumbrados tiene el fraccionamiento?:\n"));
	}
	public static void agregarDatosFraccionamiento()
	{
		Edificio.agregarDatosEdificio();
		Fraccionamiento.pedirDatosFraccionamiento();
		Fraccionamiento.getÁrea_recreativa();
		Fraccionamiento.getTienda();
		Fraccionamiento.getAcceso_vehicular();
		Fraccionamiento.getAcceso_peatonal();
		Fraccionamiento.getAlumbrado();
		Fraccionamiento.getNúmero_accesovehicular();
		Fraccionamiento.getNúmero_accesopeatonal();
		Fraccionamiento.getNúmero_tienda();
		Fraccionamiento.getNúmero_árearecreativa();
		Fraccionamiento.getNúmero_alumbrado();
	}
	public static String toString(String área_recreativa,String tienda,String acceso_vehicular,String acceso_peatonal,String alumbrado,int número_accesovehicular,int número_accesopeatonal,int número_tienda,int número_árearecreativa, int número_alumbrado)
	{
		return "¿El fraccionamiento tiene área recreativa?: "+área_recreativa+" "+"¿El fraccionamiento tiene tienda?: "+tienda+" "+"¿El fraccionamiento tiene acceso vehicular?: "+acceso_vehicular+" "+"¿El fraccionamiento tiene acceso peatonal?: "+acceso_peatonal+" "+"¿El fraccionamiento tiene alumbrado?: "+alumbrado+" "+"El número de accesos vehiculares son: "+número_accesovehicular+" "+"El número de accesos peatonales es: "+número_accesopeatonal+" "+"El número de tienditas es: "+número_tienda+" "+"El número de áreas recreativas es: "+número_árearecreativa+" "+"El número de alumbrado es: "+número_alumbrado;
	}
	public static void consultarDatosFraccionamiento()
	{
		consultarDatosEdificio();
		System.out.println(toString(área_recreativa,tienda,acceso_vehicular,acceso_peatonal,alumbrado,número_accesovehicular,número_accesopeatonal,número_árearecreativa,número_tienda,número_alumbrado));
	}
}
