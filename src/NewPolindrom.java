public class NewPolindrom {
    public static boolean polindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }//hello
        return true;
    }

    public static void main(String[] args) {
        System.out.println(polindrom2("heeeeeh"));
    }

    public static boolean polindrom1(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return str.equals(stringBuilder.toString());
    }

    public static boolean polindrom2(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return polindrom2(str.substring(1, str.length() - 1));

    }
}
//1 дорешать полиндром  с рекурсией 2 колекции все от и до чт отакое итератор , дженерики старые старые задачи разобраить