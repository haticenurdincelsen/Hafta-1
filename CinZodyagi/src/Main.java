import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int birthYear;
        System.out.print("Please enter your birth year: ");
        Scanner input = new Scanner(System.in);
        birthYear = input.nextInt();
        int zodiac = birthYear % 12;
        switch (zodiac) {
            case 0 -> System.out.print("Your Chinese Zodiac is: Monkey");
            case 1 -> System.out.print("Your Chinese Zodiac is: Rooster");
            case 2 -> System.out.print("Your Chinese Zodiac is: Dog");
            case 3 -> System.out.print("Your Chinese Zodiac is: Pig");
            case 4 -> System.out.print("Your Chinese Zodiac is: Mouse");
            case 5 -> System.out.print("Your Chinese Zodiac is: Ox");
            case 6 -> System.out.print("Your Chinese Zodiac is: Tiger");
            case 7 -> System.out.print("Your Chinese Zodiac is: Rabbit");
            case 8 -> System.out.print("Your Chinese Zodiac is: Dragon");
            case 9 -> System.out.print("Your Chinese Zodiac is: Snake");
            case 10 -> System.out.print("Your Chinese Zodiac is: Horse");
            case 11 -> System.out.print("Your Chinese Zodiac is: Sheep");
            default -> System.out.print("Not Possible");
            //Bu senaryoda input integer girildiği sürece default'a düşme imkanı yok!
        }
    }
}