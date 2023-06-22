package Arrays.FindHowManyTimesEachNumberComesInTheList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5);
        List<Character> chars = Arrays.asList('a', 'a', 'a', 'b', 'b', 'B'); 

        Map<Integer, Long> elementsMap = elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        Map<Character, Long> charsMap = chars.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        
        System.out.println(elementsMap);
        System.out.println(charsMap);
    }
}
