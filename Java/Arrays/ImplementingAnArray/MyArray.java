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

    public void push(int item){
        MyArray newArray = new MyArray();
        newArray.setArrayLength(this.getLength() + 1);
        for(int i=0; i<this.getLength(); i++){
            newArray.setDataItem(this.get(i), i);
        }
        newArray.setDataItem(item, this.getLength());
        this.setData(newArray.getData());
        this.increaseLength();
    }

    public void pop(){
        MyArray newArray = new MyArray();
        newArray.setArrayLength(this.getLength() - 1);
        for(int i=0; i<newArray.getLength(); i++){
            newArray.setDataItem(this.get(i), i);
        }
        
        
        this.setData(newArray.getData());
        this.decreaseLength();
    }

    public void delete(int index){
        this.shiftItems(index);
    }

    private void shiftItems(int index){
        for(int i = index; i < this.getLength() - 1; i++){
            this.setDataItem(this.get(i + 1), i);
        }
        this.pop();
    }

    
    public void printArray(){
        for(int i=0; i< this.getLength(); i++){
            System.out.println("Index " + i + ": " + this.get(i));
        }
    }
}
