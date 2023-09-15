import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Doğru Şifre java123,Doğru kullanıcı adı patika

        String DoğruUsername="patika",DoğruPassword="java123",username,password;
        Scanner inp =new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        username=inp.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password=inp.nextLine();

        if (username.equals(DoğruUsername) && password.equals (DoğruPassword )){
            System.out.println("Giriş Başarılı ");
        }
        else {
            System.out.println("Bilgileriniz Hatalı Şifrenizi Sıfırlamak İçin 1'e basın" );
        int tercih=inp.nextInt();

        if(tercih == 1) {
            System.out.print("Yeni Şifrenizi Giriniz : ");
            Scanner input = new Scanner(System.in);
            String yeniSifre = input.nextLine();

            boolean kosul1 = yeniSifre.equals(DoğruPassword);
            String str = (kosul1) ? "Yeni Şifre Eski Şifre İle Aynı Olamaz. " : "Yeni Şifre oluşturuldu.";
            System.out.println(str);
        }else {

        }

        }
    }
}