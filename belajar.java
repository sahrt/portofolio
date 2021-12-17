package com.tutorial;

import java.util.HashMap;
import java.util.Scanner;

public class RekrusifPakDevit {
    public static void main(String[] args) {
        try {
            System.out.println("=== program rekrusif menghitung nilai faktorial====");
            System.out.println("============= by wahyu =======");
            Scanner INPUT = new Scanner(System.in);
            System.out.print("masukan nilai   : ");
            int masukan = INPUT.nextInt();
            System.out.println(" bilangan eksponen sial");
            System.out.print(" masukan  nilai input  : ");
            int bilangan = INPUT.nextInt();
            System.out.print(" masukan bilangan exsponensial : ");
            int expo = INPUT.nextInt();
            if (masukan > 0) {
                // bagian rekrusif
                System.out.println(" ");
                System.out.println("nilai rekrusif \n======================");
                rekursif(masukan);

                // bagian faktorial
                System.out.println(" ");
                System.out.println("nilai faktorial  ");
                System.out.println("=====================");
                int hasilfaktorial = faktorial(masukan);
                System.out.println(" hasil faktorila adalah = " + hasilfaktorial);

                // faktorial interative
                System.out.println(" ");
                System.out.println("nilai faktorial interative  ");
                System.out.println("=====================");
                int hasilfaktorial1 = faktorialinterative(masukan);
                System.out.println(" hasil faktorila adalah = " + hasilfaktorial1);

                // bagian hasil fibonaci
                System.out.println(" ");
                System.out.println("nilai  fibonaci ");
                System.out.println("=====================");
                int hasilFibonaci = fibonaci(masukan);
                System.out.println("hasil fibonaci yaitu = " + hasilFibonaci);

                // bagian hasil fibonaci dengan interatif
                System.out.println("bagian hasil fibonaci dengan interatif");
                int hasilFibonaciInteratif = fibonaciInteraktif(masukan);
                System.out.println("hasil fibonaci yaitu = " + hasilFibonaciInteratif);

                // eksponen
                System.out.println(" ");
                System.out.println("eksponen \n===================================");
                int hasilExponen = exsponensial(bilangan, expo);
                System.out.println("hasil exsponensial = " + hasilExponen);

                // eksponen dengan iterative
                System.out.println(" ");
                System.out.println("eksponen \n===================================");
                int hasilExponen1 =exsponensialIterative(bilangan, expo);
                System.out.println("hasil exsponensial = " + hasilExponen1);

                // cekBilangan Prima
                System.out.println(" ");
                System.out.println(" cek bilangan \n================");
                cekBilanganPrima(masukan);
            }else {
                System.out.println(" inputan salah harus > 0");
            }
        } catch (Exception e){
                System.out.println(" kesalahan = " + e.getMessage());
        }
    }

    private static void rekursif(int x) {

        if (x > 0) {
            rekursif(x - 1);
            System.out.print(x + " ");
        }
    }

    private static int faktorial(int x) {
        if (x == 1) {
            return x;
        }
        return x * faktorial(x - 1);
    }
    private static  int faktorialinterative (int x){
        int hasil = 1;
        if (x >= 0) {
            for (int i = 1; i <= x; i++) {
                hasil = hasil * i;
            }

        } else {
            System.out.println(" inputan harus diatas 0 ");
        }
        return hasil;
    }
    private static  int fibonaci ( int x){
        if (x == 1 || x ==0){
            return  x;
        }
        else
            return fibonaci(x -1) + fibonaci(x -2);

    }
   private static  int fibonaciInteraktif ( int x) {
       int fn = 1;
       int fn_1 = 1;
       int fn_2 = 0;
           for (int i = 1; i < x; i++) {
               fn = fn_1 + fn_2;
               fn_2 = fn_1;
               fn_1 = fn;

           }
           return fn;
          }
          private  static int exsponensial ( int x , int y ){
                if ( y == 0){
                    return 1;
                }else {
                    return x * exsponensial(x,y-1);
                }

          }
          private static int exsponensialIterative (int x, int y){
                    int hasil = 1 ;
                    for (int i = 1; i <=y ; i++){
                        hasil = hasil*x;
                    }
                    return hasil;
                    }
          private static void cekBilanganPrima (int bilangan){
            int hitung = 0;
            for (int i =1 ; i <= bilangan; i++){
                if ( bilangan%i==0){
                    hitung++;
                }
            }
            if (hitung==2){
                System.out.println("Termasuk bilangan prima");
            }else {
                System.out.println("Tidak termasuk Bilangan Prima");
            }
          }

   }


