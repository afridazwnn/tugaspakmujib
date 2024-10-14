/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11soal1;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Pertemuan11soal1 {

    public static void main(String[] args) {

// Kelas Karyawan untuk menyimpan data karyawan
class Karyawan {
    // Atribut data karyawan
    private String idKaryawan;
    private String namaKaryawan;
    private String golongan;
    private String jabatan;
    private double gajiPokok;

    // Konstruktor untuk menginisialisasi data karyawan
    public Karyawan(String idKaryawan, String namaKaryawan, String golongan, String jabatan, double gajiPokok) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    // Metode untuk menampilkan data karyawan
    public void tampilkanInfo() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}

// Kelas utama untuk menjalankan program
        Scanner scanner = new Scanner(System.in);

        // Input data karyawan
        System.out.println("Masukkan ID Karyawan: ");
        String idKaryawan = scanner.nextLine();
        
        System.out.println("Masukkan Nama Karyawan: ");
        String namaKaryawan = scanner.nextLine();
        
        System.out.println("Masukkan Golongan: ");
        String golongan = scanner.nextLine();
        
        System.out.println("Masukkan Jabatan: ");
        String jabatan = scanner.nextLine();
        
        System.out.println("Masukkan Gaji Pokok: ");
        double gajiPokok = scanner.nextDouble();

        // Membuat objek Karyawan
        Karyawan karyawan = new Karyawan(idKaryawan, namaKaryawan, golongan, jabatan, gajiPokok);

        // Menampilkan informasi karyawan
        System.out.println("\nData Karyawan:");
        karyawan.tampilkanInfo();
        
        scanner.close();
    }
    }
