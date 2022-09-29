//Created by 21343077_Glody Syah Rabbynawa

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas1a {
    public static void main(String[] args) {
    BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));

    String a,b,c;
    float nomerSatu,nomerDua,nomerTiga;
    double average;

    try{
        System.out.print("Masukkan nilai biologi = ");
        a = masuk.readLine();
        nomerSatu = Float.parseFloat(a);

        System.out.print("Masukkan nilai matematika = ");
        b = masuk.readLine();
        nomerDua = Float.parseFloat(b);

        System.out.print("Masukkan nilai fisika = ");
        c = masuk.readLine();
        nomerTiga = Float.parseFloat(c);

        average = ((nomerSatu+nomerDua+nomerTiga)/3);

        System.out.println("Nilai biologi : " +nomerSatu);
        System.out.println("Nilai matematika  : "+nomerDua);
        System.out.println("Nilai  fisika  : " +nomerTiga);
        System.out.println("Rata-Rata Nilai = " +average);

        if (average >=60){
            System.out.println("Selamat kamu berhasil :-)");
        }
        else {  
            System.out.println("Maaf kamu gagal :-(");
        }
    }
     catch(IOException e){
        System.out.println("Gagal Membaca Keyboard");
    }
    }
}
