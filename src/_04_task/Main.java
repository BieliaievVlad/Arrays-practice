package _04_task;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;


public class Main {
    static String[] products = new String[6];
    static Scanner scan;
    static int count;
    static String pattern;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        do {
            System.out.print("Enter product name: ");
            products[count] = scan.nextLine();
            count++;
        } while (count < products.length);
        count = 0;


        System.out.println(Arrays.toString(products));


        System.out.printf("%nEnter product name for search: ");
        pattern = scan.nextLine();

        for (String product : products) {
            if (product.equals(pattern))
                count++;


        }
        if (count > 0)
            System.out.printf("%n%d matches for %s founded.", count, pattern);
        if (count == 0)
            System.out.println("No matches found.");

    }


}
