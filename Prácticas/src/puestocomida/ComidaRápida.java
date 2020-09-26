package puestocomida;
import javax.swing.*;

public class ComidaRápida
{
	public static int salir,otra_venta,seguir_ordenando,ordenar, producto,contador,bienvenida,pedido;
	public static String menú,menú2,menú3,menú4,menú5;
	public static double cuenta,efectivo,cambio,total,hamburguesa,refresco,papas,c1,c2,guardar_hamburguesa,guardar_refresco, guardar_papas, guardar_c1, guardar_c2,ch,cr,cp,cc1,cc2;
	public static void main(String[] args)
	{
		hamburguesa = 30.00;
		refresco = 15.00;
		papas = 15.00;
		c1 = 100.00;
		c2 = 90.00;
		guardar_hamburguesa = 0;
		guardar_refresco = 0;
		guardar_papas = 0;
		guardar_c1 = 0;
		guardar_c2 = 0;
		ch= 0;
		cr = 0;
		cp = 0;
		cc1 = 0;
		cc2 = 0;
		menú = "1) Hamburguesa - $30 ";
		menú2 = "2) Refresco - $15 ";
		menú3 = "3) Papas - $15" ;
		menú4 = "4) Combo 1 (2 hamburguesas, 2 refrescos, 2 papas) - $100 ";
		menú5 = "5) Combo 2 (1 hamburguesa, 1 refresco, 1 papas) - $90 ";
		producto = 1;
		total = 0;
		
		bienvenida = Integer.parseInt(JOptionPane.showInputDialog("Bienvenidos a Guácala qué rico - Presione 1 para continuar"));
		switch(bienvenida)
		{
			case 1:
				System.out.println("Este es el menú:");
				System.out.println(menú);
				System.out.println(menú2);
				System.out.println(menú3);
				System.out.println(menú4);
				System.out.println(menú5);
				ordenar = Integer.parseInt(JOptionPane.showInputDialog("¿Quiere usted ordenar? 0 - no, 1 - si"));
				for(contador = 0; contador == contador; contador++)
				{
					switch (ordenar)
					{
						case 0:
							System.exit(0);
						case 1:
							pedido = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea para comer?: "+"\n"+menú+"\n"+menú2+"\n"+menú3+"\n"+menú4+"\n"+menú5+"\n"));
							switch(pedido)
							{
								case 1:
									ch = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántas hamburguesas quiere?: ")));
									cuenta = ch*hamburguesa;
									guardar_hamburguesa += cuenta; 
									seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
									break;
								case 2:
									cr = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántos refrescos quiere?: ")));
									cuenta = cr * refresco;
									guardar_refresco += cuenta;
									seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
									break;
								case 3:
									cp = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántas papas quiere?: ")));
									cuenta = cp * papas;
									guardar_papas += cuenta;
									seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
									break;
								case 4:
									cc1 = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántos combo 1 quiere?: ")));
									cuenta = cc1*c1;
									guardar_c1 += cuenta;
									seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
									break;
								case 5:
									cc2 = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántas combo 2 quiere?: ")));
									cuenta = cc2*c2;
									guardar_c2 += cuenta;
									seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
									break;
							}
							switch(seguir_ordenando)
							{
								case 0:
									pedido = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea para comer?: "+"\n"+menú+"\n"+menú2+"\n"+menú3+"\n"+menú4+"\n"+menú5+"\n"));
									switch(pedido)
									{
										case 1:
											ch = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántas hamburguesas quiere?: ")));
											cuenta = ch*hamburguesa;
											guardar_hamburguesa += cuenta; 
											seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
											break;
										case 2:
											cr = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántos refrescos quiere?: ")));
											cuenta = cr * refresco;
											guardar_refresco += cuenta;
											seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
											break;
										case 3:
											cp = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántas papas quiere?: ")));
											cuenta = cp * papas;
											guardar_papas += cuenta;
											seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
											break;
										case 4:
											cc1 = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántos combo 1 quiere?: ")));
											cuenta = cc1*c1;
											guardar_c1 += cuenta;
											seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
											break;
										case 5:
											cc2 = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántas combo 2 quiere?: ")));
											cuenta = cc2*c2;
											guardar_c2 += cuenta;
											seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
											break;
									}
								case 1:
									total = guardar_hamburguesa+guardar_refresco+guardar_papas+guardar_c1+guardar_c2;
									System.out.println("El total a pagar es de: "+"$"+total);
									efectivo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto efectivo recibiste?: "));
									if(efectivo > total)
									{
										cambio = efectivo - total;
									}
									else if(efectivo == total)
									{
										cambio = 0;
									}
									else
									{
										System.out.println("Falta dinero");
										System.out.println("El total a pagar es de: "+"$"+total);
										efectivo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto efectivo recibiste?: "));
									}
									if(cambio == 0)
									{
										System.out.println("Gracias por su compra");
									}
									else
									{
										System.out.println("El cambio que tienes que dar es de: "+"$"+cambio);
									}
								break;
							}
							break;
					}
					break;
				}
		}
		salir = Integer.parseInt(JOptionPane.showInputDialog("¿Desea salir? 1 - no, 0 - si: "));
		switch(salir)
		{
			case 0:
				System.exit(0);
				break;
			case 1:
				otra_venta = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere hacer otra venta? 0 - no, 1 - si")));
				switch(otra_venta)
				{
					case 0:
						System.exit(0);
						break;
					case 1:
						bienvenida = Integer.parseInt(JOptionPane.showInputDialog("Bienvenidos a Guácala qué rico - Presione 1 para continuar"));
						switch(bienvenida)
						{
							case 1:
								System.out.println("Este es el menú:");
								System.out.println(menú);
								System.out.println(menú2);
								System.out.println(menú3);
								System.out.println(menú4);
								System.out.println(menú5);
								ordenar = Integer.parseInt(JOptionPane.showInputDialog("¿Quiere usted ordenar? 0 - no, 1 - si"));
								for(contador = 0; contador == contador; contador++)
								{
									switch (ordenar)
									{
										case 0:
											System.exit(0);
										case 1:
											pedido = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea para comer?: "+"\n"+menú+"\n"+menú2+"\n"+menú3+"\n"+menú4+"\n"+menú5+"\n"));
											switch(pedido)
											{
												case 1:
													ch = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántas hamburguesas quiere?: ")));
													cuenta = ch*hamburguesa;
													guardar_hamburguesa += cuenta; 
													seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
													break;
												case 2:
													cr = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántos refrescos quiere?: ")));
													cuenta = cr * refresco;
													guardar_refresco += cuenta;
													seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
													break;
												case 3:
													cp = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántas papas quiere?: ")));
													cuenta = cp * papas;
													guardar_papas += cuenta;
													seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
													break;
												case 4:
													cc1 = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántos combo 1 quiere?: ")));
													cuenta = cc1*c1;
													guardar_c1 += cuenta;
													seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
													break;
												case 5:
													cc2 = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántas combo 2 quiere?: ")));
													cuenta = cc2*c2;
													guardar_c2 += cuenta;
													seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
													break;
											}
											switch(seguir_ordenando)
											{
												case 0:
													pedido = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea para comer?: "+"\n"+menú+"\n"+menú2+"\n"+menú3+"\n"+menú4+"\n"+menú5+"\n"));
													switch(pedido)
													{
														case 1:
															ch = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántas hamburguesas quiere?: ")));
															cuenta = ch*hamburguesa;
															guardar_hamburguesa += cuenta; 
															seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
															break;
														case 2:
															cr = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántos refrescos quiere?: ")));
															cuenta = cr * refresco;
															guardar_refresco += cuenta;
															seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
															break;
														case 3:
															cp = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántas papas quiere?: ")));
															cuenta = cp * papas;
															guardar_papas += cuenta;
															seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
															break;
														case 4:
															cc1 = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántos combo 1 quiere?: ")));
															cuenta = cc1*c1;
															guardar_c1 += cuenta;
															seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
															break;
														case 5:
															cc2 = Double.parseDouble(JOptionPane.showInputDialog(("¿Cuántas combo 2 quiere?: ")));
															cuenta = cc2*c2;
															guardar_c2 += cuenta;
															seguir_ordenando = Integer.parseInt(JOptionPane.showInputDialog(("¿Quiere algo más? 0 - si, 1 - no: ")));
															break;
													}
												case 1:
													total = guardar_hamburguesa+guardar_refresco+guardar_papas+guardar_c1+guardar_c2;
													System.out.println("El total a pagar es de: "+"$"+total);
													efectivo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto efectivo recibiste?: "));
													if(efectivo > total)
													{
														cambio = efectivo - total;
													}
													else if(efectivo == total)
													{
														cambio = 0;
													}
													else
													{
														System.out.println("Falta dinero");
														System.out.println("El total a pagar es de: "+"$"+total);
														efectivo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto efectivo recibiste?: "));
													}
													if(cambio == 0)
													{
														System.out.println("Gracias por su compra");
													}
													else
													{
														System.out.println("El cambio que tienes que dar es de: "+"$"+cambio);
													}
												break;
											}
											break;
									}
									break;
								}
						}
						salir = Integer.parseInt(JOptionPane.showInputDialog("¿Desea salir? 1 - no, 0 - si: "));
				}
		}
	}
}