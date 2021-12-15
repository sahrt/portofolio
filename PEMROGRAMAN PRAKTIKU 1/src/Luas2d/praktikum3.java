package Luas2d;

import java.util.Scanner;

public class praktikum3 {
    public static void main(String[] args) {
        Scanner inputAzril= new Scanner(System.in);
        int a,b,k;
        System.out.println("Nilai awal = ");
        a= inputAzril.nextInt();
        System.out.println("Nilai akhir = ");
        b= inputAzril.nextInt();
        if(a>0){
            if(b<0){
                k=a*b;
                System.out.println("nilai K = "+ k );
            }else if(b>=0){
                k=a/b;
                System.out.println("nilai k = "+ k);
            }
        }else if(a<=0){
            if(b>=0){
                k= a-b;
                System.out.println("nilai k = "+ k);
            }else if(b<=0){
                k=a+b;
                System.out.println("nilai k = "+ k);
            }
        }


    }
}
