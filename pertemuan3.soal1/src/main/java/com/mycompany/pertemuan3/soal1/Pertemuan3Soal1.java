/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan3.soal1;

/**
 *
 * @author user
 */

//Metode utama yang dijaankan saat progra dieksekusi
    import java.util.Scanner;
public class Pertemuan3Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan informasi nama
        System.out.print("Nama\t\t:"); // Menggunakan \t untuk spasi
        String nama = scanner.nextLine();

        // Menampilkan informasi gender
        System.out.print("Gender\t\t:"); // Menggunakan \t untuk spasi
        String gender = scanner.nextLine();

        // Menampilkan informasi alamat
        System.out.print("Alamat\t\t:"); // Menggunakan \t untuk spasi
        String alamat = scanner.nextLine();

        // Menampilkan informasi tanggal lahir
        System.out.print("Tanggal Lahir\t:"); // Menggunakan \t untuk spasi
        String tanggalLahir = scanner.nextLine();

        // Menampilkan informasi yang telah dimasukkan
        System.out.println("\n=================================");
        System.out.println("          INFORMASI ANDA        ");
        System.out.println("=================================");
        System.out.println("Nama\t\t:" + nama);
        System.out.println("Gender\t\t:" + gender);
        System.out.println("Alamat\t\t:" + alamat);
        System.out.println("Tanggal Lahir\t:" + tanggalLahir);
        System.out.println("=================================\n");


        scanner.close();
    }
    }