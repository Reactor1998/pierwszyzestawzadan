import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) {
		 double waga;
		 double wzrost;
		 double bmi;
		 
		  System.out.println("Podaj swoj� wag�");
		  
		  Scanner reader = new Scanner(System.in);
		  
	        waga = reader.nextDouble();
	        
	        System.out.println("Podaj sw�j wzrost");
	        wzrost = reader.nextDouble();
	        reader.close();
	        
	        wzrost= wzrost/100;
	        
	        bmi= waga/(wzrost*wzrost);
	        
	        if (bmi<18.5)
	        {
	        	
	        	System.out.println("niedowaga");
	        }
	        else if (bmi>24.9)
	        {
	        	System.out.println("nadwaga");
	        }
			else 
			{
				System.out.println("waga prawid�owa");
			}
}
}

	
