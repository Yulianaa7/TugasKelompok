/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampah;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class datasampah {
    Scanner input = new Scanner (System.in);
    void data(){
        System.out.println("|          MASUKKAN IDENTITAS ANDA          |");
        System.out.print("Masukkan Nama : ");
        String nama = input.next();
        System.out.print("Masukkan Alamat : ");
        String alamat = input.next();
        System.out.print("Masukkan No. HP : ");
        String hp = input.next();
        System.out.println("");
    }
    void pilihan(){
        System.out.println("|            JENIS SAMPAH           |");
        System.out.println("1. Botol Plastik dan Gelas Plastik (Rp. 3000/kg)");
        System.out.println("2. Koran, Buku Tulis, Majalah (Rp. 1600/kg)");
        System.out.println("3. Kaleng dan Aluminium (Rp. 10000/kg)");
        System.out.println("4. Botol Syrup, Botol Bling Putih, Botol Bling Warna (Rp. 1300/kg)");
        System.out.print("Masukkan Jenis Sampah yang Akan Anda Jual : ");
        int pilihan = input.nextInt();
        System.out.println("");
        
        switch(pilihan){
            case 1 : 
                System.out.println("Anda memilih jenis sampah Botol Plastik dan Gelas Plastik");
                System.out.print("Masukkan berat sampah anda (Satuan KG) : ");
                int berat1 = input.nextInt();
                int harga1 = berat1*3000;
                System.out.println("Pembayaran : "+harga1);
            break;
            case 2 : 
                System.out.println("Anda memilih jenis sampah Koran, Buku Tulis, Majalah");
                System.out.print("Masukkan berat sampah anda (Satuan KG) : ");
                int berat2 = input.nextInt();
                int harga2 = berat2*1600;
                System.out.println("Pembayaran : "+harga2);
            break;
            case 3 : 
                System.out.println("Anda memilih jenis sampah Kaleng dan Aluminium");
                System.out.println("Masukkan berat sampah anda (Satuan KG) : ");
                int berat3 = input.nextInt();
                int harga3 = berat3*10000;
                System.out.println("Pembayaran : "+harga3);
            break;
            case 4 :
                System.out.println("Anda memilih jenis sampah Botol Syrup, Botol Bling Putih, Botol Bling Warna");
                System.out.println("Masukkan berat sampah anda (Satuan KG) : ");
                int berat4 = input.nextInt();
                int harga4 = berat4*1300;
                System.out.println("Pembayaran : "+harga4);
            }
        }
    }
