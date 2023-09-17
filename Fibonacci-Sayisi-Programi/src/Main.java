import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlayalım
    int n,sayi1=0,sayi2=1,sayi3,total=2;
    Scanner input=new Scanner(System.in);
    //Kullanıcıdan veri alalım.
    System.out.print("Fibonacci Serisinin Uzunluğunu Giriniz: ");
    n=input.nextInt();

        System.out.print(sayi1+" ");
        System.out.print(sayi2+" ");
        //do döngüsü kullanarak seri oluşturulmuştur.
        do {
            total++;
            sayi3=sayi1+sayi2;
            sayi1=sayi2;
            sayi2=sayi3;
            System.out.print(sayi3+" ");
        }while (total!=n);
    }
}