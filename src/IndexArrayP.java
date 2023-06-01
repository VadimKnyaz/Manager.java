import java.util.Scanner;

public class IndexArrayP {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=Integer.parseInt(scanner.nextLine());
        int [] array =new int [size];
        String [] array1 = scanner.nextLine().split(" ");
        for (int i = 0; i <array1.length ; i++) {
            array[i]= Integer.parseInt(array1[i]);
        }
        int p= Integer.parseInt(scanner.nextLine());
        int temp =-1;
        for (int i = 0; i < array.length; i++) {
          if(array[i]==p){
              temp=i;
          }

        }
        System.out.println(temp);
    }
}
