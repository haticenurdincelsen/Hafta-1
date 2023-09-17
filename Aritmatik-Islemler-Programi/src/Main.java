import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a sayısını girin: ");
        double a = scanner.nextDouble();

        System.out.print("b sayısını girin: ");
        double b = scanner.nextDouble();

        System.out.print("c sayısını girin: ");
        double c = scanner.nextDouble();

        double sonuc = a + b * c - b;

        System.out.println("Sonuç: " + sonuc);
    }
}