public class D260423 {

    String str;

    public D260423(String str) {
        if (str != null) {
            this.str = str;
        } else {
            throw new NullPointerException("NULL");
        }
    }
    public static String alligal(String str){
       if(str==null){
           throw new IllegalArgumentException("Легал");
       }else {
           return str;
       }
    }
    public static String vozvrat(String str){
        if (str!=null){
            return str;
            }else {
            return "AAAAAAAAAA";
        }
    }
    public static boolean included(int from , int to, int index){
        if(index>=from && index <to){
            return true;
            }else {
            throw new IndexOutOfBoundsException("Не входит в указааный диапазон");
        }
    }

    public static void main(String[] args) {
//        D260423 d260423=new D260423(null);
//        alligal(null);
//        System.out.println( vozvrat("nul"));
        System.out.println(included(1,11,11));
    }

}
// equals . hashcode полноценный доклад . 48. Немутируемая строка. Объяснить, почему класс string является немутируемым.