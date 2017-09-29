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
public class Main {
    public static void main(String [] args){
        ArrayLinearList x = new ArrayLinearList1();
        x.add(0,"a");
        x.add(1,"w");
        x.add(2,"e");
        x.add(3,"g");
        x.add(4,"d");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.element[i]);
        }
        System.out.println("panjang array : "+x.size());
        System.out.println("panjang elemen sebelum di trim : "+x.capacity);
        x.trimToSize();
        System.out.println("panjang elemen setelah di trim : "+x.capacity);
        x.setSize(8);
        System.out.println("ukuran elemen de set menjadi: " +x.element2.length);
        x.remove(1);
        System.out.println("Tampilan setelah indek 1 dihapus :");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.element[i]);
        }
    }
}
