/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5.soalsatu;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Pertemuan5Soalsatu {
public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);
    System.out.println("Masukan Nama Anda:");
    String name = myInput.nextLine();
    System.out.println("Masukan Alamat Anda:");
    int alamat = myInput.nextInt();
    System.out.println("Masukan Usia Anda:");
    int age = myInput.nextInt();
    System.out.println("Masukan Gaji Anda:");
    double salary = myInput.nextDouble();
    
    System.out.println(" Nama Karyawan : " + name);
    System.out.println("Alamat: " + alamat);
    System.out.println("Usia: " + age);
    System.out.println("Gaji: " + salary); 
} }
