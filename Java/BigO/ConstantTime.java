package BigO;

public class ConstantTime {
    public static void main(String[] args) {
        String[] boxes = {"box1", "box2"};
        printFirstBox(boxes); // O(1) -> Constant Time

    }

    public static void printFirstBox(String[] boxes){ // O(1)
        System.out.println(boxes[0]); // O(1)
    }
}
