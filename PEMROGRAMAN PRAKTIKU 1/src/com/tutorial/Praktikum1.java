package com.tutorial;

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        int a,b,total, diskon;
        Scanner inputAzril = new Scanner(System.in);
        System.out.println("Nilai harga barang = ");
        a= inputAzril.nextInt();
        System.out.println("Nilai jumblah barang = ");
        b= inputAzril.nextInt();
        double total_bayar;

        total = a*b;
        if (total>=100000){
            diskon= (5*total)/100;
            total_bayar=total-diskon;
            System.out.println(" selamat anda mendapatkan diskon ");
        }else {
            total_bayar=total;
            System.out.println(" maaf belum adpet diskon");
        }
        System.out.println("harga barang yang dibayar = "+ total_bayar);

        System.out.println("program selesai bos");


    }



}
