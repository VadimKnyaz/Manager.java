package dz;

import java.util.*;

public class Collections{
    public static void main(String[] args) {


   Map<String,Integer> fruits=new LinkedHashMap<>();
    fruits.putIfAbsent("Apple",5);
    fruits.put("Apple1",6);

    fruits.put("Apple13",7);

    fruits.put("Apple",2);
        System.out.println(fruits);
}
}
