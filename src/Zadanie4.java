import java.util.Scanner;

public class Zadanie4 {

	public static void main(String[] args) {
		
		
		System.out.println("Podaj swój dochód");
        double dochod;
        double podatek;
        Scanner reader = new Scanner(System.in);
        
        dochod = reader.nextDouble();
        reader.close();
        
        if(dochod<85528)
        {
        	podatek= (0.18*dochod)-556.02;
        	System.out.println("podatek wynosi:"+ podatek+"Z£");
        }
        else
        {
      podatek = (14839.02)+ (0.32*(dochod-85528));
    System.out.println("podatek wynosi:"+ podatek+"Z£");

	}

}
}
