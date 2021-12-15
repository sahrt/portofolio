package com.tutorial;

import java.util.Scanner;

public class inkripsi {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("SISTEM MENARA HANOI \n===========================");
            System.out.print("Banyaknya Piringan : ");
            int dics = input.nextInt();

            menaraHanoi(dics, 'A', 'B', 'C');
        }catch (Exception e){
            System.out.println("kesalahnya yaitu = "+ e.getMessage());
        }
        System.out.println("===== PROGRAM JAVA ====");

    }
    static int i = 1; // sebagai ketetapan semua variable i dalam metod supaya sama dengan
    private static  void  menaraHanoi (int dics, char awal, char bantu, char tujuan ){
        if (dics == 1){ // KONDISI INI DIMANA AKAN TERFOKUS PADA DISC TERKECIL
            System.out.println("Langkah ke -"+ i++ + "\n pindahkan ke = "+ dics + " dari " + awal + " ke " + tujuan);

        }else { // KONDISI INI DIMANA AKAN TERFOKUS PADA DISC BESAR
            menaraHanoi(dics-1, awal, tujuan, bantu);
            System.out.println("langka ke -" + i++ + " \n pindahkan disc ke "+ dics +" dari " +awal+ " ke "+ tujuan);
            menaraHanoi(dics-1, bantu, awal, tujuan);
        }
    }
}
