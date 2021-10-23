package FridayExercises2;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> all = new ArrayList<Integer>();
        for(int i=1; i<=10; i++){
            all.add(getNumbers());
        }
        System.out.println("ArrayList: "+all);
    }
    public static int getNumbers(){
        Random r = new Random();
        int x = 1+r.nextInt(100);
        return x;
    }
}
