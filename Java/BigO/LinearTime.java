package BigO;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class LinearTime{
    public static void main(String[] args) {
        
        // Checking the Big O of a loop

        String[] nemo = {"nemo"};
        String[] everyone = {"dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank"};

        findNemo(everyone); // O(n) --> Linear Time
    }
    public static void findNemo(String[] array){ // O(1)
        Instant t1 = Instant.now(); // O(1)
        Instant t2; // O(1)
        Long t3; // O(1)
        for(int i = 0; i < array.length; i++){ // O(n)
            if(array[i].equals("nemo")){ // O(n)
                System.out.println("Found NEMO!"); // O(n)
            }
        }
        t2 = Instant.now(); // O(1)
        t3 = t1.until(t2, ChronoUnit.MILLIS); // O(1)
        System.out.print("The findNemo function took: " + t3 + " millisecond(s)"); // O(1)

        // THE BIG O of findNemo is: (7 + 3n), in the end it means O(n)
    }
}