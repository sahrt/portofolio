package com.tutorial;

import java.awt.image.Kernel;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class JamKerjaSatuSatu {
    public static void main(String[] args) {
        System.out.println("Program Dimulai");
        String namaFile = "JamKerja.txt";
        try (Scanner in = new Scanner(new FileReader(namaFile))){
            System.out.println("NAMA        JAM KERJA       GAJI");

            while (in.hasNext()){
                String line = in.nextLine();
                String [] kolom = line.split(";");
                String nama = kolom [0];
                int jamKerja =Integer.parseInt(kolom[1]);

                // program perhitungan
                int gaji = jamKerja*10000;
                System.out.println(nama+"         "+jamKerja+"           "+gaji);
            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }



    }
}
