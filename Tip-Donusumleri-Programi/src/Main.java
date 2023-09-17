import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı giriniz : ");
        int a=input.nextInt();
        System.out.print("Lütfen bir ondalıklı sayı giriniz : ");
        double b=input.nextDouble();
        System.out.println("Tam sayı ifadesi ondalıklı ifadeye dönüştürüldü : "+(double)a);
        System.out.println("Ondalıklı sayı tam sayıya dönüştürüldü : "+(int)b);
        }
    }
