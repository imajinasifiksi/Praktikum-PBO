/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author ASUS
 */
public class AndroidDeveloper implements Android{
    double tulis, coding, wawancara;
    double hasil;
    String keterangan;
    
    public AndroidDeveloper(double tulis, double coding, double wawancara){
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
    }
    
    public void setTulis(double tulis){
        this.tulis = tulis;
    }
    
    public void setCoding(double coding){
        this.coding = coding;
    }
    
    public void setWawancara(double wawancara){
        this.wawancara = wawancara;
    }
    
    @Override
    public double tulis(){
        tulis = tulis * 0.2;
        return tulis;
    }
    
    @Override
    public double coding(){
        coding = coding * 0.5;
        return coding;
    }
    
    @Override
    public double wawancara(){
        wawancara = wawancara * 0.3;
        return wawancara;
    }
    
    public double hasil(){
        hasil = tulis() + coding() + wawancara();
        return hasil;
    }
    
    public String keterangan(){
        if (hasil >=85){
            keterangan = "LOLOS";
        }else
            keterangan = "GAGAL";
        return keterangan;
    }
}
