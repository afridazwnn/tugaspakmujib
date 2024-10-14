/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan8soal1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pertemuan8soal1 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        
        // Meminta input nilai awal
        System.out.print("Masukkan nilai awal: ");
        int nilaiAwal = scanner.nextInt();
        
        System.out.print("Masukkan nilai akhir: ");
        int nilaiAkhir = scanner.nextInt();
        
        System.out.println("Bilangan dengan pertambahan 5 dari " + nilaiAwal + " hingga " + nilaiAkhir + ":");
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
