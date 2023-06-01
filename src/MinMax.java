public class MinMax {
    public static int max(int i , int j){
        if(i>j){
            return i;
        }else{
            return j;
        }
    }
    public static int max1(int i , int j){
       return Math.max(i, j);
    }
    public static int min(int i ,int j){
        return Math.min(i,j);
    }
    public static void main(String[] args) {
        System.out.println(max(1,2));
    }
}
