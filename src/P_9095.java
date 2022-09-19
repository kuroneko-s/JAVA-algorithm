import java.util.Scanner;

public class P_9095 {
    static int result = 0;
    static int initV = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if ( n < 0 || n > 11) {
            throw new IllegalArgumentException("양수이면서 11보다 작아야합니다.");
        }

        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            result = 0;
            initV = input[i];
            dfs(0);
            System.out.println(result);
        }
    }

    private static void dfs(int num) {
        if (num == initV) {
            result++;
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (num + i <= initV) {
                dfs(num + i);
            }
        }
    }

}
