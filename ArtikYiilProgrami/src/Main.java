import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        int girilenYil;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yılı Giriniz : ");
        girilenYil = inp.nextInt();


        if (girilenYil % 400 == 0 )
        {
            System.out.println(girilenYil + " Artık Bir Yıldır!");
        }
        else if (girilenYil % 100 == 0 )
        {
            System.out.println(girilenYil + " Artık Bir Yıl Değildir!");
        }
        else if (girilenYil % 4 == 0)
        {
            System.out.println(girilenYil + " Artık Bir Yıldır!");
        }
        else
        {
            System.out.println(girilenYil + " Artık Bir Yıl Değildir!");
        }


=======
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
>>>>>>> e301662855c1f6b91e5d7b74fd1fbe006a0e8246
    }
}