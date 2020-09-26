package composición_factura;

import javax.swing.*;

public class Productos 
{
	public static String tipo_producto;
	public static int precio,c_producto_existencia;
	public static String getTipo_producto() {
		return tipo_producto;
	}
	public static void setTipo_producto(String tipo_producto) {
		Productos.tipo_producto = tipo_producto;
	}
	public static int getPrecio() {
		return precio;
	}
	public static void setPrecio(int precio) {
		Productos.precio = precio;
	}
	public static int getC_producto_existencia() {
		return c_producto_existencia;
	}
	public static void setC_producto_existencia(int c_producto_existencia) {
		Productos.c_producto_existencia = c_producto_existencia;
	}
	public static void pedirDatosProductos()
	{
		tipo_producto = JOptionPane.showInputDialog("¿Qué tipo de producto es?:\n");
		precio = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto cuesta el producto?:\n"));
		c_producto_existencia = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos están en existencia?:\n"));
	}
	public static void agregarDatosProductos()
	{
		Productos.pedirDatosProductos();
		Productos.getTipo_producto();
		Productos.getPrecio();
		Productos.getC_producto_existencia();
	}
	public static void consultarDatosProductos()
	{
		System.out.println("Tipo de producto: "+tipo_producto+"\n"+"Precio: "+precio);
	}
}
