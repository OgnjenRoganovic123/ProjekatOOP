package kalkulator;

public class Deljenje {
	private Clanovi x;
	private Clanovi y;
	
	public Deljenje() {
	}

	public Deljenje(Clanovi x, Clanovi y) {
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
	
	public double kolicnik() {
		double k=x.getA()/y.getA();
		return k;
	}
}

