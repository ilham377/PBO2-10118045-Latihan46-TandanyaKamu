/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan46tandanyakamu;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : Muhammad Ilham Apriyadi
 * Kelas    : if 2
 * NIM      : 10118045
 * Deskripsi Program : Tandanya Kamu
 */
public class PBO10118045Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Age age = new Age(Calendar.getInstance().get(Calendar.YEAR));
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        Scanner scanner = new Scanner(System.in);
        age.setYearBirth(scanner.nextInt());
        System.out.println("");
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir anda : "+age.getYearBirth());
        System.out.println("Hari ini tahun : "+age.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah "+age.hitungUmur()+" tahun");
        age.tandanyaKamu(age.hitungUmur());
    }
    
}
