package dz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
    String a = null;

   if (a==null){
       throw new NullPointerException("Viboshen null");
   }
  //      System.out.println(removeSpaces("   hello    "));
//        System.out.print(countN("JAVA",25));
//        System.out.println(isanAgrams("дорога","города"));
//        System.out.println(repidCounter("PRIVETVADIMPRIVETVADIMPRIVETVADIM","PRIVET"));
//       String [] array = {"MASSIVVVVVVV","PRIVET", "PPRIVET",};
//        sortArray(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println(search("PRRRRivet"));
//        System.out.println(remooveChar("PRIVET", 'R'));
//        System.out.println(repeatChar("PPRIVVETT"));
//        isPalindrom1("казак");
//       System.out.println(isPalindrom1("казах"));
//        isPalindrome("казак");
//        System.out.println(isPalindrome("казак"));

//        System.out.println(joinConkat("-_____", "Привет", "меня", "зовут", "Android"));
//        int i = Integer.parseInt("5");
//        float f = Float.parseFloat("5.5");
//        long l = Long.parseLong("7");
//        double d = Double.parseDouble("7.7");
//        System.out.println(deleteSpace("       1Adj  "));
//        System.out.println(sum(-1,1000,9,855532,98787));

//        System.out.println(repeatCounter("aaabbb",'a'));
//        HashMap <Character,Integer>hashMap1=repeatCounter2("AAAAABBBCCCCD");
//        for (Character ch: hashMap1.keySet()) {
//            System.out.println(ch+" "+hashMap1.get(ch))
//        }
//        System.out.println(isNumbers("A1ABBCDfgHH"));
//        System.out.println(isNumeric("10236548987A"));
//     leterCounter("AAABBBCCCDDDАаа");
//        System.out.println(charCounter("!ZGGGGGGGGGGGF",'G'));

    }

    public static int repeatCounter(String str, char c) {
        char[] temp = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == c) {
                counter++;
            }
        }
        return counter;
    }

    public static HashMap<Character, Integer> repeatCounter2(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (!hashMap.containsKey(temp)) {
                hashMap.put(temp, 1);
            } else {
                hashMap.put(temp, hashMap.get(temp) + 1);
            }
        }
        return hashMap;
    }

    public static String reverse(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            char ch = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = ch;
        }
        return String.valueOf(array);
    }

    public static String reverse1(String str) {
        char[] array = str.toCharArray();
        String str1 = "";
        for (int i = array.length - 1; i >= 0; i--) {
            str1 += array[i];
        }
        return str1;
    }

    public static String reverse2(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static boolean isNumbers(String str) {
        char[] array = str.toCharArray();
        for (char character : array) {
            if (Character.isDigit(character)) {
                return false;
            }
        }
        return true;

        //дорешать метод изнамберс с пом класса обертки а именно методом которыцй проверяет является ли символ числомб второй на усмотрение
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void leterCounter(String str) {
        String base = "aeiuoауоияэ";
        str = str.toLowerCase();
        int sogl = 0;
        int glasn = 0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (base.contains(String.valueOf(str.charAt(i)))) {
                glasn++;
            } else if (Character.isLetter(str.charAt(i))) {
                sogl++;
            }
        }
        System.out.println(sogl + "-Согласные");
        System.out.println(glasn + "- Гласные");
    }

    public static int charCounter(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }

    public static String deleteSpace(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static int sum(int... temp) {
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];

        }
        return sum;
    }

    public static String joinConkat(String delimetr, String... elements) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < elements.length; i++) {

            if (i == elements.length - 1) {
                result.append(elements[i]);
            } else {
                result.append(elements[i]).append(delimetr);
            }
        }
        return result.toString();
    }


    //1Чтлобы в конце не было делиметра 2 11. Проверка, что строка является палиндромом. Написать программу, которая
// выясняет, является ли данная строка палиндром
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static boolean isPalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrom1(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return str.equalsIgnoreCase(stringBuilder.toString());

    }

    public static String repeatChar(String str) {

        String result = str;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    result = result.replace(String.valueOf(str.charAt(i)), "");
                }
            }
            //PRIVET //13,14 шИлтт
        }
        return result;
    }

    public static String remooveChar(String str, char ch) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static String remooveChar1(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }

    public static char search(String str) {
        char maxChar = 0;
        int maxcharCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            int tempCounter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (temp == str.charAt(j)) {
                    tempCounter++;
                    if (tempCounter > maxcharCounter) {
                        maxcharCounter = tempCounter;
                        maxChar = temp;
                    }
                }

            }
        }
        return maxChar;
    }

    public static void sortArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[i].length() > array[i + 1].length()) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
//решить вспомнить сортировкак пузырьком посмотреть готовые реализации с нашим решением , решение с пом компаратара , предыдущие задачи перерешать все с любым способом . переписывать из шилда .уметь применять знания
            }
        }
    }

    public static boolean conteinsSubstring(String str, String substring) {
//        return str.contains(substring);
        if (str.contains(substring)) {
            return true;
        } else {
            return false;
        }
    }

    public static int repidCounter(String str, String substring) {
        int counter = 0;
        while (str.indexOf(substring) != -1) {
            counter++;
            str = str.substring(str.indexOf(substring) + substring.length());
        }
        return counter;
    }

    public static boolean isanAgrams(String str, String str1) {
        char[] aray1 = str.toCharArray();
        char[] aray2 = str1.toCharArray();
        Arrays.sort(aray1);
        Arrays.sort(aray2);
        return Arrays.equals(aray1, aray2);
    }

    public static String countN(String str, int n) {

        String result = "";
        for (int i = 0; i < n; i++) {
            result += str + str;
        }
        return result;
    }

    //21 25 теория лямбда
    public static String removeSpaces(String str) {

        int start = 0;
        int end = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int j = str.length() - 1; j >= 0; j--) {
            if (str.charAt(j) != ' ') {
                end = j;
                break;
            }
        }
        return str.substring(start, end + 1);

    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int max(int a , int b){
        return a>b?a:b;
    }
}
//исключения , прочитать про анонимные классы , функциональный интерфейс , лямбды






