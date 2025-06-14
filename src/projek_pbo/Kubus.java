package projek_pbo;

public class Kubus extends Persegi{
    private double volume;
    private double luasPermukaan;

    public Kubus(double sisi) {
        super(sisi);
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume =  super.luas * super.sisi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = super.luas * 6;
        return luasPermukaan;
    }
}
