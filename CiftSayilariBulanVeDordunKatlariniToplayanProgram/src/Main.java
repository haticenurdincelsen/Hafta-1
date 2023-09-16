    import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        int i;
        int total = 0;
        Scanner input = new Scanner(System.in);
        do {

            System.out.print("Lütfen Sayı Giriniz");
            i = input.nextInt();
            if (i % 4 == 0) {
                total += i;
            }
        } while(i%2==0);
                System.out.println("Toplam : " + total);
        }
    }