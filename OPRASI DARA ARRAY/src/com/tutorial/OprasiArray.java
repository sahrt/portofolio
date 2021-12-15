package com.tutorial;

import java.util.Arrays;

public class OprasiArray {
    public static void main(String[] args) {
        System.out.println(" Perogram Oprasi java");
        float[] array1 = {23,6,47,35,200,14};
        rataRata(array1);
        arrayTerkecil(array1);
        arrayTerbesar(array1);
        bilanganGanjil(array1);
        bilanganGenap(array1);


    }
    private static float rataRata (float [] dataArray){
        float jumblah= 0;
        float nilaiRata = 0;
        for (int i = 0; i < dataArray.length;i++){
            jumblah = jumblah + dataArray[i];
        }
        nilaiRata = jumblah/dataArray.length;
        System.out.println("hasil :"+nilaiRata);

        return nilaiRata;
    }
    private static void arrayTerbesar (float[] dataArray){
        Arrays.sort(dataArray);
        System.out.println("nilai terbesar = "+ dataArray[dataArray.length-1]);

    }
    private static void  arrayTerkecil (float [] dataArray){
        float var = 100;

        for(float value : dataArray){
            if(value < var){
                var = value;
            }
        }
        System.out.println("nilai terkecil = " + var);

    }
    private static void bilanganGenap (float [] dataArray){
        System.out.print("\n");
        System.out.println("bilangan Genap");

        for (int i = 0; i < dataArray.length;i++){
            if (dataArray[i] %2 == 0){
                System.out.print(dataArray[i]+",");
            }
        }
        System.out.println("\n");
    }
    private static void  bilanganGanjil (float [] dataArray){
        System.out.println("bilangan ganjil");

        for (int j=0; j < dataArray.length;j++){
            if (dataArray[j] %2 != 0 ){
                System.out.print(dataArray[j]+",");
            }
        }
    }


}
