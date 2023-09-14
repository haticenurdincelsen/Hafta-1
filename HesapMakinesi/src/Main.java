import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, secim;
        Scanner input = new Scanner(System.in);
            System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();
            System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
            System.out.print("Seçiminiz nedir : ");
        secim = input.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Toplama İşlemi Sonucunuz: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkartma İşlemi Sonucunuz: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma İşlemi Sonucunuz: " + (n1 * n2));
                break;
            case 4:
                switch (n2) {
            case 0:
                        System.out.println("Bir Sayı Sıfıra Bölünemez Lütfen İşlemi Tekrar Deneyiniz");
                 break;
                    default:
                        System.out.println("Bölme İşlemi Sonucunuz: " + (n1 / n2));
                 }
                 break;
                    default:System.out.println("Yanlış Seçim Yaptınız Birkez Daha Deneyiniz : ");
            }
        }
    }