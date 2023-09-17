import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    //scanner sınıfını tanımlayıp kullanıcıdan veri aldık.
    int sonuc;
        System.out.print("Lütfen 1. veriyi giriniz : ");
        int a=input.nextInt();
        System.out.print("Lütfen 2. veriyi giriniz : ");
        int b=input.nextInt();
        System.out.print("Lütfen 3. veriyi giriniz : ");
        int c=input.nextInt();
    //matematiksel formülü girip sonucu ekrana yazdırdık.
        sonuc=(a+(b*c)-b);
        System.out.println("sonuç :" +sonuc);
    }
}