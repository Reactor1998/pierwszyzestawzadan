package zadanie6;
import java.util.Scanner;


public class Zadanie6 {

	public static void main(String[] args) {
		
		
		int a ;
		int b;
		char znak;
		
		
		
		System.out.println("Wykojune operacje dodawania,odejmowania,dzielenia,mno�enia dw�ch liczb");
		
		System.out.print("Podaj pierwsz� liczb�");
		
		Scanner reader = new Scanner(System.in); 
		
			   
		       a = reader.nextInt(); 
		       
		       System.out.print("Podaj znak , jak� operacje chcesz wykona�");
		       
		       znak = reader.next().charAt(0);  
		       
		       System.out.print("Podaj drug� liczb�");
		       
		       b = reader.nextInt(); 
		       
		     
		       
		       switch(znak)     
		       {
		           case '+':   
		           {
		               System.out.println(a + b);
		               break;
		           }
		           case '-':    
		           {
		               System.out.println(a-b);
		               break;
		           }
		           case '*':   
		           {
		               System.out.println(a*b);
		               break;
		           }
		           case '/':   
		               if(b !=0)
		               {
		                 System.out.println(a/b);
		                        
		               }
		               else
		               {
		                   System.out.println("Nie dzielimy przez zero");

}
}
		       
	}
}
