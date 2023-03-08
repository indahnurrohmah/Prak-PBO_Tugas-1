/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidangdanruang;

import interfaces.MenghitungRuang; 

/**
 *
 * @author HP
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double luaspermukaan() {
        return 2*(super.luasPersegiPanjang+(panjang*tinggi)+(lebar*tinggi));
    }

    @Override
    public double volume() {
        return panjang*lebar*tinggi;
    }
    
}
