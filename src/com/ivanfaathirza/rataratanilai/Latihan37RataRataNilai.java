package com.ivanfaathirza.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program :  program ini untuk menghitung 
 * rata-rata dari nilai serta jumlah mahasiswa, sudah berbasis objek dengan 
 * instansiasi objek nilai
 */

public class Latihan37RataRataNilai {
    static Scanner scan = new Scanner(System.in);
    private static int nilaiMhs[];

    private static int masukkanJumlah(){
        System.out.print("Masukkan banyaknya Mahasiswa : ");
        return scan.nextInt();
    }

    private static void masukkanNilai(){
        int jumlah = masukkanJumlah();
        nilaiMhs = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = scan.nextInt();
        }
    }

    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        masukkanNilai();
        nilai.tampilRataRata(nilaiMhs);
        System.out.println("Developed by : Ivan Faathirza");
    }
}
