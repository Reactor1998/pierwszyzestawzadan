import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {

		int x;
		int y;
		int z;
	  
  
System.out.println("Podaj pierwsz� liczb�");
 Scanner reader = new Scanner(System.in);
x = reader.nextInt();
System.out.println("Podaj drug� liczb�");
 y = reader.nextInt();
System.out.println("Podaj trzeci� liczb�");
 z= reader.nextInt();
 reader.close();
 
 if (x>y&& x>z)
 {
	 System.out.println("Najwi�ksz liczba to:"+x);
	 if(y>z)
	 {
		 System.out.println("najmniejsza liczba liczba to:"+z); 
	 }
	 else
	 {
		 System.out.println("najmniejsza liczba liczba to:"+y); 
	 }
 }
 if(y>x&& y>z)
 {
	 System.out.println("Najwi�ksz liczba to:"+y);
	 
	 if(x>z)
	 {
		 System.out.println("najmniejsza liczba liczba to:"+z); 
	 }
	 else
	 {
		 System.out.println("najmniejsza liczba liczba to:"+x); 
	 }
 }
 
	
	if (z>x&&z>y)
	{
		System.out.println("Najwi�ksz liczba to:"+z);
		
		 if(y>x)
		 {
			 System.out.println("najmniejsza liczba liczba to:"+x); 
		 }
		 else
		 {
			 System.out.println("najmniejsza liczba liczba to:"+y); 
		 }
	 }
		
	}
	

	}


