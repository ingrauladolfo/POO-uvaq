package banco_herenciamúltiple;

import javax.swing.*;

public class Banco_main
{
	public static int banco_selección,hacerahorro_selección,hacerinversión_selección,hacernómina_selección,depositar_ahorro,retirar_ahorro,checar_ahorro,depositar_nómina,retirar_nómina,checar_nómina,depositar_inversión,retirar_inversión,checar_inversión;
	public static boolean bandera;
	public static void main(String[] args)
	{
		Ahorro[] cerdito = new Ahorro[5];
		Nómina[] nominar = new Nómina[5];
		Inversión[] invierte = new Inversión[5];
		bandera = true;
		do
		{
			banco_selección = Integer.parseInt(JOptionPane.showInputDialog("¿A qué tipo de cuenta te deseas dirigir?:\n"+"1.- Ahorro\n"+"2.- Inversión\n"+"3.- Nómina\n"+"4.- Salir"));
			switch(banco_selección)
			{
				case 1:
					hacerahorro_selección = Integer.parseInt(JOptionPane.showInputDialog("¿Qué movimiento de la cuenta de ahorro deseas realizar?:\n"+"1.- Abrir una cuenta de ahorro\n"+"2.- Depositar a una cuenta de ahorro\n"+"3.- Retirar de una cuenta de ahorro\n"+"4.- Checar movimientos de una cuenta de ahorro\n"+"5.- Regresar al menú de selección de cuentas"));
					switch(hacerahorro_selección)
					{
						case 1:
							
							for(int i = 0; i < cerdito.length;i++)
							{
								cerdito[i] = new Ahorro();
								cerdito[i].agregarDatosAhorro();
							}
							break;
						case 2:
							depositar_ahorro = Integer.parseInt(JOptionPane.showInputDialog("¿A qué cuenta quieres depositarle?:\n"+"1.- Primera cuenta\n"+"2.- Segunda cuenta\n"+"3.- Tercera cuenta\n"+"4.- Cuarta cuenta\n"+"5.- Quinta cuenta"));
							switch(depositar_ahorro)
							{
								case 1:
									cerdito[0].depositarCuenta();
									break;
								case 2:
									cerdito[1].depositarDatosAhorro();
									break;
								case 3:
									cerdito[2].depositarDatosAhorro();
									break;
								case 4:
									cerdito[3].depositarDatosAhorro();
									break;
								case 5:
									cerdito[4].depositarDatosAhorro();
									break;
							}
							break;
						case 3:
							retirar_ahorro = Integer.parseInt(JOptionPane.showInputDialog("¿A qué cuenta de ahorro le quieres retirar dinero?:\n"+"1.- Primera cuenta\n"+"2.- Segunda cuenta\n"+"3.- Tercera cuenta\n"+"4.- Cuarta cuenta\n"+"5.- Quinta cuenta"));
							switch(retirar_ahorro)
							{
								case 1:
									cerdito[0].retirarDatosAhorro();
									break;
								case 2:
									cerdito[1].retirarDatosAhorro();
									break;
								case 3:
									cerdito[2].retirarDatosAhorro();
									break;
								case 4:
									cerdito[3].retirarDatosAhorro();
									break;
								case 5:
									cerdito[4].retirarDatosAhorro();
									break;
							}
							break;
						case 4:
							checar_ahorro = Integer.parseInt(JOptionPane.showInputDialog("¿De qué cuenta de ahorro quieres checar los datos?:\n"+"1.- Primera cuenta\n"+"2.- Segunda cuenta\n"+"3.- Tercera cuenta\n"+"4.- Cuarta cuenta\n"+"5.- Quinta cuenta"));
							switch(checar_ahorro)
							{
								case 1:
									cerdito[0].consultarMovimientosyDatosAhorro();
									break;
								case 2:
									cerdito[1].consultarMovimientosyDatosAhorro();
									break;
								case 3:
									cerdito[2].consultarMovimientosyDatosAhorro();
									break;
								case 4:
									cerdito[3].consultarMovimientosyDatosAhorro();
									break;
								case 5:
									cerdito[4].consultarMovimientosyDatosAhorro();
									break;
							}
							break;
						case 5:
							banco_selección = Integer.parseInt(JOptionPane.showInputDialog("¿A qué tipo de cuenta deseas hacer?:\n"+"1.- Ahorro\n"+"2.- Inversión\n"+"3.- Nómina\n"+"4.- Salir"));
							break;
					}
					if(hacerahorro_selección > 5)
					{
						bandera = false;
					}
					break;
				case 2:
					hacerinversión_selección = Integer.parseInt(JOptionPane.showInputDialog("¿Qué movimiento de la cuenta de inversión deseas realizar?:\n"+"1.- Abrir una cuenta de inversión\n"+"2.- Depositar a una cuenta inversión\n"+"3.- Retirar cuenta de inversión\n"+"4.- Checar movimientos de una cuenta de inversión\n"+"5.- Regresar al menú de selección de cuentas"));
					switch(hacerinversión_selección)
					{
						case 1:
							for(int i = 0; i < invierte.length;i++)
							{
								invierte[i] = new Inversión();
								invierte[i].agregarDatosInversión();
							}
							break;
						case 2:
							depositar_inversión = Integer.parseInt(JOptionPane.showInputDialog("¿A qué cuenta de inversión quieres depositarle?:\n"+"1.- Primera cuenta\n"+"2.- Segunda cuenta\n"+"3.- Tercera cuenta\n"+"4.- Cuarta cuenta\n"+"5.- Quinta cuenta"));
							switch(depositar_inversión)
							{
								case 1:
									invierte[0].depositarDatosInversión();
									break;
								case 2:
									invierte[1].depositarDatosInversión();
									break;
								case 3:
									invierte[2].depositarDatosInversión();
									break;
								case 4:
									invierte[3].depositarDatosInversión();
									break;
								case 5:
									invierte[4].depositarDatosInversión();
									break;
							}
							break;
						case 3:
							retirar_inversión = Integer.parseInt(JOptionPane.showInputDialog("¿A qué cuenta de inversión le quieres retirar dinero?:\n"+"1.- Primera cuenta\n"+"2.- Segunda cuenta\n"+"3.- Tercera cuenta\n"+"4.- Cuarta cuenta\n"+"5.- Quinta cuenta"));
							switch(retirar_inversión)
							{
								case 1:
									invierte[0].retirarDatosInversión();
									break;
								case 2:
									invierte[1].retirarDatosInversión();
									break;
								case 3:
									invierte[2].retirarDatosInversión();
									break;
								case 4:
									invierte[3].retirarDatosInversión();
									break;
								case 5:
									invierte[4].retirarDatosInversión();
									break;
							}
							break;
						case 4:
							checar_inversión = Integer.parseInt(JOptionPane.showInputDialog("¿De qué cuenta quieres checar los datos?:\n"+"1.- Primera cuenta\n"+"2.- Segunda cuenta\n"+"3.- Tercera cuenta\n"+"4.- Cuarta cuenta\n"+"5.- Quinta cuenta"));
							switch(checar_inversión)
							{
								case 1:
									invierte[0].consultarMovimientosyDatosInversión();
									break;
								case 2:
									invierte[1].consultarMovimientosyDatosInversión();
									break;
								case 3:
									invierte[2].consultarMovimientosyDatosInversión();
									break;
								case 4:
									invierte[3].consultarMovimientosyDatosInversión();
									break;
								case 5:
									invierte[4].consultarMovimientosyDatosInversión();
									break;
							}
							break;
						case 5:
							banco_selección = Integer.parseInt(JOptionPane.showInputDialog("¿Qué deseas hacer?:\n"+"1.- Ahorro\n"+"2.- Inversión\n"+"3.- Nómina\n"+"4.- Salir"));
							break;
					}
					if(hacerinversión_selección > 5)
					{
						bandera = false;
					}
					break;
				case 3:
					hacernómina_selección = Integer.parseInt(JOptionPane.showInputDialog("¿Qué movimiento de la cuenta de nómina deseas realizar?:\n"+"1.- Abrir una cuenta de nómina\n"+"2.- Depositar a una cuenta de nómina\n"+"3.- Retirar de una cuenta de nómina\n"+"4.- Checar movimientos de una cuenta de nómina\n"+"5.- Regresar al menú de selección de cuentas"));
					switch(hacernómina_selección)
					{
						case 1:
							for(int i = 0; i < nominar.length;i++)
							{
								nominar[i] = new Nómina();
								nominar[i].agregarDatosNómina();
							}
							break;
						case 2:
							depositar_nómina = Integer.parseInt(JOptionPane.showInputDialog("¿A qué cuenta de nómina quieres depositarle?:\n"+"1.- Primera cuenta\n"+"2.- Segunda cuenta\n"+"3.- Tercera cuenta\n"+"4.- Cuarta cuenta\n"+"5.- Quinta cuenta"));
							switch(depositar_nómina)
							{
								case 1:
									nominar[0].depositarDatosNómina();
									break;
								case 2:
									nominar[1].depositarDatosNómina();
									break;
								case 3:
									nominar[2].depositarDatosNómina();
									break;
								case 4:
									nominar[3].depositarDatosNómina();
									break;
								case 5:
									nominar[4].depositarDatosNómina();
									break;
							}
							break;
						case 3:
							retirar_nómina = Integer.parseInt(JOptionPane.showInputDialog("¿A qué cuenta de nómina le quieres retirar dinero?:\n"+"1.- Primera cuenta\n"+"2.- Segunda cuenta\n"+"3.- Tercera cuenta\n"+"4.- Cuarta cuenta\n"+"5.- Quinta cuenta"));
							switch(retirar_nómina)
							{
								case 1:
									nominar[0].retirarDatosNómina();
									break;
								case 2:
									nominar[1].retirarDatosNómina();
									break;
								case 3:
									nominar[2].retirarDatosNómina();
									break;
								case 4:
									nominar[3].retirarDatosNómina();
									break;
								case 5:
									nominar[4].retirarDatosNómina();
									break;
							}
							break;
						case 4:
							checar_nómina = Integer.parseInt(JOptionPane.showInputDialog("¿De qué cuenta de nómina quieres checar los datos?:\n"+"1.- Primera cuenta\n"+"2.- Segunda cuenta\n"+"3.- Tercera cuenta\n"+"4.- Cuarta cuenta\n"+"5.- Quinta cuenta"));
							switch(checar_nómina)
							{
								case 1:
									nominar[0].consultarMovimientosyDatosNómina();
									break;
								case 2:
									nominar[1].consultarMovimientosyDatosNómina();
									break;
								case 3:
									nominar[2].consultarMovimientosyDatosNómina();
									break;
								case 4:
									nominar[3].consultarMovimientosyDatosNómina();
									break;
								case 5:
									nominar[4].consultarMovimientosyDatosNómina();
									break;
							}
							break;
						case 5:
							banco_selección = Integer.parseInt(JOptionPane.showInputDialog("¿Qué deseas hacer?:\n"+"1.- Ahorro\n"+"2.- Inversión\n"+"3.- Nómina\n"+"4.- Salir"));
							break;
					}
					if(hacernómina_selección > 5)
					{
						bandera = false;
					}
					break;
				case 4:
					System.exit(0);
					break;
 			}
			if(banco_selección != 4)
			{
				bandera = false;
			}
		}while(true);
	}
}
