/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidangdanruang;

import interfaces.MenghitungBidang;

/**
 *
 * @author HP
 */
public class Lingkaran implements MenghitungBidang{
    static final double PHI = 3.14;
    public double luasLingkaran, kelilingLingkaran, r;

    public Lingkaran(double r) {
        this.r = r;
    }
    
    
    @Override
    public double luas() {
        luasLingkaran = PHI*r*r; 
        return luasLingkaran; 

    }

    @Override
    public double keliling() {
        kelilingLingkaran = PHI*2*r; 
        return kelilingLingkaran;
    }
}
