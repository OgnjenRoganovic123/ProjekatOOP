package konvertor;

public class Funta {
	private double iznos;

    public Funta() {}
    
    public Funta(double iznos) {

        this.iznos = iznos;

    }


    public double getIznos() {

        return iznos;

    }


    public void setIznos(double iznos) {

        this.iznos = iznos;

    }


    public double konvertujUDinar() {

        return iznos * 141.02;

    }


    public double konvertujUDolar() {

        return iznos * 1.27;

    }


    public double konvertujUEuro() {

        return iznos * 1.21;

    }


    public double konvertujUFranak() {

        return iznos * 1.13;

    }

}

