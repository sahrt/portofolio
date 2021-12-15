package com.KelasAriel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        System.out.println("Menentukan Jenis Segitiga Dengan I/O Serentak");
        String namafile = "Triangel.txt";

        int x = 0;
        try (Scanner cek = new Scanner(new FileReader(namafile))) {
            while (cek.hasNext()) {
                String cekline = cek.nextLine();
                x++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (Scanner in = new Scanner(new FileReader(namafile))) {
            System.out.println("SisiA     SisiB     SisiC     Tinggi     Jenis Segitiga");
            int[] SisiA = new int[x];
            int[] SisiB = new int[x];
            int[] SisiC = new int[x];
            int[] Tinggi = new int[x];
            int[] A = new int[x];
            int[] B = new int[x];
            int[] C = new int[x];
            int[] D = new int[x];
            int i = 0;

            while (in.hasNext()) {
                String line = in.nextLine();
                String[] kolom = line.split(";");
                SisiA[i] = Integer.parseInt(kolom[0]);
                SisiB[i] = Integer.parseInt(kolom[1]);
                SisiC[i] = Integer.parseInt(kolom[2]);
                Tinggi[i] = Integer.parseInt(kolom[3]);
                i++;
            }

            for (int j = 0; j < i ; j++) {
                A[j] = SisiA[j] * SisiA[j] ;
                B[j] = SisiB[j] * SisiB[j];
                C[j] = SisiC[j] * SisiC[j];
                D[j] = Tinggi[j];
            }
            for (int k =0; k < i ; k++) {
                if (SisiA[k] > SisiB[k] && SisiA[k] > SisiC[k]) {
                    if (A[k] < B[k] + C[k] - Tinggi[k]) {
                        System.out.println(SisiA[k] + "     " + SisiB[k] + "     " + SisiC[k] + "     " + Tinggi[k] + "     " + "Lancip");
                    } else if (A[k] <= B[k] + C[k] + Tinggi[k] && A[k] >= B[k] + C[k] - Tinggi[k]) {
                        System.out.println(SisiA[k] + "     " + SisiB[k] + "     " + SisiC[k] + "     " + Tinggi[k] + "     " + "Siku - Siku");
                    } else if (A[k] > B[k] + C[k] + Tinggi[k]) {
                        System.out.println(SisiA[k] + "     " + SisiB[k] + "     " + SisiC[k] + "     " + Tinggi[k] + "     " + "Tumpul");
                    }
                } else if (SisiB[k] > SisiA[k] && SisiB[k] > SisiC[k]) {
                    if (B[k] < A[k] + C[k] - Tinggi[k]) {
                        System.out.println(SisiA[k] + "     " + SisiB[k] + "     " + SisiC[k] + "     " + Tinggi[k] + "     " + "Lancip");
                    } else if (B[k] <= A[k] + C[k] + Tinggi[k] && B[k] >= A[k] + C[k] - Tinggi[k]) {
                        System.out.println(SisiA[k] + "     " + SisiB[k] + "     " + SisiC[k] + "     " + Tinggi[k] + "     " + "Siku - Siku");
                    } else if (B[k] > A[k] + C[k] + Tinggi[k]) {
                        System.out.println(SisiA[k] + "     " + SisiB[k] + "     " + SisiC[k] + "     " + Tinggi[k] + "     " + "Tumpul");
                    }
                } else if (SisiC[k] > SisiA[k] && SisiC[k] > SisiB[k]) {
                    if (C[k] < A[k] + B[k] - Tinggi[k]) {
                        System.out.println(SisiA[k] + "     " + SisiB[k] + "     " + SisiC[k] + "     " + Tinggi[k] + "     " + "Lancip");
                    } else if (C[k] <= A[k] + B[k] + Tinggi[k] && C[k] >= A[k] + B[k] - Tinggi[k]) {
                        System.out.println(SisiA[k] + "     " + SisiB[k] + "     " + SisiC[k] + "     " + Tinggi[k] + "     " + "Siku - Siku");
                    } else if (C[k] > A[k] + B[k] + Tinggi[k]) {
                        System.out.println(SisiA[k] + "     " + SisiB[k] + "     " + SisiC[k] + "     " + Tinggi[k] + "     " + "Tumpul");
                    }
            }
        }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
    }
}
}