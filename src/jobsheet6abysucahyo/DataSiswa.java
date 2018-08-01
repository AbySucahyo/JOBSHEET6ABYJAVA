/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6abysucahyo;

/**
 *
 * @author Aby
 */
import java.util.Scanner;
public class DataSiswa {
    public static void main(String[] args){
        //Deklarasi variabel
        String nama, alamat;
        int usia, absen;
        //Membuat scannr baru
        Scanner keyboard = new Scanner(System.in);
        //Tampilkan output ke user
        System.out.println("### DATA SISWA SMK TELKOM MALANG ###");
        System.out.print("Nama Siswa: ");
        //Menggunakan scanner dan menyimapn apa yang diketik di variabel nama
        nama = keyboard.next();
        //Tampilkan output lagi
        System.out.print("Alamat: ");
        //Menggunamkan scanner lagi
        alamat = keyboard.next();
        System.out.print("Absen: ");
        absen = keyboard.nextInt();
        System.out.print("Usia: ");
        usia =keyboard.nextInt();
        //Menampilkan apa yang sudah simpan di variabel
        System.out.println("---------------");
        System.out.println("Nama Siswa: " + nama );
        System.out.println("Alamat: " + alamat );
        System.out.println("Absen: " + absen );
        System.out.println("Usia: " + usia+ " tahun");
        
        
                
        
    }
}
