import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil,kalan;
        Scanner input=new Scanner(System.in);
        System.out.print("Dogum Yılınızı Giriniz : ");
        yil=input.nextInt();
        kalan=yil%12;
        switch (kalan){
            case 0:
                System.out.print("Cin Zodyagı Burcunuz : Maymun ");
                break;
            case 1:
                System.out.print("Cin Zodyagı Burcunuz : Horoz ");
                break;
            case 2:
                System.out.print("Cin Zodyagı Burcunuz : Köpek ");
                break;
            case 3:
                System.out.print("Cin Zodyagı Burcunuz : Domuz ");
                break;
            case 4:
                System.out.print("Cin Zodyagı Burcunuz : Fare ");
                break;
            case 5:
                System.out.print("Cin Zodyagı Burcunuz : Öküz ");
                break;
            case 6:
                System.out.print("Cin Zodyagı Burcunuz : Kaplan ");
                break;
            case 7:
                System.out.print("Cin Zodyagı Burcunuz : Tavşan ");
                break;
            case 8:
                System.out.print("Cin Zodyagı Burcunuz : Ejderha ");
                break;
            case 9:
                System.out.print("Cin Zodyagı Burcunuz : Yılan ");
                break;
            case 10:
                System.out.print("Cin Zodyagı Burcunuz : At ");
                break;
            case 11:
                System.out.print("Cin Zodyagı Burcunuz : Koyun ");
                break;
            default:
        }
    }
}