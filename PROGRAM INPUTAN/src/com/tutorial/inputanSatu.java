package com.tutorial;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class inputanSatu {
    public static void main (String[] agrs){
        // inputan satu satu
        String namaFile = "segitiga.txt";
        try (Scanner in = new Scanner(new FileReader(namaFile))){
            System.out.println("SISIA       SISIB       SISIC       TINGGI      JENIS SEGITIGA"  );

        while (in.hasNext()){                                           //mengechek apakah ada baris berikutnya
            String line = in.nextLine();
            String [] kolom = line.split(";");                     // memisahkan dari file kita buat dengan tanda pemisa;
            int sisia = Integer.parseInt(kolom[0]);                    // mengkonversi dari string yeks menuju integer
            int sisib = Integer.parseInt(kolom[1]);
            int sisic = Integer.parseInt(kolom[2]);
            int tinggi = Integer.parseInt(kolom[3]);
            // program bagian perhitungan
            int a =hitungSegitiga(sisia);
            int b =hitungSegitiga1(sisib,sisic,tinggi);
            int c =hitungSegitiga2(sisib,sisic,tinggi);
            if ( a <= b &&  a >=c ){
                System.out.println(sisia+"            "+sisib+"            "+sisic+"           "+tinggi+"          "+"SIKU-SIKU");
            }else  if ( a > b ){
                System.out.println(sisia+"            "+sisib+"            "+sisic+"           "+tinggi+"          "+"TUMPUL");
            }else if (a < b ){
                if ( a != b) {
                    System.out.println(sisia + "            " + sisib + "            " + sisic + "           " + tinggi + "          " + "LANCIP");
                }

            }

            }
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static int hitungSegitiga2 ( int sisib, int sisic,int tinggi) {
        int kuadratKedua1 = (sisib * sisib) + (sisic * sisic) - tinggi;
        return kuadratKedua1;
    }
    private static int hitungSegitiga1 ( int sisib, int sisic,int tinggi) {

        int kuadratKedua = (sisib * sisib) + (sisic * sisic) + tinggi;
        return kuadratKedua;
    }
    private static int hitungSegitiga (int sisia){
        int kuadratPanjang = sisia*sisia;
        return kuadratPanjang;

    }
}
