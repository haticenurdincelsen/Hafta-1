import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy,indeks;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz : ");
        boy=input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo=input.nextInt();
        indeks=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+indeks);
    }
}