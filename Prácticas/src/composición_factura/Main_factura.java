package composición_factura;
import javax.swing.*;
public class Main_factura
{
	public static int menú,hacer_clientes,hacer_productos,hacer_ventas;
	public static Clientes[] clientazos = new Clientes[5];
	public static Productos[] productazos = new Productos[5];
	public static Venta[] ventas = new Venta[5];
	public static void main(String[] args)
	{
		do
		{
			menú = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un número del menú que desees acceder:\n"+"1.- Clientes\n"+"2.- Productos\n"+"3.- Venta\n"+"4.- Salir"));
			switch(menú)
			{
				case 1:
					hacer_clientes = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
					break;
				case 2:
					hacer_productos = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
					break;
				case 3:
					hacer_ventas = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número para lo que desees hacer\n"+"1.- Agregar\n"+"2.- Consultar"));
					break;
			}
			switch(hacer_clientes)
			{
				case 1:
					for(int i = 0; i < clientazos.length;i++)
					{
						clientazos[i].agregarDatosClientes();
						clientazos[i].consultarDatosClientes();
					}
					break;
				case 2:
					for(int i = 0; i < clientazos.length;i++)
					{
						clientazos[i].consultarDatosClientes();
					}
					break;
			}
			switch(hacer_productos)
			{
				case 1:
					for(int i = 0; i < productazos.length;i++)
					{
						productazos[i].agregarDatosProductos();
						productazos[i].consultarDatosProductos();
					}
					break;
				case 2:
					for(int i = 0;i < productazos.length;i++)
					{
						productazos[i].consultarDatosProductos();
					}
					break;
			}
		}while(true);
	}

}
