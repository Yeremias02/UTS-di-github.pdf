/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author USER
 */
public class matematikaberaksi {
    public static void main(String[] args){
        matematikacanggih matcanggih = new matematikacanggih();
        
        // uji angkah pecahsn 
        System.out.println("Uji Parameter Pecahan:");
        System.out.printf("pertambahan: %.2f%n", matcanggih.pertambahan(12.5, 28.7, 14.2));
        System.out.println("pertambahan: " + matcanggih.pertambahan(12, 28, 14));
        System.out.println("pertambahan: " + matcanggih.pertambahan(23, 34));
        System.out.printf("pertambahan: %.2f%n", matcanggih.pertambahan(3.4, 4.9));
        
        //uji operasi tiga angka
        System.out.println("\noperasi  gabbungabn tiga angkah:");
        System.out.printf("12.5 + 28.7 - 14.2 = %.2f%n",matcanggih.operasiTigaAngkah(12.5, 28.7, 14.2));
    }
}