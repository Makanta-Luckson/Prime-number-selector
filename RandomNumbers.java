import javax.swing.*;
import java.util.*;
public class RandomNumbers{
    public static void main(String[] args) {
        
  int array[] = new int [100];

  for(int i = 0, x = 1; i < array.length; i++){
            array[i] = x;
            x++;
  }


for(int i = 0; i < array.length; i++){

    boolean var = true;
     if(array[i] == 2){
         System.out.print(array[i] + " ");
     }else{
         for(int y = 2; y <= array[i]; y++){
               if(array[i] % y != 0 ){
                         var = false;
               }
         }
                if(var){
                    System.out.print(array[i] + " ");
                }     
     }
  
        var = true;

}





    }
}