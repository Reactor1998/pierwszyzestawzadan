import java.util.Scanner;
public class Zadanie5 {

	public static void main(String[] args) {
	
		double cena;
		int iloscrat;
		double rata;
		
		System.out.println("Podaj cen� towaru w warto�ci od 100zl do 10 tys zl");
		Scanner reader= new Scanner(System.in);
		cena= reader.nextDouble();
		
		if(cena<100|| cena>10000 )
		{
			System.out.println("Podano nieprawdid�ow� kwot�, wprowadz kwot� jeszcze raz");
			cena= reader.nextDouble();
		}
			
		System.out.println("Podaj ilo�� rat od 6 do 48");
		iloscrat= reader.nextInt();
		
		if(iloscrat<6|| iloscrat >48 )
		{
			System.out.println("Podano nieprawdid�ow� liczb� rat, wprowadz liczbe rat raz jeszcze");
			iloscrat= reader.nextInt();
		}
		
		
			
			if(iloscrat>=6 && iloscrat<=12)
			{
				cena=cena + cena*0.025;
				rata= cena/iloscrat;
				System.out.println("Rata wynosi:"+ rata+"z�");
					
			}
			
			else if (iloscrat >=13 && iloscrat<= 24)
			{
				cena=cena + cena*0.5;
				rata= cena/iloscrat;
				System.out.println("Rata wynosi:"+ rata+"z�");
				
				
			}
			else 
			{
				cena=cena + cena*0.1;
				rata= cena/iloscrat;
				System.out.println("Rata wynosi:"+ rata+"z�");
						
			
		}

	}
}


