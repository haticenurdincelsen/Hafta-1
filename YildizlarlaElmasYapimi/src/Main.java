import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Ssayısı;
        System.out.print("Basamak Giriniz : ");
        Ssayısı = input.nextInt();

//Döngüyü başlatalım
        for (int i = 1; i <= Ssayısı; i++) {
            for (int k = 0; k < Ssayısı - i; k++) {
                System.out.print(" ");
            }
            for (int m = 0; m < 2 * i - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Ters Üçgen yapımı
        for (int i=Ssayısı-1;i>0;i--){
                for (int k = 0; k < Ssayısı - i; k++) {
                    System.out.print(" ");
                }
                for (int m = 0; m < 2 * i- 1; m++) {
                    System.out.print("*");
                }
            System.out.println();
        }

    }
}
