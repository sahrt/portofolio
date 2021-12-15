package com.tutorial;

import java.beans.Encoder;
import java.util.Base64;
import java.util.Locale;
import java.util.Scanner;

public class EnkripsiArray {
    public static void main(String[] args) {
        System.out.println("ENKRIPSI ARRAY JAVA");
        System.out.println("============ by_wahyu =============");
        Scanner wahyu = new Scanner(System.in);
        System.out.print("Masukan password anda :");

        // data kunci
        char [] inputan = "abcdefgijklmnopqrstuvwxyz".toCharArray();
        char [] key = "hijklmnopqrstuvwxyzabcdefg".toCharArray();
        try {
            String masukan = wahyu.next();
            System.out.println("password = " + masukan);
            char [] data = masukan.toCharArray();

            // kita buat data array baru sebagai tempat hasilnya

             // memulai awal maka kita gunakan variable pemulaian

            System.out.print("maka yang dihasilkan yaitu : ");
           memasukanStringKeArray(inputan,key,data);
            System.out.println("=== SEMOGA HARIMU MENYENANGKAN ===");

        }catch (Exception e){
            System.out.println( "kelasahan yaitu = " + e.getMessage());
        }


    }
    private static void  memasukanStringKeArray (char [] dataScanner, char[] keypasword, char [] datachar){
        // memulai awal maka kita gunakan variable pemulaian
        int ui = 0;
        // kita buat data array baru sebagai tempat hasilnya
        char [] hasilcovert = new char [datachar.length];
        for (int i = 0; i < datachar.length; i++){
            ui = new String(dataScanner).indexOf(datachar[i]);

            hasilcovert[i] = keypasword[ui];
        }
        // for each
        String hasil = "";
        for ( char h : hasilcovert){
           hasil += h;
        }
        System.out.println("pasword convert = " + hasil);
    }

}
