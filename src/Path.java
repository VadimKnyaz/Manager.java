public class Path {
    public static String changePath(String str, String str1){

       int start=str.indexOf("jdk");
       int end =str.indexOf("/",start+1);
       String substring=str.substring(start,end);
       return str.replace(substring,str1);

    }

    public static void main(String[] args) {
       String str="/usr/java/jdk1.8/bin/";
        System.out.println(changePath(str,"HHHHH"));
    }
}
