package banco_herenciamúltiple;
import javax.swing.*;
public class Ahorro extends Datos_cuenta
{
	public int num_seguro;
	public String beneficiario;
	public int getNum_seguro() {
		return num_seguro;
	}
	public void setNum_seguro(int num_seguro) {
		this.num_seguro = num_seguro;
	}
	public String getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	public void pedirDatosAhorro()
	{
		pedirDatosCuenta();
		beneficiario = JOptionPane.showInputDialog("¿Quién es el beneficiario?:\n");
		num_seguro = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el número de seguro?:\n"));
	}
	public void agregarDatosAhorro()
	{
		pedirDatosAhorro();
		System.out.println("El cliente es: "+cliente+" "+"El saldo es: "+saldo+" "+"El beneficiario es: "+beneficiario+" "+"El número de seguro es: "+num_seguro);
	}
	public String toString(int num_seguro,String beneficiario,String cliente,int saldo)
	{
		return "El cliente es: "+cliente+" "+"El saldo es: "+saldo+" "+"El beneficiario es: "+beneficiario+" "+"El número de seguro es: "+num_seguro;
	}
	public void depositarDatosAhorro()
	{
		depositarCuenta();
	}
	public void retirarDatosAhorro()
	{
		retirarCuenta();
	}
	public void consultarMovimientosyDatosAhorro()
	{
		System.out.println(toString(num_seguro,beneficiario,cliente,(int) saldo));
		movimientosCuenta();
	}
}
