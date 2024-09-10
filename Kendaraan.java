/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuan3;

/**
 *
 * @author DAGH
 */
public abstract class Kendaraan {

    protected String merk;
    protected String jenis;
    protected int harga;
    
    

    public Kendaraan(String merk, String jenis,int harga) {
        this.merk = merk;
        this.jenis = jenis;
        this.harga = harga;
    }
    
    public abstract void infoKendaraan();
    
    
    public void infoPajakKendaraan(int pajak, String info){
        this.harga += pajak;
        System.out.println("Harga ditambah pajak sebesar " + pajak + " lebih mahal " + info );
    }
    public void infoPajakKendaraan(int pajak, String info, int harga){
        this.harga += pajak;
        System.out.println("Harga ditambah pajak sebesar " + pajak + " lebih murah " + info + " sebesar " + harga );
    }
}
