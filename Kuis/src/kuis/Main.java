/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

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
        
        System.out.println("FORM PENDAFTARAN PT.UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        int pilih = in.nextInt();
          
        switch (pilih){
      
        case 1:
            System.out.println("FORM PENDAFTARAN");
            System.out.print("Input NIK : ");
            String nik = in.next();
            System.out.print("Input NAMA : ");
            String nama = in.next();
            System.out.print("Input Nilai Tes Tulis : ");
            double tulis = in.nextDouble();
            System.out.print("Input Nilai Tes Coding : ");
            double coding = in.nextDouble();
            System.out.print("Input Nilai Tes Wawancara: ");
            double wawancara = in.nextDouble();
            AndroidDeveloper androidD = new AndroidDeveloper(tulis, coding, wawancara);

            do{
            System.out.println("Menu");
            System.out.println("1. Edit");
            System.out.println("2. Tampil");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = in.nextInt();
            
            if (pilih == 1){
                System.out.println("FORM EDIT");
                System.out.print("Input Nilai Tes Tulis : ");
                tulis = in.nextDouble();
                androidD.setTulis(tulis);
                System.out.print("Input Nilai Tes Coding : ");
                coding = in.nextDouble();
                androidD.setCoding(coding);
                System.out.print("Input Nilai Tes Wawancara : ");
                wawancara = in.nextDouble();
                androidD.setWawancara(wawancara);
                } 
            else if(pilih == 2){
                System.out.println("Nilai Akhir : " + androidD.hasil());
                System.out.println("Keterangan : " + androidD.keterangan());
                }

                }while(pilih != 3);
            
            break;
            
        case 2:
            System.out.println("FORM PENDAFTARAN");
            System.out.print("Input NIK : ");
            String nik2 = in.next();
            System.out.print("Input NAMA : ");
            String nama2 = in.next();
            System.out.print("Input Nilai Tes Tulis : ");
            double tulis2 = in.nextDouble();
            System.out.print("Input Nilai Tes Coding : ");
            double coding2 = in.nextDouble();
            System.out.print("Input Nilai Tes Wawancara: ");
            double wawancara2 = in.nextDouble();
            WebDeveloper WebD = new WebDeveloper(tulis2, coding2, wawancara2); 
            
            do{
            System.out.println("Menu");
            System.out.println("1. Edit");
            System.out.println("2. Tampil");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = in.nextInt();
            
            if (pilih == 1){
                System.out.println("FORM EDIT");
                System.out.print("Input Nilai Tes Tulis : ");
                tulis2 = in.nextDouble();
                WebD.setTulis2(tulis2);
                System.out.print("Input Nilai Tes Coding : ");
                coding2 = in.nextDouble();
                WebD.setCoding2(coding2);
                System.out.print("Input Nilai Tes Wawancara : ");
                wawancara2 = in.nextDouble();
                WebD.setWawancara2(wawancara2);
                } 
            else if(pilih == 2){
                System.out.println("Nilai Akhir : " + WebD.hasil());
                System.out.println("Keterangan : " + WebD.keterangan());
                }

                }while(pilih != 3);
            
            break;
        }  
    } 
}
