/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6.soal1;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Pertemuan6Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("NIM : ");
                String nim = scanner.nextLine();
                
                System.out.println("Nama : ");
                String nama = scanner.nextLine();
                
                System.out.println("Nilai : ");
                int nilai = scanner.nextInt();
            
                String Grade;
               if (nilai>=80){Grade = "A";
               }
       else if (nilai>=70){Grade = "B";
       }
       else if (nilai>=60){Grade = "C";
      }
       else{
           Grade = "D"; 
     }
               
              
        System.out.println("Grade:"+Grade);
scanner.close();
    }
}
  