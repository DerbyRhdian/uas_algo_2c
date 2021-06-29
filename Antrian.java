/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author DERBY R
 */
public class Antrian {
     private int ukuran;
    private long[] antrian;
    private int belakang;
    private int jumItem;
    private int depan;

    public Antrian (int s){
        ukuran = s;
        antrian = new long[ukuran];
        depan = 0;
        belakang = -1;
        jumItem = 0;
    }

    public void enqueue(long j){
        if(!isFull()){
            antrian[++belakang] = j;
            jumItem++;
        }
    
    }
