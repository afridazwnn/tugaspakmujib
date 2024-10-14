/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11.soal2;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Pertemuan11Soal2 {

    public static void main(String[] args) {
 
// Kelas Karyawan untuk menyimpan data karyawan
class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private String golongan;
    private String jabatan;
    private double gajiPokok;

    // Konstruktor untuk menginisialisasi data karyawan
    public Karyawan(String idKaryawan, String namaKaryawan, String golongan) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.golongan = golongan;

        // Menetapkan jabatan dan gaji pokok berdasarkan golongan
        switch (golongan) {
            case "1":
                this.jabatan = "Assisten Staff";
                this.gajiPokok = 3000000;
                break;
            case "2":
                this.jabatan = "Staff";
                this.gajiPokok = 3500000;
                break;
            case "3":
                this.jabatan = "Supervisor";
                this.gajiPokok = 4000000;
                break;
            case "4":
                this.jabatan = "Assisten Manager";
                this.gajiPokok = 5000000;
                break;
            case "5":
                this.jabatan = "Manager";
                this.gajiPokok = 6000000;
                break;
            default:
                this.jabatan = "Unknown";
                this.gajiPokok = 0;
                break;
        }
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
        
        System.out.println("Masukkan Golongan (1-5): ");
        String golongan = scanner.nextLine();

        // Membuat objek Karyawan
        Karyawan karyawan = new Karyawan(idKaryawan, namaKaryawan, golongan);

        // Menampilkan informasi karyawan
        System.out.println("\nData Karyawan:");
        karyawan.tampilkanInfo();
        
        scanner.close();
    }
    }