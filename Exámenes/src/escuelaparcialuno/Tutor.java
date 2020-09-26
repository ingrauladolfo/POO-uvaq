package escuelaparcialuno;

import javax.swing.*;

public class Tutor extends DatosGenerales
{
	public static String celular,mail;
	public Tutor(String nombre, String dirección) 
	{
		super(nombre, dirección);
		this.celular = celular;
		this.mail = mail;
	}
	public static String getCelular() {
		return celular;
	}
	public static void setCelular(String celular) {
		Tutor.celular = celular;
	}
	public static String getMail() {
		return mail;
	}
	public static void setMail(String mail) {
		Tutor.mail = mail;
	}
	public static void pedirDatosTutor()
	{
		nombre = JOptionPane.showInputDialog("Dame tu nombre:\n");
		dirección = JOptionPane.showInputDialog("Dame tu dirección:\n");
		mail = JOptionPane.showInputDialog("Dame tu correo:\n");
		celular = JOptionPane.showInputDialog("Dame tu celular:\n");
	}
	public static void agregarDatosTutor()
	{
		Tutor.pedirDatosTutor();
		Tutor.getNombre();
		Tutor.getDirección();
		Tutor.getMail();
		Tutor.getCelular();
	}
	public static void eliminarDatosTutor()
	{
		Profesor.getNombre();
		Profesor.getDirección();
		Profesor.getColonia();
		Profesor.getProfesión();
		Profesor.getFacultad();
	}
	public static void consultarDatosTutor()
	{
		Tutor.pedirDatosTutor();
	}
}
