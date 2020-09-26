package composición_vehículos;

import javax.swing.JOptionPane;

public class Motocicleta
{
	public static String uso,tipo_moto,tipo_freno;
	public static int num_velocidades,num_asientos,num_cc;
	public static Llantas círculo = new Llantas();
	public static Estructura datos = new Estructura();
	public static Tipo persona = new Tipo();
	public Motocicleta(String uso,String tipo_moto,String tipo_freno,int num_velocidades,int num_asientos,int num_cc,Llantas círculo,Estructura datos,Tipo persona)
	{
		super();
		this.uso = uso;
		this.tipo_moto = tipo_moto;
		this.tipo_freno = tipo_freno;
		this.num_asientos = num_asientos;
		this.num_cc = num_cc;
		this.círculo = círculo;
		this.datos = datos;
		this.persona = persona;
	}
	public static String getUso() {
		return uso;
	}
	public static void setUso(String uso) {
		Motocicleta.uso = uso;
	}
	public static String getTipo_moto() {
		return tipo_moto;
	}
	public static void setTipo_moto(String tipo_moto) {
		Motocicleta.tipo_moto = tipo_moto;
	}
	public static String getTipo_freno() {
		return tipo_freno;
	}
	public static void setTipo_freno(String tipo_freno) {
		Motocicleta.tipo_freno = tipo_freno;
	}
	public static int getNum_velocidades() {
		return num_velocidades;
	}
	public static void setNum_velocidades(int num_velocidades) {
		Motocicleta.num_velocidades = num_velocidades;
	}
	public static int getNum_asientos() {
		return num_asientos;
	}
	public static void setNum_asientos(int num_asientos) {
		Motocicleta.num_asientos = num_asientos;
	}
	public static int getNum_cc() {
		return num_cc;
	}
	public static void setNum_cc(int num_cc) {
		Motocicleta.num_cc = num_cc;
	}
	public static Llantas getCírculo() {
		return círculo;
	}
	public static void setCírculo(Llantas círculo) {
		Motocicleta.círculo = círculo;
	}
	public static Estructura getDatos() {
		return datos;
	}
	public static void setDatos(Estructura datos) {
		Motocicleta.datos = datos;
	}
	public static Tipo getPersona() {
		return persona;
	}
	public static void setPersona(Tipo persona) {
		Motocicleta.persona = persona;
	}
	public static void pedirDatosMotocicleta()
	{
		num_cc = Integer.parseInt(JOptionPane.showInputDialog("Dame los centrímetros cúbicos que tiene tu moto:\n"));
		num_asientos = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de asientos que tiene tu moto:\n"));
		num_velocidades = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de velocidades que tiene tu moto:\n"));
		tipo_freno = JOptionPane.showInputDialog("Dame el tipo de freno que tiene tu moto:\n");
		tipo_moto = JOptionPane.showInputDialog("Dame el tipo que es tu moto:\n");
		uso = JOptionPane.showInputDialog("Dame el uso que le das a la moto:\n");
		círculo.pedirDatosLlantas();
		datos.pedirDatosEstructura();
		persona.pedirDatosTipo();
	}
	public static void agregarDatosMotocicleta()
	{
		Motocicleta.pedirDatosMotocicleta();
		Motocicleta.getCírculo();
		Motocicleta.getDatos();
		Motocicleta.getPersona();
		Motocicleta.getNum_asientos();
		Motocicleta.getNum_cc();
		Motocicleta.getNum_velocidades();
		Motocicleta.getTipo_freno();
		Motocicleta.getUso();
		Motocicleta.getTipo_moto();
		System.out.println(toString(uso,tipo_moto,tipo_freno,num_velocidades,num_cc,num_asientos, círculo, datos, persona));
	}
	public static String toString(String uso, String tipo_moto, String tipo_freno, int num_velocidades,int num_cc,int num_asientos,Llantas círculo,Estructura datos,Tipo persona)
	{
		return "El uso que le das a la moto es: "+uso+" "+"el tipo de moto es: "+tipo_moto+" "+"el estilo del freno de la moto es: "+tipo_freno+" "+"el número de velocidades de la moto son: "+num_velocidades+" "+"los centrímetros cúbicos de la moto son: "+num_cc+" "+"el número de asientos de la moto son: "+num_asientos+" "+"La marca de la motocicleta es: "+persona.marca+" "+"El modelo de la motocicleta: "+persona.modelo+" "+"El color de la motocicleta es: "+datos.color+" "+"El tamaño de la moto es: "+datos.tamaño+" "+"El material de la moto es: "+datos.material+" "+"las medidas de las llantas de la motocicleta son: "+círculo.medida+" "+"El número de llantas de la moto son: "+círculo.número;
	}
	public static void consultarDatosMotocicleta()
	{
		System.out.println("El uso que le das a la moto es: "+uso+" "+"el tipo de moto es: "+tipo_moto+" "+"el estilo del freno de la moto es: "+tipo_freno+" "+"el número de velocidades de la moto son: "+num_velocidades+" "+"los centrímetros cúbicos de la moto son: "+num_cc+" "+"el número de asientos de la moto son: "+num_asientos+" "+"La marca de la motocicleta es: "+persona.marca+" "+"El modelo de la motocicleta: "+persona.modelo+" "+"El color de la motocicleta es: "+datos.color+" "+"El tamaño de la moto es: "+datos.tamaño+" "+"El material de la moto es: "+datos.material+" "+"las medidas de las llantas de la motocicleta son: "+círculo.medida+" "+"El número de llantas de la moto son: "+círculo.número);
	}
}