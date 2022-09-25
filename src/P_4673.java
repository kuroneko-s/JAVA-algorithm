import java.util.HashSet;
import java.util.Set;

public class P_4673 {
    public static void main(String[] args) {
        Set<Integer> targetSet = new HashSet<>();
        Set<Integer> set = new HashSet();

        for (int i = 0; i < 10000; i++) {
            targetSet.add(i);
            set.add(d(i));
        }

        targetSet.removeAll(set);
        targetSet.forEach(System.out::println);
    }

    public static Integer d(int n) {
        final String s = String.valueOf(n);
        final char[] chars = s.toCharArray();
        int sum = n;

        for (int i = 0; i < chars.length; i++) {
            final int numericValue = Character.getNumericValue(chars[i]);
            sum += numericValue;
        }

        return sum;
    }
}