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
public class WebDeveloper implements Web {
   double tulis2, coding2, wawancara2;
    double hasil;
    String keterangan;
    
    public WebDeveloper(double tulis2, double coding2, double wawancara2){
        this.tulis2 = tulis2;
        this.coding2 = coding2;
        this.wawancara2 = wawancara2;
    }
    
    public void setTulis2(double tulis2){
        this.tulis2 = tulis2;
    }
    
    public void setCoding2(double coding2){
        this.coding2 = coding2;
    }
    
    public void setWawancara2(double wawancara2){
        this.wawancara2 = wawancara2;
    }
    
    @Override
    public double tulis2(){
        tulis2 = tulis2 * 0.4;
        return tulis2;
    }
    
    @Override
    public double coding2(){
        coding2 = coding2 * 0.35;
        return coding2;
    }
    
    @Override
    public double wawancara2(){
        wawancara2 = wawancara2 * 0.25;
        return wawancara2;
    }
    
    public double hasil(){
        hasil = tulis2() + coding2() + wawancara2();
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