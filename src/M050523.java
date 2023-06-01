import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class M050523 {
    public static void main(String[] args) {

        HashMap <String,Integer>hashMap =new HashMap<>();
        hashMap.put("AAA",11);
        hashMap.put("AA",1);
        hashMap.put("A",10);
        Iterator<String>iterator=hashMap.keySet().iterator();
        while (iterator.hasNext()){
            String element =iterator.next();
            System.out.println(element+" "+hashMap.get(element));
        }
        for (String str:hashMap.keySet() ) {
            System.out.println(str+" "+hashMap.get(str));
        }
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("AAAA");
        arrayList.add("AABB");
        arrayList.add("AB");
        for (String str:arrayList) {
            System.out.println(str+" "+arrayList);
        }
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
        Iterator <String>iterator1=arrayList.iterator();
        while (iterator.hasNext()){
            String element=iterator.next();
            System.out.println(element);
        }























HashMap <String,Integer> hashMap1=new HashMap<>();
        hashMap1.put("AAAA", 123);
        hashMap1.put("ABA", 333);

        Iterator <Map.Entry<String,Integer>> iterator2=hashMap1.entrySet().iterator();
        while (iterator2.hasNext()){
            Map.Entry<String,Integer> element=iterator2.next();
            System.out.println(element.getKey()+" "+element.getValue());
        }
    }
























}



//доклад по итератор и сплитератор в чем разнтица. сортировка пузырьком повторить задачву дорешать с ее помощью, второе решение с помощью готового метода сорт , повторить все с азов