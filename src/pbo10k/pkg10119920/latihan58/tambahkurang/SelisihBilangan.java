/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan58.tambahkurang;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class SelisihBilangan extends Bilangan{
    
    public void tampilSelisih() {
        
        System.out.println("Hasil Selisih " + this.getX() + " - " + this.getY() + " = " + (this.getX() - this.getY()));
    }
}
