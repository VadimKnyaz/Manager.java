import java.util.HashMap;
import java.util.Scanner;

public class Reverse {
    public static String reverse(String str){
        String temp = "";
        for (int i = str.length()- 1;i >=0 ; i--) {
            temp+=str.charAt(i);
        }
        return temp;
    }

    public static void main(String[] args) {
//      int a=1;
//      int b=2;
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a);
//        System.out.println(b);

        HashMap <String , Integer>hashMap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        String temp =scanner.nextLine();
        String [] array=temp.trim().split(" ");
        for (int i = 0; i <array.length ; i++) {
            if(hashMap.containsKey(array [i])){
                hashMap.put(array[i], hashMap.get(array [i])+1);
            }else {
                hashMap.put(array[i],1 );
            }

        }
        System.out.println(hashMap);

    }
    public static String revers2(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();

        return stringBuilder.toString();
    }

}
