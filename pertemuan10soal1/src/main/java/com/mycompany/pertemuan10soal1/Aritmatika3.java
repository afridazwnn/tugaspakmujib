package com.mycompany.pertemuan10soal1;

// Kelas Aritmatika2 dengan metode tambahan
class Aritmatika2 {
    // Misalnya, metode tambah (sebagai contoh)
    public int tambah(int a, int b) {
        return a + b;
    }
}

// Kelas Aritmatika3 yang merupakan turunan dari Aritmatika2
public class Aritmatika3 extends Aritmatika2 {

    // Method untuk pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Method untuk pembagian
    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh 0");
        }
        return (double) a / b;
    }

    // Method untuk pangkat
    public double pangkat(int a, int b) {
        return Math.pow(a, b);
    }
}

// Kelas utama dengan metode main
public class Pertemuan10soal1 {
    public static void main(String[] args) {
        // Membuat objek Aritmatika3
        Aritmatika3 aritmatika = new Aritmatika3();

        // Mendefinisikan bilangan
        int bilangan1 = 10;
        int bilangan2 = 5;

        // Menggunakan method-method dari Aritmatika3
        int hasilPengurangan = aritmatika.pengurangan(bilangan1, bilangan2);
        int hasilPerkalian = aritmatika.perkalian(bilangan1, bilangan2);
        double hasilPembagian = aritmatika.pembagian(bilangan1, bilangan2);
        double hasilPangkat = aritmatika.pangkat(bilangan1, bilangan2);

        // Menampilkan hasil ke layar
        System.out.println("Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);
        System.out.println("Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);
        System.out.println("Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);
        System.out.println("Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + hasilPangkat);
    }
}
