package _01_task;

import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;
public class Main {

    static double[] tempValue = new double[10];
    static Scanner scan;
    static int day = 1;
    static int count;
    static String measure = "degree(s)";

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
       do {
           System.out.printf("Enter temperature value for day %d: ", day++);
           tempValue[count] = scan.nextDouble();
           count++;
       } while (count <= 9);
       scan.close();
       count = 0;
       day = 1;

       do {
           System.out.printf("%n%d) Temperature value for day %d is: %.2f %s", day,
                   day, tempValue[count], measure);
           count++;
           day++;
       } while (count <=9);

    }
}
