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
public class ArrayLinearList2 extends ArrayLinearList{
    @Override
    public void trimToSize() {
        if (size < capacity) {
            Object[] newArray = new Object[size];
            System.arraycopy(element, 0, newArray, 0, size);
            element = newArray;
            capacity = size;
        }
    }
    
    
}
