import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //Değişkenleri tanımlayalım.
        int sıcaklık;
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık Değerini Giriniz. ");
        sıcaklık=input.nextInt();

        if (sıcaklık<5) {
            System.out.println("Kayak Yapabilirsiniz ");
                }else if(sıcaklık>=5 && sıcaklık<= 25){
                if (sıcaklık<15) {
                    System.out.println("Sinemaya Gidebilirisiniz.");
                }
                if (sıcaklık>=10) {
                    System.out.println("Pikniğe gidebilirsiniz");
                } else if (sıcaklık>25) {
                    System.out.println("Yüzmeye Gidebilirsiniz. ");
                }
            }
            }
        }