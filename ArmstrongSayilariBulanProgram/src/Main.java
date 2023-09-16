import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int sayı=input.nextInt();

        int temp=sayı;
        int toplam=0;
        while (sayı!=0){
            int basamak =sayı%10;
            toplam+=basamak;
            sayı/=10;
        }
        System.out.println(temp+" Sayısının basamakları toplamı "+toplam);
        }
    }
