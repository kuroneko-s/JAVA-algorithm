import java.io.*;

// https://www.acmicpc.net/problem/1065
public class P_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        final int capacity = Integer.parseInt(reader.readLine());
        int result;

        if ( capacity < 100 ) {
            result = capacity;
        } else {
            result = 99;
            for (int i = 100; i <= capacity; i++) {
                if (fn(i)) {
                    result++;
                }
            }
        }
        writer.write(result + "");
        writer.newLine();
        writer.flush();

        reader.close();
        writer.close();
    }

    private static boolean fn(int n) {
        final String s = String.valueOf(n);
        final char[] chars = s.toCharArray();
        int[] transform = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            transform[i] = Character.getNumericValue(chars[i]);
        }

        int temp = transform[0] - transform[1];

        for (int i = chars.length - 1; i > 0; i--) {
            final int result = transform[i] + temp;
            if (result != transform[i - 1]) {
                return false;
            }
        }

        return true;
    }
}