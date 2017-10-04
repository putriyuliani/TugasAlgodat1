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
public class Main9dan12 {
    public static void main(String[] args) {
        ArrayLinearList x = new ArrayLinearList();
        x.add(0, "0");
        x.add(1, "1");
        x.add(2, "2");
        x.add(3, "3");
        Object[] y = new Object[20];

        System.out.println("panjang array : "+x.size);
        System.out.println("Panjang elemen : "+x.element.length);
        System.out.println("data dipanggil di variabel x : "+x.toString());
        x.removeRange(0, 3);
        System.out.println(x.toString());
        System.out.println("data dipanggil di variabel y : "+x.clone(y));
    }
    }
