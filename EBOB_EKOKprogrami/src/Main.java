import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan veri alalım .
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        int sayı1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        //tanımlamaları yapalım.
        int sayı2=input.nextInt();
        int ebob=1;
        int i=1;
        //koşulları belirleyelim.
        if (sayı1<sayı2){
            while (i<=sayı1){
                 if (sayı1%i==0 && sayı2%i==0) {
                         ebob = i;
                 }
                     i++;
            }
        }else{
            while (i<=sayı2){
                if (sayı1%i==0 && sayı2%i==0) {
                    ebob = i;
                }
                i++;
            }
        }
        int ekok= (sayı1*sayı2)/ebob;
        System.out.println("EBOB : "+ebob);
        System.out.println("EKOK : "+ekok);
        }
    }