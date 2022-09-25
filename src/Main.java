import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        final int target = Integer.parseInt(reader.readLine());
        int level = 1;
        int values = 1;
        int leveling = 0;

        if ( target == 1 ) {
            writer.write("1\n");
        } else {
            while (target > values) {
                level++;
                leveling += 6;
                values += leveling;
            }

            writer.write(level + "\n");
        }

        reader.close();
        writer.close();
    }
}