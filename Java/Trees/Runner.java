package Trees;

import Trees.Model.BinaryTree;

public class Runner {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.insert(6);
        bt.insert(4);
        bt.insert(8);
        bt.insert(3);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);


        System.out.println(bt.contains(3));
        System.out.println(bt.contains(0));

        bt.printInOrder();
    }
}
