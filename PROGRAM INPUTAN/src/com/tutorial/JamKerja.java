package com.tutorial;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class JamKerja {
    public static void main(String[] args) {
        // inputa serentak
        System.out.println(" PROGRAM DIMULAI");
        String namaFile ="JamKerja.txt";

        // menghitung jumblah baris
        int n = 0;
        try (Scanner cek = new Scanner(new FileReader(namaFile)))
        {
            while ( cek.hasNext())
            {
                String cekline= cek.nextLine();
                n++;

            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try (Scanner hasilBaca = new Scanner(new FileReader(namaFile))) {
            System.out.println("NAMA        JAM KERJA       GAJI");
            // inisiasi si variable
            int i =0;
            String nama [] = new String[n];
            int [] jamKerja = new int [n];
            int [] gaji = new int [n];

            while (hasilBaca.hasNext()) {
                String line = hasilBaca.nextLine();
                String [] kolom = line.split(";");

                // KITA BAGI VARIABLENYA
                nama[i]=kolom[0];
                jamKerja[i]=Integer.parseInt(kolom[1]);
                i++;

            }

            // proses serentaknya
            for (int j = 0; j <i;j++){
                gaji [j] = jamKerja [j] * 10000;
            }
            for (int k=0; k<i ; k++){
                System.out.println(nama[k]+"           "+jamKerja[k]+"        "+ gaji[k]);
            }

            }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
