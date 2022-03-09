/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ulangi, pilih;
        double panjang, lebar, tinggi, jari;
        do{
        System.out.println("==========");
        System.out.println("Menu Utama");
        System.out.println("==========");
        System.out.print("\n 1. Hitung Balok  \n 2. Hitung Tabung  \n 0. Exit  \n  Pilih : ");
          pilih = in.nextInt();
          
        switch (pilih){
        case 0:
            System.out.println("ThankYou!!!");
            System.exit(0);
            break;
        
        case 1:
            System.out.print("Input Panjang: ");
            panjang = in.nextInt();
            System.out.print("Input Lebar: ");
            lebar = in.nextInt();
            System.out.print("Input Tinggi: ");
            tinggi = in.nextInt();
            Balok balok = new Balok(panjang, lebar, tinggi);

            System.out.println("Luas Persegi Panjang= " + balok.hitungLuas());
            System.out.println("Keliling Persegi Panjang= " + balok.hitungKeliling());
            System.out.println("Volume Balok= " + balok.hitungVolume());
            System.out.println("Luas Permukaan Balok= " + balok.hitungLuasPermukaan());
            break;
            
        case 2:
            System.out.print("Input Tinggi: ");
            tinggi = in.nextInt();
            System.out.print("Input Jari - jari: ");
            jari = in.nextInt();
            Tabung tabung = new Tabung(jari, tinggi);

            System.out.println("Luas Lingkaran= " + tabung.hitungLuas());
            System.out.println("Keliling Lingkaran= " + tabung.hitungKeliling());
            System.out.println("Volume Tabung= " + tabung.hitungVolume());
            System.out.println("Luas Permukaan Tabung= " + tabung.hitungLuasPermukaan());
            break;
        } 
        System.out.print("Ulangi? (Ya: 1 || Tidak: 0) : ");
            ulangi = in.nextInt();
        }while(ulangi == 1);
    }  
}
