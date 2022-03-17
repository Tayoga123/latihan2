/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan2;

/**
 *
 * @author USER
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inisialisasi sebagai stok
        int semangka=7, jambu=3;
        double harga_semangka, harga_jambu;
        harga_semangka = 3000.2;
        harga_jambu = 2340.2;
        double total, bayar;
        
        /* operator penugasan (pembelian yang mengurangi stok)*/
        jambu-=2;
        semangka-=3;
        /*operator Aritmatika (total barang tersedia)*/
        total=semangka+jambu;
        
    System.out.println("jumlah barang yang tersedia =" +semangka+ "+" +jambu+ 
                "=" +total);
        
        bayar= (total*harga_jambu)+(total*harga_semangka);
        //total aset yang dimiliki
        System.out.println("total aset yang dimiliki  = Rp"+bayar);    
    }
    
}

