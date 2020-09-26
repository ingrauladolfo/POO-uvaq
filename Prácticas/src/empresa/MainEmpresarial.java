package empresa;

import javax.swing.*;

public class MainEmpresarial 
{
	public static int opción,addit,consulado,nombre_agregar,puesto_agregar,salario_agregar, nombre_consul, puesto_consul, salario_consul;
	public static Datos[] registroempresa = new Datos[5];
	public static boolean bandera = true;
	public static void main(String[] args)
	{
		opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué deseas hacer?\n"+"1.- Agregar\n"+"2.- Consultar\n"+"3.- Salir"));
		while(bandera)
		{
			switch(opción)
			{
				case 1:
					addit = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea agregar?\n"+"1.- Nombre\n"+"2.- Puesto\n"+"3.- Salario"));
					break;
				case 2:
					consulado = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea consultar?\n"+"1.- Nombre\n"+"2.- Puesto\n"+"3.- Salario"));
					break;
				case 3:
					System.exit(0);
					break;
			}
			switch(addit)
			{
				case 1:
					nombre_agregar = Integer.parseInt(JOptionPane.showInputDialog("¿En qué posición desea agregar el nombre?\n"+"1.- Erste(Primera)\n"+"2.- Zweite (Segunda)\n"+"3.- Dritte(Tercera)\n"+"4.- Vierte(Cuarta)\n"+"5.- Fünfte(Quinta)"));
					break;
				case 2:
					puesto_agregar = Integer.parseInt(JOptionPane.showInputDialog("¿En qué posición desea agregar el puesto?\n"+"1.- Erste(Primera)\n"+"2.- Zweite (Segunda)\n"+"3.- Dritte(Tercera)\n"+"4.- Vierte(Cuarta)\n"+"5.- Fünfte(Quinta)"));
					break;
				case 3:
					salario_agregar = Integer.parseInt(JOptionPane.showInputDialog("¿En qué posición desea agregar el salario?\n"+"1.- Erste(Primera)\n"+"2.- Zweite (Segunda)\n"+"3.- Dritte(Tercera)\n"+"4.- Vierte(Cuarta)\n"+"5.- Fünfte(Quinta)"));
					break;
			}
			switch(nombre_agregar)
			{
				case 1:
					registroempresa[0].agregarNombre();
					System.out.println(registroempresa[0].nombre);
					break;
				case 2:
					registroempresa[1].agregarNombre();
					System.out.println(registroempresa[1].nombre);
					break;
				case 3:
					registroempresa[2].agregarNombre();
					System.out.println(registroempresa[2].nombre);
					break;
				case 4:
					registroempresa[3].agregarNombre();
					System.out.println(registroempresa[3].nombre);
					break;
				case 5:
					registroempresa[4].agregarNombre();
					System.out.println(registroempresa[4].nombre);
					break;
			}
			switch(puesto_agregar)
			{
				case 1:
					registroempresa[0].agregarPuesto();
					System.out.println(registroempresa[0].puesto);
					break;
				case 2:
					registroempresa[1].agregarPuesto();
					System.out.println(registroempresa[1].puesto);
					break;
				case 3:
					registroempresa[2].agregarPuesto();
					System.out.println(registroempresa[2].puesto);
					break;
				case 4:
					registroempresa[3].agregarPuesto();
					System.out.println(registroempresa[3].puesto);
					break;
				case 5:
					registroempresa[4].agregarPuesto();
					System.out.println(registroempresa[4].puesto);
					break;
			}
			switch(salario_agregar)
			{
				case 1:
					registroempresa[0].agregarSalario();
					System.out.println(registroempresa[0].salario);
					break;
				case 2:
					registroempresa[1].agregarSalario();
					System.out.println(registroempresa[1].salario);
					break;
				case 3:
					registroempresa[2].agregarSalario();
					System.out.println(registroempresa[2].salario);
					break;
				case 4:
					registroempresa[3].agregarSalario();
					System.out.println(registroempresa[3].salario);
					break;
				case 5:
					registroempresa[4].agregarSalario();
					System.out.println(registroempresa[4].salario);
					break;
			}
			switch (consulado)
			{
			case 1:
				nombre_consul = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál posición del nombre quieres consultar?\n"+"1.- Erste(Primera)\n"+"2.- Zweite (Segunda)\n"+"3.- Dritte(Tercera)\n"+"4.- Vierte(Cuarta)\n"+"5.- Fünfte(Quinta)"+":\n"));
				break;
			case 2:
				puesto_consul = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál posición del puesto quieres consultar?\n"+"1.- Erste(Primera)\n"+"2.- Zweite (Segunda)\n"+"3.- Dritte(Tercera)\n"+"4.- Vierte(Cuarta)\n"+"5.- Fünfte(Quinta)"+":\n"));
				break;
			case 3:
				salario_consul = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál posición del salario quieres consultar?\n"+"1.- Erste(Primera)\n"+"2.- Zweite (Segunda)\n"+"3.- Dritte(Tercera)\n"+"4.- Vierte(Cuarta)\n"+"5.- Fünfte(Quinta)"+":\n"));
				break;
			}
			switch(nombre_consul)
			{
				case 1:
					registroempresa[0].pedirNombre();
					registroempresa[0].consultarNombre();
					System.out.println(registroempresa[0].nombre);
					break;
				case 2:
					registroempresa[1].pedirNombre();
					registroempresa[1].consultarNombre();
					System.out.println(registroempresa[1].nombre);
					break;
				case 3:
					registroempresa[2].pedirNombre();
					registroempresa[2].consultarNombre();
					System.out.println(registroempresa[2].nombre);
					break;
				case 4:
					registroempresa[3].pedirNombre();
					registroempresa[3].consultarNombre();
					System.out.println(registroempresa[3].nombre);
					break;
				case 5:
					registroempresa[4].pedirNombre();
					registroempresa[4].consultarNombre();
					System.out.println(registroempresa[4].nombre);
					break;
			}
			switch(puesto_consul)
			{
				case 1:
					registroempresa[0].pedirPuesto();
					registroempresa[0].consultarPuesto();
					System.out.println(registroempresa[0].puesto);
					break;
				case 2:
					registroempresa[1].pedirPuesto();
					registroempresa[1].consultarPuesto();
					System.out.println(registroempresa[1].puesto);
					break;
				case 3:
					registroempresa[2].pedirPuesto();
					registroempresa[2].consultarPuesto();
					System.out.println(registroempresa[2].puesto);
					break;
				case 4:
					registroempresa[3].pedirPuesto();
					registroempresa[3].consultarPuesto();
					System.out.println(registroempresa[3].puesto);
					break;
				case 5:
					registroempresa[4].pedirPuesto();
					registroempresa[4].consultarPuesto();
					System.out.println(registroempresa[4].puesto);
					break;
			}
			switch(salario_consul)
			{
				case 1:
					registroempresa[0].pedirSalario();
					registroempresa[0].consultarSalario();
					System.out.println(registroempresa[0].salario);
					break;
				case 2:
					registroempresa[1].pedirSalario();
					registroempresa[1].consultarSalario();
					System.out.println(registroempresa[1].salario);
					break;
				case 3:
					registroempresa[2].pedirSalario();
					registroempresa[2].consultarSalario();
					System.out.println(registroempresa[2].salario);
					break;
				case 4:
					registroempresa[3].pedirSalario();
					registroempresa[3].consultarSalario();
					System.out.println(registroempresa[3].salario);
					break;
				case 5:
					registroempresa[4].pedirSalario();
					registroempresa[4].consultarSalario();
					System.out.println(registroempresa[4].salario);
					break;
			}
			break;
		}
	}
}
