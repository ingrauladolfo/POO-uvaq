package añobisiesto;

import javax.swing.JOptionPane;
public class AñoBisiestoAlReves
{
	public static int día,mes,año;
	public static void main(String[] args) 
	{
		while((día == día)&&(mes == mes)&&(año == año))
		{
			try
			{
				día = Integer.parseInt((JOptionPane.showInputDialog("Dame el día: ")));
				mes = Integer.parseInt((JOptionPane.showInputDialog("Dame el mes: ")));
				año = Integer.parseInt((JOptionPane.showInputDialog("Dame el año: ")));
				if((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0))
				{
					switch (mes)
					{
						case 1:
							if((mes == 1)&&((día <= 31)&&(día > 1)))
							{
								día -= 1;
								mes = mes;
								año = año;
								break;
							}
							else
							{
								día = 31;
								mes = 12;
								año -= 1;
								break;
							}
						case 2:
							if((mes == 2)&&((día <= 29)&&(día > 1)))
							{
								día -= 1;
								mes = mes;
								año = año;
								break;
							}
							else
							{
								día = 31;
								mes = 1;
								año = año;
								break;
							}
							
						case 3:
							if((mes == 3)&&((día <= 31)&&(día > 1)))
							{
								día -= 1;
								mes = mes;
								año = año;
								break;
							}
							else
							{
								día = 29;
								mes = 2;
								año = año;
								break;
							}
						case 4:
							if((mes == 4)&&((día <= 30)&&(día > 1)))
							{
								día -= 1;
								mes = mes;
								año = año;
								break;
							}
							else
							{
								día = 31;
								mes = 3;
								año = año;
								break;
							}
						case 5:
							if((mes == 5)&&((día <= 31)&&(día > 1)))
							{
								día -= 1;
								mes = mes;
								año = año;
								break;
							}
							else
							{
								día = 30;
								mes = 4;
								año = año;
								break;
							}
						case 6:
							if((mes == 6)&&((día <= 30)&&(día > 1)))
							{
								día -= 1;
								mes = mes;
								año = año;
								break;
							}
							else
							{
								día = 31;
								mes = 5;
								año = año;
								break;
							}
						case 7:
							if((mes == 7)&&((día <= 31)&&(día > 1)))
							{
								día -= 1;
								mes = mes;
								año = año;
								break;
							}
							else
							{
								día = 30;
								mes = 6;
								año = año;
								break;
							}
						case 8:
							if((mes == 8)&&((día <= 31)&&(día > 1)))
							{
								día -= 1;
								mes = mes;
								año = año;
								break;
							}
							else
							{
								día = 31;
								mes = 7;
								día = 1;
								año = año;
								break;
							}
						case 9:
							if((mes == 9)&&((día <= 30)&&(día > 1)))
							{
								día -= 1;
								mes = mes;
								año = año;
								break;
							}
							else
							{
								día = 31;
								mes = 8;
								año = año;
								break;
							}
							
						case 10:
							if((mes == 10)&&((día <= 31)&&(día > 1)))
							{
								día -= 1;
								mes = mes;
								año = año;
								break;
							}
							else
							{
								día = 30;
								mes = 9;
								año = año;
								break;
							}
						case 11:
							if((mes == 11)&&((día <= 30)&&(día > 1)))
							{
								día -= 1;
								mes = mes;
								año = año;
								break;
							}
							else
							{
								mes = 10;
								día = 31;
								año = año;
								break;
							}
						case 12:
							if((mes == 12)&&((día <= 31)&&(día > 1)))
							{
								día -= 1;
								mes = mes;
								año = año;
								break;
							}
							else
							{
								mes = 11;
								día = 30;
								año = año;
								break;
							}
					}
				}
				else if (((mes == 2) && (día == 29)) || ((mes == 2) && (día == 28)))
				{
					switch(mes)
					{
						case 2:
							if((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0))
							{
								día = 29 - 1;
								mes = 2;
								año = año;
								break;
							}
							else
							{
								día = 28 - 1;
								mes = 2;
								año = año;
								break;
							}
						
					}
				}
				else if (((mes == 1) && (día == 31)) || ((mes == 3) && (día == 31)) || ((mes == 5) && (día == 31))|| ((mes == 7) && (día == 31)) || ((mes == 8) && (día == 31)) || ((mes == 10) && (día == 31)) || ((mes == 12) && (día == 31)))
				{
					switch(mes)
					{
						case 1:
							día = 31;
							mes = 12;
							año -= 1;
							break;
						case 3:
							if((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0))
							{
								día = 29;
								mes = 2;
								año = año;
								break;
							}
							else
							{
								día = 28;
								mes = 2;
								año = año;
								break;
							}
						case 5:
							día = 30;
							mes = 4;
							año = año;
							break;
						case 7:
							día = 30;
							mes = 6;
							año = año;
							break;
						case 8:
							día = 31;
							mes = 7;
							día = 1;
							año = año;
							break;
						case 10:
							mes = 9;
							día = 30;
							año = año;
							break;
						case 12:
							mes = 11;
							día = 30;
							año = año;
							break;
					}
				}
				else if (((mes == 4)&&(día == 30))||((mes == 6)&&(día == 30))||((mes == 9)&&(día == 30))||((mes == 11)&&(día == 30)))
				{
					switch(mes)
					{
						case 4:
							día = 31;
							mes = 3;
							año = año;
							break;
						case 6:
							día = 31;
							mes = 5;
							año = año;
							break;
						case 9:
							día = 31;
							mes = 8;
							año = año;
							break;
						case 11:
							mes = 10;
							día = 31;
							año = año;
							break;
					}
				}
				else if((día > 0 )&&(día < 31))
				{
					switch(día)
					{
					 case 1:
						 if((mes == 1)&&(día == 1))
						 {
							 día = 31;
							 mes = 12;
							 año -= 1;
							 break;
						 }
						 else
						 {
							 día = 31;
							 mes = mes - 1;
							 año -= 1;
							 break;
						 }
					 case 2:
						 día = 1;
						 mes = mes;
						 año = año;
						 break;
					 case 3:
						 día = 2;
						 mes = mes;
						 año = año;
						 break;
					 case 4:
						 día = 3;
						 mes = mes;
						 año = año;
						 break;
					 case 5:
						 día = 4;
						 mes = mes;
						 año = año;
						 break;
					 case 6:
						 día = 5;
						 mes = mes;
						 año = año;
						 break;
					 case 7:
						 día = 6;
						 mes = mes;
						 año = año;
						 break;
					 case 8:
						 día = 7;
						 mes = mes;
						 año = año;
						 break;
					 case 9:
						 día = 8;
						 mes = mes;
						 año = año;
						 break;
					 case 10:
						 día = 9;
						 mes = mes;
						 año = año;
						 break;
					 case 11:
						 día = 10;
						 mes = mes;
						 año = año;
						 break;
					 case 12:
						 día = 11;
						 mes = mes;
						 año = año;
						 break;
					 case 13:
						 día = 12;
						 mes = mes;
						 año = año;
						 break;
					 case 14:
						 día = 13;
						 mes = mes;
						 año = año;
						 break;
					 case 15:
						 día = 14;
						 mes = mes;
						 año = año;
						 break;
					 case 16:
						 día = 15;
						 mes = mes;
						 año = año;
						 break;
					 case 17:
						 día = 16;
						 mes = mes;
						 año = año;
						 break;
					 case 18:
						 día = 17;
						 mes = mes;
						 año = año;
						 break;
					 case 19:
						 día = 18;
						 mes = mes;
						 año = año;
						 break;
					 case 20:
						 día = 19;
						 mes = mes;
						 año = año;
						 break;
					 case 21:
						 día = 20;
						 mes = mes;
						 año = año;
						 break;
					 case 22:
						 día = 21;
						 mes = mes;
						 año = año;
						 break;
					 case 23:
						 día = 22;
						 mes = mes;
						 año = año;
						 break;
					 case 24:
						 día = 23;
						 mes = mes;
						 año = año;
						 break;
					 case 25:
						 día = 24;
						 mes = mes;
						 año = año;
						 break;
					 case 26:
						 día = 25;
						 mes = mes;
						 año = año;
						 break;
					 case 27:
						 día = 26;
						 mes = mes;
						 año = año;
						 break;
					 case 28:
						 día = 27;
						 mes = mes;
						 año = año;
						 break;
					 case 29:
						 día = 28;
						 mes = mes;
						 año = año;
						 break;
					 case 30:
						 día = 29;
						 mes = mes;
						 año = año;
						 break;
					 case 31:
						 día = 30;
						 mes = mes;
						 año = año;
						 break;
					}
				}
				else if ((día > 0 )&&(día < 30))
				{
					switch(día)
					{
						case 1:
							 día = 31;
							 mes = mes - 1;
							 año -= 1;
							 break;
						 case 2:
							 día = 1;
							 mes = mes;
							 año = año;
							 break;
						 case 3:
							 día = 2;
							 mes = mes;
							 año = año;
							 break;
						 case 4:
							 día = 3;
							 mes = mes;
							 año = año;
							 break;
						 case 5:
							 día = 4;
							 mes = mes;
							 año = año;
							 break;
						 case 6:
							 día = 5;
							 mes = mes;
							 año = año;
							 break;
						 case 7:
							 día = 6;
							 mes = mes;
							 año = año;
							 break;
						 case 8:
							 día = 7;
							 mes = mes;
							 año = año;
							 break;
						 case 9:
							 día = 8;
							 mes = mes;
							 año = año;
							 break;
						 case 10:
							 día = 9;
							 mes = mes;
							 año = año;
							 break;
						 case 11:
							 día = 10;
							 mes = mes;
							 año = año;
							 break;
						 case 12:
							 día = 11;
							 mes = mes;
							 año = año;
							 break;
						 case 13:
							 día = 12;
							 mes = mes;
							 año = año;
							 break;
						 case 14:
							 día = 13;
							 mes = mes;
							 año = año;
							 break;
						 case 15:
							 día = 14;
							 mes = mes;
							 año = año;
							 break;
						 case 16:
							 día = 15;
							 mes = mes;
							 año = año;
							 break;
						 case 17:
							 día = 16;
							 mes = mes;
							 año = año;
							 break;
						 case 18:
							 día = 17;
							 mes = mes;
							 año = año;
							 break;
						 case 19:
							 día = 18;
							 mes = mes;
							 año = año;
							 break;
						 case 20:
							 día = 19;
							 mes = mes;
							 año = año;
							 break;
						 case 21:
							 día = 20;
							 mes = mes;
							 año = año;
							 break;
						 case 22:
							 día = 21;
							 mes = mes;
							 año = año;
							 break;
						 case 23:
							 día = 22;
							 mes = mes;
							 año = año;
							 break;
						 case 24:
							 día = 23;
							 mes = mes;
							 año = año;
							 break;
						 case 25:
							 día = 24;
							 mes = mes;
							 año = año;
							 break;
						 case 26:
							 día = 25;
							 mes = mes;
							 año = año;
							 break;
						 case 27:
							 día = 26;
							 mes = mes;
							 año = año;
							 break;
						 case 28:
							 día = 27;
							 mes = mes;
							 año = año;
							 break;
						 case 29:
							 día = 28;
							 mes = mes;
							 año = año;
							 break;
						 case 30:
							 día = 29;
							 mes = mes;
							 año = año;
							 break;
					}
				}
				else if ((día > 0 )&&(día < 28))
				{
					switch(día)
					{
						case 1:
							 if((mes == 1)&&(día == 1))
							 {
								 día = 31;
								 mes = 12;
								 año -= 1;
								 break;
							 }
							 else
							 {
								 día = 31;
								 mes = mes - 1;
								 año -= 1;
								 break;
							 }
						 case 2:
							 día = 1;
							 mes = mes;
							 año = año;
							 break;
						 case 3:
							 día = 2;
							 mes = mes;
							 año = año;
							 break;
						 case 4:
							 día = 3;
							 mes = mes;
							 año = año;
							 break;
						 case 5:
							 día = 4;
							 mes = mes;
							 año = año;
							 break;
						 case 6:
							 día = 5;
							 mes = mes;
							 año = año;
							 break;
						 case 7:
							 día = 6;
							 mes = mes;
							 año = año;
							 break;
						 case 8:
							 día = 7;
							 mes = mes;
							 año = año;
							 break;
						 case 9:
							 día = 8;
							 mes = mes;
							 año = año;
							 break;
						 case 10:
							 día = 9;
							 mes = mes;
							 año = año;
							 break;
						 case 11:
							 día = 10;
							 mes = mes;
							 año = año;
							 break;
						 case 12:
							 día = 11;
							 mes = mes;
							 año = año;
							 break;
						 case 13:
							 día = 12;
							 mes = mes;
							 año = año;
							 break;
						 case 14:
							 día = 13;
							 mes = mes;
							 año = año;
							 break;
						 case 15:
							 día = 14;
							 mes = mes;
							 año = año;
							 break;
						 case 16:
							 día = 15;
							 mes = mes;
							 año = año;
							 break;
						 case 17:
							 día = 16;
							 mes = mes;
							 año = año;
							 break;
						 case 18:
							 día = 17;
							 mes = mes;
							 año = año;
							 break;
						 case 19:
							 día = 18;
							 mes = mes;
							 año = año;
							 break;
						 case 20:
							 día = 19;
							 mes = mes;
							 año = año;
							 break;
						 case 21:
							 día = 20;
							 mes = mes;
							 año = año;
							 break;
						 case 22:
							 día = 21;
							 mes = mes;
							 año = año;
							 break;
						 case 23:
							 día = 22;
							 mes = mes;
							 año = año;
							 break;
						 case 24:
							 día = 23;
							 mes = mes;
							 año = año;
							 break;
						 case 25:
							 día = 24;
							 mes = mes;
							 año = año;
							 break;
						 case 26:
							 día = 25;
							 mes = mes;
							 año = año;
							 break;
						 case 27:
							 día = 26;
							 mes = mes;
							 año = año;
							 break;
						 case 28:
							 día = 27;
							 mes = mes;
							 año = año;
							 break;
					}
				}
				else if ((día > 0 )&&(día < 29))
				{
					switch(día)
					{
						case 1:
							 if((mes == 1)&&(día == 1))
							 {
								 día = 31;
								 mes = 12;
								 año -= 1;
								 break;
							 }
							 else
							 {
								 día = 31;
								 mes = mes - 1;
								 año -= 1;
								 break;
							 }
						 case 2:
							 día = 1;
							 mes = mes;
							 año = año;
							 break;
						 case 3:
							 día = 2;
							 mes = mes;
							 año = año;
							 break;
						 case 4:
							 día = 3;
							 mes = mes;
							 año = año;
							 break;
						 case 5:
							 día = 4;
							 mes = mes;
							 año = año;
							 break;
						 case 6:
							 día = 5;
							 mes = mes;
							 año = año;
							 break;
						 case 7:
							 día = 6;
							 mes = mes;
							 año = año;
							 break;
						 case 8:
							 día = 7;
							 mes = mes;
							 año = año;
							 break;
						 case 9:
							 día = 8;
							 mes = mes;
							 año = año;
							 break;
						 case 10:
							 día = 9;
							 mes = mes;
							 año = año;
							 break;
						 case 11:
							 día = 10;
							 mes = mes;
							 año = año;
							 break;
						 case 12:
							 día = 11;
							 mes = mes;
							 año = año;
							 break;
						 case 13:
							 día = 12;
							 mes = mes;
							 año = año;
							 break;
						 case 14:
							 día = 13;
							 mes = mes;
							 año = año;
							 break;
						 case 15:
							 día = 14;
							 mes = mes;
							 año = año;
							 break;
						 case 16:
							 día = 15;
							 mes = mes;
							 año = año;
							 break;
						 case 17:
							 día = 16;
							 mes = mes;
							 año = año;
							 break;
						 case 18:
							 día = 17;
							 mes = mes;
							 año = año;
							 break;
						 case 19:
							 día = 18;
							 mes = mes;
							 año = año;
							 break;
						 case 20:
							 día = 19;
							 mes = mes;
							 año = año;
							 break;
						 case 21:
							 día = 20;
							 mes = mes;
							 año = año;
							 break;
						 case 22:
							 día = 21;
							 mes = mes;
							 año = año;
							 break;
						 case 23:
							 día = 22;
							 mes = mes;
							 año = año;
							 break;
						 case 24:
							 día = 23;
							 mes = mes;
							 año = año;
							 break;
						 case 25:
							 día = 24;
							 mes = mes;
							 año = año;
							 break;
						 case 26:
							 día = 25;
							 mes = mes;
							 año = año;
							 break;
						 case 27:
							 día = 26;
							 mes = mes;
							 año = año;
							 break;
						 case 28:
							 día = 27;
							 mes = mes;
							 año = año;
							 break;
						 case 29:
							 día = 28;
							 mes = mes;
							 año = año;
							 break;
					}
				}
				else
				{
					System.out.println("Dame un valor numérico: ");
				}
				System.out.println(día + "/"+ mes + "/" + año);
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("No tienes el formato correcto, por favor inténtalo de nuevo");
			}
		}
	}

}
