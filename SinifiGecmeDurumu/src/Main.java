import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematık, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan verileri isteyelim.
        System.out.print(" Matematik Notunuzu Giriniz : ");
        matematık = input.nextInt();

        System.out.print(" Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();

        System.out.print(" Türkçe Notunuzu Giriniz :");
        turkce = input.nextInt();

        System.out.print(" Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.print(" Müzik Notunuzu Giriniz  :");
        muzik = input.nextInt();
        // Koşulları belirleyelim.
            if (matematık >= 0 && matematık <= 100 &&
                fizik >= 0 && fizik <= 100 &&
                turkce >= 0 && turkce <= 100 &&
                kimya >= 0 && kimya <= 100 &&
                muzik >= 0 && muzik <= 100) {

            double ortalama = (matematık + fizik + kimya + turkce + muzik) / 5;

            if (ortalama < 55) {
                ;
                System.out.println(" Sınıfta Kaldınız. ");

            } else {
                System.out.println(" Sınıfı Geçtiniz. ");
            }
            System.out.println(" Ortalamanız : " + ortalama);
            //0 ile 100 arasında not girilmediyse uyarı verecek koşulu girelim.
            }else {
            System.out.println("Girilen Not Hatalıdır.Lütfen 0 ile 100 Arasında Not Girişi Yapınız.");
        }
    }
}
