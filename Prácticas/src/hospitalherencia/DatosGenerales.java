package hospitalherencia;

public class DatosGenerales 
{
	public static String nombre, correo, dirección, teléfono;
	public DatosGenerales(String nombre, String correo, String dirección, String teléfono)
	{
		this.nombre = nombre;
		this.correo = correo;
		this.dirección = dirección;
		this.teléfono = teléfono;
	}
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		DatosGenerales.nombre = nombre;
	}
	public static String getCorreo() {
		return correo;
	}
	public static void setCorreo(String correo) {
		DatosGenerales.correo = correo;
	}
	public static String getDirección() {
		return dirección;
	}
	public static void setDirección(String dirección) {
		DatosGenerales.dirección = dirección;
	}
	public static String getTeléfono() {
		return teléfono;
	}
	public static void setTeléfono(String teléfono) {
		DatosGenerales.teléfono = teléfono;
	}
}
