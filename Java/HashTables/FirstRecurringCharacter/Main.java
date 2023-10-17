package HashTables.FirstRecurringCharacter;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {4, 5, 1, 2, 3, 5, 1, 2, 4};

        System.out.println(firstRecurringCharacter(array1));
        System.out.println(firstRecurringChar2(array1));
    }

    public static Integer firstRecurringCharacter(int[] array){ // NAIVE SOLUTION O(n^2)
        for(int index = 1; index < array.length; index++){
            for(int index2 = index - 1; index2 >= 0; index2--){
                if(array[index] == array[index2]){
                    return array[index];
                }
            }
        }
        return null;
    }

    public static Integer firstRecurringChar2(int[] array){ // HASHTABLE SOLUTION O(N)
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int index = 0; index < array.length; index++){
            if(map.containsKey(array[index])){
                return array[index];
            }
            else{
                map.put(array[index], true);
            }
        }
        return null;
    }
}
