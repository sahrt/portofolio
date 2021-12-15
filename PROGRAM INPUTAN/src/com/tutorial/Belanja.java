package com.tutorial;

import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
        System.out.println(" Program dimulai");
        // inputan
        String namaFile = "Belanja.txt";
        try (Scanner in = new Scanner(new FileReader(namaFile))) {
            System.out.println("NAMA       JUMBLAH       HARGA BARANG      DISKON       HARGA"  );

            while (in.hasNext()){
                String line  = in.nextLine();
                String[] kolom = line.split(";");
                // inputkan satu satu
                String nama = kolom [0];
                int jumblah = Integer.parseInt(kolom [1]);
                int harga = Integer.parseInt(kolom[2]);
                float diskon = 0.05f;
                float a = harga(jumblah,harga);
                if ( jumblah >= 10){
                    float diskonHarga = a -(diskon*a);
                    System.out.println(nama+"          "+ jumblah +"            "+harga+"          "+ diskon+"         "+ diskonHarga);
                } else {
                    System.out.println(nama+"          "+ jumblah +"            "+harga+"                       "+ a);

                }


                //



                //



            }



        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
    private  static  int harga (int jumblah, int harga){
        float hargaTotal = jumblah * harga;
        return (int) hargaTotal;
    }
}


