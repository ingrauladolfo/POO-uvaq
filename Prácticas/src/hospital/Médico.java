package hospital;
import javax.swing.*;

public class Médico 
{
	public static String nombre, correo, dirección, especialidad, cédula,teléfono, nombre_modificado, correo_modificado,dirección_modificada,especialidad_modificada, cédula_modificada, teléfono_modificado;
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Médico.nombre = nombre;
	}
	public static String getCorreo() {
		return correo;
	}
	public static void setCorreo(String correo) {
		Médico.correo = correo;
	}
	public static String getDirección() {
		return dirección;
	}
	public static void setDirección(String dirección) {
		Médico.dirección = dirección;
	}
	public static String getEspecialidad() {
		return especialidad;
	}
	public static void setEspecialidad(String especialidad) {
		Médico.especialidad = especialidad;
	}
	public static String getCédula() {
		return cédula;
	}
	public static void setCédula(String cédula) {
		Médico.cédula = cédula;
	}
	public static String getTeléfono() {
		return teléfono;
	}
	public static void setTeléfono(String teléfono) {
		Médico.teléfono = teléfono;
	}
	
	public static String getNombre_modificado() {
		return nombre_modificado;
	}
	public static void setNombre_modificado(String nombre_modificado) {
		Médico.nombre_modificado = nombre_modificado;
	}
	public static String getCorreo_modificado() {
		return correo_modificado;
	}
	public static void setCorreo_modificado(String correo_modificado) {
		Médico.correo_modificado = correo_modificado;
	}
	public static String getDirección_modificada() {
		return dirección_modificada;
	}
	public static void setDirección_modificada(String dirección_modificada) {
		Médico.dirección_modificada = dirección_modificada;
	}
	public static String getEspecialidad_modificada() {
		return especialidad_modificada;
	}
	public static void setEspecialidad_modificada(String especialidad_modificada) {
		Médico.especialidad_modificada = especialidad_modificada;
	}
	public static String getCédula_modificada() {
		return cédula_modificada;
	}
	public static void setCédula_modificada(String cédula_modificada) {
		Médico.cédula_modificada = cédula_modificada;
	}
	public static String getTeléfono_modificado() {
		return teléfono_modificado;
	}
	public static void setTeléfono_modificado(String teléfono_modificado) {
		Médico.teléfono_modificado = teléfono_modificado;
	}
	public static void pedirDatos()
	{
		nombre = JOptionPane.showInputDialog("Dame tu nombre: ");
		correo = JOptionPane.showInputDialog("Dame tu correo: ");
		dirección = JOptionPane.showInputDialog("Dame tu dirección: ");
		teléfono = JOptionPane.showInputDialog("Dame tu teléfono: ");
		cédula = JOptionPane.showInputDialog("Dame tu cédula: ");
		especialidad = JOptionPane.showInputDialog("Dame tu especialidad: ");
	}
	public static void pedirDatosModificados()
	{
		nombre_modificado = JOptionPane.showInputDialog("Dame tu nombre: ");
		correo_modificado = JOptionPane.showInputDialog("Dame tu correo: ");
		dirección_modificada = JOptionPane.showInputDialog("Dame tu dirección: ");
		teléfono_modificado = JOptionPane.showInputDialog("Dame tu teléfono: ");
		cédula_modificada = JOptionPane.showInputDialog("Dame tu cédula: ");
		especialidad_modificada = JOptionPane.showInputDialog("Dame tu especialidad: ");
	}
	public static void agregarDatosMédico()
	{
		Médico.pedirDatos();
		Médico.getNombre();
		Médico.getCorreo();
		Médico.getDirección();
		Médico.getTeléfono();
		Médico.getCédula();
		Médico.getEspecialidad();
	}
	public static void eliminarDatosMédico()
	{
		nombre = null;
		correo = null;
		dirección = null;
		teléfono = null;
		cédula = null;
		especialidad = null;
	}
	public static void modificarDatosMédico()
	{
		Médico.pedirDatos();
		Médico.getNombre_modificado();
		Médico.getCorreo_modificado();
		Médico.getDirección_modificada();
		Médico.getTeléfono_modificado();
		Médico.getCédula_modificada();
		Médico.getEspecialidad_modificada();
	}
	public static void consultarDatosMédico()
	{
		
	}
	
}