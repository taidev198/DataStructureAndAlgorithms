package com.taidev198.DataStructure.HashTable;

import javax.xml.crypto.Data;

/**
 * @author traig on 6/27/2018.
 * @project DataStructure
 */

class DataItem{

    private int iData;

    public DataItem(int ii){
        iData = ii;
    }

    public int getKey(){
        return iData;
    }




}
public class HashTable {

    private DataItem[] hashArray;//array holds hash table
    private int arraySize;
    private DataItem nonItem;// for deleted item

    public HashTable(int size){

        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);//set key -1 for deleted nonItem
    }

    /****************************************************************/

    public void displayTable(){
        System.out.println("Table:");
        for (int i = 0; i < arraySize; i++) {
            if (hashArray[i] != null)
                System.out.println(hashArray[i].getKey() + " ");
            else System.out.println("**");
        }
        System.out.println(" ");
    }

    /****************************************************************/

    public int hashFunc(int key){
        return key % arraySize;//hash function
    }

    /****************************************************************/

    public void insert(DataItem item){

        int key = item.getKey();
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null
                && hashArray[hashVal].getKey() != -1){//does'nt contain nonItem
         ++hashVal;
         hashVal %= arraySize;

        }
        hashArray[hashVal] = item;
    }

    /****************************************************************/

    public DataItem find(int key){

        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null){
            if (hashArray[hashVal].getKey() == key)//found item?
                return hashArray[hashVal];//return it
            ++hashVal;//go to next cell
            hashVal  %= arraySize;//wrap around if necessary
        }

        return null;//can't find item
    }

    /****************************************************************/


    public DataItem delete(int key){

        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null){
            if (hashArray[hashVal].getKey() == key){
                DataItem temp = hashArray[hashVal];//save item
                hashArray[hashVal] = nonItem;//delete item
                return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }

    public static void main(String...args){
        for (int i = 0; i < 3; i++) {
            System.out.println(i+"Nguyen Thanh Tai");
        }
        for (int i = 0; i < 3; ++i) {
            System.out.println(i+"Nguyen Thanh Tai");
        }
    }



}
