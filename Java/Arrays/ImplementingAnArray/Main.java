package Arrays.ImplementingAnArray;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.addAtTheEnd(10);
        array.printArray();

        array.addAtTheEnd(20);
        array.printArray();

        array.addAtTheEnd(30);
        array.printArray();

        array.addAtTheEnd(40);
        array.printArray();

        array.add(0, 22);
        array.printArray();

        /*
        array.removeFromIndex(1);
        array.printArray();

        array.remove(10);
        array.printArray();
        */
    }
}
