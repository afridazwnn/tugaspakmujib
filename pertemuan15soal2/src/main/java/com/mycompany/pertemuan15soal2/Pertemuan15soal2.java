/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Pertemuan15soal2;

/**
 *
 * @author user
 */
public class Pertemuan15soal2 {
    public static void main(String[] args) {
    }
    public static class KalkulatorKurang {
        // Method untuk pengurangan dua bilangan
        public int kurang(int a, int b) {
            return a - b;
        }
    }

    // Kelas untuk operasi pembagian
    public static class KalkulatorBagi {
        // Method untuk pembagian dua bilangan
        public double bagi(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Pembagi tidak boleh 0");
            }
            return (double) a / b;
        }
    }

    // Kelas untuk operasi perkalian
    public static class KalkulatorKali {
        // Method untuk perkalian dua bilangan
        public int kali(int a, int b) {
            return a * b;
        }
    }

    // Kelas Main untuk menjalankan program
    public static class Main {
        public static void main(String[] args) {
            // Membuat objek untuk setiap kelas kalkulator
            KalkulatorKurang kalkulatorKurang = new KalkulatorKurang();
            KalkulatorBagi kalkulatorBagi = new KalkulatorBagi();
            KalkulatorKali kalkulatorKali = new KalkulatorKali();

            // Mendefinisikan dua bilangan
            int a = 20;
            int b = 10;

            // Menggunakan method-method dari setiap kelas kalkulator
            int hasilKurang = kalkulatorKurang.kurang(a, b);
            double hasilBagi = kalkulatorBagi.bagi(a, b);
            int hasilKali = kalkulatorKali.kali(a, b);

            // Menampilkan hasil operasi
            System.out.println("Hasil Pengurangan: " + hasilKurang);
            System.out.println("Hasil Pembagian: " + hasilBagi);
            System.out.println("Hasil Perkalian: " + hasilKali);
        }
    }
    }