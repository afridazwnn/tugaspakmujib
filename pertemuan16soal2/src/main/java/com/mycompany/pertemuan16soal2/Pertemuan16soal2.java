/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan16soal2;

// Kelas abstrak untuk operasi aritmatika
abstract class OperasiAritmatika {
    protected double a;
    protected double b;

    public OperasiAritmatika(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Metode abstrak untuk operasi aritmatika
    protected abstract double hitung();
}

// Kelas turunan untuk operasi penjumlahan
class Penjumlahan extends OperasiAritmatika {

    public Penjumlahan(double a, double b) {
        super(a, b);
    }

    @Override
    protected double hitung() {
        return a + b;
    }
}

// Kelas turunan untuk operasi pengurangan
class Pengurangan extends OperasiAritmatika {

    public Pengurangan(double a, double b) {
        super(a, b);
    }

    @Override
    protected double hitung() {
        return a - b;
    }
}

// Kelas turunan untuk operasi perkalian
class Perkalian extends OperasiAritmatika {

    public Perkalian(double a, double b) {
        super(a, b);
    }

    @Override
    protected double hitung() {
        return a * b;
    }
}

// Kelas turunan untuk operasi pembagian
class Pembagian extends OperasiAritmatika {

    public Pembagian(double a, double b) {
        super(a, b);
    }

    @Override
    protected double hitung() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Pembagi tidak boleh nol.");
        }
    }
}

// Kelas utama
public class Pertemuan16soal2 {
    public static void main(String[] args) {
        // Parameter bilangan A dan B
        double a = 9.5;
        double b = 2.5;
        
        // Membuat objek untuk setiap operasi aritmatika
        OperasiAritmatika penjumlahan = new Penjumlahan(a, b);
        OperasiAritmatika pengurangan = new Pengurangan(a, b);
        OperasiAritmatika perkalian = new Perkalian(a, b);
        OperasiAritmatika pembagian = new Pembagian(a, b);

        // Menampilkan hasil operasi
        System.out.println("Hasil Penjumlahan: " + penjumlahan.hitung());
        System.out.println("Hasil Pengurangan: " + pengurangan.hitung());
        System.out.println("Hasil Perkalian: " + perkalian.hitung());
        try {
            System.out.println("Hasil Pembagian: " + pembagian.hitung());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}


