import java.util.Scanner;

public class praktikum2 {
    public static void main(String[] args) {
        Scanner inputAzril= new Scanner(System.in);
        int a,b;
        // program ke dua
        System.out.println("Nilai awal = ");
        a= inputAzril.nextInt();
        System.out.println("Nilai akhir = ");
        b= inputAzril.nextInt();

        if (a%2==0){
            if (b%2==0){
                while (a<=b){
                    if (a%2==1){
                        System.out.println(a);

                    }
                    a++;
                }
            }
        }else {
            System.out.println(" input salah");
        }
    }
}
