/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6abysucahyo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;     
public class ContohBufferReader {
    public static void main(String[] args) throws IOException {
        String nama;
        //Membuat objek inputstream
        InputStreamReader Aby = new InputStreamReader(System.in);
        //Membuat objek bufferreader
        BufferedReader br = new BufferedReader(Aby);
        //Mengisi variabel nama dengan Bufferreader
        System.out.print("Inputkan nama: ");  
        nama = br.readLine();
        //Tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama);
        }
}
