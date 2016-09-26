import java.io.*;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner weightScanner=new  Scanner(System.in);
		System.out.println("Enter your weight in Kg: ");
		double kg=weightScanner.nextDouble();
		
		Scanner xavStinks=new Scanner(System.in);
		System.out.println("Enter a 1 if you would like to see your weight on the planet Voltar. Enter a 2 if you would like to see your weight on the planet Krypton. Enter a 3 if you would like to see you weith on the planet Fertos. And lastly, you should enter a 4 if you would like to see your weight on the planet Servontos."); 
		int p=xavStinks.nextInt();
		
		switch(p)
		{
		case 1:
			System.out.println((kg * .091) + " kg");
			break;
		case 2:
			System.out.println((kg * .72) + " kg");
			break;
		case 3:
			System.out.println((kg * .865) + " kg");
			break;
		case 4:
			System.out.println((kg * 4.612) + " kg");
			break;
		default:
			System.out.println("You must enter a 1, 2, 3, or 4 only. No exceptions!");
		}
		
	}

}
