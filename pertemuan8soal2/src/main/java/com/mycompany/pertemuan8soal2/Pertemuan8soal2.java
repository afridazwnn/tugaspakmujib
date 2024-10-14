/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8soal2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pertemuan8soal2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Meminta input nilai awal
        System.out.print("Tahun Akhir: ");
        int tahunakhir = scanner.nextInt();
        
        System.out.print("Tahun Awal: ");
        int tahunawal = scanner.nextInt();
        
        System.out.println("Bilangan dengan pengurangan 1 dari " + tahunakhir + " hingga " + tahunawal + ":");
        for (int i = tahunakhir; i >= tahunawal; i -= 5) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
