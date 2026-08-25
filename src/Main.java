import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (true) {
            System.out.println("Enter a series of numbers separated by a comma: ");

            arr.clear();

            String input = scan.nextLine();
            String[] inputArr = input.split("\\s*,\\s*");

            for (String str : inputArr) {
                try {
                    arr.add(Integer.parseInt(str));
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number format " + str);
                }
            }

            System.out.println("You entered " + arr + ", is that correct? Y/N: ");
            String response = scan.nextLine();

            if (response.equalsIgnoreCase("y")) {
                break;
            }
        }

        int even = 0;
        int odd = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (even > odd) {
            System.out.println("EVEN");
        } else if (odd > even) {
            System.out.println("ODD");
        } else {
            System.out.println("NEUTRAL");
        }
        scan.close();
    }
}
