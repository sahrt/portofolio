package com.tutorial;

import java.util.Scanner;

public class Kakulator {
    public static void main(String[] args) {
        double angka1, angka2;
        String operator;

        System.out.println("Program Kakulator Method Fungsi \n================================================");
        Scanner inputAngka = new Scanner(System.in);
        while (true) {
            System.out.print("masukan bilangan pertama = ");
            angka1 = inputAngka.nextDouble();
            System.out.print("masukan Operator = ");
            operator = inputAngka.next();
            System.out.print("masukan bilangan kedua = ");
            angka2 = inputAngka.nextDouble();
            // panggil satu setiap method fungsi nya

            double hasil = penjumblahan(angka1, angka2);
            double hasil1 = pengurangan(angka1, angka2);
            double hasil2 = perkalian(angka1, angka2);
            double hasil3 = pembagian(angka1, angka2);
            pemilahanOperator(operator, hasil, hasil1, hasil2, hasil3);



        }

    }

    // tempat method fungsi berkerja
    private static void pemilahanOperator(String operator, double hasil, double hasil1, double hasil2, double hasil3) {
        switch (operator) {
            case "+":
                double hasilhitung = hasil;
                printHasil(hasilhitung);
                break;
            case "-":
                hasilhitung = hasil1;
                printHasil(hasilhitung);
                break;
            case "*":
                hasilhitung = hasil2;
                printHasil(hasilhitung);
                break;
            case "/":
                hasilhitung = hasil3;
                printHasil(hasilhitung);
                break;
            default:
        }
    }
    private static void printHasil(double hasilOperasi) {
        System.out.println("maka hasilnya =  " + hasilOperasi);
    }





    private static double penjumblahan(double angka1, double angka2) {
        double hasil = angka1 + angka2;
        return hasil;
    }

    private static double pengurangan(double angka1, double angka2) {
        double hasil = angka1 - angka2;
        return hasil;
    }

    private static double perkalian(double angka1, double angka2) {
        double hasil = angka1 * angka2;
        return hasil;
    }

    private static double pembagian(double angka1, double angka2) {
        double hasil = angka1 / angka2;
        return hasil;
    }
}
