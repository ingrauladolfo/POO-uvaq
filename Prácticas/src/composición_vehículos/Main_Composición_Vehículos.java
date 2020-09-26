package composición_vehículos;
import javax.swing.*;
public class Main_Composición_Vehículos 
{
	public static Auto[] loteautos = new Auto[3];
	public static Bicicleta[] lotebicis = new Bicicleta[3];
	public static Motocicleta[] lotemotos = new Motocicleta[3];
	public static Triciclo[] lotetriciclos = new Triciclo[3];
	public static int selección,auto_opción,bici_opción,trici_opción,moto_opción,otra_opción,i;
	public static boolean bandera = true;
	public static void main(String[] args)
	{
		do
		{
			selección = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea escoger?\n"+"1.- Auto\n"+"2.- Bici\n"+"3.- Motocicleta\n"+"4.- Triciclo\n"+"5.- Salir\n"));
			switch(selección)
			{
				case 1:
					auto_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
					while(bandera == true)
					{
						switch(auto_opción)
						{
							case 1:
								for(i = 0;i < loteautos.length;i++)
								{
									loteautos[i].agregarDatosAuto();
								}
								break;
							case 2:
								for(i = 0;i < loteautos.length;i++)
								{
									loteautos[i].consultarDatosAuto();
								}
								break;
							case 3:
								System.out.println("Gracias por usarme");
								System.exit(0);
								break;
						}
						auto_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
						if(auto_opción == 2)
						{
							bandera = false;
						}
					}
					break;
				case 2:
					bici_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
					while(bandera == true)
					{
						switch(bici_opción)
						{
							case 1:
								for(i = 0;i < lotebicis.length;i++)
								{
									lotebicis[i].agregarDatosBicicleta();
								}
								break;
							case 2:
								for(i = 0;i < lotebicis.length;i++)
								{
									lotebicis[i].consultarDatosBicicleta();
								}
								break;
							case 3:
								System.out.println("Gracias por usarme");
								System.exit(0);
								break;
						}
						bici_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
						if(bici_opción == 2)
						{
							bandera = false;
						}
					}
					break;
				case 3:
					moto_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
					while(bandera == true)
					{
						switch(moto_opción)
						{
							case 1:
								for(i = 0;i < lotemotos.length;i++)
								{
									lotemotos[i].agregarDatosMotocicleta();
								}
								break;
							case 2:
								for(i = 0;i < lotemotos.length;i++)
								{
									lotemotos[i].consultarDatosMotocicleta();
								}
								break;
							case 3:
								System.out.println("Gracias por usarme");
								System.exit(0);
								break;
						}
						moto_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
						if(moto_opción == 2)
						{
							bandera = false;
						}
					}
					break;
				case 4:
					trici_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
					while(bandera == true)
					{
						switch(trici_opción)
						{
							case 1:
								for(i = 0;i < lotetriciclos.length;i++)
								{
									lotetriciclos[i].agregarDatosTriciclo();
								}
								break;
							case 2:
								for(i = 0;i < lotetriciclos.length;i++)
								{
									lotetriciclos[i].consultarDatosTriciclo();
								}
								break;
							case 3:
								System.out.println("Gracias por usarme");
								System.exit(0);
								break;
						}
						trici_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
						if(trici_opción == 2)
						{
							bandera = false;
						}
					}
					break;
				case 5:
					System.out.println("Gracias por usarme");
					System.exit(0);
					break;
			}
			otra_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Desea hacer otra opción?\n"+"0.- No\n"+"1.- Sí"));
			switch(otra_opción)
			{
				case 0:
					System.out.println("Gracias por usarme");
					System.exit(0);
					break;
				case 1:
					selección = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea escoger?\n"+"1.- Auto\n"+"2.- Bici\n"+"3.- Motocicleta\n"+"4.- Triciclo\n"+"5.- Salir\n"));
					switch(selección)
					{
						case 1:
							auto_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
							while(bandera == true)
							{
								switch(auto_opción)
								{
									case 1:
										for(i = 0;i < loteautos.length;i++)
										{
											loteautos[i].agregarDatosAuto();
										}
										break;
									case 2:
										for(i = 0;i < loteautos.length;i++)
										{
											loteautos[i].consultarDatosAuto();
										}
										break;
									case 3:
										System.out.println("Gracias por usarme");
										System.exit(0);
										break;
								}
								auto_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
								if(auto_opción == 2)
								{
									bandera = false;
								}
							}
							break;
						case 2:
							bici_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
							while(bandera == true)
							{
								switch(bici_opción)
								{
									case 1:
										for(i = 0;i < lotebicis.length;i++)
										{
											lotebicis[i].agregarDatosBicicleta();
										}
										break;
									case 2:
										for(i = 0;i < lotebicis.length;i++)
										{
											lotebicis[i].consultarDatosBicicleta();
										}
										break;
									case 3:
										System.out.println("Gracias por usarme");
										System.exit(0);
										break;
								}
								bici_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
								if(bici_opción == 2)
								{
									bandera = false;
								}
							}
							break;
						case 3:
							moto_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
							while(bandera == true)
							{
								switch(moto_opción)
								{
									case 1:
										for(i = 0;i < lotemotos.length;i++)
										{
											lotemotos[i].agregarDatosMotocicleta();
										}
										break;
									case 2:
										for(i = 0;i < lotemotos.length;i++)
										{
											lotemotos[i].consultarDatosMotocicleta();
										}
										break;
									case 3:
										System.out.println("Gracias por usarme");
										System.exit(0);
										break;
								}
								moto_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
								if(moto_opción == 2)
								{
									bandera = false;
								}
							}
							break;
						case 4:
							trici_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
							while(bandera == true)
							{
								switch(trici_opción)
								{
									case 1:
										for(i = 0;i < lotetriciclos.length;i++)
										{
											lotetriciclos[i].agregarDatosTriciclo();
										}
										break;
									case 2:
										for(i = 0;i < lotetriciclos.length;i++)
										{
											lotetriciclos[i].consultarDatosTriciclo();
										}
										break;
									case 3:
										System.out.println("Gracias por usarme");
										System.exit(0);
										break;
								}
								trici_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Nada"));
								if(trici_opción == 2)
								{
									bandera = false;
								}
							}
							break;
						case 5:
							System.out.println("Gracias por usarme");
							System.exit(0);
							break;
					}
					otra_opción = Integer.parseInt(JOptionPane.showInputDialog("¿Desea hacer otra opción?\n"+"0.- No\n"+"1.- Sí"));
					break;
			}
			break;
		}while(true);
	}
}