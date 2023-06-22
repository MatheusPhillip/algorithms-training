package Trees.Model;

public class BinaryTree {
    private Node root;


    private Node insertRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if(value <= current.getData()){
            current.setLeft(insertRecursive(current.getLeft(), value));
        }
        else if(value > current.getData()){
            current.setRight(insertRecursive(current.getRight(), value));
        }
        else{
            return current;
        }
        return current;
    }

    public void insert(int value){
        root = insertRecursive(root, value);
    }

    private boolean containsRecursive(Node current, int value){
        if(value == current.getData()){
            return true;
        }
        else if(value < current.getData()){
            if(current.getLeft() == null){
                return false;
            }
            else{
                return this.containsRecursive(current.getLeft(), value);
            }
        }
        else{
            if(current.getRight() == null){
                return false;
            }
            else{
                return this.containsRecursive(current.getRight(), value);
            }
        }
    }

    public boolean contains(int value){
        return containsRecursive(root, value);
    }

    private void printInOrderRecursive(Node current){
        if(current.getLeft() != null){
            printInOrderRecursive(current.getLeft());
        }
        System.out.println(current.getData());
        if(current.getRight() != null){
            printInOrderRecursive(current.getRight());
        }
    }

    public void printInOrder(){
        printInOrderRecursive(root);
    }
}
