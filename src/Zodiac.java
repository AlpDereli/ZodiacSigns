import java.util.Scanner;
public class Zodiac {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Birth Month (as int): ");
        int month = take.nextInt();
        System.out.println("Birthday: ");
        int day = take.nextInt();
        if (month == 2)
        {
            if (day < 19)
            {
                System.out.println("Kova");
            }
            else {
                System.out.println("Balık");
            }
        }
        if (month == 1)
        {
            if (day < 21)
            {
                System.out.println("Oğlak");
            }
            else {
                System.out.println("Kova");
            }
        }
        if (month == 3)
        {
            if (day < 20)
            {
                System.out.println("Balık");
            }
            else {
                System.out.println("Koç");
            }
            //... and it continues...
        }
    }
}
