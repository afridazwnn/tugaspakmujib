/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6.soal2;

import java.util.Scanner;

/**
 *
 * @author user
 */
     import java.util.Scanner;
public class Pertemuan6Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("NIM : ");
                String nim = scanner.nextLine();
                
                System.out.println("Nama : ");
                String nama = scanner.nextLine();
                
                System.out.println("Nilai : ");
                int nilai = scanner.nextInt();
            
                String Grade;
                String keterangan;
               if (nilai>=80){Grade = "A";
               keterangan = "Lulus";}
       else if (nilai>=70){Grade = "B";
       keterangan = "Lulus";}
       else if (nilai>=60){Grade = "C";
       keterangan = "Lulus";}
       else{
           Grade = "D"; 
       keterangan = "Tidak Lulus";}
               
              
        System.out.println("Grade:"+Grade);
        System.out.println("Keterangan:"+keterangan);
scanner.close();
    }
}
  
    

