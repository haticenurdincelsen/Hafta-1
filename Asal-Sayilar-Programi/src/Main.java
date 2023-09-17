import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Üst Sınırı Giriniz :");
        int ustSinir = input.nextInt();

        System.out.println("1 ile " + ustSinir +" arasındaki asal sayılar :");
        for (int i = 2; i <= ustSinir; i++) {
            boolean asal = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.print(i + " ");

            }
        }
    }
}