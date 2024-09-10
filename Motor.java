/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuan3;

/**
 *
 * @author DAGH
 */
public class Motor extends Kendaraan {
    private int tahunproduksi;
   public Motor(String merk,String jenis,int harga,int tahunproduksi){
       super(merk,jenis,harga);
       this.tahunproduksi = tahunproduksi;
       
   } 
   
   @ Override
   public void infoKendaraan(){
       System.out.println("Merk: " + merk);
       System.out.println("Jenis: " + jenis);
       System.out.println("Tahun Produksi: " + tahunproduksi);
       System.out.println("Harga: " + harga);
     
   }

    /**
     *
     * @param pajak
     * @param info
     * @param harga
     */
    @Override
   public void infoPajakKendaraan(int pajak, String info,int harga){
       super.infoPajakKendaraan(pajak,info,harga);
   }

}
