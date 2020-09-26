package composición_vehículos;

import javax.swing.JOptionPane;

public class Triciclo 
{
	public static String uso,tipo_triciclo,t_canasta,t_manubrio;
	public static int num_canasta;
	public static Llantas círculo = new Llantas();
	public static Estructura datos = new Estructura();
	public static Tipo persona = new Tipo();
	public Triciclo()
	{
		super();
		this.uso = uso;
		this.tipo_triciclo = tipo_triciclo;
		this.t_canasta = t_canasta;
		this.t_manubrio = t_manubrio;
		this.num_canasta = num_canasta;
		this.círculo = círculo;
		this.datos = datos;
		this.persona = persona;
	}
	public static String getUso() {
		return uso;
	}
	public static void setUso(String uso) {
		Triciclo.uso = uso;
	}
	public static String getTipo_triciclo() {
		return tipo_triciclo;
	}
	public static void setTipo_triciclo(String tipo_triciclo) {
		Triciclo.tipo_triciclo = tipo_triciclo;
	}
	public static String getT_canasta() {
		return t_canasta;
	}
	public static void setT_canasta(String t_canasta) {
		Triciclo.t_canasta = t_canasta;
	}
	public static String getT_manubrio() {
		return t_manubrio;
	}
	public static void setT_manubrio(String t_manubrio) {
		Triciclo.t_manubrio = t_manubrio;
	}
	public static int getNum_canasta() {
		return num_canasta;
	}
	public static void setNum_canasta(int num_canasta) {
		Triciclo.num_canasta = num_canasta;
	}
	public static Llantas getCírculo() {
		return círculo;
	}
	public static void setCírculo(Llantas círculo) {
		Triciclo.círculo = círculo;
	}
	public static Estructura getDatos() {
		return datos;
	}
	public static void setDatos(Estructura datos) {
		Triciclo.datos = datos;
	}
	public static Tipo getPersona() {
		return persona;
	}
	public static void setPersona(Tipo persona) {
		Triciclo.persona = persona;
	}
	public static void pedirDatosTriciclo()
	{
		uso = JOptionPane.showInputDialog("Dame el uso que le das a tu triciclo:\n");
		tipo_triciclo = JOptionPane.showInputDialog("Dame el tipo de triciclo al cual pertenece:\n");
		t_canasta = JOptionPane.showInputDialog("¿El triciclo tiene canasta?:\n");
		num_canasta = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de canastas que tiene:\n"));
		t_manubrio = JOptionPane.showInputDialog("¿El triciclo tiene manubrio?:\n");
		círculo.pedirDatosLlantas();
		datos.pedirDatosEstructura();
		persona.pedirDatosTipo();
	}
	public static void agregarDatosTriciclo()
	{
		Triciclo.pedirDatosTriciclo();
		Triciclo.getNum_canasta();
		Triciclo.getT_canasta();
		Triciclo.getUso();
		Triciclo.getT_manubrio();
		Triciclo.getTipo_triciclo();
		Triciclo.getCírculo();
		Triciclo.getDatos();
		Triciclo.getPersona();
		System.out.println(toString(uso,t_canasta,num_canasta,tipo_triciclo,t_manubrio,círculo,datos,persona));
	}
	public static String toString(String uso,String t_canasta,int num_canasta,String tipo_triciclo,String t_manubrio, Llantas círculo,Estructura datos,Tipo persona)
	{
		return "El uso que le das al triciclo es: "+uso+" "+"¿El triciclo tiene canasta? :"+t_canasta+" "+"El número de canastas que tiene el triciclo son: "+num_canasta+" "+"¿El triciclo tiene manubrio?: "+t_manubrio+" "+"El tipo de triciclo es: "+tipo_triciclo+" "+"La marca del triciclo es: "+persona.marca+" "+"El modelo del triciclo es: "+persona.modelo+" "+"El color del triciclo es: "+datos.color+" "+"El tamaño del triciclo es: "+datos.tamaño+" "+"El material del triciclo es: "+datos.material+"las medidas de las llantas del triciclo son: "+círculo.medida+" "+"El número de llantas del triciclo son: "+círculo.número;
	}
	public static void consultarDatosTriciclo()
	{
		System.out.println("El uso que le das al triciclo es: "+uso+" "+"¿El triciclo tiene canasta? :"+t_canasta+" "+"El número de canastas que tiene el triciclo son: "+num_canasta+" "+"¿El triciclo tiene manubrio?: "+t_manubrio+" "+"El tipo de triciclo es: "+tipo_triciclo+" "+"La marca del triciclo es: "+persona.marca+" "+"El modelo del triciclo es: "+persona.modelo+" "+"El color del triciclo es: "+datos.color+" "+"El tamaño del triciclo es: "+datos.tamaño+" "+"El material del triciclo es: "+datos.material+"las medidas de las llantas del triciclo son: "+círculo.medida+" "+"El número de llantas del triciclo son: "+círculo.número);
	}
}
