import java.util.Arrays;

public class Minimum2 {
    public static void main(String[] args) {
        int []array= {9,2,3,5,4,6,7,8,1};
//        int min =Integer.MAX_VALUE;
//        int min2= Integer.MAX_VALUE;
//        for (int i = 1; i < array.length ; i++) {
//            if (array[i]<min){
//                min2=min;
//                min=array[i];
//            } else if (array[i]<min2 && array[i] !=min) {
//                min2=array[i];
//            }
//        }
//        if(min2 !=Integer.MIN_VALUE){
//            System.out.println("Второй по величине элемент:"+min2);
//        }else {
//            System.out.println("Второuj по величине элементf нет:");
//        }
//        System.out.println("Минимальный элемент:"+min);
        boolean isSorted=false;
        while (!isSorted){
            isSorted=true;
        for (int i = 1; i < array.length ; i++) {
            if(array[i]<array[i-1]){
                int temp =array[i];
                array[i] =array[i-1];
                array[i-1]=temp;
                isSorted=false;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
}
