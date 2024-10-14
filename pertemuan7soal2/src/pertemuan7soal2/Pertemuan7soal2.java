/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7soal2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pertemuan7soal2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
                System.out.println("NIM : ");
                String nim = scanner.nextLine();
                System.out.println("Nama : ");
                String nama = scanner.nextLine();
                
                System.out.println("Tahun : ");
                int Tahun = scanner.nextInt();
                
                scanner.nextLine();
                System.out.print("Pilih Peminatan (M untuk Mobile, W untuk Web,  D untuk Data Science)");
      char peminatan = scanner.nextLine().charAt(0);
                System.out.println("Output:");
        switch (peminatan) {
            case 'M':
                System.out.println("Pemrogramman Mobile");
                break;
            case 'W':
                System.out.println("Pemrogramman Web");
                break;
            case 'D':
                System.out.println("Data Mining, Machine Learning");
                break;
            default:
                System.out.println("Peminatan tidak valid");
         
        }
        
        scanner.close();
}}