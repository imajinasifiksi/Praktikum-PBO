/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
 
import java.util.Scanner;
/**
 *
 * @author RizkySusanto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int C, pilih;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("+---------------------------+");
        System.out.println("| Program Konversi Suhu Air |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius  : "); C = input.nextInt();
        
        Suhu suhu = new Suhu(C);
        do{
          System.out.println("\n 1. Lihat Data Konversi  \n 2. Edit Data Konversi  \n 3. Keluar  \n  Pilih : ");
          pilih = input.nextInt();
          
          switch (pilih){
                case 1:
                    System.out.println("\n");
                    System.out.println("Suhu dalam celcius : " + suhu.C + "°C");
                    System.out.println("Suhu dalam fahrenheit : " + suhu.Fahrenheit() + "°F");
                    System.out.println("Suhu dalam reamur : " + suhu.Reamur() + "°R");
                    System.out.println("Suhu dalam kelvin : " + suhu.Kelvin() + "K");
                    System.out.println("Kondisi Air " + suhu.Kondisi());
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("Silakan input suhu dalam celcius : ");
                    C = input.nextInt();
                    suhu.C = C;
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("ThankYou!!!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("");
                    System.out.println("Menu Tidak Tersedia!!!");
            }

        }while(pilih != 3);

    }
    
}
