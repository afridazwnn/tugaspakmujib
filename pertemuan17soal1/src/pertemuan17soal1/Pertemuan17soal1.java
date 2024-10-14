/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan17soal1;
import java.util.Scanner;

public class Pertemuan17soal1 {
        // TODO code application logic here

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah kota
        System.out.print("Masukan Jumlah Kota : ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline character setelah nextInt()

        // Membuat array untuk menyimpan nama-nama kota
        String[] kotaArray = new String[jumlahKota];

        // Meminta input nama-nama kota
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + " : ");
            kotaArray[i] = scanner.nextLine();
        }

        // Menutup Scanner
        scanner.close();

        // Menampilkan nama-nama kota yang dimasukkan, tanpa kata "Kota"
        System.out.println("Kota-kota yang dimasukan:");
        for (String kota : kotaArray) {
            // Menghilangkan kata "Kota" dari nama kota
            String kotaTanpaKota = kota.replace(" Kota", "");
            System.out.println(kotaTanpaKota);
        }
    }
}
