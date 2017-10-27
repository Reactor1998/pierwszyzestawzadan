import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) {
		
		
		System.out.println("Podaj stopnie, które nalezy przeliczyc");
        double stopnie;
        double wynik;
        Scanner reader = new Scanner(System.in);
        
        stopnie = reader.nextDouble();
        reader.close();
        wynik=(stopnie)*1.8+32;
        System.out.println(wynik);

	}

}
