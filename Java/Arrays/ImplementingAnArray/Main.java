package Arrays.ImplementingAnArray;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.push(10);
        System.out.println(array.get(0));
        array.push(20);
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        array.push(30);
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
    }
}
