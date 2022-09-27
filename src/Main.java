import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = reader.readLine();
        String[] s = input.split(" ");

        long v = Integer.parseInt(s[2]);
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int x = a - b;
        double result = (float) (v - a) / x;
        double ceil = Math.ceil(result);
        long resultByInt = (int) ceil;
        writer.write(resultByInt + 1 + "\n");

        reader.close();
        writer.close();
    }
}