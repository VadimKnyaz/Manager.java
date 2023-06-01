import java.util.Arrays;

public class PrefiksMax {
    public static String commonPrefix(String... strings) {
        String prefix = "";
        Arrays.sort(strings);
        String first = strings[0];
        String end = strings[strings.length - 1];

        for (int i = 0; i < first.length() && i < end.length(); i++) {
            if (first.charAt(i) == end.charAt(i)) {
                prefix += first.charAt(i);
            } else {
                break;
            }
        }
        return prefix;
    }

    public static String commonPrefixNew(String... strings) {
        String prefix = "";
        first:
        for (int i = 0; i < strings[0].length(); i++) {
            for (int j = 0; j < strings.length; j++) {
                try {
                    if (strings[0].charAt(i) != strings[j].charAt(i)) {
                        break first;
                    }
                } catch  (StringIndexOutOfBoundsException e) {
                 break first;
                }
            }
            prefix += strings[0].charAt(i);
        }
        return prefix;
    }
    public static void main(String[] args) {

        System.out.println(commonPrefixNew("ALEXXXXXXXLKMLN:", "тгд", "ALEXANDR"));
    }
}

