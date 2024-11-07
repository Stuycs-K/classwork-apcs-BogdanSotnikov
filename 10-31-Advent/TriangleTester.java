import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
    public static int countTrianglesA(String filename){
    int count = 0; 
      try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
      String line = input.nextLine;
        for(int i = 0 ; i < line.length(); i ++){
          count += isTriangle(line.nextInt(),line.nextInt(),line.nextInt());
        }
      }
      }
      input.close();

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return;
      } 
      return count; 
    }
    
    public static int isTriangle(int a, b, c){
    if (a+b>c && a+c>b && b+c>a)
      return 1;
    return 0;
    }
    
    public static void main (String[] args){
    
  } 
}
