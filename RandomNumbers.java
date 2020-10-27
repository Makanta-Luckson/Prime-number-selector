import javax.swing.*;
import java.util.*;
public class RandomNumbers{
    public static void main(String[] args) {
        
  int array[] = new int [100];

  Random ran = new Random();
// a loop stroing the numbers into the array
  for(int i = 0; i < array.length;  i++){
      array[i] = ran.nextInt(992) + 10;
  }
                         // a loop printing out the generated numbers
                for(int y = 0; y < array.length; y++){
                    System.out.print(array[y] + " ");
                }
                System.out.println();


    }
}