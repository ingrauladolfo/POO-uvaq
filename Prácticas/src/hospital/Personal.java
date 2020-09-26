package hospital;
import javax.swing.*;

public class Personal
{
	public static String nombre, correo, dirección, puesto, salario,teléfono, nombre_modificado, correo_modificado,dirección_modificada,puesto_modificado, salario_modificado, teléfono_modificado;
	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Personal.nombre = nombre;
	}

	public static String getCorreo() {
		return correo;
	}

	public static void setCorreo(String correo) {
		Personal.correo = correo;
	}

	public static String getDirección() {
		return dirección;
	}

	public static void setDirección(String dirección) {
		Personal.dirección = dirección;
	}

	public static String getPuesto() {
		return puesto;
	}

	public static void setPuesto(String puesto) {
		Personal.puesto = puesto;
	}

	public static String getSalario() {
		return salario;
	}

	public static void setSalario(String salario) {
		Personal.salario = salario;
	}

	public static String getTeléfono() {
		return teléfono;
	}

	public static void setTeléfono(String teléfono) {
		Personal.teléfono = teléfono;
	}
	
	public static String getNombre_modificado() {
		return nombre_modificado;
	}

	public static void setNombre_modificado(String nombre_modificado) {
		Personal.nombre_modificado = nombre_modificado;
	}

	public static String getCorreo_modificado() {
		return correo_modificado;
	}

	public static void setCorreo_modificado(String correo_modificado) {
		Personal.correo_modificado = correo_modificado;
	}

	public static String getDirección_modificada() {
		return dirección_modificada;
	}

	public static void setDirección_modificada(String dirección_modificada) {
		Personal.dirección_modificada = dirección_modificada;
	}

	public static String getPuesto_modificado() {
		return puesto_modificado;
	}

	public static void setPuesto_modificado(String puesto_modificado) {
		Personal.puesto_modificado = puesto_modificado;
	}

	public static String getSalario_modificado() {
		return salario_modificado;
	}

	public static void setSalario_modificado(String salario_modificado) {
		Personal.salario_modificado = salario_modificado;
	}

	public static String getTeléfono_modificado() {
		return teléfono_modificado;
	}

	public static void setTeléfono_modificado(String teléfono_modificado) {
		Personal.teléfono_modificado = teléfono_modificado;
	}

	public static void pedirDatos()
	{
		nombre = JOptionPane.showInputDialog("Dame tu nombre: ");
		correo = JOptionPane.showInputDialog("Dame tu correo: ");
		dirección = JOptionPane.showInputDialog("Dame tu dirección: ");
		teléfono = JOptionPane.showInputDialog("Dame tu teléfono: ");
		puesto = JOptionPane.showInputDialog("Dame tu puesto: ");
		salario = JOptionPane.showInputDialog("Dame tu salario: ");
	}
	public static void pedirDatosModificados()
	{
		nombre_modificado = JOptionPane.showInputDialog("Dame tu nombre: ");
		correo_modificado = JOptionPane.showInputDialog("Dame tu correo: ");
		dirección_modificada = JOptionPane.showInputDialog("Dame tu dirección: ");
		teléfono_modificado = JOptionPane.showInputDialog("Dame tu teléfono: ");
		puesto_modificado = JOptionPane.showInputDialog("Dame tu nuevo puesto: ");
		salario_modificado = JOptionPane.showInputDialog("Dame tu nuevo salario: ");
	}
	public static void agregarDatosPersonal()
	{
		Personal.pedirDatos();
		Personal.getNombre();
		Personal.getCorreo();
		Personal.getDirección();
		Personal.getTeléfono();
		Personal.getPuesto();
		Personal.getSalario();
	}
	public static void eliminarDatosPersonal()
	{
		nombre = null;
		correo = null;
		dirección = null;
		teléfono = null;
		puesto = null;
		salario = null;
	}
	public static void modificarDatosPersonal()
	{
		Personal.pedirDatosModificados();
		Personal.getNombre_modificado();
		Personal.getCorreo_modificado();
		Personal.getDirección_modificada();
		Personal.getTeléfono_modificado();
		Personal.getPuesto_modificado();
		Personal.getSalario_modificado();
	}
	public static void consultarDatosPersonal()
	{
		Personal.getNombre();
		Personal.getCorreo();
		Personal.getDirección();
		Personal.getTeléfono();
		Personal.getPuesto();
		Personal.getSalario();
	}
}