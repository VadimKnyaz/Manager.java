 public class Solution {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder sb=new StringBuilder(string) ;
        for(int i=0;i<strings.length;i++){
            sb.append(strings[i]);
        }
        return sb;

    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder sb1=new StringBuilder(string);
        sb1.replace(start,end,str);
        return sb1;
    }

}
//писать решать старрые задачи енам полноценный доклад с примерами со всей ерундой