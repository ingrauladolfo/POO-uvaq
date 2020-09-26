package auto;

import javax.swing.JOptionPane;

public class Automóvil 
{
	String marca, modelo, color, usuario;
	int año, velocidad = 0, acelerar = 0, estado, cuentaKilómetros, disminuir = 0;
	boolean arrancado;
	void arrancar ()
	{
		arrancado = true;
		estado = 1;
		System.out.println("El auto en movimiento");
	}
	void parar ()
	{
		arrancado = false;
		estado = 0;
		System.out.println("El auto está parado y no se moverá");
	}
	void acelerar()
	{
		acelerar = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto desea acelerar?: "));
		velocidad = acelerar;
		System.out.println("Vamos a: "+ velocidad + " km/hr");
	}
	
	void disminuir()
	{
		disminuir = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto desea disminuir?: "));
		velocidad = acelerar - disminuir;
		System.out.println("Haz disminuido: "+ disminuir + " km/hr"+ " ,y tu velocidad actual es: "+ velocidad + " km/hr" );
	}
	void ObtenerDatosdelcarro()
	{
		marca = JOptionPane.showInputDialog("Dame la marca del auto: ");
		modelo = JOptionPane.showInputDialog("Dame el modelo del auto: ");
		año = Integer.parseInt(JOptionPane.showInputDialog("Dame el año del auto: "));
		color = JOptionPane.showInputDialog("Dame el color del auto: ");
		usuario = JOptionPane.showInputDialog("¿Cuál es tu nombre?: ");
	}
	void MostarDatosdelcarro()
	{
		System.out.println("Marca: "+ marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Año: " + año);
		System.out.println("Color: " + color);
	}
	void comprar()
	{
		System.out.println("El auto de marca: "+ marca + ", modelo: " + modelo + ", año: " + año + " y color: "+ color + ", fue comprado por: "+ usuario);
	}
	void nocomprar()
	{
		System.out.println("El auto de marca: "+ marca + ", modelo: " + modelo + ", año: " + año + " y color: "+ color + ", no fue comprado por: "+ usuario);
	}
}