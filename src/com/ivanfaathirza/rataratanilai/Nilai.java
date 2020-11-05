package com.ivanfaathirza.rataratanilai;

public class Nilai {
    double rataRata = 0;

    private double hitungRataRata(int[] nilai){
        for(int x : nilai){
            rataRata += x;
        }
        return rataRata = rataRata / nilai.length;
    }

    public void tampilRataRata(int[] nilai){
        hitungRataRata(nilai);
        System.out.println("Rata-rata Nilainya adalah "+rataRata);
    }
}
