
public class Main {
    public static void main(String[] args) {
        int sayac=0;
        for (int sayi=2;sayi<=100;sayi++){
            int input=0;
            for (int i=2;i<sayi;i++){
                if (sayi%i==0){
                    input=1;
                    break;
                }
            }
    if (input==0){
    System.out.print(sayi+",");
    sayac++;
            }
        }
    }
}