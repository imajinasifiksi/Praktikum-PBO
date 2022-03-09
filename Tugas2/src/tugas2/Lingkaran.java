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
public class Lingkaran implements MenghitungBangun{
    private double jari, hasilLuas, hasilKel;
    
    public Lingkaran(double jari){
        this.jari = jari;
    }
    
    public double getJari(){
        return jari;
    }

    @Override
    public double hitungLuas() {
        hasilLuas = PHI * (jari * jari);
        return hasilLuas;
    }

    @Override
    public double hitungKeliling() {
        return hasilKel = PHI * (2*jari);
    }
}
