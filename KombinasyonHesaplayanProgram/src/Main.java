import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       //Kullanıcıdan Veri İsteyelim
        System.out.print("Faktöriyel Sayısı 1 :");
        int n = input.nextInt();
        int total = 1;
        //Döngüler Başlatıldı,n degeri için
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        //Döngüler Başlatıldı,r degeri için
        Scanner input2 = new Scanner(System.in);
        System.out.print("Faktöriyel Sayısı 2 :");
        int r = input.nextInt();
        int toplam = 1;
        for (int a = 1; a <= r; a++) {
            toplam = toplam * a;
        }
        ////Döngüler Başlatıldı,n-r degeri için
        int c=n-r;
        int deger=1;
        for (int j=1; j<=c;j++){
            deger=deger*j;
        }
        System.out.println("sonuc: " +total/(toplam*deger));
        }
    }