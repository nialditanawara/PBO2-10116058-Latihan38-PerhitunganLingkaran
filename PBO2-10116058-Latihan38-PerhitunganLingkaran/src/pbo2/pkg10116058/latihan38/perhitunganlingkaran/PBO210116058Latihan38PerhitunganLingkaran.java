/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan38.perhitunganlingkaran;

public class PBO210116058Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran ling = new Lingkaran();
        
        System.out.println("===============Perhitungan lingkaran=============");
        ling.ValidasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
    
}