package kalkulator;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			while(true)
			{
			System.out.println("Unesite prvi clan");	
			double d1 = sc.nextDouble();
			sc.nextLine();
			Clanovi a1 = new Clanovi(d1);
			a1.setA(d1);
			System.out.println("Unesite drugi clan");
			double d2 = sc.nextDouble();
			sc.nextLine();
			Clanovi a2 = new Clanovi(d2);
			a2.setA(d2);
			System.out.println("Unesite operaciju");
			String s = sc.nextLine();
			if (s.equals("+")) {
				Sabiranje sab = new Sabiranje();
				sab.setX(a1);
				sab.setY(a2);
				System.out.println(sab.zbir());
			}
			else if (s.equals("-")) {
				Oduzimanje odu = new Oduzimanje();
				odu.setX(a1);
				odu.setY(a2);
				System.out.println(odu.razlika());
			}
			else if (s.equals("*")) {
				Mnozenje mno = new Mnozenje();
				mno.setX(a1);
				mno.setY(a2);
				System.out.println(mno.proizvod());
			} 
			else if (s.equals("/")) {
				Deljenje del = new Deljenje();
				del.setX(a1);
				del.setY(a2);
				System.out.println(del.kolicnik());
			} 
			else {
				System.out.println("Nepoznata operacija");
			}
			System.out.println("Da li zelite da nastavite?(Da/Ne)");
			String kraj = sc.nextLine();
			if(kraj.equals("Ne"))
				break;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
	


