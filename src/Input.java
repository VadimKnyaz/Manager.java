import java.io.*;

public class Input {
    public static String openFile(String fileName){
        String temp ="";
      try (BufferedReader bufferedReader= new BufferedReader(new FileReader(fileName))){

        while (bufferedReader.ready()){
            temp+=bufferedReader.readLine()+"\n";
        }
      } catch (IOException e ) {
          throw new RuntimeException(e);
      }
        return temp;
    }
    public static void fileWriter( String str , String pathName){
        try (FileWriter fileWriter=new FileWriter(pathName)){
            fileWriter.write(str.toUpperCase());
        }catch (IOException e) {
            throw new RuntimeException("IO");
        }
    }

    public static void main(String[] args) {
       String temp1 = openFile("C:\\Users\\2231v\\Desktop\\Input.txt");
      fileWriter(temp1,"C:\\Users\\2231v\\Desktop\\Output.txt");



    }
}
