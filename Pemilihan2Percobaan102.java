import java.util.Scanner;

public class Pemilihan2Percobaan102 {
    public static void main(String[] args) {
        Scanner absen = new Scanner(System.in);
         double tahun;
         System.out.println("Masukan Tahun : ");
         tahun = absen.nextInt();

        if ((tahun % 4) == 0){
            if ((tahun % 100) != 0)
            System.out.println("Tahun Kabisat");

        }else
        System.out.println("Bukan Tahun Kabisat");
    }
    
}