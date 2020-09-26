package transporteparcialdos;
import javax.swing.*;
public class Main_vehículos
{
	public static Autobús[]bus = new Autobús[5];
 	public static VAN[] vienen = new VAN [5];
 	public static Auto[] sobreruedas = new Auto[5];
 	public static int regresar, opción_autobús, opción_van, opción_auto, opción,desear_autobús,desear_van;
	public static void main(String[] args)
	{
		do
		{
			opción = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opción que desee:\n"+"1.- Autobús\n"+"2.- VAN\n"+"3.- Auto\n"+"4.- Salir"));
			switch(opción)
			{
				case 1:
					opción_autobús = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un autobús:\n"+"1.- primero\n"+"2.- segundo\n"+"3.- tercero\n"+"4.- cuarto\n"+"5.- quinto\n" +"6.- Ninguno"));
					break;
				case 2:
					opción_van = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una van:\n"+"1.- primera\n"+"2.- segunda\n"+"3.- tercera\n"+"4.- cuarta\n"+"5.- quinta\n" +"6.- Ninguna"));
					break;
				case 3:
					opción_auto = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un carro:\n"+"1.- primero\n"+"2.- segundo\n"+"3.- tercero\n"+"4.- cuarto\n"+"5.- quinto\n" +"6.- Ninguno"));
					break;
			}
			switch(opción_autobús)
			{
				case 1:
					desear_autobús = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?:\n"+"1.- Agregar\n"+"2.- Consultar\n"+ "3.- Nada"));
					break;
				case 2:
					desear_autobús = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?:\n"+"1.- Agregar\n"+"2.- Consultar\n"+ "3.- Nada"));
					break;
				case 3:
					desear_autobús = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?:\n"+"1.- Agregar\n"+"2.- Consultar\n"+ "3.- Nada"));
					break;
				case 4:
					desear_autobús = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?:\n"+"1.- Agregar\n"+"2.- Consultar\n"+ "3.- Nada"));
					break;
				case 5:
					System.exit(0);
			}
			switch(desear_autobús)
			{
				case 1:
					for(int i = 0; i < bus.length;i++)
					{
						bus[i].agregarAutobús();
						bus[i].consultarAutobús();
					}
					break;
				case 2:
					for(int i = 0; i < bus.length;i++)
					{
						bus[i].consultarAutobús();
					}
					break;
				case 3:
					System.exit(0);
					break;
			}
			switch(desear_van)
			{
				case 1:
					for(int i = 0; i < vienen.length;i++)
					{
						vienen[i].agregarVAN();
						vienen[i].consultarVAN();
					}
					break;
				case 2:
					for(int i = 0; i < vienen.length;i++)
					{
						vienen[i].consultarVAN();
					}
					break;
			}
			regresar = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres hacer otra cosa?:\n" + "1.- Sí\n"+"2.- No"));
			switch (regresar)
			{
				case 1:
					opción = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opción que desee:\n"+"1.- Autobús\n"+"2.- VAN\n"+"3.- Auto\n"+"4.- Salir"));
					switch(opción)
					{
						case 1:
							opción_autobús = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un autobús:\n"+"1.- primero\n"+"2.- segundo\n"+"3.- tercero\n"+"4.- cuarto\n"+"5.- quinto\n" +"6.- Ninguno"));
							break;
						case 2:
							opción_van = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una van:\n"+"1.- primera\n"+"2.- segunda\n"+"3.- tercera\n"+"4.- cuarta\n"+"5.- quinta\n" +"6.- Ninguna"));
							break;
						case 3:
							opción_auto = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un carro:\n"+"1.- primero\n"+"2.- segundo\n"+"3.- tercero\n"+"4.- cuarto\n"+"5.- quinto\n" +"6.- Ninguno"));
							break;
					}
					switch(opción_autobús)
					{
						case 1:
							desear_autobús = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?:\n"+"1.- Agregar\n"+"2.- Consultar\n"+ "3.- Nada"));
							break;
						case 2:
							desear_autobús = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?:\n"+"1.- Agregar\n"+"2.- Consultar\n"+ "3.- Nada"));
							break;
						case 3:
							desear_autobús = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?:\n"+"1.- Agregar\n"+"2.- Consultar\n"+ "3.- Nada"));
							break;
						case 4:
							desear_autobús = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?:\n"+"1.- Agregar\n"+"2.- Consultar\n"+ "3.- Nada"));
							break;
						case 5:
							System.exit(0);
					}
					switch(desear_autobús)
					{
						case 1:
							for(int i = 0; i < bus.length;i++)
							{
								bus[i].agregarAutobús();
								bus[i].consultarAutobús();
							}
							break;
						case 2:
							for(int i = 0; i < bus.length;i++)
							{
								bus[i].consultarAutobús();
							}
							break;
						case 3:
							System.exit(0);
							break;
					}
					switch(desear_van)
					{
						case 1:
							for(int i = 0; i < vienen.length;i++)
							{
								vienen[i].agregarVAN();
								vienen[i].consultarVAN();
							}
							break;
						case 2:
							for(int i = 0; i < vienen.length;i++)
							{
								vienen[i].consultarVAN();
							}
							break;
					}
					break;
				case 0:
					System.exit(0);
			}
			break;
		}while(true);
	}

}
