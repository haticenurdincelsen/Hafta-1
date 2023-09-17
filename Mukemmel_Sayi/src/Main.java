import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan Sayıyı Alalım.
        int n,total=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        n= input.nextInt();
        //Girilen sayıya kadar döngü oluşturalım.
        for (int i=1;i<n;i++) {
            if (n%i==0){
                total+=i;
            }
        }
        if (total==n){
            //Sonucu ekrana yazdıralım.
            System.out.println(n + " sayısı mükemmel sayıdır.");
        }else{
            System.out.println(n+ " sayısı mükemmel sayı değildir.");
        }
    }
}