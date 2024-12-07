package kalkulator;

public class Oduzimanje {
	private Clanovi x;
	private Clanovi y;
	
	public Oduzimanje() {
	}

	public Oduzimanje(Clanovi x, Clanovi y) {
		this.x = x;
		this.y = y;
	}

	public Clanovi getX() {
		return x;
	}

	public void setX(Clanovi x) {
		this.x = x;
	}

	public Clanovi getY() {
		return y;
	}

	public void setY(Clanovi y) {
		this.y = y;
	}
	
	public double razlika() {
		double z = x.getA()-y.getA();
		return z;
	}
}

