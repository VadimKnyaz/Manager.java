public class MyEvenNumber {
    int n;

    public MyEvenNumber(int n) {
        if (n % 2 != 0) {
            throw new RuntimeException("Run");
        }
        this.n=n;
    }

    public static void main(String[] args) {
       MyEvenNumber myEvenNumber =new MyEvenNumber(51);
//        int [] arr=new int[2];
//        System.out.println(arr[2]);
        String name= null;
        name.length();
    }

}

