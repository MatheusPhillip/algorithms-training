package Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] firstArray = {1, 3, 5};
        int[] secondArray = {2, 4, 6};
        int[] arraysSortedMerged = mergeSortedArrays(firstArray, secondArray);

        for (int number : arraysSortedMerged) {
            System.out.println(number);
        }
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2){
        if(array1.length == 0){
            return array2;
        }
        if(array2.length == 0){
            return array1;
        }
        
        int[] sortedArray = new int[array1.length + array2.length];
        int indexArr1 = 0;
        int indexArr2 = 0;

        for(int i=0; i < sortedArray.length; i++){
            if(checkArrayIndexIsValid(indexArr1, array1)){
                if(checkArrayIndexIsValid(indexArr2, array2)){
                    if(array1[indexArr1] < array2[indexArr2]){
                        sortedArray[i] = array1[indexArr1];
                        indexArr1++;
                    }
                    else{
                        sortedArray[i] = array2[indexArr2];
                        indexArr2++;
                    }
                }
                else{ // Only the first array has items remaining
                    sortedArray[i] = array1[indexArr1];
                    indexArr1++;
                }
            }else{ // Only the second array has items remaining
                sortedArray[i] = array2[indexArr2];
                indexArr2++;
            }
        }
        return sortedArray;
    }

    public static boolean checkArrayIndexIsValid(int index, int[] array){
        if(index < array.length){
            return true;
        }
        else{
            return false;
        }
    }
}
