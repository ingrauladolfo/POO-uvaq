package hospital;

import javax.swing.*;

public class MainHospital 
{
	public static int continuar,opción, persona_agregar,persona_modificar,persona_eliminar,persona_consultar;
	public static Médico[]registromédico = new Médico[2];
	public static Paciente[]registropaciente = new Paciente[2];
	public static Personal[]registropersonal = new Personal[2];
	public static boolean bandera = true;
	public static void main(String[] args)
	{
		opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar datos\n"+"2.- Eliminar\n"+"3.- Consultar\n"+"4.- Modificar\n"+"5.- Regresar al menú\n"+ "6.- Salir"));
		while(bandera)
		{
			switch(opción)
			{
				case 1:
					persona_agregar = Integer.parseInt(JOptionPane.showInputDialog("¿De quién desea agregar los datos?\n"+"1.- Médico\n"+"2.- Personal\n"+"3.- Paciente"));
					break;
				case 2:
					persona_eliminar = Integer.parseInt(JOptionPane.showInputDialog("¿De quién desea eliminar los datos?\n"+"1.- Médico\n"+"2.- Personal\n"+"3.- Paciente"));
					break;
				case 3:
					persona_consultar = Integer.parseInt(JOptionPane.showInputDialog("¿De quién desea consultar los datos?\n"+"1.- Médico\n"+"2.- Personal\n"+"3.- Paciente"));
					break;
				case 4:
					persona_modificar = Integer.parseInt(JOptionPane.showInputDialog("¿De quién desea modificar los datos?\n"+"1.- Médico\n"+"2.- Personal\n"+"3.- Paciente"));
					break;
				case 5:
					opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar datos\n"+"2.- Eliminar\n"+"3.- Consultar\n"+"4.- Modificar\n"+"5.- Regresar al menú\n"+ "6.- Salir"));
					break;
				case 6:
					System.exit(0);
			}
			switch(persona_agregar)
			{
				case 1:
					for (int i = 0; i < registromédico.length;i++)
					{
						registromédico[i] = new Médico();
						registromédico[i].agregarDatosMédico();
						System.out.println(registromédico[i].nombre+" "+registromédico[i].correo + " "+registromédico[i].dirección + " "+registromédico[i].teléfono +" "+ registromédico[i].cédula+" "+registromédico[i].especialidad);
					}
					break;
				case 2:
					for (int i = 0; i < registropersonal.length;i++)
					{
						registropersonal[i] = new Personal();
						registropersonal[i].agregarDatosPersonal();
						System.out.println(registropersonal[i].nombre+" "+registropersonal[i].correo + " "+registropersonal[i].dirección + " "+ registropersonal[i].teléfono +" "+ registropersonal[i].puesto +" "+registropersonal[i].salario);
					}
					break;
				case 3:
					for (int i = 0; i < registropaciente.length;i++)
					{
						registropaciente[i] = new Paciente();
						registropaciente[i].agregarDatosPaciente();
						System.out.println(registropaciente[i].nombre+" "+registropaciente[i].correo + " "+registropaciente[i].dirección + " "+ registropaciente[i].teléfono +" "+ registropaciente[i].padecimiento+" "+registropaciente[i].tratamiento);
					}
					break;
			}
			switch (persona_eliminar)
			{
				case 1:
					for (int i = 0; i < registromédico.length;i++)
					{
						registromédico[i] = new Médico();
						registromédico[i].eliminarDatosMédico();
						System.out.println(registromédico[i].nombre+" "+registromédico[i].correo + " "+registromédico[i].dirección + " "+registromédico[i].teléfono +" "+ registromédico[i].cédula+" "+registromédico[i].especialidad);
					}
					break;
				case 2:
					for(int i = 0; i < registropersonal.length;i++)
					{
						registropersonal[i] = new Personal();
						registropersonal[i].eliminarDatosPersonal();
						System.out.println(registropersonal[i].nombre+" "+registropersonal[i].correo + " "+registropersonal[i].dirección + " "+ registropersonal[i].teléfono +" "+ registropersonal[i].puesto +" "+registropersonal[i].salario);
					}
					break;
				case 3:
					for (int i = 0; i < registropaciente.length;i++)
					{
						registropaciente[i] = new Paciente();
						registropaciente[i].eliminarDatosPaciente();
						System.out.println(registropaciente[i].nombre+" "+registropaciente[i].correo + " "+registropaciente[i].dirección + " "+ registropaciente[i].teléfono +" "+ registropaciente[i].padecimiento+" "+registropaciente[i].tratamiento);
					}
					break;
			}
			switch(persona_consultar)
			{
				case 1:
					for(int i = 0; i < registromédico.length;i++)
					{
						Médico.pedirDatos();
						registromédico[i] = new Médico();
						registromédico[i].consultarDatosMédico();
						System.out.println(registromédico[i].nombre+" "+registromédico[i].correo + " "+registromédico[i].dirección + " "+registromédico[i].teléfono +" "+ registromédico[i].cédula+" "+registromédico[i].especialidad);
					}
					break;
				case 2:
					for (int i = 0; i < registropersonal.length;i++)
					{
						Personal.pedirDatos();
						registropersonal[i] = new Personal();
						registropersonal[i].consultarDatosPersonal();
						System.out.println(registropersonal[i].nombre+" "+registropersonal[i].correo + " "+registropersonal[i].dirección + " "+ registropersonal[i].teléfono +" "+ registropersonal[i].puesto +" "+registropersonal[i].salario);
					}
					break;
				case 3:
					for (int i = 0; i < registropaciente.length;i++)
					{
						Paciente.pedirDatos();
						registropaciente[i] = new Paciente();
						registropaciente[i].consultarDatosPaciente();
						System.out.println(registropaciente[i].nombre+" "+registropaciente[i].correo + " "+registropaciente[i].dirección + " "+ registropaciente[i].teléfono +" "+ registropaciente[i].padecimiento+" "+registropaciente[i].tratamiento);
					}
					break;
			}
			switch(persona_modificar)
			{
				case 1:
					for(int i = 0; i < registromédico.length;i++)
					{
						Médico.pedirDatos();
						switch(continuar)
						{
							case 1:
								registromédico[i] = new Médico();
								registromédico[i].modificarDatosMédico();
								System.out.println(registromédico[i].nombre_modificado +" "+registromédico[i].correo_modificado + " "+registromédico[i].dirección_modificada + " "+registromédico[i].teléfono_modificado +" "+ registromédico[i].cédula_modificada+" "+registromédico[i].especialidad_modificada);
								break;
							case 0:
								Médico.getNombre();
								Médico.getCorreo();
								Médico.getDirección();
								Médico.getTeléfono();
								Médico.getCédula();
								Médico.getEspecialidad();
								System.out.println(registromédico[i].nombre+" "+registromédico[i].correo + " "+registromédico[i].dirección + " "+registromédico[i].teléfono +" "+ registromédico[i].cédula+" "+registromédico[i].especialidad);
								break;
						}
					}
					continuar = Integer.parseInt(JOptionPane.showInputDialog("¿Seguro que quiere modificar los datos del médico?\n"+"0.- No\n"+"1.- Sí"));
					break;
				case 2:
					for(int i = 0; i < registropersonal.length;i++)
					{
						Personal.pedirDatos();
						switch(continuar)
						{
							case 1:
								registropersonal[i] = new Personal();
								registropersonal[i].modificarDatosPersonal();
								System.out.println(registropersonal[i].nombre_modificado +" "+registropersonal[i].correo_modificado + " "+registropersonal[i].dirección_modificada + " "+registropersonal[i].teléfono_modificado +" "+ registropersonal[i].puesto_modificado+" "+registropersonal[i].salario_modificado);
								break;
							case 0:
								Personal.getNombre();
								Personal.getCorreo();
								Personal.getDirección();
								Personal.getTeléfono();
								Personal.getPuesto();
								Personal.getSalario();
								System.out.println(registropersonal[i].nombre+" "+registropersonal[i].correo + " "+registropersonal[i].dirección + " "+registropersonal[i].teléfono +" "+ registropersonal[i].puesto+" "+registropersonal[i].salario);
								break;
						}
					}
					continuar = Integer.parseInt(JOptionPane.showInputDialog("¿Seguro que quiere modificar los datos del personal?\n"+"0.- No\n"+"1.- Sí"));
					break;
				case 3:
					for(int i = 0; i < registropaciente.length;i++)
					{
						Personal.pedirDatos();
						switch(continuar)
						{
							case 1:
								registropaciente[i] = new Paciente();
								registropaciente[i].modificarDatosPaciente();
								System.out.println(registropaciente[i].nombre_modificado +" "+registropaciente[i].correo_modificado + " "+ registropaciente[i].dirección_modificada + " "+registropaciente[i].teléfono_modificado +" "+ registropaciente[i].padecimiento_modificado+" "+ registropaciente[i].tratamiento_modificado);
								break;
							case 0:
								Paciente.getNombre();
								Paciente.getCorreo();
								Paciente.getDirección();
								Paciente.getTeléfono();
								Paciente.getPadecimiento();
								Paciente.getTratamiento();
								System.out.println(registropaciente[i].nombre+" "+registropaciente[i].correo + " "+registropaciente[i].dirección + " "+ registropaciente[i].teléfono +" "+ registropaciente[i].padecimiento +" "+registropaciente[i].tratamiento);
								break;
						}
					}
					continuar = Integer.parseInt(JOptionPane.showInputDialog("¿Seguro que quiere modificar los datos del paciente?\n"+"0.- No\n"+"1.- Sí"));
					break;
			}
			break;
		}
	}
}
