import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int r,a;
    double alan,pi=3.14;
    Scanner input=new Scanner(System.in);
    System.out.print("Dairenin Yarıçap Değerini Giriniz : ");
    r=input.nextInt();
    System.out.print("a Merkez Açısı Değerini Giriniz");
    a=input.nextInt();
    alan=(pi*(r*r)*a)/360;
    System.out.println("Alan:"+ alan);
    }
}