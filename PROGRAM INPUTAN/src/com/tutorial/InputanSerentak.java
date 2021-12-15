package com.tutorial;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InputanSerentak {
    public static void main(String[] args) {
        System.out.println("PROGRAM SERENTAK PENENTUAN SEGITIGA");
        String namaFile = "segitiga.txt";

        // menghitung jumblah baris
        int n = 0;
        try (Scanner cekin = new Scanner(new FileReader(namaFile))) {
            while (cekin.hasNext()) {                        // cek brp baris dengan berurutan
                String cekling = cekin.nextLine();          // membaca setiap baris
                n++;                                         // increment agar si perlulangan akan meriksa baris berikutnya
                // kita print kan si baris ( System.out.println(n)
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (Scanner in = new Scanner(new FileReader(namaFile))) {
            System.out.println("SISIA       SISIB       SISIC       TINGGI      JENIS SEGITIGA");
            int i = 0;
            int[] sisia = new int[n];
            int[] sisib = new int[n];
            int[] sisic = new int[n];
            int[] tinggi = new int[n];
            int[] a =new int[n];
            int[] b =new int[n];
            int[] c =new int[n];

            // baca masukan serentak, si sistem akan memasukan variable serentak atau bersama-sama
            while (in.hasNext()) {
                String line = in.nextLine();
                String[] kolom = line.split(";");
                sisia[i] = Integer.parseInt(kolom[0]);
                sisib[i] = Integer.parseInt(kolom[1]);
                sisic[i] = Integer.parseInt(kolom[2]);
                tinggi[i] = Integer.parseInt(kolom[3]);
                i++;
            }
                for(int j=0;j<i;j++){
                    a[j] = hitungSegitiga(sisia[j]);
                    b[j] = hitungSegitiga1(sisib[j],sisic[j],tinggi[j]);
                    c[j] = hitungSegitiga2(sisib[j],sisic[j],tinggi[j]);
                }
                for (int k = 0; k < i; k++) {
                    if (a[k] <= b[k] && a[k] >= c[k]) {
                        System.out.println(sisia[k] + "            " + sisib[k] + "            " + sisic[k] + "           " + tinggi[k] + "          " + "SIKU-SIKU");
                    } else if (a[k] > b[k]) {
                        System.out.println(sisia[k] + "            " + sisib[k] + "            " + sisic[k] + "           " + tinggi[k] + "          " + "TUMPUL");
                    } else {
                        System.out.println(sisia[k] + "            " + sisib[k] + "            " + sisic[k] + "           " + tinggi[k] + "          " + "LANCIP");
                            }

                         }

                    }

            catch (FileNotFoundException e) {
            e.printStackTrace();
                }

        }

    private static int hitungSegitiga2 (int sisib, int sisic, int tinggi) {
        int a = (sisib * sisib) + (sisic * sisic) - tinggi;
        return a;
        }
    private static int hitungSegitiga1 ( int sisib, int sisic,int tinggi) {

        int b = (sisib * sisib) + (sisic * sisic) + tinggi;
        return b;
         }
    private static int hitungSegitiga (int sisia){
        int c = sisia*sisia;
        return c;

         }
}

