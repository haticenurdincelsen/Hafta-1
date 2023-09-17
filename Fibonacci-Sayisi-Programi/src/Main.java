import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayılı seri istediğinizi giriniz: ");
        int numbers = input.nextInt();

        // Fibonacci serisi oluşturma bölgesi
        int n = 0;
        int nextValue = 1;
        int sum;
        int counter = 0;
        // Fibonacci serisi oluşturma bölgesi

        if (numbers > 0) {
            do {
                System.out.print(nextValue + " ");
                sum = nextValue + n;
                n = nextValue;
                nextValue = sum;

                counter ++;
            } while ( counter < numbers) ;
        } else {
            System.out.println("Lütfen geçerli bir sayı giriniz!");
        }
    }
}