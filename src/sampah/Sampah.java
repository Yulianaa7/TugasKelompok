/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampah;

/**
 *
 * @author MOKLET-2
 */
public class Sampah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        datasampah oi = new datasampah();
        
        oi.data();
        oi.pilihan();
        
        System.out.println("\n========== NOTA PENJUALAN SAMPAH ANDA ==========");
        System.out.println("Nama    : " + oi.nama());
        System.out.println("Alamat  : " + oi.alamat());
        System.out.println("No. HP  : " + oi.hp());
        System.out.println("Total uang yang anda dapatkan : " + oi.totalprice);
        System.out.println("\nTerima kasih, Silahkan datang kembali");
    }
    
}
