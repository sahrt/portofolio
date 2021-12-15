package com.tutorial;
import java.util.Scanner;

public class Sayang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ketikkan angka p:");

        int num_p = scanner.nextInt();

        System.out.print("Ketikkan angka q:");

        int num_q = scanner.nextInt();

        System.out.print("Ketikkan angka r:");

        int num_r = scanner.nextInt();

        // kode program akan disisipkan di sini
        if (num_p>num_q){
           if (num_p>num_r) {
               System.out.println(num_p);
           }else {
               System.out.println(num_r);
           }
        }else if( num_q>num_r) {
            System.out.println(num_q);
        }else {
            System.out.println(num_r);
        }

    }
}
