package com.KelasAriel;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Triangel {
    public static void main(String[] args) {
        System.out.println("Menentukan Jenis Segitiga");
        String namafile = "Triangel.txt";

        try (Scanner in = new Scanner(new FileReader(namafile))) {
            System.out.println("Sisi A     Sisi B     Sisi C     Tinggi     Jenis Segitiga");
            while (in.hasNext()) {
                String line = in.nextLine();
                String[] kolom = line.split(";");

                int SisiA = Integer.parseInt(kolom[0]);
                int SisiB = Integer.parseInt(kolom[1]);
                int SisiC = Integer.parseInt(kolom[2]);
                int Tinggi = Integer.parseInt(kolom[3]);

                int KuadratA = SisiA * SisiA;
                int KuadratB = SisiB * SisiB;
                int KuadratC = SisiC * SisiC;

                if (SisiA > SisiB && SisiA > SisiC) {
                    if (KuadratA < KuadratB + KuadratC - Tinggi) {
                        System.out.println(SisiA + "     " + SisiB + "     " + SisiC + "     " + Tinggi + "     " + "Lancip");
                    } else if (KuadratA <= KuadratB + KuadratC + Tinggi && KuadratA >= KuadratB + KuadratC - Tinggi) {
                        System.out.println(SisiA + "     " + SisiB + "     " + SisiC + "     " + Tinggi + "     " + "Siku - Siku");
                    } else if (KuadratA > KuadratB + KuadratC + Tinggi) {
                        System.out.println(SisiA + "     " + SisiB + "     " + SisiC + "     " + Tinggi + "     " + "Tumpul");
                    }
                } else if (SisiB > SisiA && SisiB > SisiC) {
                    if (KuadratB < KuadratA + KuadratC - Tinggi) {
                        System.out.println(SisiA + "     " + SisiB + "     " + SisiC + "     " + Tinggi + "     " + "Lancip");
                    } else if (KuadratB <= KuadratA + KuadratC + Tinggi && KuadratB >= KuadratA + KuadratC - Tinggi) {
                        System.out.println(SisiA + "     " + SisiB + "     " + SisiC + "     " + Tinggi + "     " + "Siku - Siku");
                    } else if (KuadratB > KuadratA + KuadratC + Tinggi) {
                        System.out.println(SisiA + "     " + SisiB + "     " + SisiC + "     " + Tinggi + "     " + "Tumpul");
                    }
                } else if (SisiC > SisiA && SisiC > SisiB) {
                    if (KuadratC < KuadratA + KuadratB - Tinggi) {
                        System.out.println(SisiA + "     " + SisiB + "     " + SisiC + "     " + Tinggi + "     " + "Lancip");
                    } else if (KuadratC <= KuadratA + KuadratB + Tinggi && KuadratC >= KuadratA + KuadratB - Tinggi) {
                        System.out.println(SisiA + "     " + SisiB + "     " + SisiC + "     " + Tinggi + "     " + "Siku - Siku");
                    } else if (KuadratC > KuadratA + KuadratB + Tinggi) {
                        System.out.println(SisiA + "     " + SisiB + "     " + SisiC + "     " + Tinggi + "     " + "Tumpul");
                    }
                }
            }
            }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}




