package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HasPairWithSum {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 10;

        System.out.println(hasPairWithSumNaive(array, sum));
        System.out.println(hasPairWithSumBetter(array, sum));

    }

    // Naive solution
    // Nested Loops
    // O(n*m)
    public static boolean hasPairWithSumNaive(int[] arr, int sum){
        for(int i=0; i < arr.length-1; i++){
            for(int j=0; j < arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }

    // Better solution for time complexity
    // Linear
    // Has more space complexity
    public static boolean hasPairWithSumBetter(int[] arr, int sum){
        List<Integer> complement = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(complement.contains(arr[i])){
                return true;
            }
            complement.add(sum - arr[i]);
        }
        return false;
    }

}
