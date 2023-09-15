import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mount, day;
        Scanner input = new Scanner(System.in);
        System.out.print(" Doğduğunuz ayı yazınız :");
        mount = input.nextInt();
        System.out.print("Doğdugunuz günü giriniz :");
        day = input.nextInt();
        //ay değerine 1 ile 12 arasında gün değerine 1 ile 31 arasında değer girilmesini sağlayan kodu yazalım
        if ((mount >= 1 && mount <= 12) && (day >= 1 && day <= 31)) {
        //ay ve gün degerlerine karşılık gelen değerleri atayalım.
        }
        if (mount == 1) {
            if (day < 22) {
                System.out.print(" Oğlak Burcusunuz. ");
            } else {
                System.out.print("Kova Burcusunuz. ");
                }
            }
            if (mount == 2) {
                if (day < 19) {
                    System.out.print("Kova Burcusunuz.");
                } else {
                    System.out.print("Balık Burcusunuz");
                }
            }
            if (mount == 3) {
                if (day < 20) {
                    System.out.print("Balık Burcusunuz");
                } else {
                    System.out.print("Koç Burcusunuz.");
                }
            }
            if (mount == 4) {
                if (day < 20) {
                    System.out.print("Koç Burcusunuz");
                } else {
                    System.out.print("Boğa Burcusunuz.");
                }
            }
            if (mount == 5) {
                if (day < 21) {
                    System.out.print("Boğa Burcusunuz");
                } else {
                    System.out.print("İkizler Burcusunuz.");
                }
            }
            if (mount == 6) {
                if (day < 22) {
                    System.out.print("İkizler Burcusunuz");
                } else {
                    System.out.print("Yengeç Burcusunuz.");
                }
            }
            if (mount == 7) {
                if (day < 22) {
                    System.out.print("Yengeç Burcusunuz");
                } else {
                    System.out.print("Aslan Burcusunuz.");
                }
            }
            if (mount == 8) {
                if (day < 22) {
                    System.out.print("Aslan Burcusunuz");
                } else {
                    System.out.print("Başak Burcusunuz.");
                }
            }
            if (mount == 9) {
                if (day < 22) {
                    System.out.print("Başak Burcusunuz");
                } else {
                    System.out.print("Terazi Burcusunuz.");
                }
            }
            if (mount == 10) {
                if (day < 22) {
                    System.out.print("Terazi Burcusunuz");
                } else {
                    System.out.print("Akrep Burcusunuz.");
                }
            }
            if (mount == 11) {
                if (day < 21) {
                    System.out.print("Akrep Burcusunuz");
                } else {
                    System.out.print("Yay Burcusunuz.");
                }
            }
            if (mount == 12) {
                if (day < 21) {
                    System.out.print("Yay Burcusunuz");
                } else {
                    System.out.print("Oğlak Burcusunuz.");
                }
            }
        }
    }