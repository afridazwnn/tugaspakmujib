package com.mycompany.pertemuan13soal2;

/**
 * Program untuk menghitung luas segitiga menggunakan method overloading
 */
public class Pertemuan13soal2 {

    public static void main(String[] args) {
        // Membuat objek Segitiga dengan alas dan tinggi
        Segitiga segitiga1 = new Segitiga(10, 5);
        
        // Menghitung luas dengan method default
        segitiga1.hitungLuas();
        System.out.println("Luas segitiga dengan alas 10 dan tinggi 5: " + segitiga1.getLuas());

        // Menghitung luas dengan method overloading
        Segitiga segitiga2 = new Segitiga(0, 0); // Initial values will be overridden
        segitiga2.hitungLuas(7, 3);
        System.out.println("Luas segitiga dengan alas 7 dan tinggi 3: " + segitiga2.getLuas());
    }
}

class Segitiga {
    // Atribut segitiga
    private double alas;
    private double tinggi;
    private double luas;

    // Constructor untuk inisialisasi alas dan tinggi
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Method untuk menghitung luas segitiga dengan parameter alas dan tinggi
    public void hitungLuas() {
        this.luas = (alas * tinggi) / 2;
    }

    // Overloading method untuk menghitung luas segitiga dengan parameter alas, tinggi dan menggunakan formula
    public void hitungLuas(double alas, double tinggi) {
        this.luas = (alas * tinggi) / 2;
    }

    // Method untuk mendapatkan nilai luas
    public double getLuas() {
        return luas;
    }
}
