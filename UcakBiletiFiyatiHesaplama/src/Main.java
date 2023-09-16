import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri int ve double komutları ile tanımlayalım.
        int mesafe,km,yas,yolculukT;
        double normalFiyat,yasIndirimi1,yasIndirimi2,yasIndirimi3,IndirimliFiyat1,IndırımlıFİyat2,IndırımlıFİyat3;
        //Kullanıcıdan Veri Girişi Yaomasını İsteyelim.
        Scanner info=new Scanner(System.in);
        System.out.print("Lütfen Gidilecek Mesafeyi Giriniz : ");
        km=info.nextInt();
        System.out.print("Lütfen Yolcunun Yaşını Giriniz : ");
        yas=info.nextInt();
        System.out.print("Lütfen Yolculuk Tercihi Yapınız : \n1-Tek yön:\n2-Gidiş Dönüş:");
        yolculukT=info.nextInt();
        //İndirimleri Tanımlayalım.
        normalFiyat= km*0.10;
        yasIndirimi1=normalFiyat*0.50;
        yasIndirimi2=normalFiyat*0.10;
        yasIndirimi3=normalFiyat*0.30;
        IndirimliFiyat1=normalFiyat-yasIndirimi1;
        IndırımlıFİyat2=normalFiyat-yasIndirimi2;
        IndırımlıFİyat3=normalFiyat-yasIndirimi3;
        //Koşullu İfadeleri Girelim.
        if (yas>0&&yas<=12&&yolculukT==1&&km>0) {
            System.out.print("Toplam Tutar :" + IndirimliFiyat1);

        }else if (yas > 0 && yas <= 12 && yolculukT==2 && km>0) {
            System.out.print("Toplam Tutar :" + ((IndirimliFiyat1 - (IndirimliFiyat1 * 0.20) * 2)));

        }else if (yas>0 && yas>12 && yas<=24 && yolculukT==1 && km>0) {
            System.out.print("Toplam Tutar: " +IndırımlıFİyat2);

        }else if (yas>0 && yas>12 && yas<=24 && yolculukT==2 && km>0) {
            System.out.print("Toplam Tutar: " +((IndırımlıFİyat2-(IndırımlıFİyat2*0.20))*2) +" TL");

        }else if (yas>0 && yas>=65 && yolculukT==1 && km>0) {
            System.out.print("Toplam Tutar: " +IndırımlıFİyat3);

        }else if (yas>0 && yas>=65 && yolculukT==2 && km>0) {
            System.out.print("Toplam Tutar: " +((IndırımlıFİyat3-(IndırımlıFİyat3*0.20))*2));

        }else if (yas>0 && yas>24 &&yas<65&& yolculukT==1 && km>0) {
            System.out.print("Toplam Tutar: " +normalFiyat);

        }else if (yas>0 && yas>24 && yas<65&& yolculukT==2 && km>0) {
            System.out.print("Toplam Tutar: " +normalFiyat*0.20*2);

        }else{
            System.out.print("Hatalı Giriş Yaptınız.");
        }
    }
}