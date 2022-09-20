import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] split = input.split(" ");

        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);

        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b && b != c) {
            System.out.println(1000 + a * 100);
        } else if (b == c && a != c) {
            System.out.println(1000 + b * 100);
        } else {
            int max = Math.max(Math.max(a, b), c);
            System.out.println(max * 100);
        }
    }
}
