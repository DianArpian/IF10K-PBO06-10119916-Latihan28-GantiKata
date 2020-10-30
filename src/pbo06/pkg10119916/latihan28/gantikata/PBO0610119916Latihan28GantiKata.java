/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripsi Program : Ganti Kata
 */
public class PBO0610119916Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt, ganti_kata, menjadi_kata;
        
        System.out.println("=======Program Ganti Kata=======");
        System.out.println();
        System.out.print(" Masukkan Kalimat : ");
        txt = scan.nextLine();
        System.out.print(" Ganti Kata : ");
        ganti_kata = scan.nextLine();
        System.out.print(" Ganti Kata : ");
        menjadi_kata = scan.nextLine();
        
            String replaceString =txt.replace(ganti_kata,menjadi_kata);
            System.out.println(replaceString);
    }
    
}
