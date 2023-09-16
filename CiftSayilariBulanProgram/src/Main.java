import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        int toplam=0;
        int sayac=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Sayı Giriniz : ");
        a=input.nextInt();
            for(int i=0;i<=a;i++){
                if (i%3==0&&i%4==0){
                    System.out.println(i);

                    toplam=toplam+i;
                    sayac=sayac+1;
                }
            }
        System.out.println("Ortalama : " +(toplam/sayac));
        }
    }
