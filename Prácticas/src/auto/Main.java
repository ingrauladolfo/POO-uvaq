package auto;

import javax.swing.JOptionPane;

public class Main 
{
	public static int pedir,estadoar, estado, acelerar = 0, comprar, disminuir,año,velocidad = 0;;
	public static String marca, modelo, color,usuario;
	public static void main(String[] args)
	{
		Automóvil carro =  new Automóvil();
		
		carro.ObtenerDatosdelcarro();
		estado = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas arrancar el carro? 0 - no, 1 - sí: "));
		switch (estado)
		{
			case 0:
				carro.parar();
				break;
			case 1:
				carro.arrancar();
				break;
		}
		if (estado == 1)
		{
			carro.acelerar();
			carro.disminuir();
		}
		comprar = Integer.parseInt(JOptionPane.showInputDialog("¿Desea comprar el carro? 0 - no, 1 - sí: "));
		switch(comprar)
		{
			case 0:
				carro.MostarDatosdelcarro();
				carro.nocomprar();
				break;
			case 1:
				carro.MostarDatosdelcarro();
				carro.comprar();
				break;
		}
		pedir = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas continuar? 0 - no, 1 - sí: "));
		switch (pedir)
		{
			case 0:
				System.out.println("Gracias por usar este programa ");
				break;
			case 1:
				carro.ObtenerDatosdelcarro();
				estado = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas arrancar el carro? 0 - no, 1 - sí: "));
				switch (estado)
				{
					case 0:
						carro.parar();
						break;
					case 1:
						carro.arrancar();
						break;
				}
				if (estado == 1)
				{
					carro.acelerar();
					carro.disminuir();
				}
				comprar = Integer.parseInt(JOptionPane.showInputDialog("¿Desea comprar el carro? 0 - no, 1 - sí: "));
				switch(comprar)
				{
					case 0:
						carro.MostarDatosdelcarro();
						carro.nocomprar();
						break;
					case 1:
						carro.MostarDatosdelcarro();
						carro.comprar();
						break;
				}
				break;
		}
	}
}
