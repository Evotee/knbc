import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = {"Rock", "Spock", "Paper", "Lizard", "Scissors"};
        Random rand = new Random();
        boolean c = true;
        int b=0;
        String a;
        while (c) {
            System.out.print("Please, enter your choice: ");
            a = sc.nextLine();
            if ("Exit".equals(a)) {
                c = false;
            }
            outer:
            for (int i = 0; i < 5; ++i) {
                if (arr1[i].equals(a)) {
                    b = i;
                    break outer;
                }
            }
            int pc = rand.nextInt(5);
            System.out.println("PC has chosen: " + arr1[pc]);
            if (b == pc) {
                System.out.println("Tie");
            } else if (0 < b - pc && b - pc <= 2) {
                System.out.println("Player win!");
            } else if (0 > b - pc && b - pc <= -3) {
                System.out.println("Player win!");
            } else {
                System.out.println("PC win!");
            }
        }

    }
}