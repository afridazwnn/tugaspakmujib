package com.mycompany.pertemuan13soal1;

/**
 *
 * @author user
 */
public class Pertemuan13soal1 {

    public static void main(String[] args) {
        // Membuat objek Kalkulator
        Kalkulator kalkulator = new Kalkulator();

        // Mendefinisikan dua bilangan
        int a = 20;
        int b = 10;

        // Menggunakan method-method Kalkulator
        int hasilTambah = kalkulator.tambah(a, b);
        int hasilKurang = kalkulator.kurang(a, b);
        int hasilKali = kalkulator.kali(a, b);
        double hasilBagi = kalkulator.bagi(a, b);

        // Menampilkan hasil operasi
        System.out.println("Hasil Pertambahan: " + hasilTambah);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Perkalian: " + hasilKali);
        System.out.println("Hasil Pembagian: " + hasilBagi);
    }

    // Kelas Kalkulator
    public static class Kalkulator {

        // Method untuk penjumlahan
        public int tambah(int a, int b) {
            return a + b;
        }

        // Method untuk pengurangan
        public int kurang(int a, int b) {
            return a - b;
        }

        // Method untuk perkalian
        public int kali(int a, int b) {
            return a * b;
        }

        // Method untuk pembagian
        public double bagi(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Pembagi tidak boleh 0");
            }
            return (double) a / b;
        }
    }
}
