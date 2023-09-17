import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Şifreniz :");
            password = input.nextLine();
            if (userName.equals("Patika") && password.equals("java123")) {
                System.out.println("Patika Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış\n");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçin : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak İstediğiniz Para Miktarını Giriniz : ");
                            int yatırılanMik = input.nextInt();
                            balance += yatırılanMik;
                            break;
                        case 2:
                            System.out.println("Çekmek İstediğiniz Para Miktarını Giriniz : ");
                            int cekilenMik = input.nextInt();
                            if (cekilenMik > balance) {
                                System.out.println("Bakiye yetersiz.");
                            }else {
                                balance -= cekilenMik;
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("İşleminiz Sonlandırıldı Yeniden Görüşmek Üzere ");
                            break;
                        default:
                            System.out.println("Yanlış Tuşlama Yaptınız Tekrar Deneyiniz");
                            break;
                    }
                } while (select != 4);
                break;

            } else {
                right--;
                System.out.println("Hatalı Kulanıcı Adı ve Şifre .Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur.Banka İle İletişime Geçiniz.");
                } else {
                    System.out.println("Yanlış Giriş ,Kalan Hakkınız : " + right);
                }
            }
        }
    }}