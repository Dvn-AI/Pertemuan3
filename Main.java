/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_pertemuan3;

/**
 *
 * @author DAGH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota","Innova",300000000,2018);       
        mobil1.infoPajakKendaraan(2000000," dari motor");
        mobil1.infoKendaraan();
        
        System.out.println("");
        
        Motor motor1 = new Motor("Honda", "Vario", 12000000,2020);
        motor1.infoPajakKendaraan(1000000," dari Mobil",17200000);
        motor1.infoKendaraan();
    
        
        
    }
    
}
