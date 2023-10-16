package HashTables.ImplementingAHashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashTable {
    private ArrayList<ArrayList<Map<String, Integer>>> data;
    private int size;


    public HashTable(int size){
        this.data = new ArrayList<ArrayList<Map<String, Integer>>>();
        
        this.size = 50;
        for(int index=0; index<size; index++){
            this.data.add(index, null);
        }
    }

    private int hash(String key){
        int hash = 0;
        for(int index = 0; index < key.length(); index++){
            hash = (hash + key.codePointAt(index) * index) % this.size;
        }
        return hash;
    }

    public void set(String key, int value){
        int address = this.hash(key);
        if(!this.addressHasData(address)){
            ArrayList<Map<String, Integer>> hashList = new ArrayList<>();
            Map<String, Integer> hashNode = new HashMap<>();
            hashNode.put(key, value);
            hashList.add(hashNode);
            this.data.set(address, hashList);
        }
        else{
            Map<String, Integer> hashNode = new HashMap<>();
            hashNode.put(key, value);
            ArrayList<Map<String, Integer>> actualHashList = this.getData().get(address);
            actualHashList.add(hashNode);
            this.data.set(address, actualHashList);
            System.out.println(this.data);
        }
    }

    public Integer get(String key){
        int address = this.hash(key);
        ArrayList<Map<String, Integer>> currentBucket = this.getData().get(address);
        if(currentBucket != null){
            for(int index = 0; index < currentBucket.size(); index++){
                if(currentBucket.get(index).containsKey(key)){
                    return currentBucket.get(index).get(key);
                }
            }
        }
        return null;
    }

    private boolean addressHasData(int address){
        if(this.data.get(address) == null){
            System.out.println("entrou");
            return false;
        }
        else{
            return true;
        }
    }

    public void displayHash(String key){
        System.out.println(this.hash(key));
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<ArrayList<Map<String, Integer>>> getData() {
        return data;
    }

    public void setData(ArrayList<ArrayList<Map<String, Integer>>> data) {
        this.data = data;
    }



   


}
