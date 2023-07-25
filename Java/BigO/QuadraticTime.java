package BigO;

public class QuadraticTime {
    public static void main(String[] args) {
        char[] boxes = {'a', 'b', 'c', 'd', 'e'};

        logAllPairsOfArray(boxes);
    }

    public static void logAllPairsOfArray(char[] array){
        for(int i = 0; i < array.length; i++){ //O(n)
            for(int j = 0; j < array.length; j++){ //O(n)
                System.out.println(array[i] + " " + array[j]); //O(n)
            }
        }
        // When we have a loop inside a loop than we multiple each bigO notation of them
        // BigO (n * n + n) => (2n^2) => In the ends it means quadratic time: BigO(n^2) because we remove the constants
    }
}
