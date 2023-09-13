import java.util.Scanner;
public class Main{
    public static void main (String[]args){
        int kilo,tutar,elma,armut,domates,muz,patlican;
        double armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5,toplam;
        Scanner inp=new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız : ");
        armut=inp.nextInt();
        System.out.print("Kaç kilo elma aldınız : ");
        elma=inp.nextInt();
        System.out.print("Kaç kilo domates aldınız : ");
        domates=inp.nextInt();
        System.out.print("Kaç kilo muz aldınız : ");
        muz=inp.nextInt();
        System.out.print("Kaç kilo patlıcan aldınız : ");
        patlican=inp.nextInt();
        toplam=((armut*armutFiyat)+(elma*elmaFiyat)+(domates*domatesFiyat)+(muz*muzFiyat)+(patlican*patlicanFiyat));
        System.out.print("Toplam tutar : "+toplam);
        }
    }