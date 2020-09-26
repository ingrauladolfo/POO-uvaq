package banco_herenciamúltiple;

import javax.swing.*;

public class Nómina extends Datos_cuenta
{
	public static String empresa;
	public static String getEmpresa() {
		return empresa;
	}
	public static void setEmpresa(String empresa) {
		Nómina.empresa = empresa;
	}
	public void pedirDatosNómina()
	{
		pedirDatosCuenta();
		empresa = JOptionPane.showInputDialog("¿Cómo se llama la empresa?:\n");
	}
	public void agregarDatosNómina()
	{
		pedirDatosNómina();
		System.out.println("El cliente es: "+cliente+" "+"El saldo es: "+saldo+" "+"La empresa se llama: "+empresa);
	}
	public String toString(String empresa, int saldo, String cliente)
	{
		return "El cliente es: "+cliente+" "+"El saldo inicial es: "+saldo+" "+"La empresa se llama: "+empresa;
	}
	public void depositarDatosNómina()
	{
		depositarCuenta();
	}
	public void retirarDatosNómina()
	{
		retirarCuenta();
	}
	public void consultarMovimientosyDatosNómina()
	{
		System.out.println(toString(cliente,(int) saldo,empresa));
		movimientosCuenta();
	}
}
