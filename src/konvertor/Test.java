package konvertor;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			while (true) {
				System.out.println("Unesite valutu za pretvaranje (dinar/dolar/euro/funta/franak)");
				String s1 = sc.nextLine();
				System.out.println("Unesite valutu u koju pretvarate (dinar/dolar/euro/funta/franak)(Nemojte staviti istu)");
				String s2 = sc.nextLine();
				System.out.println("Unesite iznos");
				double d = sc.nextDouble();
				sc.nextLine();
				if (s1.equals("dinar")) {
					Dinar din = new Dinar(d);
					if (s2.equals("dolar")) {
						System.out.println(din.konvertujUDolar() + " dolara");
					} else if (s2.equals("euro")) {
						System.out.println(din.konvertujUEuro() + " evra");
					} else if (s2.equals("funta")) {
						System.out.println(din.konvertujUFuntu() + " funte");
					} else if (s2.equals("franak")) {
						System.out.println(din.konvertujUFranak() + " franaka");
					}

				} else if (s1.equals("dolar")) {
					Dolar dol = new Dolar(d);
					if (s2.equals("dinar")) {
						System.out.println(dol.konvertujUDinar() + " dinara");
					} else if (s2.equals("euro")) {
						System.out.println(dol.konvertujUEuro() + " evra");
					} else if (s2.equals("funta")) {
						System.out.println(dol.konvertujUFuntu() + " funte");
					} else if (s2.equals("franak")) {
						System.out.println(dol.konvertujUFranak() + " franaka");
					}

				} else if (s1.equals("euro")) {
					Euro eur = new Euro(d);
					if (s2.equals("dinar")) {
						System.out.println(eur.konvertujUDinar() + " dinara");
					} else if (s2.equals("dolar")) {
						System.out.println(eur.konvertujUDolar() + " dolara");
					} else if (s2.equals("funta")) {
						System.out.println(eur.konvertujUFuntu() + " funte");
					} else if (s2.equals("franak")) {
						System.out.println(eur.konvertujUFranak() + " franaka");
					}

				} else if (s1.equals("funta")) {
					Funta fun = new Funta(d);
					if (s2.equals("dinar")) {
						System.out.println(fun.konvertujUDinar() + " dinara");
					} else if (s2.equals("dolar")) {
						System.out.println(fun.konvertujUDolar() + " dolara");
					} else if (s2.equals("euro")) {
						System.out.println(fun.konvertujUEuro() + " evra");
					} else if (s2.equals("franak")) {
						System.out.println(fun.konvertujUFranak() + " franaka");
					}

				} else if (s1.equals("franak")) {
					Franak fra = new Franak(d);
					if (s2.equals("dinar")) {
						System.out.println(fra.konvertujUDinar() + " dinara");
					} else if (s2.equals("dolar")) {
						System.out.println(fra.konvertujUDolar() + " dolara");
					} else if (s2.equals("euro")) {
						System.out.println(fra.konvertujUEuro() + " evra");
					} else if (s2.equals("funta")) {
						System.out.println(fra.konvertujUFuntu() + " funte");
					}
				}
				System.out.println("Da li zelite da nastavite?(Da/Ne)");
				String kraj = sc.nextLine();
				if(kraj.equals("Ne"))
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}



