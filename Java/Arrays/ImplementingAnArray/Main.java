package Arrays.ImplementingAnArray;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.push(10);
        array.printArray();

        array.push(20);
        array.printArray();

        array.push(30);
        array.printArray();

        array.push(40);
        array.printArray();

        array.delete(1);
        array.printArray();
    }
}
