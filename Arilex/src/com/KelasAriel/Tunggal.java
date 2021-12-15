package com.KelasAriel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Tunggal {
    public static void main(String[] args) {
        System.out.println("Menentukan Gaji Karyawan");
        String namafile = "jam kerja.txt";

        try (Scanner in = new Scanner(new FileReader(namafile))) {
            System.out.println("Nama     Jam Kerja     Gaji");
            while (in.hasNext()) {
                String line = in.nextLine();
                String[] kolom = line.split(";");

                String Nama = kolom[0];
                int Waktu = Integer.parseInt(kolom[1]);
                int Gaji = Waktu * 20000;

                System.out.println(Nama + "     " + Waktu + "     " + Gaji);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
