package Arrays.ImplementingAnArray;

public class MyArray {
    private int length;
    private int numberOfItems;
    private int[] data;

    public MyArray() {
        this.length = 10;
        this.numberOfItems = 0;
    }

    public int get(int index){
        return this.data[index];
    }

    public int getLength(){
        return this.length;
    }

    public int getNumberOfItems(){
        return this.numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems){
        this.numberOfItems = numberOfItems;
    }

    private void decreaseLength(){
        this.length--;
    }

    private void setDataItem(int item, int index){
        this.data[index] = item;
    }

    private int[] getData(){
        return this.data;
    }

    private void setData(int[] data){
        this.data = data;
    }

    private void setArrayLength(int length){
        this.data = new int[length];
        this.setLength(length);
    }

    private void setLength(int length){
        this.length = length;
    }

    public void addAtTheEnd(int item){
        MyArray newArray = this.createNewArray();
        for(int i=0; i<this.getNumberOfItems(); i++){
            newArray.setDataItem(this.get(i), i);
        }
        newArray.setDataItem(item, this.getNumberOfItems());
        this.setData(newArray.getData());
        this.increaseNumberOfItems();
    }

    private void increaseLengthForNewArray(){
        this.length = this.getLength() + 10;
    }

    private void increaseNumberOfItems(){
        this.numberOfItems++;
    }

    private void decreaseNumberOfItems(){
        this.numberOfItems--;
    }

    private MyArray createNewArray(){
        MyArray newArray = new MyArray();
        if(this.arrayHasSpace()){
            newArray.setArrayLength(this.getLength() + 1);
        }else{
            newArray.setArrayLength(this.getLength() + 10);
            this.increaseLengthForNewArray();
        }
        newArray.setNumberOfItems(this.getNumberOfItems() + 1);
        return newArray;
    }

    private boolean arrayHasSpace(){
        return !(this.getNumberOfItems() >= this.getLength());
    }

    public boolean isEmpty(){
        return this.getNumberOfItems() == 0;
    }

    private boolean validIndex(int index){
        if(index >= 0 && index < this.getNumberOfItems()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean add(int index, int item){
        if(!this.isEmpty() && validIndex(index)){
            int lastItem = this.get(this.getNumberOfItems() - 1);
            this.shiftItemsAfterAdd(index, item);
            this.addAtTheEnd(lastItem);
            return true;
        }
        else{
            return false;
        }
    }

    public void removeLastItem(){
        MyArray newArray = new MyArray();
        newArray.setArrayLength(this.getLength());
        newArray.setNumberOfItems(this.getNumberOfItems());
        for(int i=0; i<newArray.getNumberOfItems(); i++){
            newArray.setDataItem(this.get(i), i);
        }
        this.setData(newArray.getData());
        this.decreaseNumberOfItems();
    }

    public void removeFromIndex(int index){
        this.shiftItemsAfterRemove(index);
        this.removeLastItem();
    }

    public int indexOf(int value){
        for(int i = 0; i < this.getNumberOfItems(); i++){
            if(value == this.get(i)){
                return i;
            }
        }
        return -1;
    }

    public boolean remove(int value){
        int index = this.indexOf(value);
        if(index >= 0){
            this.shiftItemsAfterRemove(index);
            this.removeLastItem();
            return true;
        }else{
            return false;
        }
    }

    private void shiftItemsAfterRemove(int index){
        for(int i = index; i < this.getNumberOfItems() - 1; i++){
            this.setDataItem(this.get(i + 1), i);
        }
    }

    private void shiftItemsAfterAdd(int index, int item){
        int actualItem = this.get(index);
        int nextItem;
        this.setDataItem(item, index);
        for(int i = index; i < this.getNumberOfItems() - 1; i++){
            nextItem = this.get(i + 1);
            this.setDataItem(actualItem, i + 1);
            actualItem = nextItem;
        }
    }

    
    public void printArray(){
        for(int i=0; i< this.getNumberOfItems(); i++){
            System.out.println("Index " + i + ": " + this.get(i));
        }
        System.out.println("|-------------------------------------|");
    }

    public boolean contains(int value){
        for(int i = 0; i < this.getNumberOfItems(); i++){
            if(value == this.get(i)){
                return true;
            }
        }
        return false;
    }

    public void clean(){
        this.setDefaultArrayLength();
    }

    private void setDefaultArrayLength(){
        int[] emptyArray = new int[10];
        this.setData(emptyArray);
        this.setLength(10);
        this.setNumberOfItems(0);
    }
}
