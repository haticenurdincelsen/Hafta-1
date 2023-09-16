import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Degerleri tanımlayalım
        int n, k;
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan degerleri girmesini isteyelim
        System.out.print("Üssü Alınacak Sayıyı Girin : ");
        n = input.nextInt();
        System.out.print("Üs Olacak Sayıyı Girin ");
        k = input.nextInt();
        int total = 1;
        //döngüyü yazalım
        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        //Sonucu Yazdıralım
        System.out.print("Cevap :" + total);
    }
}