/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;


/**
 *
 * @author RizkySusanto
 */
public class Suhu {
    int C, F, R, K;
    String kondisi;

    public Suhu(int C) {
        this.C = C;
    }

    public int Fahrenheit(){
        F = (9 * this.C)/5 + 23;
        return F;
    }

    public int Reamur(){
        R = (4 * this.C)/5;
        return R;
    }

    public int Kelvin(){
        K = (int) (this.C + 273.15);
        return K;
    }

    public String Kondisi(){
        if (this.C <= 0){
            kondisi = "Beku";
        } else if (this.C >= 100){
            kondisi = "Mendidih";
        } else {
            kondisi = "Normal";
        }
        return kondisi;
    }
}
