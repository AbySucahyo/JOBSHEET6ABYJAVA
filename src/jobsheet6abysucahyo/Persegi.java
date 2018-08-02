package jobsheet6abysucahyo;

import java.io.*;

public class Persegi {
    public static void main(String[] args) {
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        String x = " ";
        int hitungluas = 0;
        System.out.println("----Luas Persegi----");
        System.out.print("Masukkan nilai sisi : ");
        
         try {
             x = data.readLine();
             int angka = Integer.parseInt(x);
             hitungluas = angka * angka;
             } catch (Exception e) {
                 System.out.println("Error");
             }
                 System.out.println("Luas Persegi dengan sisi " + x + "adalah" + hitungluas);
    }
}
