package escuelaparcialuno;

import javax.swing.*;

public class Alumno extends DatosGenerales
{
	public static String colonia,carrera,grado;
	public Alumno(String nombre, String dirección) 
	{
		super(nombre, dirección);
		this.colonia = colonia;
		this.carrera = carrera;
		this.grado = grado;
	}
	public static String getColonia() {
		return colonia;
	}
	public static void setColonia(String colonia) {
		Alumno.colonia = colonia;
	}
	public static String getCarrera() {
		return carrera;
	}
	public static void setCarrera(String carrera) {
		Alumno.carrera = carrera;
	}
	public static String getGrado() {
		return grado;
	}
	public static void setGrado(String grado) {
		Alumno.grado = grado;
	}
	public static void pedirDatosAlumno()
	{
		nombre = JOptionPane.showInputDialog("Dame tu nombre:\n");
		dirección = JOptionPane.showInputDialog("Dame tu dirección:\n");
		colonia = JOptionPane.showInputDialog("Dame tu colonia:\n");
		carrera = JOptionPane.showInputDialog("Dame tu carrera:\n");
		grado = JOptionPane.showInputDialog("Dame tu grado:\n");
	}
	public static void agregarDatosAlumno()
	{
		Alumno.pedirDatosAlumno();
		Alumno.getNombre();
		Alumno.getDirección();
		Alumno.getColonia();
		Alumno.getCarrera();
		Alumno.getGrado();
	}
	public static void eliminarDatosAlumno()
	{
		Profesor.getNombre();
		Profesor.getDirección();
		Profesor.getColonia();
		Profesor.getProfesión();
		Profesor.getFacultad();
	}
	public static void consultarDatosAlumno()
	{
		Alumno.pedirDatosAlumno();
	}
}