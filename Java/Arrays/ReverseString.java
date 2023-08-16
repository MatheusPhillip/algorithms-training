package Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String initialString = "pillihP suehtaM si eman yM";
        String reversedString;
        reversedString = reverseString(initialString); //O(n/2)
        System.out.println(reversedString);

    }

    public static String reverseString(String string){
        if(string != null && string.length() > 1){
            char[] stringAsArray = string.toCharArray();
            char actualChar;
            for(int i=0; i< Math.floor(stringAsArray.length / 2); i++){
                actualChar = stringAsArray[i];
                stringAsArray[i] = stringAsArray[stringAsArray.length - (i + 1)];
                stringAsArray[stringAsArray.length - (i + 1)] = actualChar;
            } 
            return String.valueOf(stringAsArray);
        }
        else{
            return string;
        }
    }
}
