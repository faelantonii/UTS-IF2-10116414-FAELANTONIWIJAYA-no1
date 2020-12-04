/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_IF2_10116414_FAELANTONIWIJAYA_no1;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program mengenali tanda tanda usia kamu
 */
public class Soal_1_main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
        System.out.print("Masukkan Tahun Lahir Anda : ");
        int YearBirth = scan.nextInt();
        Age umur = new Age(2020);
        umur.setYearBirth(YearBirth);        
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + umur.getYearBirth());
        System.out.println("Hari ini tahun : " + umur.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + umur.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + umur.tandanyaKamu(umur.hitungUmur()));
    }
}
