import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //degişken tanımlayalım
        int i;
        //kullanıcıdan sınır değeri isteyelim
        Scanner input=new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz : ");
        i=input.nextInt();
        //döngüleri yazalım
        for (int j=1; j<i; j*=4){
            System.out.println("4'ün kuvvetleri :"+j);
        }
        for (int k=1; k<i; k*=5 ){
            System.out.println("5'in kuvvetleri :"+k);
        }
    }
}