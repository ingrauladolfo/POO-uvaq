/*Raúl Adolfo Torres Vargas*/
/*16027008*/
/*Programación Orientada a Objetos*/
/*Dr. Alejandro Vega Camarena*/

package escuelaparcialuno;
import javax.swing.*;

public class MainEscuela 
{
	public static int otra_acción, tamaño = 5,opción, persona_agregar,persona_eliminar,persona_consultar;
	public static Profesor[]registroprofesor = new Profesor[tamaño];
	public static Alumno[]registroalumno = new Alumno[tamaño];
	public static Tutor[]registrotutor = new Tutor[tamaño];
	public static boolean escuela = true;
	public static void main(String[] args)
	{
		while(escuela == true)
		{
			opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar Datos\n"+"2.- Eliminar Datos\n"+"3.- Consultar Datos\n"+"4.- Salir"));
			switch(opción)
			{
				case 1:
					persona_agregar = Integer.parseInt(JOptionPane.showInputDialog("¿De quién desea agregar los datos?\n"+"1.- Profesores\n"+"2.- Alumnos\n"+"3.- Tutores\n"));
					break;
				case 2:
					persona_eliminar = Integer.parseInt(JOptionPane.showInputDialog("¿De quién desea eliminar los datos?\n"+"1.- Profesores\n"+"2.- Alumnos\n"+"3.- Tutores\n"));
					break;
				case 3:
					persona_consultar = Integer.parseInt(JOptionPane.showInputDialog("¿De quién desea consultar los datos?\n"+"1.- Profesores\n"+"2.- Alumnos\n"+"3.- Tutores\n"));
					break;
				case 4:
					System.out.println("Gracias por usarme");
					System.exit(0);
					break;
			}
			switch(persona_agregar)
			{
				case 1:
					for (int i = 0; i < registroprofesor.length;i++)
					{
						registroprofesor[i].agregarDatosProfesor();
						System.out.println(registroprofesor[i].nombre+" "+registroprofesor[i].dirección + " "+registroprofesor[i].colonia + " "+registroprofesor[i].profesión +" "+ registroprofesor[i].facultad);
					}
					break;
				case 2:
					for (int i = 0; i < registroalumno.length;i++)
					{
						registroalumno[i].agregarDatosAlumno();
						System.out.println(registroalumno[i].nombre+" "+registroalumno[i].dirección + " "+registroalumno[i].colonia + " "+registroalumno[i].carrera +" "+ registroalumno[i].grado);
					}
					break;
				case 3:
					for (int i = 0; i < registrotutor.length;i++)
					{
						registrotutor[i].agregarDatosTutor();
						System.out.println(registrotutor[i].nombre+" "+registroprofesor[i].dirección + " "+registrotutor[i].celular + " "+registrotutor[i].mail);
					}
					break;
			}
			switch(persona_eliminar)
			{
				case 1:
					for (int i = 0; i < registroprofesor.length - 1;i++)
					{
						registroprofesor[i].pedirDatosProfesor();
						registroprofesor[i].eliminarDatosProfesor();
						System.out.println(registroprofesor[i].nombre+" "+registroprofesor[i].dirección + " "+registroprofesor[i].colonia + " "+registroprofesor[i].profesión +" "+ registroprofesor[i].facultad);
					}
					break;
				case 2:
					for (int i = 0; i < registroalumno.length - 1;i++)
					{
						registroalumno[i].pedirDatosAlumno();
						registroalumno[i].eliminarDatosAlumno();
						System.out.println(registroalumno[i].nombre+" "+registroalumno[i].dirección + " "+registroalumno[i].colonia + " "+registroalumno[i].carrera +" "+ registroalumno[i].grado);
					}
					break;
				case 3:
					for (int i = 0; i < registrotutor.length - 1;i++)
					{
						registrotutor[i].pedirDatosTutor();
						registrotutor[i].eliminarDatosTutor();
						System.out.println(registrotutor[i].nombre+" "+registroprofesor[i].dirección + " "+registrotutor[i].celular + " "+registrotutor[i].mail);
					}
					break;
			}
			switch(persona_consultar)
			{
				case 1:
					for (int i = 0; i < registroprofesor.length;i++)
					{
						Profesor.consultarDatosProfesor();
						registroprofesor[i].getNombre();
						registroprofesor[i].getDirección();
						registroprofesor[i].getColonia();
						registroprofesor[i].getProfesión();
						registroprofesor[i].getFacultad();
						System.out.println(registroprofesor[i].nombre+" "+registroprofesor[i].dirección + " "+registroprofesor[i].colonia + " "+registroprofesor[i].profesión +" "+ registroprofesor[i].facultad);
					}
					break;
				case 2:
					for (int i = 0; i < registroalumno.length;i++)
					{
						Alumno.consultarDatosAlumno();
						registroalumno[i].getNombre();
						registroalumno[i].getDirección();
						registroalumno[i].getColonia();
						registroalumno[i].getCarrera();
						registroalumno[i].getGrado();
						System.out.println(registroalumno[i].nombre+" "+registroalumno[i].dirección + " "+registroalumno[i].colonia + " "+registroalumno[i].carrera +" "+ registroalumno[i].grado);
					}
					break;
				case 3:
					for (int i = 0; i < registrotutor.length;i++)
					{
						Tutor.consultarDatosTutor();
						registrotutor[i].getNombre();
						registrotutor[i].getDirección();
						registrotutor[i].getCelular();
						registrotutor[i].getMail();
						System.out.println(registrotutor[i].nombre+" "+registroprofesor[i].dirección + " "+registrotutor[i].celular + " "+registrotutor[i].mail);
					}
					break;
			}
			otra_acción = Integer.parseInt(JOptionPane.showInputDialog("¿Quiere realizar otra acción?\n"+"0.- No\n"+"1.- Sí\n"));
			switch(otra_acción)
			{
				case 0:
					System.out.println("Gracias por usarme");
					System.exit(0);
			 		break;
			 	case 1:
			 		opción = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n"+"1.- Agregar Datos\n"+"2.- Eliminar Datos\n"+"3.- Consultar Datos\n"+"4.- Salir"));
			 		switch(opción)
					{
						case 1:
							persona_agregar = Integer.parseInt(JOptionPane.showInputDialog("¿De quién desea agregar los datos?\n"+"1.- Profesores\n"+"2.- Alumnos\n"+"3.- Tutores\n"));
							break;
						case 2:
							persona_eliminar = Integer.parseInt(JOptionPane.showInputDialog("¿De quién desea eliminar los datos?\n"+"1.- Profesores\n"+"2.- Alumnos\n"+"3.- Tutores\n"));
							break;
						case 3:
							persona_consultar = Integer.parseInt(JOptionPane.showInputDialog("¿De quién desea consultar los datos?\n"+"1.- Profesores\n"+"2.- Alumnos\n"+"3.- Tutores\n"));
							break;
						case 4:
							System.out.println("Gracias por usarme");
							System.exit(0);
							break;
					}
					switch(persona_agregar)
					{
						case 1:
							for (int i = 0; i < registroprofesor.length;i++)
							{
								registroprofesor[i].agregarDatosProfesor();
								System.out.println(registroprofesor[i].nombre+" "+registroprofesor[i].dirección + " "+registroprofesor[i].colonia + " "+registroprofesor[i].profesión +" "+ registroprofesor[i].facultad);
							}
							break;
						case 2:
							for (int i = 0; i < registroalumno.length;i++)
							{
								registroalumno[i].agregarDatosAlumno();
								System.out.println(registroalumno[i].nombre+" "+registroalumno[i].dirección + " "+registroalumno[i].colonia + " "+registroalumno[i].carrera +" "+ registroalumno[i].grado);
							}
							break;
						case 3:
							for (int i = 0; i < registrotutor.length;i++)
							{
								registrotutor[i].agregarDatosTutor();
								System.out.println(registrotutor[i].nombre+" "+registroprofesor[i].dirección + " "+registrotutor[i].celular + " "+registrotutor[i].mail);
							}
							break;
					}
					switch(persona_eliminar)
					{
						case 1:
							for (int i = 0; i < registroprofesor.length - 1;i++)
							{
								registroprofesor[i].eliminarDatosProfesor();
								System.out.println(registroprofesor[i].nombre+" "+registroprofesor[i].dirección + " "+registroprofesor[i].colonia + " "+registroprofesor[i].profesión +" "+ registroprofesor[i].facultad);
							}
							break;
						case 2:
							for (int i = 0; i < registroalumno.length - 1;i++)
							{
								registroalumno[i].eliminarDatosAlumno();
								System.out.println(registroalumno[i].nombre+" "+registroalumno[i].dirección + " "+registroalumno[i].colonia + " "+registroalumno[i].carrera +" "+ registroalumno[i].grado);
							}
							break;
						case 3:
							for (int i = 0; i < registrotutor.length - 1;i++)
							{
								registrotutor[i].eliminarDatosTutor();
								System.out.println(registrotutor[i].nombre+" "+registroprofesor[i].dirección + " "+registrotutor[i].celular + " "+registrotutor[i].mail);
							}
							break;
					}
					switch(persona_consultar)
					{
						case 1:
							for (int i = 0; i < registroprofesor.length;i++)
							{
								Profesor.consultarDatosProfesor();
								registroprofesor[i].getNombre();
								registroprofesor[i].getDirección();
								registroprofesor[i].getColonia();
								registroprofesor[i].getProfesión();
								registroprofesor[i].getFacultad();
								System.out.println(registroprofesor[i].nombre+" "+registroprofesor[i].dirección + " "+registroprofesor[i].colonia + " "+registroprofesor[i].profesión +" "+ registroprofesor[i].facultad);
							}
							break;
						case 2:
							for (int i = 0; i < registroalumno.length;i++)
							{
								Alumno.consultarDatosAlumno();
								registroalumno[i].getNombre();
								registroalumno[i].getDirección();
								registroalumno[i].getColonia();
								registroalumno[i].getCarrera();
								registroalumno[i].getGrado();
								System.out.println(registroalumno[i].nombre+" "+registroalumno[i].dirección + " "+registroalumno[i].colonia + " "+registroalumno[i].carrera +" "+ registroalumno[i].grado);
							}
							break;
						case 3:
							for (int i = 0; i < registrotutor.length;i++)
							{
								Tutor.consultarDatosTutor();
								registrotutor[i].getNombre();
								registrotutor[i].getDirección();
								registrotutor[i].getCelular();
								registrotutor[i].getMail();
								System.out.println(registrotutor[i].nombre+" "+registroprofesor[i].dirección + " "+registrotutor[i].celular + " "+registrotutor[i].mail);
							}
							break;
					}
					otra_acción = Integer.parseInt(JOptionPane.showInputDialog("¿Quiere realizar otra acción?\n"+"0.- No\n"+"1.- Sí\n"));
			 		break;
			}
			break;
		}
	}
}