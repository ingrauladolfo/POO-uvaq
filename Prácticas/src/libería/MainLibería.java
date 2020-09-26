package libería;
import javax.swing.*;

public class MainLibería 
{
	public static int continuar,opción, objeto_agregar,objeto_modificar,objeto_eliminar,objeto_consultar;
	public static Libro[]registroliterario = new Libro[2];
	public static Revista[]registrochismes = new Revista[2];
	public static Enciclopedia[]registrointelecto = new Enciclopedia[2];
	public static boolean bandera = true;
	public static void main(String[] args)
	{
		opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar datos\n"+"2.- Eliminar\n"+"3.- Consultar\n"+"4.- Modificar\n"+"5.- Regresar al menú\n"+ "6.- Salir"));
		while(bandera)
		{
			switch(opción)
			{
				case 1:
					objeto_agregar = Integer.parseInt(JOptionPane.showInputDialog("¿A quién le quieres agregar los datos?\n"+"1.- Libros\n"+"2.- Revistas\n"+"3.- Enciclopedias"));
					break;
				case 2:
					objeto_eliminar = Integer.parseInt(JOptionPane.showInputDialog("¿A quién le quieres quitar datos?\n"+"1.- Libros\n"+"2.- Revistas\n"+"3.- Enciclopedias"));
					break;
				case 3:
					objeto_consultar = Integer.parseInt(JOptionPane.showInputDialog("¿Qué datos quieres consultar?\n"+"1.- Libros\n"+"2.- Revistas\n"+"3.- Enciclopedias"));
					break;
				case 4:
					objeto_modificar = Integer.parseInt(JOptionPane.showInputDialog("¿Qué datos quieres cambiar?\n"+"1.- Libros\n"+"2.- Revistas\n"+"3.- Enciclopedias"));
					break;
				case 5:
					opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar datos\n"+"2.- Eliminar\n"+"3.- Consultar\n"+"4.- Modificar\n"+"5.- Regresar al menú\n"+ "6.- Salir"));
					break;
				case 6:
					System.exit(0);
			}
			switch(objeto_agregar)
			{
				case 1:
					for (int i = 0; i < registroliterario.length;i++)
					{
						registroliterario[i] = new Libro();
						registroliterario[i].agregarDatosLibro();
						System.out.println(registroliterario[i].nombre+" "+registroliterario[i].autor + " "+registroliterario[i].editorial + " "+registroliterario[i].isbn +" "+ registroliterario[i].materia);
					}
					break;
				case 2:
					for (int i = 0; i < registrochismes.length;i++)
					{
						registrochismes[i] = new Revista();
						registrochismes[i].agregarDatosRevista();
						System.out.println(registrochismes[i].nombre + " " + registrochismes[i].autor + " " + registrochismes[i].número + " "+ registrochismes[i].isbn +" "+ registrochismes[i].fecha);
					}
					break;
				case 3:
					for (int i = 0; i < registrointelecto.length;i++)
					{
						registrointelecto[i] = new Enciclopedia();
						registrointelecto[i].agregarDatosEnciclopedia();
						System.out.println(registrointelecto[i].nombre+" "+registrointelecto[i].autor + " "+registrointelecto[i].editorial + " "+ registrointelecto[i].isbn +" "+ registrointelecto[i].volumen);
					}
					break;
			}
			switch (objeto_eliminar)
			{
				case 1:
					for (int i = 0; i < registroliterario.length;i++)
					{
						registroliterario[i] = new Libro();
						registroliterario[i].eliminarDatosLibro();
						System.out.println(registroliterario[i].nombre+" "+registroliterario[i].autor + " "+registroliterario[i].editorial + " "+registroliterario[i].isbn +" "+ registroliterario[i].materia);
					}
					break;
				case 2:
					for (int i = 0; i < registrochismes.length;i++)
					{
						registrochismes[i] = new Revista();
						registrochismes[i].eliminarDatosRevista();
						System.out.println(registrochismes[i].nombre + " " + registrochismes[i].autor + " " + registrochismes[i].número + " "+ registrochismes[i].isbn +" "+ registrochismes[i].fecha);
					}
					break;
				case 3:
					for (int i = 0; i < registrointelecto.length;i++)
					{
						registrointelecto[i] = new Enciclopedia();
						registrointelecto[i].eliminarDatosEnciclopedia();
						System.out.println(registrointelecto[i].nombre+" "+registrointelecto[i].autor + " "+registrointelecto[i].editorial + " "+ registrointelecto[i].isbn +" "+ registrointelecto[i].volumen);
					}
					break;
			}
			switch(objeto_consultar)
			{
				case 1:
					for(int i = 0; i < registroliterario.length;i++)
					{
						Libro.pedirDatosLibros();
						registroliterario[i] = new Libro();
						registroliterario[i].consultarDatosLibro();
						System.out.println(registroliterario[i].nombre+" "+registroliterario[i].autor + " "+registroliterario[i].editorial + " "+registroliterario[i].isbn +" "+ registroliterario[i].materia);
					}
					break;
				case 2:
					for (int i = 0; i < registrochismes.length;i++)
					{
						Revista.pedirDatosRevistas();
						registrochismes[i] = new Revista();
						registrochismes[i].consultarDatosRevista();
						System.out.println(registrochismes[i].nombre + " " + registrochismes[i].autor + " " + registrochismes[i].número + " "+ registrochismes[i].isbn +" "+ registrochismes[i].fecha);
					}
					break;
				case 3:
					for (int i = 0; i < registrointelecto.length;i++)
					{
						Enciclopedia.pedirDatosEnciclopedias();
						registrointelecto[i] = new Enciclopedia();
						registrointelecto[i].consultarDatosEnciclopedia();
						System.out.println(registrointelecto[i].nombre+" "+registrointelecto[i].autor + " "+registrointelecto[i].editorial + " "+ registrointelecto[i].isbn +" "+ registrointelecto[i].volumen);
					}
					break;
			}
			switch(objeto_modificar)
			{
				case 1:
					for(int i = 0; i < registroliterario.length;i++)
					{
						Libro.pedirDatosLibros();
						switch(continuar)
						{
							case 1:
								registroliterario[i] = new Libro();
								registroliterario[i].modificarDatosLibro();
								System.out.println(registroliterario[i].nombre_modificado +" "+registroliterario[i].autor_modificado + " "+registroliterario[i].editorial_modificada + " "+registroliterario[i].isbn_modificado +" "+ registroliterario[i].materia_modificada);
								break;
							case 0:
								Libro.getNombre();
								Libro.getAutor();
								Libro.getEditorial();
								Libro.getIsbn();
								Libro.getMateria();
								System.out.println(registroliterario[i].nombre+" "+registroliterario[i].autor + " "+registroliterario[i].editorial + " "+registroliterario[i].isbn +" "+ registroliterario[i].materia);
								break;
						}
					}
					continuar = Integer.parseInt(JOptionPane.showInputDialog("¿Seguro que quiere modificar los datos del libro?\n"+"0.- No\n"+"1.- Sí"));
					break;
				case 2:
					for(int i = 0; i < registrochismes.length;i++)
					{
						Revista.pedirDatosRevistas();
						switch(continuar)
						{
							case 1:
								registrochismes[i] = new Revista();
								registrochismes[i].modificarDatosRevista();
								System.out.println(registrochismes[i].nombre_modificado + " " + registrochismes[i].autor_modificado + " " + registrochismes[i].número_modificado + " "+ registrochismes[i].isbn_modificado +" "+ registrochismes[i].fecha_modificada);
								break;
							case 0:
								Revista.getNombre();
								Revista.getAutor();
								Revista.getNúmero();
								Revista.getIsbn();
								Revista.getFecha();
								System.out.println(registrochismes[i].nombre + " " + registrochismes[i].autor + " " + registrochismes[i].número + " "+ registrochismes[i].isbn +" "+ registrochismes[i].fecha);
								break;
						}
					}
					continuar = Integer.parseInt(JOptionPane.showInputDialog("¿Seguro que quiere modificar los datos de las revistas\n"+"0.- No\n"+"1.- Sí"));
					break;
				case 3:
					for(int i = 0; i < registrointelecto.length;i++)
					{
						Enciclopedia.pedirDatosEnciclopedias();
						switch(continuar)
						{
							case 1:
								registrointelecto[i] = new Enciclopedia();
								registrointelecto[i].modificarDatosEnciclopedia();
								System.out.println(registrointelecto[i].nombre_modificado +" "+registrointelecto[i].autor_modificado + " "+registrointelecto[i].editorial_modificada + " "+ registrointelecto[i].isbn_modificado +" "+ registrointelecto[i].volumen_modificado);
								break;
							case 0:
								Enciclopedia.getNombre();
								Enciclopedia.getAutor();
								Enciclopedia.getEditorial();
								Enciclopedia.getIsbn();
								Enciclopedia.getVolumen();
								System.out.println(registrointelecto[i].nombre+" "+registrointelecto[i].autor + " "+registrointelecto[i].editorial + " "+ registrointelecto[i].isbn +" "+ registrointelecto[i].volumen);
								break;
						}
					}
					continuar = Integer.parseInt(JOptionPane.showInputDialog("¿Seguro que quiere modificar los datos de la enciclopedia?\n"+"0.- No\n"+"1.- Sí"));
					break;
			}
			break;
		}
	}
}
