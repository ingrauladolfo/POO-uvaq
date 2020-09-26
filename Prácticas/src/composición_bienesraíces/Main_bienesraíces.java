package composición_bienesraíces;
import javax.swing.*;
public class Main_bienesraíces
{
	public static int menú,hacer_frac,hacer_edificio,hacer_casa,hacer_ventana,hacer_puerta,otra_selecciónhf,otra_selecciónhe,otra_selecciónhc,otra_selecciónhv,otra_selecciónhp,regresar_menú;
	public static Ventana[] window = new Ventana[3];
	public static Puerta[] door = new Puerta[3];
	public static Casa[] home = new Casa[3];
	public static Edificio[] building = new Edificio[3];
	public static Fraccionamiento[] frac = new Fraccionamiento[3];
	public static void main(String[] args)
	{
		do
		{
			menú = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para entrar en la opción que necesites\n"+"1.- Fraccionamiento\n"+"2.- Edificios\n"+"3.- Casas\n"+"4.- Ventanas\n"+"5.- Puertas\n"+"6.- Salir"));
			switch(menú)
			{
				case 1:
					hacer_frac = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
					switch(hacer_frac)
					{
						case 1:
							for(int control = 0; control < frac.length;control++)
							{
								frac[control].agregarDatosFraccionamiento();
								frac[control].consultarDatosFraccionamiento();
							}
							System.out.println("\n");
							otra_selecciónhf = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
							break;
						case 2:
							for(int control = 0; control < frac.length;control++)
							{
								frac[control].consultarDatosFraccionamiento();
							}
							System.out.println("\n");
							otra_selecciónhf = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
							break;
					}
					switch(otra_selecciónhf)
					{
						case 0:
							System.exit(0);
							break;
						case 1:
							hacer_frac = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
							switch(hacer_frac)
							{
								case 1:
									for(int control = 0; control < frac.length;control++)
									{
										frac[control].agregarDatosFraccionamiento();
										frac[control].consultarDatosFraccionamiento();
									}
									System.out.println("\n");
									otra_selecciónhf = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
								case 2:
									for(int control = 0; control < frac.length;control++)
									{
										frac[control].consultarDatosFraccionamiento();
									}
									System.out.println("\n");
									otra_selecciónhf = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
							}
							break;
					}
					break;
				case 2:
					hacer_edificio = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
					switch(hacer_edificio)
					{
						case 1:
							for(int controla = 0; controla < building.length;controla++)
							{
								building[controla].agregarDatosEdificio();
								building[controla].consultarDatosEdificio();
							}
							System.out.println("\n");
							otra_selecciónhe = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
							break;
						case 2:
							for(int controla = 0; controla < building.length;controla++)
							{
								building[controla].consultarDatosEdificio();
							}
							System.out.println("\n");
							otra_selecciónhe = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
							break;
					}
					switch(otra_selecciónhe)
					{
						case 0:
							System.exit(0);
							break;
						case 1:
							hacer_edificio = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
							switch(hacer_edificio)
							{
								case 1:
									for(int controla = 0; controla < building.length;controla++)
									{
										building[controla].agregarDatosEdificio();
										building[controla].consultarDatosEdificio();
									}
									System.out.println("\n");
									otra_selecciónhe = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
								case 2:
									for(int controla = 0; controla < building.length;controla++)
									{
										building[controla].consultarDatosEdificio();
									}
									System.out.println("\n");
									otra_selecciónhe = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
							}
							break;
					}
					break;
				case 3:
					hacer_casa = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
					switch(hacer_casa)
					{
						case 1:
							for(int controlad = 0; controlad < home.length;controlad++)
							{
								home[controlad].agregarDatosCasa();
								home[controlad].consultarDatosCasa();
							}
							System.out.println("\n");
							otra_selecciónhc = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
							break;
						case 2:
							for(int controlad = 0; controlad < home.length;controlad++)
							{
								home[controlad].consultarDatosCasa();
							}
							System.out.println("\n");
							otra_selecciónhc = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
							break;
					}
					switch(otra_selecciónhc)
					{
						case 0:
							System.exit(0);
							break;
						case 1:
							hacer_casa = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
							switch(hacer_casa)
							{
								case 1:
									for(int controlad = 0; controlad < home.length;controlad++)
									{
										home[controlad].agregarDatosCasa();
										home[controlad].consultarDatosCasa();
									}
									System.out.println("\n");
									otra_selecciónhc = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
								case 2:
									for(int controlad = 0; controlad < home.length;controlad++)
									{
										home[controlad].consultarDatosCasa();
									}
									System.out.println("\n");
									otra_selecciónhc = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
							}
							break;
					}
					break;
				case 4:
					hacer_ventana = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
					switch(hacer_ventana)
					{
						case 1:
							for(int controlado = 0; controlado < window.length;controlado++)
							{
								window[controlado].agregarDatosVentana();
								window[controlado].consultarDatosVentana();
							}
							System.out.println("\n");
							otra_selecciónhv = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
							break;
						case 2:
							for(int controlado = 0; controlado < window.length;controlado++)
							{
								window[controlado].consultarDatosVentana();
							}
							System.out.println("\n");
							otra_selecciónhv = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
							break;
					}
					switch(otra_selecciónhv)
					{
						case 0:
							System.exit(0);
							break;
						case 1:
							hacer_ventana = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
							switch(hacer_ventana)
							{
								case 1:
									for(int controlado = 0; controlado < window.length;controlado++)
									{
										window[controlado].agregarDatosVentana();
										window[controlado].consultarDatosVentana();
									}
									System.out.println("\n");
									otra_selecciónhv = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
								case 2:
									for(int controlado = 0; controlado < window.length;controlado++)
									{
										window[controlado].consultarDatosVentana();
									}
									System.out.println("\n");
									otra_selecciónhv = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
							}
							break;
					}
					break;
				case 5:
					hacer_puerta = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
					switch(hacer_puerta)
					{
						case 1:
							for(int controlador = 0; controlador < door.length;controlador++)
							{
								door[controlador].agregarDatosPuerta();
								door[controlador].consultarDatosPuerta();
							}
							System.out.println("\n");
							otra_selecciónhp = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
							break;
						case 2:
							for(int controlador = 0; controlador < door.length;controlador++)
							{
								door[controlador].consultarDatosPuerta();
							}
							System.out.println("\n");
							otra_selecciónhp = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
							break;
					}
					switch(otra_selecciónhp)
					{
						case 0:
							System.exit(0);
							break;
						case 1:
							hacer_puerta = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
							switch(hacer_puerta)
							{
								case 1:
									for(int controlador = 0; controlador < door.length;controlador++)
									{
										door[controlador].agregarDatosPuerta();
										door[controlador].consultarDatosPuerta();
									}
									System.out.println("\n");
									otra_selecciónhp = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
								case 2:
									for(int controlador = 0; controlador < door.length;controlador++)
									{
										door[controlador].consultarDatosPuerta();
									}
									System.out.println("\n");
									otra_selecciónhp = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
							}
							break;
					}
					break;
				case 6:
					System.exit(0);
					break;
			}
			regresar_menú =Integer.parseInt(JOptionPane.showInputDialog("¿Quieres regresar al menú?\n"+"0.- No\n"+"1.- Sí"));
			switch(regresar_menú)
			{
				case 0:
					System.exit(0);
					break;
				case 1:
					menú = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para entrar en la opción que necesites\n"+"1.- Fraccionamiento\n"+"2.- Edificios\n"+"3.- Casas\n"+"4.- Ventanas\n"+"5.- Puertas\n"+"6.- Salir"));
					switch(menú)
					{
						case 1:
							hacer_frac = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
							switch(hacer_frac)
							{
								case 1:
									for(int control = 0; control < frac.length;control++)
									{
										frac[control].agregarDatosFraccionamiento();
										frac[control].consultarDatosFraccionamiento();
									}
									System.out.println("\n");
									otra_selecciónhf = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
								case 2:
									for(int control = 0; control < frac.length;control++)
									{
										frac[control].consultarDatosFraccionamiento();
									}
									System.out.println("\n");
									otra_selecciónhf = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
							}
							switch(otra_selecciónhf)
							{
								case 0:
									System.exit(0);
									break;
								case 1:
									hacer_frac = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
									switch(hacer_frac)
									{
										case 1:
											for(int control = 0; control < frac.length;control++)
											{
												frac[control].agregarDatosFraccionamiento();
												frac[control].consultarDatosFraccionamiento();
											}
											System.out.println("\n");
											otra_selecciónhf = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
											break;
										case 2:
											for(int control = 0; control < frac.length;control++)
											{
												frac[control].consultarDatosFraccionamiento();
											}
											System.out.println("\n");
											otra_selecciónhf = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
											break;
									}
									break;
							}
							break;
						case 2:
							hacer_edificio = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
							switch(hacer_edificio)
							{
								case 1:
									for(int controla = 0; controla < building.length;controla++)
									{
										building[controla].agregarDatosEdificio();
										building[controla].consultarDatosEdificio();
									}
									System.out.println("\n");
									otra_selecciónhe = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
								case 2:
									for(int controla = 0; controla < building.length;controla++)
									{
										building[controla].consultarDatosEdificio();
									}
									System.out.println("\n");
									otra_selecciónhe = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
							}
							switch(otra_selecciónhe)
							{
								case 0:
									System.exit(0);
									break;
								case 1:
									hacer_edificio = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
									switch(hacer_edificio)
									{
										case 1:
											for(int controla = 0; controla < building.length;controla++)
											{
												building[controla].agregarDatosEdificio();
												building[controla].consultarDatosEdificio();
											}
											System.out.println("\n");
											otra_selecciónhe = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
											break;
										case 2:
											for(int controla = 0; controla < building.length;controla++)
											{
												building[controla].consultarDatosEdificio();
											}
											System.out.println("\n");
											otra_selecciónhe = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
											break;
									}
									break;
							}
							break;
						case 3:
							hacer_casa = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
							switch(hacer_casa)
							{
								case 1:
									for(int controlad = 0; controlad < home.length;controlad++)
									{
										home[controlad].agregarDatosCasa();
										home[controlad].consultarDatosCasa();
									}
									System.out.println("\n");
									otra_selecciónhc = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
								case 2:
									for(int controlad = 0; controlad < home.length;controlad++)
									{
										home[controlad].consultarDatosCasa();
									}
									System.out.println("\n");
									otra_selecciónhc = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
							}
							switch(otra_selecciónhc)
							{
								case 0:
									System.exit(0);
									break;
								case 1:
									hacer_casa = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
									switch(hacer_casa)
									{
										case 1:
											for(int controlad = 0; controlad < home.length;controlad++)
											{
												home[controlad].agregarDatosCasa();
												home[controlad].consultarDatosCasa();
											}
											System.out.println("\n");
											otra_selecciónhc = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
											break;
										case 2:
											for(int controlad = 0; controlad < home.length;controlad++)
											{
												home[controlad].consultarDatosCasa();
											}
											System.out.println("\n");
											otra_selecciónhc = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
											break;
									}
									break;
							}
							break;
						case 4:
							hacer_ventana = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
							switch(hacer_ventana)
							{
								case 1:
									for(int controlado = 0; controlado < window.length;controlado++)
									{
										window[controlado].agregarDatosVentana();
										window[controlado].consultarDatosVentana();
									}
									System.out.println("\n");
									otra_selecciónhv = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
								case 2:
									for(int controlado = 0; controlado < window.length;controlado++)
									{
										window[controlado].consultarDatosVentana();
									}
									System.out.println("\n");
									otra_selecciónhv = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
							}
							switch(otra_selecciónhv)
							{
								case 0:
									System.exit(0);
									break;
								case 1:
									hacer_ventana = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
									switch(hacer_ventana)
									{
										case 1:
											for(int controlado = 0; controlado < window.length;controlado++)
											{
												window[controlado].agregarDatosVentana();
												window[controlado].consultarDatosVentana();
											}
											System.out.println("\n");
											otra_selecciónhv = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
											break;
										case 2:
											for(int controlado = 0; controlado < window.length;controlado++)
											{
												window[controlado].consultarDatosVentana();
											}
											System.out.println("\n");
											otra_selecciónhv = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
											break;
									}
									break;
							}
							break;
						case 5:
							hacer_puerta = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
							switch(hacer_puerta)
							{
								case 1:
									for(int controlador = 0; controlador < door.length;controlador++)
									{
										door[controlador].agregarDatosPuerta();
										door[controlador].consultarDatosPuerta();
									}
									System.out.println("\n");
									otra_selecciónhp = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
								case 2:
									for(int controlador = 0; controlador < door.length;controlador++)
									{
										door[controlador].consultarDatosPuerta();
									}
									System.out.println("\n");
									otra_selecciónhp = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
									break;
							}
							switch(otra_selecciónhp)
							{
								case 0:
									System.exit(0);
									break;
								case 1:
									hacer_puerta = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
									switch(hacer_puerta)
									{
										case 1:
											for(int controlador = 0; controlador < door.length;controlador++)
											{
												door[controlador].agregarDatosPuerta();
												door[controlador].consultarDatosPuerta();
											}
											System.out.println("\n");
											otra_selecciónhp = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
											break;
										case 2:
											for(int controlador = 0; controlador < door.length;controlador++)
											{
												door[controlador].consultarDatosPuerta();
											}
											System.out.println("\n");
											otra_selecciónhp = Integer.parseInt(JOptionPane.showInputDialog("¿Alguna otra selección?\n"+"0.- No\n"+"1.- Sí"));
											break;
									}
									break;
							}
							break;
						case 6:
							System.exit(0);
							break;
					}
					regresar_menú =Integer.parseInt(JOptionPane.showInputDialog("¿Quieres regresar al menú?\n"+"0.- No\n"+"1.- Sí"));
					break;
			}
		}while(true);
	}
}