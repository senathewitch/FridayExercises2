package FridayExercises2;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        Random r = new Random();
        int apple [] = new int [10];
        int slot = 0;
        boolean found = false;
        System.out.println("Array: ");

        for(int i=0; i<apple.length; i++){
            apple[i]=1+r.nextInt(50);
            System.out.print(apple[i]+"  ");
        }
        System.out.print("\nValue to find: ");
        int value = keyboard.nextInt();
        for(int i=0; i<apple.length; i++){
            if(apple[i]==value && !found){
                slot=i;
                found=true;
            }
        }
        System.out.println();
        if(found){
            System.out.println(value+" is in slot "+slot+".");
        }else{
            System.out.println(value+" is not in the array.");
        }
    }
}
