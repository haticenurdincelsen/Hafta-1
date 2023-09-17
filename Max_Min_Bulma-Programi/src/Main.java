import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        int sayi;
        int enBuyuk = 0;
        int enKucuk = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "Sayıyı Giriniz : ");
            sayi = input.nextInt();
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }else if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }
        System.out.println("Yazdığınız En Küçük Sayı : "+enKucuk);
        System.out.println("Yazdığınız En Büyük Sayı : "+enBuyuk);
    }
}