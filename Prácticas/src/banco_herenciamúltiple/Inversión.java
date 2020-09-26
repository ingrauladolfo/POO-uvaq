package banco_herenciamúltiple;

import javax.swing.JOptionPane;

public class Inversión extends Datos_cuenta
{
	public int tiempo_inversión;
	public int getTiempo_inversión() {
		return tiempo_inversión;
	}
	public void setTiempo_inversión(int tiempo_inversión) {
		this.tiempo_inversión = tiempo_inversión;
	}
	public void pedirDatosInversión()
	{
		pedirDatosCuenta();
		tiempo_inversión = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos días dura la inversión?:\n"));
	}
	public void agregarDatosInversión()
	{
		pedirDatosInversión();
		System.out.println("El cliente es: "+cliente+" "+"El saldo es: "+saldo+" "+"Los días que la inversión se tardan son: "+tiempo_inversión);
	}
	public String toString(int tiempo_inversión,String cliente,int saldo)
	{
		return "El cliente es: "+cliente+" "+"El saldo es: "+saldo+" "+"Los días que la inversión se tardan son: "+tiempo_inversión;
	}
	public void depositarDatosInversión()
	{
		depositarCuenta();
	}
	public void retirarDatosInversión()
	{
		retirarCuenta();
	}
	public void consultarMovimientosyDatosInversión()
	{
		System.out.println(toString(tiempo_inversión,cliente,(int) saldo));
		movimientosCuenta();
	}
}
