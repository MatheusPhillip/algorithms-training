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

    private void setDataLength(int length){
        this.data = new int[length];
    }

    public void push(int item){
        MyArray newArray = new MyArray();
        newArray.setDataLength(this.getLength() + 1);
        //newArray.data = new int[this.getLength() + 1];
        for(int i=0; i<this.getLength(); i++){
            newArray.setDataItem(this.get(i), i);
        }
        newArray.setDataItem(item, this.getLength());
        this.setData(newArray.getData());
        //this.data = newArray.getData();
        this.increaseLength();
    }

    public void pop(){
        MyArray newArray = new MyArray();
        newArray.setDataLength(this.getLength() - 1);
        //int[] newArray = new int[this.getLength() - 1];
        for(int i=0; i<newArray.getLength(); i++){
            //newArray[i] = this.data[i];
            newArray.setDataItem(this.get(i), i);
        }
        //this.data = newArray;
        this.setData(newArray.getData());
        this.decreaseLength();
    }
}
