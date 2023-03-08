/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Scanner;
import bidangdanruang.Balok;
import bidangdanruang.Lingkaran;
import bidangdanruang.PersegiPanjang;
import bidangdanruang.Tabung;
/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        
        int Pilih, Ulangi;
        double panjang, lebar, tinggi, Tinggi, jari;
        
        Scanner input = new Scanner(System.in);
        
        do{
        
        System.out.println("==========\nMenu Utama\n==========");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. Exit");
        System.out.print("Pilih: ");
        Pilih = input.nextInt();
        
        switch (Pilih){
            case 0 :
                break;
            case 1 :  
                System.out.print("Input Panjang: ");
                panjang = input.nextDouble();  
                System.out.print("Input Lebar: ");
                lebar = input.nextDouble();  
                System.out.print("Input Panjang: ");
                tinggi = input.nextDouble();
                
                PersegiPanjang persegipanjang = new PersegiPanjang(panjang, lebar);
                Balok balok = new Balok(tinggi, panjang, lebar);
                
                System.out.println("Luas Persegi Panjang= " + persegipanjang.luas());
                System.out.println("Keliling Persegi Panjang= "+ persegipanjang.keliling());
                System.out.println("Luas Permukaan Balok= " + balok.luaspermukaan());
                System.out.println("Volume Balok= " + balok.volume());
                
                break;

            case 2 : 
                System.out.print("Input Tinggi: ");
                Tinggi = input.nextDouble();  
                System.out.print("Input Jari-jari: ");
                jari = input.nextDouble();
                
                Lingkaran lingkaran = new Lingkaran(jari);
                Tabung tabung = new Tabung(Tinggi,jari);
                
                System.out.println("Luas Lingkaran= " + lingkaran.luas());
                System.out.println("Keliling Lingkaran= "+ lingkaran.keliling());
                System.out.println("Luas Permukaan Tabung= " + tabung.luaspermukaan());
                System.out.println("Volume Tabung= " + tabung.volume());
                
                break;
                
            default : 
                System.out.println("Input salah. Silakan ulangi.");
                break;
        }
        
            
            System.out.println("Ulangi?(Ya: 1||Tidak: 0)");
            Ulangi = input.nextInt();
            
            
        }while(Pilih !=0 && Ulangi==1);
    }
}
