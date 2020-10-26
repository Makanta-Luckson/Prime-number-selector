import javax.swing.*;
import java.util.*;
public class RandomNumbers{
    public static void main(String[] args) {
        
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the limit of the number you want");
   int num = input.nextInt();

   Random ran = new Random();
  
    int array[] = new int[num];

        for(int i = 0; i <= array.length-1; i++){
                   int limit =  ran.nextInt(10) + 1;
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }





    }
}