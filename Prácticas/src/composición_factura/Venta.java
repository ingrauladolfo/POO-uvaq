package composición_factura;
import javax.swing.*;
public class Venta extends Productos
{
	public static Productos[] productazos = new Productos[5];
	public static Clientes[] clientes = new Clientes[5];
	public static int cantidad_producto = 0,total_pagarp = 0,total_pagar = 0,continuar;
	public static void Menú()
	{
		do
		{
			continuar = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres hacer una venta?:\n"+"0.- No\n"+"1.- Sí\n"));
			switch(continuar)
			{
				case 0:
					System.exit(0);
					break;
				case 1:
					break;
			}
		}while(true);
	}
	
}
