package kalkulator;

public class Mnozenje {
	private Clanovi x;
	private Clanovi y;
	
	public Mnozenje() {
	}
	public Mnozenje(Clanovi x, Clanovi y) {
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
	
	public double proizvod() {
		double p = x.getA()*y.getA();
		return p;
	}
}

