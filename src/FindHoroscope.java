import java.util.Scanner;
public class FindHoroscope {
    public static void main(String[] args) {
        int month, day;

        Scanner doa = new Scanner(System.in);

        System.out.println("Enter your B-day Month: ");
        month = doa.nextInt();

        System.out.println("Enter your B-day Day: ");
        day = doa.nextInt();

        if ((month == 1) && (day <= 31 && day >= 22)) {
            System.out.println("Your horoscope is Aquarius.");
        } else if ((month == 1) && (day <= 21 && day >= 1)) {
            System.out.println("Your horoscope is Capricorn.");
        } else if ((month == 2) && (day <= 28 && day >= 20)) {
            System.out.println("Your horoscope is Pisces.");
        } else if ((month == 2) && (day <= 19 && day >= 1)) {
            System.out.println("Your horoscope is Aquarius.");
        } else if ((month == 3) && (day <= 31 && day >= 21)) {
            System.out.println("Your horoscope is Aries.");
        } else if ((month == 3) && (day <= 20 && day >= 1)) {
            System.out.println("Your horoscope is Pisces.");
        } else if ((month == 4) && (day <= 31 && day >= 21)) {
            System.out.println("Your horoscope is Taurus .");
        } else if ((month == 4) && (day <= 20 && day >= 1)) {
            System.out.println("Your horoscope is Aries.");
        } else if ((month == 5) && (day <= 31 && day >= 22)) {
            System.out.println("Your horoscope is Gemini.");
        } else if ((month == 5) && (day <= 21 && day >= 1)) {
            System.out.println("Your horoscope is Taurus .");
        } else if ((month == 6) && (day <= 31 && day >= 23)) {
            System.out.println("Your horoscope is Cancer.");
        } else if ((month == 6) && (day <= 22 && day >= 1)) {
            System.out.println("Your horoscope is Gemini.");
        } else if ((month == 7) && (day <= 31 && day >= 23)) {
            System.out.println("Your horoscope is Leo.");
        } else if ((month == 7) && (day <= 22 && day >= 1)) {
            System.out.println("Your horoscope is Cancer.");
        } else if ((month == 8) && (day <= 31 && day >= 23)) {
            System.out.println("Your horoscope is Virgo.");
        } else if ((month == 8) && (day <= 22 && day >= 1)) {
            System.out.println("Your horoscope is Leo.");
        } else if ((month == 9) && (day <= 31 && day >= 23)) {
            System.out.println("Your horoscope is Libra.");
        } else if ((month == 9) && (day <= 22 && day >= 1)) {
            System.out.println("Your horoscope is Virgo.");
        } else if ((month == 10) && (day <= 31 && day >= 22)) {
            System.out.println("Your horoscope is Scorpio.");
        } else if ((month == 10) && (day <= 22 && day >= 1)) {
            System.out.println("Your horoscope is Libra.");
        } else if ((month == 11) && (day <= 31 && day >= 22)) {
            System.out.println("Your horoscope is Sagittarius.");
        } else if ((month == 11) && (day <= 21 && day >= 1)) {
            System.out.println("Your horoscope is Scorpio.");
        } else if ((month == 12) && (day <= 31 && day >= 22)) {
            System.out.println("Your horoscope is Capricorn.");
        } else if ((month == 12) && (day <= 21 && day >= 1)) {
            System.out.println("Your horoscope is Sagittarius.");
        } else {
            System.out.println("Invalid date!");


        }
    }
}


