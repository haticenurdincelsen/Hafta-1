import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yıl;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir yıl bilgisi giriniz : ");
        yıl=inp.nextInt();
        if (yıl%4==0) {
            System.out.print(yıl + " Bir artık yıldır. ");
        }
        else{
            System.out.print(yıl+ " Bir artık yıl değildir. ");

        }
    }
}