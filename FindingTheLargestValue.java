package FridayExercises2;

import java.util.Random;
import java.util.Scanner;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int ally[] = new int[10];
        int largest=ally[0];

        System.out.print("Array: ");
        for(int i=1; i<ally.length; i++){
            ally[i]= 1+r.nextInt(100);
            System.out.print(ally[i] +"  ");
        }
        for(int i=1; i<ally.length-1; i++){
            if(largest<ally[i]){
                largest=ally[i];
            }
        }
        System.out.println();
        System.out.println("\nThe largest value is "+largest+".");
    }
}

