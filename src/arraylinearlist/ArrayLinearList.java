/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylinearlist;

/**
 *
 * @author user
 */

public class ArrayLinearList {
    protected Object [] element,element2;
    protected int size;
    protected int capacity;
    int index;
    public ArrayLinearList(int capacity) {
        this.capacity = capacity;
        element = new Object[capacity];

        index = 0;
    }
    public ArrayLinearList(){
        this(10);
    }
    public boolean isEmpty(){
        return size == 0;
    } 
    public int size(){
        return size;
    }
    public void increaseSize() {
        capacity++;
        Object[] newArray = new Object[capacity];
        System.arraycopy(element, 0, newArray, 0, element.length);
        element = newArray;
    }
    void checkIndex(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index = " + index + "size = " + size);
    }
    
    public void add(int index, Object theElement){        
        
    }
    public void trimToSize() {
        
    }

    public Object remove(int i) {
        return null;
    }

    public Object setSize(int newArray) {
        return null;
    }
}