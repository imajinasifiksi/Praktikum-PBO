/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author ASUS
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggi;

    public Tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return PHI * (super.getJari() * super.getJari()) * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * (PHI * super.getJari()) * (super.getJari() + tinggi);
    }
}
