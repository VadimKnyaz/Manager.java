import java.util.ArrayList;

public class newArrayList{
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("red");
        arrayList.add("wait");
        arrayList.add(0,"green");
        System.out.println(arrayList.get(1));
        arrayList.set(0,"GREEN");
        System.out.println(arrayList.get(0));
        arrayList.remove(2);
        System.out.println(arrayList);
       


//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//
//        }
//        for (String str : arrayList) {
//            System.out.println(str);
        }
    }
//вс е колекции полностью трегулов старые залачи, эпики таски сабтаски
