import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yıl;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir Yıl Giriniz ");
        yıl =inp.nextInt();

        boolean artıkyıl=false;
        if(yıl %4 ==0) {
            if (yıl % 100 != 0 || yıl % 400 == 0) {
                artıkyıl = true;
            }
        }
        if (artıkyıl) {
            System.out.println(yıl + " Bir Artık Yıldır. ");
        } else {
            System.out.println(yıl + " Bir Artık Yıl Değildir. ");
            }
        }
    }