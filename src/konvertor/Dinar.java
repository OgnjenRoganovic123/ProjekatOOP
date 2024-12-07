package konvertor;

public class Dinar {
	private double iznos;

    public Dinar() {}
    
    public Dinar(double iznos) {

        this.iznos = iznos;

    }


    public double getIznos() {

        return iznos;

    }


    public void setIznos(double iznos) {

        this.iznos = iznos;

    }


    public double konvertujUDolar() {

        return iznos * 0.009;

    }


    public double konvertujUEuro() {

        return iznos * 0.0085;

    }


    public double konvertujUFuntu() {

        return iznos * 0.0071;

    }


    public double konvertujUFranak() {

        return iznos * 0.0079;

    }

}

