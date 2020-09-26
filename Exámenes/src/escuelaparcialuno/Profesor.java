package escuelaparcialuno;

import javax.swing.*;

public class Profesor extends DatosGenerales
{
	public static String colonia, profesión, facultad;
	public Profesor(String nombre, String dirección) 
	{
		super(nombre, dirección);
		this.colonia = colonia;
		this.profesión = profesión;
		this.facultad = facultad;
	}
	public static String getColonia() {
		return colonia;
	}
	public static void setColonia(String colonia) {
		Profesor.colonia = colonia;
	}
	public static String getProfesión() {
		return profesión;
	}
	public static void setProfesión(String profesión) {
		Profesor.profesión = profesión;
	}
	public static String getFacultad() {
		return facultad;
	}
	public static void setFacultad(String facultad) {
		Profesor.facultad = facultad;
	}
	
	public static void pedirDatosProfesor()
	{
		nombre = JOptionPane.showInputDialog("Dame tu nombre:\n");
		dirección = JOptionPane.showInputDialog("Dame tu dirección:\n");
		colonia = JOptionPane.showInputDialog("Dame tu colonia:\n");
		profesión = JOptionPane.showInputDialog("Dame tu profesión:\n");
		facultad = JOptionPane.showInputDialog("Dame tu facultad:\n");
	}
	public static void agregarDatosProfesor()
	{
		Profesor.pedirDatosProfesor();
		Profesor.getNombre();
		Profesor.getDirección();
		Profesor.getColonia();
		Profesor.getProfesión();
		Profesor.getFacultad();
	}
	public static void eliminarDatosProfesor()
	{
		Profesor.getNombre();
		Profesor.getDirección();
		Profesor.getColonia();
		Profesor.getProfesión();
		Profesor.getFacultad();
	}
	public static void consultarDatosProfesor()
	{
		Profesor.pedirDatosProfesor();
	}
}