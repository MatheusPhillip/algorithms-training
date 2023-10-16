package HashTables.ImplementingAHashTable;

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable(50);
        ht.set("grapes", 10000);
        ht.set("star", 500);
        ht.set("apples", 15);

        System.out.println(ht.get("grapes"));
        System.out.println(ht.get("apples"));
        System.out.println(ht.get("star"));
        System.out.println(ht.get("appless"));

    }
}
