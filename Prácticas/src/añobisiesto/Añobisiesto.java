package añobisiesto;

import javax.swing.*;
public class Añobisiesto 
{
	public static void main(String[] args) 
	{
		int día, mes, mesb, año, añob, díab;
		día = Integer.parseInt((JOptionPane.showInputDialog("Dame el día: ")));
		mes = Integer.parseInt((JOptionPane.showInputDialog("Dame el mes: ")));
		año = Integer.parseInt((JOptionPane.showInputDialog("Dame el año: ")));
		
		if((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0))
		{
			switch(mes)
			{
				case 1:
					mes = 2;
					día = 1;
					año = año;
					break;
				case 2:
					día = 28;
					díab = 28 + 1;
					día = díab;
					break;
				case 3:
					mes = 4;
					día = 1;
					año = año;
					break;
				case 4:
					mes = 5;
					día = 1;
					año = año;
					break;
				case 5:
					mes = 6;
					día = 1;
					año = año;
					break;
				case 6:
					mes = 7;
					día = 1;
					año = año;
					break;
				case 7:
					mes = 8;
					día = 1;
					año = año;
					break;
				case 8:
					mes = 9;
					día = 1;
					año = año;
					break;
				case 9:
					mes = 10;
					día = 1;
					año = año;
					break;
				case 10:
					mes = 11;
					día = 1;
					año = año;
					break;
				case 11:
					mes = 12;
					día = 1;
					año = año;
					break;
				case 12:
					mes = 1;
					día = 1;
					año += 1;
					break;
			}
		}
		else if (((mes == 2) && (día == 29)) || ((mes == 2) && (día == 28)))
		{
			switch(mes)
			{
				case 2:
					mes = 3;
					día = 1;
					año = año;
					break;
			}
		
		}
		else if (((mes == 1) && (día == 31)) || ((mes == 3) && (día == 31)) || ((mes == 5) && (día == 31))|| ((mes == 7) && (día == 31)) || ((mes == 8) && (día == 31)) || ((mes == 10) && (día == 31)) || ((mes == 12) && (día == 31)))
		{
			switch(mes)
			{
				case 1:
					mes = 2;
					día = 1;
					año = año;
					break;
				case 3:
					mes = 4;
					día = 1;
					año = año;
					break;
				case 5:
					mes = 6;
					día = 1;
					año = año;
					break;
				case 7:
					mes = 8;
					día = 1;
					año = año;
					break;
				case 8:
					mes = 9;
					día = 1;
					año = año;
					break;
				case 10:
					mes = 11;
					día = 1;
					año = año;
					break;
				case 12:
					mes = 1;
					día = 1;
					año += 1;
					break;
			}
		}
		else if (((mes == 4)&&(día == 30))||((mes == 6)&&(día == 30))||((mes == 9)&&(día == 30))||((mes == 11)&&(día == 30)))
		{
			switch(mes)
			{
				case 4:
					mes = 5;
					día = 1;
					año = año;
					break;
				case 6:
					mes = 7;
					día = 1;
					año = año;
					break;
				case 9:
					mes = 10;
					día = 1;
					año = año;
					break;
				case 11:
					mes = 12;
					día = 1;
					año = año;
					break;
			}
		}
		else if((día > 0 )&&(día < 31))
		{
			switch(día)
			{
			 case 1:
				 día = 2;
				 mes = mes;
				 año = año;
				 break;
			 case 2:
				 día = 3;
				 mes = mes;
				 año = año;
				 break;
			 case 3:
				 día = 4;
				 mes = mes;
				 año = año;
				 break;
			 case 4:
				 día = 5;
				 mes = mes;
				 año = año;
				 break;
			 case 5:
				 día = 6;
				 mes = mes;
				 año = año;
				 break;
			 case 6:
				 día = 7;
				 mes = mes;
				 año = año;
				 break;
			 case 7:
				 día = 8;
				 mes = mes;
				 año = año;
				 break;
			 case 8:
				 día = 9;
				 mes = mes;
				 año = año;
				 break;
			 case 9:
				 día = 10;
				 mes = mes;
				 año = año;
				 break;
			 case 10:
				 día = 11;
				 mes = mes;
				 año = año;
				 break;
			 case 11:
				 día = 12;
				 mes = mes;
				 año = año;
				 break;
			 case 12:
				 día = 13;
				 mes = mes;
				 año = año;
				 break;
			 case 13:
				 día = 14;
				 mes = mes;
				 año = año;
				 break;
			 case 14:
				 día = 15;
				 mes = mes;
				 año = año;
				 break;
			 case 15:
				 día = 16;
				 mes = mes;
				 año = año;
				 break;
			 case 16:
				 día = 17;
				 mes = mes;
				 año = año;
				 break;
			 case 17:
				 día = 18;
				 mes = mes;
				 año = año;
				 break;
			 case 18:
				 día = 19;
				 mes = mes;
				 año = año;
				 break;
			 case 19:
				 día = 20;
				 mes = mes;
				 año = año;
				 break;
			 case 20:
				 día = 21;
				 mes = mes;
				 año = año;
				 break;
			 case 21:
				 día = 22;
				 mes = mes;
				 año = año;
				 break;
			 case 22:
				 día = 23;
				 mes = mes;
				 año = año;
				 break;
			 case 23:
				 día = 24;
				 mes = mes;
				 año = año;
				 break;
			 case 24:
				 día = 25;
				 mes = mes;
				 año = año;
				 break;
			 case 25:
				 día = 26;
				 mes = mes;
				 año = año;
				 break;
			 case 26:
				 día = 27;
				 mes = mes;
				 año = año;
				 break;
			 case 27:
				 día = 28;
				 mes = mes;
				 año = año;
				 break;
			 case 28:
				 día = 29;
				 mes = mes;
				 año = año;
				 break;
			 case 29:
				 día = 30;
				 mes = mes;
				 año = año;
				 break;
			 case 30:
				 día = 31;
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
					 día = 2;
					 mes = mes;
					 año = año;
					 break;
				 case 2:
					 día = 3;
					 mes = mes;
					 año = año;
					 break;
				 case 3:
					 día = 4;
					 mes = mes;
					 año = año;
					 break;
				 case 4:
					 día = 5;
					 mes = mes;
					 año = año;
					 break;
				 case 5:
					 día = 6;
					 mes = mes;
					 año = año;
					 break;
				 case 6:
					 día = 7;
					 mes = mes;
					 año = año;
					 break;
				 case 7:
					 día = 8;
					 mes = mes;
					 año = año;
					 break;
				 case 8:
					 día = 9;
					 mes = mes;
					 año = año;
					 break;
				 case 9:
					 día = 10;
					 mes = mes;
					 año = año;
					 break;
				 case 10:
					 día = 11;
					 mes = mes;
					 año = año;
					 break;
				 case 11:
					 día = 12;
					 mes = mes;
					 año = año;
					 break;
				 case 12:
					 día = 13;
					 mes = mes;
					 año = año;
					 break;
				 case 13:
					 día = 14;
					 mes = mes;
					 año = año;
					 break;
				 case 14:
					 día = 15;
					 mes = mes;
					 año = año;
					 break;
				 case 15:
					 día = 16;
					 mes = mes;
					 año = año;
					 break;
				 case 16:
					 día = 17;
					 mes = mes;
					 año = año;
					 break;
				 case 17:
					 día = 18;
					 mes = mes;
					 año = año;
					 break;
				 case 18:
					 día = 19;
					 mes = mes;
					 año = año;
					 break;
				 case 19:
					 día = 20;
					 mes = mes;
					 año = año;
					 break;
				 case 20:
					 día = 21;
					 mes = mes;
					 año = año;
					 break;
				 case 21:
					 día = 22;
					 mes = mes;
					 año = año;
					 break;
				 case 22:
					 día = 23;
					 mes = mes;
					 año = año;
					 break;
				 case 23:
					 día = 24;
					 mes = mes;
					 año = año;
					 break;
				 case 24:
					 día = 25;
					 mes = mes;
					 año = año;
					 break;
				 case 25:
					 día = 26;
					 mes = mes;
					 año = año;
					 break;
				 case 26:
					 día = 27;
					 mes = mes;
					 año = año;
					 break;
				 case 27:
					 día = 28;
					 mes = mes;
					 año = año;
					 break;
				 case 28:
					 día = 29;
					 mes = mes;
					 año = año;
					 break;
				 case 29:
					 día = 30;
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
					 día = 2;
					 mes = mes;
					 año = año;
					 break;
				 case 2:
					 día = 3;
					 mes = mes;
					 año = año;
					 break;
				 case 3:
					 día = 4;
					 mes = mes;
					 año = año;
					 break;
				 case 4:
					 día = 5;
					 mes = mes;
					 año = año;
					 break;
				 case 5:
					 día = 6;
					 mes = mes;
					 año = año;
					 break;
				 case 6:
					 día = 7;
					 mes = mes;
					 año = año;
					 break;
				 case 7:
					 día = 8;
					 mes = mes;
					 año = año;
					 break;
				 case 8:
					 día = 9;
					 mes = mes;
					 año = año;
					 break;
				 case 9:
					 día = 10;
					 mes = mes;
					 año = año;
					 break;
				 case 10:
					 día = 11;
					 mes = mes;
					 año = año;
					 break;
				 case 11:
					 día = 12;
					 mes = mes;
					 año = año;
					 break;
				 case 12:
					 día = 13;
					 mes = mes;
					 año = año;
					 break;
				 case 13:
					 día = 14;
					 mes = mes;
					 año = año;
					 break;
				 case 14:
					 día = 15;
					 mes = mes;
					 año = año;
					 break;
				 case 15:
					 día = 16;
					 mes = mes;
					 año = año;
					 break;
				 case 16:
					 día = 17;
					 mes = mes;
					 año = año;
					 break;
				 case 17:
					 día = 18;
					 mes = mes;
					 año = año;
					 break;
				 case 18:
					 día = 19;
					 mes = mes;
					 año = año;
					 break;
				 case 19:
					 día = 20;
					 mes = mes;
					 año = año;
					 break;
				 case 20:
					 día = 21;
					 mes = mes;
					 año = año;
					 break;
				 case 21:
					 día = 22;
					 mes = mes;
					 año = año;
					 break;
				 case 22:
					 día = 23;
					 mes = mes;
					 año = año;
					 break;
				 case 23:
					 día = 24;
					 mes = mes;
					 año = año;
					 break;
				 case 24:
					 día = 25;
					 mes = mes;
					 año = año;
					 break;
				 case 25:
					 día = 26;
					 mes = mes;
					 año = año;
					 break;
				 case 26:
					 día = 27;
					 mes = mes;
					 año = año;
					 break;
				 case 27:
					 día = 28;
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
					 día = 2;
					 mes = mes;
					 año = año;
					 break;
				 case 2:
					 día = 3;
					 mes = mes;
					 año = año;
					 break;
				 case 3:
					 día = 4;
					 mes = mes;
					 año = año;
					 break;
				 case 4:
					 día = 5;
					 mes = mes;
					 año = año;
					 break;
				 case 5:
					 día = 6;
					 mes = mes;
					 año = año;
					 break;
				 case 6:
					 día = 7;
					 mes = mes;
					 año = año;
					 break;
				 case 7:
					 día = 8;
					 mes = mes;
					 año = año;
					 break;
				 case 8:
					 día = 9;
					 mes = mes;
					 año = año;
					 break;
				 case 9:
					 día = 10;
					 mes = mes;
					 año = año;
					 break;
				 case 10:
					 día = 11;
					 mes = mes;
					 año = año;
					 break;
				 case 11:
					 día = 12;
					 mes = mes;
					 año = año;
					 break;
				 case 12:
					 día = 13;
					 mes = mes;
					 año = año;
					 break;
				 case 13:
					 día = 14;
					 mes = mes;
					 año = año;
					 break;
				 case 14:
					 día = 15;
					 mes = mes;
					 año = año;
					 break;
				 case 15:
					 día = 16;
					 mes = mes;
					 año = año;
					 break;
				 case 16:
					 día = 17;
					 mes = mes;
					 año = año;
					 break;
				 case 17:
					 día = 18;
					 mes = mes;
					 año = año;
					 break;
				 case 18:
					 día = 19;
					 mes = mes;
					 año = año;
					 break;
				 case 19:
					 día = 20;
					 mes = mes;
					 año = año;
					 break;
				 case 20:
					 día = 21;
					 mes = mes;
					 año = año;
					 break;
				 case 21:
					 día = 22;
					 mes = mes;
					 año = año;
					 break;
				 case 22:
					 día = 23;
					 mes = mes;
					 año = año;
					 break;
				 case 23:
					 día = 24;
					 mes = mes;
					 año = año;
					 break;
				 case 24:
					 día = 25;
					 mes = mes;
					 año = año;
					 break;
				 case 25:
					 día = 26;
					 mes = mes;
					 año = año;
					 break;
				 case 26:
					 día = 27;
					 mes = mes;
					 año = año;
					 break;
				 case 27:
					 día = 28;
					 mes = mes;
					 año = año;
					 break;
				 case 28:
					 día = 29;
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
	}
}
