package banco_herenciamúltiple;
import javax.swing.*;
public abstract class Datos_cuenta implements Operaciones_banco
{
	public double saldo;
	public double saldo_depositado = 0;
	public double saldo_retirado = 0;
	public double retirar;
	public double depositar;
	public int selección;
	public String cliente;
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo_depositado() {
		return saldo_depositado;
	}
	public void setSaldo_depositado(double saldo_depositado) {
		this.saldo_depositado = saldo_depositado;
	}
	public double getSaldo_retirado() {
		return saldo_retirado;
	}
	public void setSaldo_retirado(double saldo_retirado) {
		this.saldo_retirado = saldo_retirado;
	}
	public double getRetirar() {
		return retirar;
	}
	public void setRetirar(double retirar) {
		this.retirar = retirar;
	}
	public double getDepositar() {
		return depositar;
	}
	public void setDepositar(double depositar) {
		this.depositar = depositar;
	}
	public int getSelección() {
		return selección;
	}
	public void setSelección(int selección) {
		this.selección = selección;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void pedirDatosCuenta()
	{
		cliente = JOptionPane.showInputDialog("¿Quién es el cliente?:\n");
		saldo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el saldo inicial?:\n"));
	}
	public void abrirCuenta()
	{
		getCliente();
		getSaldo();
		System.out.println("El nombre es: "+cliente+" "+"El saldo con el que se abrió esta cuenta es: "+ saldo);
	}
	public void depositarCuenta()
	{
		System.out.println("Su saldo en esta cuenta es de: "+saldo);
		selección = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres depositar?\n"+"0.- No\n"+"1.- Sí"+":"));
		switch(selección)
		{
			case 0:
				System.out.println(getCliente()+" su saldo sigue siendo: "+saldo);
				break;
			case 1:
				depositar = Double.parseDouble(JOptionPane.showInputDialog(getCliente()+" ¿Cuánto quiere depositar?:\n"));
				saldo_depositado = depositar + saldo;
				System.out.println(getCliente()+" su saldo actual es: "+saldo_depositado);
				saldo = saldo_depositado;
				break;
		}
	}
	public void retirarCuenta()
	{
		System.out.println(getCliente()+" su saldo en esta cuenta es de: "+saldo);
		selección = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres retirar?\n"+"0.- No\n"+"1.- Sí"+":"));
		switch(selección)
		{
			case 0:
				System.out.println(getCliente()+" su saldo sigue siendo: "+saldo);
				break;
			case 1:
				retirar = Double.parseDouble(JOptionPane.showInputDialog(getCliente()+" ¿Cuánto quiere retirar?:\n"));
				if(saldo > 0)
				{
					saldo_retirado = saldo - retirar;
					System.out.println(cliente+" su saldo hasta el momento es: "+saldo_retirado);
					saldo = saldo_retirado;
					System.out.println("Su saldo en esta cuenta es: "+saldo);
				}
				else
				{
					System.out.println(getCliente()+" no se puede retirar por insuficiencia de saldo, perdón la molestia");
				}
				break;
		}
	}
	public void movimientosCuenta()
	{
		System.out.println("El cliente es: "+cliente+" "+"Se retiró: "+retirar+" "+"Se depositó: "+depositar+" "+"El saldo actual es: "+saldo);
	}
	
}
