package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsCommonItem {
    public static void main(String[] args) {
        
        char[] array1 = {'a', 'c', 'f', 'g'};
        char[] array2 = {'b', 'e', 'g'};

        // Big O (a + b)
        // The easiest way to solve this would be with a nested loop, but then
        // it would be O(a * b)
        System.out.println(containsCommonItem(array1, array2));

    }

    public static boolean containsCommonItem(char[] arr1, char[] arr2){
        Map<Character, Boolean> mapArray = new HashMap<Character, Boolean>();
        Character actualChar;

        // loop through first array and creates a map with every element found
        for (int i=0; i < arr1.length; i++){
            if(!mapArray.containsKey(arr1[i])){
                actualChar = arr1[i];
                mapArray.put(actualChar, true);
            }
        }

        // loop through second array and check if item in second array exists on created object
        for(int j=0; j<arr2.length; j++){
            if(mapArray.containsKey(arr2[j])){
                return true;
            }
        }
        return false;
    }
}
