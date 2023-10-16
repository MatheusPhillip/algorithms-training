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

        array.addAtTheEnd(10);
        array.printArray();

        array.addAtTheEnd(20);
        array.printArray();

        array.addAtTheEnd(30);
        array.printArray();

        array.addAtTheEnd(40);
        array.printArray();

        array.addAtTheEnd(10);
        array.printArray();

        array.addAtTheEnd(20);
        array.printArray();

        array.addAtTheEnd(30);
        array.printArray();

        array.addAtTheEnd(70);
        array.printArray();

        array.addAtTheEnd(1000);
        array.printArray();

        array.remove(70);
        array.printArray();

        System.out.println(array.getLength());

        array.clean();

        array.addAtTheEnd(30);
        array.printArray();

        array.addAtTheEnd(70);
        array.printArray();

        array.addAtTheEnd(1000);
        array.printArray();

        array.remove(70);
        array.printArray();

        System.out.println(array.getLength());
    }
}
