package escuelaparcialuno;

public class DatosGenerales 
{
	public static String nombre, dirección;
	public DatosGenerales(String nombre, String dirección)
	{
		this.nombre = nombre;
		this.dirección = dirección;
	}
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		DatosGenerales.nombre = nombre;
	}
	public static String getDirección() {
		return dirección;
	}
	public static void setDirección(String dirección) {
		DatosGenerales.dirección = dirección;
	}
	
}