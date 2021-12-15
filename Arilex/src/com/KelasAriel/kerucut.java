package com.KelasAriel;
import java.util.Scanner;

public class kerucut {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Program Menghitung Luas & Volume Kerucut");
        try {
            float phi = 3.14f;

            System.out.println("Diameter = ");
            String Diameter = Input.nextLine();

            System.out.println("Tinggi = ");
            String Tinggi = Input.nextLine();

            float D = Float.parseFloat(Diameter);
            float T = Float.parseFloat(Tinggi);
            float r = D / 2;
            float Luas = phi * r * r;
            float Volume = (Luas * T) / 3;

            System.out.println("Luas Alas Kerucut = " + Luas);
            System.out.println("Volume kerucut = " + Volume);
        }
        catch (Exception e) {
            System.out.println("Program has Failed");
            System.out.println(e.getMessage());
        }
    }
}