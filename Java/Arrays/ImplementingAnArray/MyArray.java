package Arrays.ImplementingAnArray;

public class MyArray {
    private int length;
    private int[] data;

    public MyArray() {
        this.length = 0;
    }

    public int get(int index){
        return this.data[index];
    }

    public int getLength(){
        return this.length;
    }

    private void increaseLength(){
        this.length++;
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
        MyArray newArray = new MyArray();
        newArray.setArrayLength(this.getLength() + 1);
        for(int i=0; i<this.getLength(); i++){
            newArray.setDataItem(this.get(i), i);
        }
        newArray.setDataItem(item, this.getLength());
        this.setData(newArray.getData());
        this.increaseLength();
    }

    public boolean isEmpty(){
        if(this.getLength() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    private boolean validIndex(int index){
        if(index >= 0 && index < this.getLength()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean add(int index, int item){
        if(!this.isEmpty() && validIndex(index)){
            System.out.println("Entrou");
            int lastItem = this.get(this.getLength() - 1);
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
        newArray.setArrayLength(this.getLength() - 1);
        for(int i=0; i<newArray.getLength(); i++){
            newArray.setDataItem(this.get(i), i);
        }
        
        
        this.setData(newArray.getData());
        this.decreaseLength();
    }

    public void removeFromIndex(int index){
        this.shiftItemsAfterRemove(index);
        this.removeLastItem();
    }

    public int indexOf(int value){
        for(int i = 0; i < this.getLength(); i++){
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
        for(int i = index; i < this.getLength() - 1; i++){
            this.setDataItem(this.get(i + 1), i);
        }
    }

    private void shiftItemsAfterAdd(int index, int item){
        int actualItem = this.get(index);
        int nextItem;
        this.setDataItem(item, index);
        for(int i = index; i < this.getLength() - 1; i++){
            nextItem = this.get(i + 1);
            this.setDataItem(actualItem, i + 1);
            actualItem = nextItem;
        }
    }

    
    public void printArray(){
        for(int i=0; i< this.getLength(); i++){
            System.out.println("Index " + i + ": " + this.get(i));
        }
        System.out.println("|-------------------------------------|");
    }

    public boolean contains(int value){
        for(int i = 0; i < this.getLength(); i++){
            if(value == this.get(i)){
                return true;
            }
        }
        return false;
    }
}
