package com.KelasAriel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Serentak {
    public static void main(String[] args) {
        System.out.println("Menentukan Gaji dengan Serentak");
        String namafile = "jam kerja.txt";

        int x = 0;
        try (Scanner cek = new Scanner(new FileReader(namafile))) {
            while (cek.hasNext()) {
                String cekline = cek.nextLine();
                x++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (Scanner hasilbaca = new Scanner(new FileReader(namafile))) {
            System.out.println("Nama     Jam Kerja     Gaji");

            String[] Nama = new String[x];
            int[] JamKerja = new int[x];
            int[] Gaji = new int[x];
            int i = 0;

            while (hasilbaca.hasNext()) {
                String line = hasilbaca.nextLine();
                String[] kolom = line.split(";");

                Nama[i] = kolom[0];
                JamKerja[i] = Integer.parseInt(kolom[1]);
                i++;
            }
            for (int j = 0; j < i; j++) {
                Gaji[j] = JamKerja[j] * 20000;
            }
            for (int k = 0; k < i; k++) {
                System.out.println(Nama[k] + "     " + JamKerja[k] + "     " + Gaji[k]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
