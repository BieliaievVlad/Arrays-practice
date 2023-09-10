package _03_task;

import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;

public class Main {

    static int[] tickets = new int[5];
    static int count;
    static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        do {
            System.out.print("Enter ticket number: ");
            tickets[count] = scan.nextInt();
            count++;
        } while (count <= 4);
        count = 0;

        System.out.println("Winning tickets is:");
        for (int num : tickets) {
            if (num % 2 == 0) {
                count++;
                System.out.printf("%n%d) %d", count, num);
            }
        }
        if (count == 0)
            System.out.println("No winners this time :(");
    }
}
