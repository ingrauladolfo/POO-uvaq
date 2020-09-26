package abstractclasses;

public class Main 
{
	public static void main(String arg[])
	{
		/**Objeto miGuitarra de tipo Instrumento */
		Instrumento miGuitarra = new Guitarra();
		System.out.println("Instrumento : "+miGuitarra.tipo);
		miGuitarra.tocar();
		System.out.println();
		/**Objeto miSaxofón de tipo Instrumento */
		Instrumento miSaxofón = new Saxofón();
		System.out.println("Instrumento : "+miSaxofón.tipo);
		miSaxofón.tocar();
		System.out.println();
		/**Objeto miViolín de tipo Instrumento */
		Instrumento miViolín = new Violín();
		System.out.println("Instrumento : "+miViolín.tipo);
		miViolín.tocar();
	}
}
