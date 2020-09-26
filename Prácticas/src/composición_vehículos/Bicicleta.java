package composición_vehículos;

import javax.swing.JOptionPane;

public class Bicicleta
{
	public static String uso,tipo_bici,tipo_freno;
	public static int num_velocidades, num_nivel_cadena;
	public static Llantas círculo = new Llantas();
	public static Estructura datos = new Estructura();
	public static Tipo persona = new Tipo();
	public Bicicleta(String uso,String tipo_bici, String tipo_freno,int num_velocidades,int num_nivel_cadena,Llantas círculo,Estructura datos,Tipo persona)
	{
		super();
		this.uso = uso;
		this.tipo_bici = tipo_bici;
		this.tipo_freno = tipo_freno;
		this.num_velocidades = num_velocidades;
		this.num_nivel_cadena = num_nivel_cadena;
		this.círculo = círculo;
		this.datos = datos;
		this.persona = persona;
	}
	
	public static String getUso() {
		return uso;
	}

	public static void setUso(String uso) {
		Bicicleta.uso = uso;
	}

	public static String getTipo_bici() {
		return tipo_bici;
	}

	public static void setTipo_bici(String tipo_bici) {
		Bicicleta.tipo_bici = tipo_bici;
	}

	public static String getTipo_freno() {
		return tipo_freno;
	}

	public static void setTipo_freno(String tipo_freno) {
		Bicicleta.tipo_freno = tipo_freno;
	}

	public static int getNum_velocidades() {
		return num_velocidades;
	}

	public static void setNum_velocidades(int num_velocidades) {
		Bicicleta.num_velocidades = num_velocidades;
	}

	public static int getNum_nivel_cadena() {
		return num_nivel_cadena;
	}

	public static void setNum_nivel_cadena(int num_nivel_cadena) {
		Bicicleta.num_nivel_cadena = num_nivel_cadena;
	}

	public static Llantas getCírculo() {
		return círculo;
	}

	public static void setCírculo(Llantas círculo) {
		Bicicleta.círculo = círculo;
	}

	public static Estructura getDatos() {
		return datos;
	}

	public static void setDatos(Estructura datos) {
		Bicicleta.datos = datos;
	}

	public static Tipo getPersona() {
		return persona;
	}

	public static void setPersona(Tipo persona) {
		Bicicleta.persona = persona;
	}

	public static void pedirDatosBicicleta()
	{
		uso = JOptionPane.showInputDialog("Dame el uso que le das a la bici:\n");
		tipo_bici = JOptionPane.showInputDialog("Dame el tipo de bici que tienes (montaña,etc...):\n");
		tipo_freno = JOptionPane.showInputDialog("Dame el tipo de freno que tiene la bici (disco,normal,etc...):\n");
		num_velocidades = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de velocidades que tiene tu bici:\n"));
		num_nivel_cadena = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de velocidades para el nivel de la cadena que tiene tu bici:\n"));
		círculo.pedirDatosLlantas();
		datos.pedirDatosEstructura();
		persona.pedirDatosTipo();
	}
	public static void agregarDatosBicicleta()
	{
		Bicicleta.pedirDatosBicicleta();
		Bicicleta.getCírculo();
		Bicicleta.getDatos();
		Bicicleta.getNum_nivel_cadena();
		Bicicleta.getNum_velocidades();
		Bicicleta.getPersona();
		Bicicleta.getTipo_bici();
		Bicicleta.getTipo_freno();
		Bicicleta.getUso();
		System.out.println(toString(uso,tipo_bici,tipo_freno,num_velocidades,num_nivel_cadena));
	}
	public static String toString(String uso, String tipo_bici, String tipo_freno, int num_velocidades,int num_nivel_cadena)
	{
		return "El uso que le das a la bici es: "+uso+" "+"El tipo de bici es: "+tipo_bici+" "+"El estilo del freno de la bici es: "+tipo_freno+" "+"El número de velocidades de la bici son: "+num_velocidades+" "+"El número de nivel de la cadena son: "+num_nivel_cadena+" "+"La marca de la bicicleta es: "+persona.marca+" "+"El modelo de la bicicleta es: "+persona.modelo+" "+"El color de la bicicleta es: "+datos.color +" "+"El material de la bicicleta es: "+datos.material+" "+"El tamaño de la bicicleta es: "+datos.tamaño+" "+"Las medidas de las llantas son: "+círculo.medida +" "+"El número de llantas son: "+círculo.número;
	}
	public static void consultarDatosBicicleta()
	{
		System.out.println("El uso que le das a la bici es: "+uso+" "+"El tipo de bici es: "+tipo_bici+" "+"El estilo del freno de la bici es: "+tipo_freno+" "+"El número de velocidades de la bici son: "+num_velocidades+" "+"El número de nivel de la cadena son: "+num_nivel_cadena+" "+"La marca de la bicicleta es: "+persona.marca+" "+"El modelo de la bicicleta es: "+persona.modelo+" "+"El color de la bicicleta es: "+datos.color +" "+"El material de la bicicleta es: "+datos.material+" "+"El tamaño de la bicicleta es: "+datos.tamaño+" "+"Las medidas de las llantas son: "+círculo.medida +" "+"El número de llantas son: "+círculo.número);
	}
}