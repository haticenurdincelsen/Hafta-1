import java.util.Scanner;
public class Main {
    public static void main (String []args){
        int Km;
        double perKm=2.20,total,startprice=10;
        Scanner input =new Scanner(System.in);
        System.out.print("Mesafeyi Km cinsinden giriniz : ");
        Km=input.nextInt();
        total=(Km*perKm);
        total+=startprice;
        total=(total<20)?20:total;
        System.out.println("Total Tutar : "+total);
    }
}