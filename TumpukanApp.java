/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author DERBY R
 */
public class TumpukanApp {
     public static void main(String[] args) {
        Tumpukan tumpukan = new Tumpukan(10);
        tumpukan.push(39);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        long nilai1 = tumpukan.peek();
        System.out.println("nilai tertinggi = "+nilai1);
        System.out.println("Nama saya adalah Deniar Angga W");
        long nilai2 = tumpukan.pop();
        System.out.println("nilai yang dihapus = "+nilai2);
        System.out.println("");
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();




    }
}

