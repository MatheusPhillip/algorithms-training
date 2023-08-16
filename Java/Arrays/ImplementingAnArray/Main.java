package Arrays.ImplementingAnArray;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.add(10);
        array.printArray();

        array.add(20);
        array.printArray();

        array.add(30);
        array.printArray();

        array.add(40);
        array.printArray();

        array.removeFromIndex(1);
        array.printArray();
    }
}
