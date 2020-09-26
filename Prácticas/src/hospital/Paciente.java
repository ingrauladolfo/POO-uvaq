package hospital;
import javax.swing.*;

public class Paciente 
{
	public static String nombre, correo, dirección, teléfono,padecimiento,tratamiento,nombre_modificado, correo_modificado,dirección_modificada,padecimiento_modificado, tratamiento_modificado, teléfono_modificado;
	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Paciente.nombre = nombre;
	}

	public static String getCorreo() {
		return correo;
	}

	public static void setCorreo(String correo) {
		Paciente.correo = correo;
	}

	public static String getDirección() {
		return dirección;
	}

	public static void setDirección(String dirección) {
		Paciente.dirección = dirección;
	}

	public static String getTeléfono() {
		return teléfono;
	}

	public static void setTeléfono(String teléfono) {
		Paciente.teléfono = teléfono;
	}

	public static String getPadecimiento() {
		return padecimiento;
	}

	public static void setPadecimiento(String padecimiento) {
		Paciente.padecimiento = padecimiento;
	}

	public static String getTratamiento() {
		return tratamiento;
	}

	public static void setTratamiento(String tratamiento) {
		Paciente.tratamiento = tratamiento;
	}
	
	public static String getNombre_modificado() {
		return nombre_modificado;
	}

	public static void setNombre_modificado(String nombre_modificado) {
		Paciente.nombre_modificado = nombre_modificado;
	}

	public static String getCorreo_modificado() {
		return correo_modificado;
	}

	public static void setCorreo_modificado(String correo_modificado) {
		Paciente.correo_modificado = correo_modificado;
	}

	public static String getDirección_modificada() {
		return dirección_modificada;
	}

	public static void setDirección_modificada(String dirección_modificada) {
		Paciente.dirección_modificada = dirección_modificada;
	}

	public static String getPadecimiento_modificado() {
		return padecimiento_modificado;
	}

	public static void setPadecimiento_modificado(String padecimiento_modificado) {
		Paciente.padecimiento_modificado = padecimiento_modificado;
	}

	public static String getTratamiento_modificado() {
		return tratamiento_modificado;
	}

	public static void setTratamiento_modificado(String tratamiento_modificado) {
		Paciente.tratamiento_modificado = tratamiento_modificado;
	}

	public static String getTeléfono_modificado() {
		return teléfono_modificado;
	}

	public static void setTeléfono_modificado(String teléfono_modificado) {
		Paciente.teléfono_modificado = teléfono_modificado;
	}

	public static void pedirDatos()
	{
		nombre = JOptionPane.showInputDialog("Dame tu nombre: ");
		correo = JOptionPane.showInputDialog("Dame tu correo: ");
		dirección = JOptionPane.showInputDialog("Dame tu dirección: ");
		teléfono = JOptionPane.showInputDialog("Dame tu teléfono: ");
		padecimiento = JOptionPane.showInputDialog("Dame tu padecimiento: ");
		tratamiento = JOptionPane.showInputDialog("Dame tu tratamiento: ");
	}
	
	public static void pedirDatosModificados()
	{
		nombre_modificado = JOptionPane.showInputDialog("Dame tu nombre: ");
		correo_modificado = JOptionPane.showInputDialog("Dame tu correo: ");
		dirección_modificada = JOptionPane.showInputDialog("Dame tu dirección: ");
		teléfono_modificado = JOptionPane.showInputDialog("Dame tu teléfono: ");
		padecimiento_modificado = JOptionPane.showInputDialog("Dame tu padecimiento: ");
		tratamiento_modificado = JOptionPane.showInputDialog("Dame tu nuevo tratamiento: ");
	}
	
	public static void agregarDatosPaciente()
	{
		Paciente.pedirDatos();
		Paciente.getNombre();
		Paciente.getCorreo();
		Paciente.getDirección();
		Paciente.getTeléfono();
		Paciente.getPadecimiento();
		Paciente.getTratamiento();
	}
	
	public static void eliminarDatosPaciente()
	{
		nombre = null;
		correo = null;
		dirección = null;
		teléfono = null;
		padecimiento = null;
		tratamiento = null;
	}
	
	public static void modificarDatosPaciente()
	{
		Paciente.pedirDatosModificados();
		Paciente.getNombre_modificado();
		Paciente.getCorreo_modificado();
		Paciente.getDirección_modificada();
		Paciente.getTeléfono_modificado();
		Paciente.getPadecimiento_modificado();
		Paciente.getTratamiento_modificado();
	}
	
	public static void consultarDatosPaciente()
	{
		Paciente.getNombre();
		Paciente.getCorreo();
		Paciente.getDirección();
		Paciente.getTeléfono();
		Paciente.getPadecimiento();
		Paciente.getTratamiento();
	}
}