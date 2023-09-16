import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("N sayısını giriniz ; ");
        int n=input.nextInt();
        //double ile tanımlayalım
        double sonuc=0.0;
        //for döngüsüne sokalım
        for (double i=1; i<=n;i++){
            sonuc+=(1/i);
        }
        System.out.println(sonuc);
    }
}