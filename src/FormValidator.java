import task.Gender;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class FormValidator {
    public static void checkName(String str) {
        if (str.length() >= 2 && str.length() < 20 && Character.isUpperCase(str.charAt(0))) {
            System.out.println("Имя успешно прошло валидацию");
        } else {
            throw new RuntimeException("Problem with name validation");
        }
    } public static void checkBirthDate(String str){
       String [] temp= str.split("\\.");
       try {
           int day = Integer.parseInt(temp[0]);
           int month = Integer.parseInt(temp[1]);
           int year= Integer.parseInt(temp[2]);
           LocalDate time = LocalDate.of(year,month,day);
           if(time.isBefore(LocalDate.of(1900 ,1,1)) || time.isAfter(LocalDate.now())) {
               throw new RuntimeException("Введите правильную дату");
           }
       }catch(NumberFormatException e) {
           System.err.println("Была введен не правильный формат даты");
           return;
       }
        System.out.println("Дата прошла валидацию");
    }
    public static void checkGender(String str){
        try {
            Gender gender=Gender.valueOf(str.toUpperCase());
            System.out.println(str+" Прошла валидацию");
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Неправильный пол");
        }
    }
    public static void checkHeight(String str){
        try {
            double temp = Double.parseDouble(str);
            if(temp<0){
                throw new RuntimeException("Веден отрицательный рост");
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("Невозможно распарсить "+str);
        }//          дорешать задачу , по датам полноценный доклад
    }

//    checkHeight("1");
//    //      checkName("ASYAKNHKJH");
//    checkGender("FEMALE");
//    checkBirthDate("01.01.2023");
//}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size=Integer.parseInt(scanner.nextLine());
        int [] array=new int[size];
        String temp =scanner.nextLine() ;
        String []arrayStr =temp.split(" ");
      for (int i = 0; i < arrayStr.length; i++) {
          array [i]= Integer.parseInt(arrayStr[i]);
      }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length -1 ; j++) {
                if(array[j]>array[j+1]){
                    int tempj = array[j];
                    array[j]=array[j+1];
                    array[j+1]=tempj;
                }
            }
        }
        System.out.println(array[array.length-1]+" "+array[array.length-2]);

        }






}
