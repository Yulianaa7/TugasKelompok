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
    String nama, alamat, hp;
    int totalprice = 0;
    void data(){
        System.out.println("|          MASUKKAN IDENTITAS ANDA          |");
        System.out.print("Masukkan Nama     : ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat   : ");
        alamat = input.nextLine();
        System.out.print("Masukkan No. HP   : ");
        hp = input.nextLine();
        System.out.println("");
    }
    void pilihan(){
        boolean repeat = true;
        while(repeat){
            String[] jenis = {"","Plastik", "Kertas", "Logam", "Kaca"};
        int[] harga = {0,   3000,   1600,   10000,  1300};
        System.out.println("============= Jenis Sampah ============= \n");
        for(int i=1; i<jenis.length;i++){
            System.out.println(i+". "+jenis[i]);
            System.out.println("   Harga : "+harga[i]);
        }
        System.out.println("");
        System.out.println("Masukkan sampah yang ingin anda jual : ");
        int pilih = input.nextInt();
        System.out.println("Masukkan berat sampah (Satuan KG) : ");
        int berat = input.nextInt();
        
        int total = harga[pilih]*berat;
        System.out.println("Uang yang anda dapatkan : "+total);
        totalprice += total;
    
        System.out.println("\nApakah anda ingin menambahnya? (ya/tidak)");
        System.out.print("=> ");
        String keepRepeating = input.next();
        repeat = keepRepeating.equalsIgnoreCase("ya");
        }
        
        System.out.println("\nTotal uang yang anda dapatkan : "+totalprice);
    }
    String nama(){
        return nama;
    }
    String alamat(){
        return alamat;
    }
    String hp(){
        return hp;
    }
    }
        
    
