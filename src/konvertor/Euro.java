package konvertor;

public class Euro {
	private double iznos;

    public Euro() {}
    
    public Euro(double iznos) {

        this.iznos = iznos;

    }


    public double getIznos() {

        return iznos;

    }


    public void setIznos(double iznos) {

        this.iznos = iznos;

    }


    public double konvertujUDinar() {

        return iznos * 116.96;

    }


    public double konvertujUDolar() {

        return iznos * 1.06;

    }


    public double konvertujUFuntu() {

        return iznos * 0.83;

    }


    public double konvertujUFranak() {

        return iznos * 0.93;

    }

}

