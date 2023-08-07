package Arrays;

public class BinarySearch{
    public static void main(String[] args) {
        int[] positiveNumbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        binarySearchForIntArray(positiveNumbersArray, 11);
    }


    public static void binarySearchForIntArray(int[] array, int element){
        int left = 0;
        int right = array.length - 1;
        int middle;

        while(left < right){
            middle = Math.round((left + right) / 2);
            if(array[middle] < element){
                left = middle + 1;
            }
            else if( middle > element){
                right = middle - 1;
            }
            else {
                System.out.println("Number found: " + element);
                return;
            }
        }
        System.out.println("Number not found: " + element);

    }
}