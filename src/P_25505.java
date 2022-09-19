import java.util.*;

// https://www.acmicpc.net/problem/25505
public class P_25505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int index = Integer.parseInt(scanner.nextLine());

        if ( index < 1 || index > 200_000 ) scanner.close();

        String[] stringArr = new String[index];

        for (int i = 0; i < index; i++) {
            String input = scanner.nextLine();
            stringArr[i] = input;
        }

        int queryIndex = Integer.parseInt(scanner.nextLine());
        if ( queryIndex < 1 || queryIndex > 200_000 ) scanner.close();

        List<String[]> queryTarget = new ArrayList<>();

        for (int i = 0; i < queryIndex; i++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");

            int input_1 = Integer.parseInt(inputArr[0]);
            int input_2 = Integer.parseInt(inputArr[1]);

            if (
                    input_1 < 0 || input_1 > index ||
                    input_2 < 0 || input_2 > index
            ) {
                scanner.close();
                break;
            }

            String[] strArr = new String[]{
                    stringArr[input_1 - 1], stringArr[input_2 - 1]
            };
            queryTarget.add(strArr);
        }

        Set<String> resultSet = new HashSet<>();

        for (int i = 0; i < queryTarget.size(); i++) {
            String targetKey = queryTarget.get(i)[0]; // key
            String targetVal = queryTarget.get(i)[1]; // val

            char[] keyChars = targetKey.toCharArray();
            int repeat = keyChars.length;

            for (int startFlag = 0; startFlag < keyChars.length; startFlag++) {
                while (repeat > startFlag) {
                    String target = targetKey.substring(startFlag, repeat);

                    if (!target.equals("") && targetVal.contains(target)) {
                        resultSet.add(target);
                    }

                    repeat--;
                }
                repeat = keyChars.length;
            }
            System.out.println(resultSet.size());
            resultSet = new HashSet<>();
        };

        scanner.close();
    }
}
