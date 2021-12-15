package com.tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySandi {
    public static void main(String[] args) {
        System.out.println("=====PROGRAM ENKRIPSI DALAM GENERATOR PASWORD======");
        System.out.println("------------BY WAHYU SAHRI RHAMADHAN---------");
        Scanner userInput = new Scanner(System.in);
        String[] pasword = {"a", "b", "c", "d","e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v","w","x","y","z"};
        String[] key = {"h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "c", "d", "e","f","g"};

        System.out.println("masukan inputan");
        String masukan = userInput.nextLine();

        String hasil = " ";
        for (int i = 0; i < masukan.length(); i++) {
            String baca = String.valueOf(masukan.charAt(i));
            if (baca.equals(" ")) {
                hasil += " ";
                continue;
            }

            for (int j = 0; j < key.length; j++) {
                if (baca.equals(pasword[j])) {
                    hasil += key[j];

                }
            }
        }
        System.out.println("hasil PASSWORD  = " + hasil);
        System.out.println("======[PROGRAM SELESAI ]=======");
    }
}
