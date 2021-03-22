import java.util.Scanner;

public class Tema1 
{
	public static void main(String[] args)
	{
		int num1, num2, suma, diferenta, produs, distanta, maxim, minim;
		float media;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduceti primul numar: ");
		num1 = s.nextInt();
		
		System.out.println("Introduceti al doilea numar: ");
		num2 = s.nextInt();
		s.close();
		
		suma = num1 + num2;
		diferenta = num1 - num2;
		produs = num1 * num2;
		media = (num1 + num2)/2;
		
		if(num1>num2)
		{
			distanta = num1 - num2;
			maxim = num1;
			minim = num2;
		}
		else{
			distanta = num2 - num1;
			maxim = num2;
			minim = num1;
		}
		
		System.out.println("Suma celor doua numere este: " + suma);
		System.out.println("Diferenta celor doua numere este: " + diferenta);
		System.out.println("Produsul celor doua numere este: " + produs);
		System.out.println("Media celor doua numere este: " + media);
		System.out.println("Distanta dintre cele doua numere este: " + distanta);
		System.out.println("Maximul dintre cele doua numere este: " + maxim);
		System.out.println("Minimul dintre cele doua numere este: " + minim);
	}
}