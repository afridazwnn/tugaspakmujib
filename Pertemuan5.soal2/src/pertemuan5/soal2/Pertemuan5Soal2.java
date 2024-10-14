/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5.soal2;

/**
 *
 * @author user
 */import java.util.Scanner;
public class Pertemuan5Soal2 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int result = 0;
        System.out.println("Luas Alas:");
    int Luas = myInput.nextInt();
    System.out.println("Luas Tinggi:");
    int Tinggi = myInput.nextInt();
        double alas= 17; double tinggi = 11;
        double luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga: " + Luas);
        System.out.println("Alas Segitiga: " + Tinggi);
    System.out.println("Tinggi x Alas: "+result);
    }
    
}
