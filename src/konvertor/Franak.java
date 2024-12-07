package konvertor;

public class Franak {
	private double iznos;

    public Franak() {}

    public Franak(double iznos) {

        this.iznos = iznos;

    }


    public double getIznos() {

        return iznos;

    }


    public void setIznos(double iznos) {

        this.iznos = iznos;

    }


    public double konvertujUDinar() {

        return iznos * 125.96;

    }


    public double konvertujUDolar() {

        return iznos * 1.13;

    }


    public double konvertujUEuro() {

        return iznos * 1.08;

    }


    public double konvertujUFuntu() {

        return iznos * 0.89;

    }

}
