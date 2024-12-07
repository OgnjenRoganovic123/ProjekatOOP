package konvertor;

public class Dolar {
	private double iznos;

    public Dolar() {}
    
    public Dolar(double iznos) {

        this.iznos = iznos;

    }


    public double getIznos() {

        return iznos;

    }


    public void setIznos(double iznos) {

        this.iznos = iznos;

    }


    public double konvertujUDinar() {

        return iznos * 110.6;

    }


    public double konvertujUEuro() {

        return iznos * 0.95;

    }


    public double konvertujUFuntu() {

        return iznos * 0.78;

    }


    public double konvertujUFranak() {

        return iznos * 0.88;
}
    }
