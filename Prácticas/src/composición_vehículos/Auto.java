package composición_vehículos;

import javax.swing.JOptionPane;

public class Auto
{
	public static int num_puertas,num_cilindros,num_velocidades, num_ventanas;
	public static Llantas círculo = new Llantas();
	public static Estructura datos = new Estructura();
	public static Tipo persona = new Tipo();
	public Auto(int num_puertas, int num_cilindros, int num_velocidades,Llantas círculo,Estructura datos,Tipo persona)
	{
		this.num_cilindros = num_cilindros;
		this.num_velocidades = num_velocidades;
		this.num_puertas = num_puertas;
		this.círculo = círculo;
		this.datos = datos;
		this.persona = persona;
	}
	public static int getNum_puertas() {
		return num_puertas;
	}

	public static void setNum_puertas(int num_puertas) {
		Auto.num_puertas = num_puertas;
	}

	public static int getNum_cilindros() {
		return num_cilindros;
	}

	public static void setNum_cilindros(int num_cilindros) {
		Auto.num_cilindros = num_cilindros;
	}

	public static int getNum_velocidades() {
		return num_velocidades;
	}

	public static void setNum_velocidades(int num_velocidades) {
		Auto.num_velocidades = num_velocidades;
	}
	public static int getNum_ventanas() {
		return num_ventanas;
	}
	public static void setNum_ventanas(int num_ventanas) {
		Auto.num_ventanas = num_ventanas;
	}
	public static Llantas getCírculo() {
		return círculo;
	}
	public static void setCírculo(Llantas círculo) {
		Auto.círculo = círculo;
	}
	public static Estructura getDatos() {
		return datos;
	}
	public static void setDatos(Estructura datos) {
		Auto.datos = datos;
	}
	public static Tipo getPersona() {
		return persona;
	}
	public static void setPersona(Tipo persona) {
		Auto.persona = persona;
	}
	public static void pedirDatosAuto()
	{
		num_puertas = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de puertas del carro:\n"));
		num_cilindros = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de cilindros del carro:\n"));
		num_velocidades = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de velocidades del carro:\n"));
		num_ventanas = Integer.parseInt(JOptionPane.showInputDialog("Dame el número de ventanas del carro:\n"));
		círculo.pedirDatosLlantas();
		datos.pedirDatosEstructura();
		persona.pedirDatosTipo();
	}
	public static void agregarDatosAuto()
	{
		Auto.pedirDatosAuto();
		Auto.getNum_puertas();
		Auto.getNum_cilindros();
		Auto.getNum_velocidades();
		Auto.getNum_ventanas();
		Auto.getCírculo();
		Auto.getDatos();
		Auto.getPersona();
		System.out.println(toString(num_puertas,num_cilindros,num_velocidades,num_ventanas, círculo, datos, persona));
	}
	public static String toString(int num_puertas,int num_cilindros,int num_velocidades,int num_ventanas,Llantas círculo,Estructura datos,Tipo persona)
	{
		return "El número de puertas del carro es: "+num_puertas+" "+"El número de cilindros del carro es: "+num_cilindros+" "+"El número de velocidades del carro es: "+num_velocidades+" "+"El número de ventanas son: "+num_ventanas+" "+"La marca del carro es: "+ persona.marca+" "+ "El modelo del auto es: "+persona.modelo+" "+"El color del auto es: "+datos.color + " "+"El material del carro es: "+datos.material+" "+"El tamaño del carro es: "+datos.tamaño+" "+"Las medidas de las llantas son: "+círculo.medida +" "+"El número de las llantas son: "+círculo.número;
	}
	public static void consultarDatosAuto()
	{
		Auto.getNum_puertas();
		Auto.getNum_cilindros();
		Auto.getNum_velocidades();
		Auto.getNum_ventanas();
		Auto.getCírculo();
		Auto.getDatos();
		Auto.getPersona();
		System.out.println("El número de puertas del carro es: "+num_puertas+" "+"El número de cilindros del carro es: "+num_cilindros+" "+"El número de velocidades del carro es: "+num_velocidades+" "+"El número de ventanas son: "+num_ventanas+" "+"La marca del carro es: "+ persona.marca+" "+ "El modelo del auto es: "+persona.modelo+" "+"El color del auto es: "+datos.color + " "+"El material del carro es: "+datos.material+" "+"El tamaño del carro es: "+datos.tamaño+" "+"Las medidas de las llantas son: "+círculo.medida +" "+"El número de las llantas son: "+círculo.número);
	}
}