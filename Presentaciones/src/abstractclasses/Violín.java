package abstractclasses;

public class Violín extends Instrumento
{
	public Violín()
	{
		tipo = "Violín";
	}
	public void tocar() 
	{
		System.out.println("Tocar el violín");
	}
}
